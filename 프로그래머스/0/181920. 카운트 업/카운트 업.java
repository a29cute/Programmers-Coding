class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] solution = new int[end_num - start_num + 1]; // 8개
        int count = 0;
        for (int i = start_num; i <= end_num; i++) {
            solution[count] = i;
            count++;
        }

        return solution;
    }
}