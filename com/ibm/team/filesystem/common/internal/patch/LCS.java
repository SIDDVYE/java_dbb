// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

public class LCS<T>
{
    private static final double TOO_LONG = 1.0E7;
    private static final double POW_LIMIT = 1.5;
    private int max_differences;
    private int[][] result;
    private final ILCSInput input;
    
    public static <T> LCS<T> lcs(final ILCSInput<T> input) {
        return new LCS<T>(input);
    }
    
    protected LCS(final ILCSInput<T> input) {
        this.input = input;
        this.result = this.longestCommonSubsequence(input);
    }
    
    public int length() {
        return this.result[0].length;
    }
    
    public int[] getLCSIndices1() {
        return this.result[0];
    }
    
    public int[] getLCSIndices2() {
        return this.result[1];
    }
    
    private int[][] longestCommonSubsequence(final ILCSInput input) {
        final int length1 = input.length1();
        final int length2 = input.length2();
        if (length1 == 0 || length2 == 0) {
            return new int[2][0];
        }
        this.max_differences = (length1 + length2 + 1) / 2;
        if (length1 * (double)length2 > 1.0E7) {
            this.max_differences = (int)Math.pow(this.max_differences, 0.5);
        }
        final int[][] lcs = new int[2][length1];
        int i = length1;
        while (--i >= 0) {
            lcs[0][i] = (lcs[1][i] = -1);
        }
        int max;
        int forwardBound;
        for (max = Math.min(length1, length2), forwardBound = 0; forwardBound < max && input.match(input.get1(forwardBound), input.get2(forwardBound)); ++forwardBound) {
            lcs[0][forwardBound] = forwardBound;
            lcs[1][forwardBound] = forwardBound;
        }
        int backBoundL1;
        int backBoundL2;
        for (backBoundL1 = length1 - 1, backBoundL2 = length2 - 1; backBoundL1 >= forwardBound && backBoundL2 >= forwardBound && input.match(input.get1(backBoundL1), input.get2(backBoundL2)); --backBoundL1, --backBoundL2) {
            lcs[0][backBoundL1] = backBoundL1;
            lcs[1][backBoundL1] = backBoundL2;
        }
        final int len = forwardBound + length1 - backBoundL1 - 1 + this.lcs_rec(input, forwardBound, backBoundL1, forwardBound, backBoundL2, new int[2][length1 + length2 + 1], new int[3], lcs);
        final int[][] result = { this.compactAndShiftLCS(lcs[0], len, input, true), this.compactAndShiftLCS(lcs[1], len, input, false) };
        return result;
    }
    
    private int[] compactAndShiftLCS(final int[] lcs, final int len, final ILCSInput input, final boolean firstSeq) {
        final int[] result = new int[len];
        if (len == 0) {
            return result;
        }
        int j;
        for (j = 0; lcs[j] == -1; ++j) {}
        result[0] = lcs[j];
        ++j;
        for (int i = 1; i < len; ++i) {
            while (lcs[j] == -1) {
                ++j;
            }
            Label_0159: {
                Label_0150: {
                    if (firstSeq) {
                        if (!input.match(input.get1(result[i - 1] + 1), input.get1(lcs[j]))) {
                            break Label_0150;
                        }
                    }
                    else if (!input.match(input.get2(result[i - 1] + 1), input.get2(lcs[j]))) {
                        break Label_0150;
                    }
                    result[i] = result[i - 1] + 1;
                    break Label_0159;
                }
                result[i] = lcs[j];
            }
            ++j;
        }
        return result;
    }
    
    private int lcs_rec(final ILCSInput input, final int bottoml1, final int topl1, final int bottoml2, final int topl2, final int[][] V, final int[] snake, final int[][] lcs) {
        if (bottoml1 > topl1 || bottoml2 > topl2) {
            return 0;
        }
        final int d = this.find_middle_snake(input, bottoml1, topl1, bottoml2, topl2, V, snake);
        final int len = snake[2];
        final int startx = snake[0];
        final int starty = snake[1];
        for (int i = 0; i < len; ++i) {
            lcs[0][startx + i] = startx + i;
            lcs[1][startx + i] = starty + i;
        }
        if (d > 1) {
            return len + this.lcs_rec(input, bottoml1, startx - 1, bottoml2, starty - 1, V, snake, lcs) + this.lcs_rec(input, startx + len, topl1, starty + len, topl2, V, snake, lcs);
        }
        if (d == 1) {
            final int max = Math.min(startx - bottoml1, starty - bottoml2);
            for (int j = 0; j < max; ++j) {
                lcs[0][bottoml1 + j] = bottoml1 + j;
                lcs[1][bottoml1 + j] = bottoml2 + j;
            }
            return max + len;
        }
        return len;
    }
    
