class Solution {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                int result = arr[i] / 2;
                arr[i] = result;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                int result = arr[i] * 2;
                arr[i] = result;
            }

        }
        return arr;
    }
}