    private int find_middle_snake(final ILCSInput input, final int bottoml1, final int topl1, final int bottoml2, final int topl2, final int[][] V, final int[] snake) {
        final int N = topl1 - bottoml1 + 1;
        final int M = topl2 - bottoml2 + 1;
        final int delta = N - M;
        final boolean isEven = (delta & 0x1) != 0x1;
        final int limit = Math.min(this.max_differences, (N + M + 1) / 2);
        int value_to_add_forward;
        if ((M & 0x1) == 0x1) {
            value_to_add_forward = 1;
        }
        else {
            value_to_add_forward = 0;
        }
        int value_to_add_backward;
        if ((N & 0x1) == 0x1) {
            value_to_add_backward = 1;
        }
        else {
            value_to_add_backward = 0;
        }
        int start_forward = -M;
        int end_forward = N;
        int start_backward = -N;
        int end_backward = M;
        V[0][limit + 1] = 0;
        V[1][limit - 1] = N;
        for (int d = 0; d <= limit; ++d) {
            int start_diag = Math.max(value_to_add_forward + start_forward, -d);
            int end_diag = Math.min(end_forward, d);
            value_to_add_forward = 1 - value_to_add_forward;
            for (int k = start_diag; k <= end_diag; k += 2) {
                int x;
                if (k == -d || (k < d && V[0][limit + k - 1] < V[0][limit + k + 1])) {
                    x = V[0][limit + k + 1];
                }
                else {
                    x = V[0][limit + k - 1] + 1;
                }
                int y = x - k;
                snake[0] = x + bottoml1;
                snake[1] = y + bottoml2;
                snake[2] = 0;
                while (x < N && y < M && input.match(input.get1(x + bottoml1), input.get2(y + bottoml2))) {
                    ++x;
                    ++y;
                    final int n = 2;
                    ++snake[n];
                }
                V[0][limit + k] = x;
                if (!isEven && k >= delta - d + 1 && k <= delta + d - 1 && x >= V[1][limit + k - delta]) {
                    return 2 * d - 1;
                }
                if (x >= N && end_forward > k - 1) {
                    end_forward = k - 1;
                }
                else if (y >= M) {
                    start_forward = k + 1;
                    value_to_add_forward = 0;
                }
            }
            start_diag = Math.max(value_to_add_backward + start_backward, -d);
            end_diag = Math.min(end_backward, d);
            value_to_add_backward = 1 - value_to_add_backward;
            for (int k = start_diag; k <= end_diag; k += 2) {
                int x;
                if (k == d || (k != -d && V[1][limit + k - 1] < V[1][limit + k + 1])) {
                    x = V[1][limit + k - 1];
                }
                else {
                    x = V[1][limit + k + 1] - 1;
                }
                int y = x - k - delta;
                snake[2] = 0;
                while (x > 0 && y > 0 && input.match(input.get1(x - 1 + bottoml1), input.get2(y - 1 + bottoml2))) {
                    --x;
                    --y;
                    final int n2 = 2;
                    ++snake[n2];
                }
                V[1][limit + k] = x;
                if (isEven && k >= -delta - d && k <= d - delta && x <= V[0][limit + k + delta]) {
                    snake[0] = bottoml1 + x;
                    snake[1] = bottoml2 + y;
                    return 2 * d;
                }
                if (x <= 0) {
                    start_backward = k + 1;
                    value_to_add_backward = 0;
                }
                else if (y <= 0 && end_backward > k - 1) {
                    end_backward = k - 1;
                }
            }
        }
        final int[] most_progress = findMostProgress(M, N, limit, V);
        snake[0] = bottoml1 + most_progress[0];
        snake[1] = bottoml2 + most_progress[1];
        snake[2] = 0;
        return 5;
    }
    
    private static int[] findMostProgress(final int M, final int N, final int limit, final int[][] V) {
        final int delta = N - M;
        int forward_start_diag;
        if ((M & 0x1) == (limit & 0x1)) {
            forward_start_diag = Math.max(-M, -limit);
        }
        else {
            forward_start_diag = Math.max(1 - M, -limit);
        }
        final int forward_end_diag = Math.min(N, limit);
        int backward_start_diag;
        if ((N & 0x1) == (limit & 0x1)) {
            backward_start_diag = Math.max(-N, -limit);
        }
        else {
            backward_start_diag = Math.max(1 - N, -limit);
        }
        final int backward_end_diag = Math.min(M, limit);
        final int[][] max_progress = new int[Math.max(forward_end_diag - forward_start_diag, backward_end_diag - backward_start_diag) / 2 + 1][3];
        int num_progress = 0;
        for (int k = forward_start_diag; k <= forward_end_diag; k += 2) {
            final int x = V[0][limit + k];
            final int y = x - k;
            if (x <= N) {
                if (y <= M) {
                    final int progress = x + y;
                    if (progress > max_progress[0][2]) {
                        num_progress = 0;
                        max_progress[0][0] = x;
                        max_progress[0][1] = y;
                        max_progress[0][2] = progress;
                    }
                    else if (progress == max_progress[0][2]) {
                        ++num_progress;
                        max_progress[num_progress][0] = x;
                        max_progress[num_progress][1] = y;
                        max_progress[num_progress][2] = progress;
                    }
                }
            }
        }
        boolean max_progress_forward = true;
        for (int i = backward_start_diag; i <= backward_end_diag; i += 2) {
            final int x2 = V[1][limit + i];
            final int y2 = x2 - i - delta;
            if (x2 >= 0) {
                if (y2 >= 0) {
                    final int progress2 = N - x2 + M - y2;
                    if (progress2 > max_progress[0][2]) {
                        num_progress = 0;
                        max_progress_forward = false;
                        max_progress[0][0] = x2;
                        max_progress[0][1] = y2;
                        max_progress[0][2] = progress2;
                    }
                    else if (progress2 == max_progress[0][2] && !max_progress_forward) {
                        ++num_progress;
                        max_progress[num_progress][0] = x2;
                        max_progress[num_progress][1] = y2;
                        max_progress[num_progress][2] = progress2;
                    }
                }
            }
        }
        return max_progress[num_progress / 2];
    }
    
    public ILCSInput getInput() {
        return this.input;
    }
    
    public RangeDifference[] getDifferences() {
        return RangeComparatorLCS.getDifferences(this);
    }
    
    public RangeDifference[] getRanges() {
        return RangeComparatorLCS.findRanges(this);
    }
}
