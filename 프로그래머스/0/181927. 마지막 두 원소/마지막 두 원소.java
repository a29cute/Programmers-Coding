class Solution {
    public int[] solution(int[] num_list) {
        int[] arrResult = new int [num_list.length + 1];

        for(int i = 0; i < num_list.length; i++){
            arrResult[i] = num_list[i];

        }

        int lastValue = num_list[num_list.length - 1]; // 마지막 원소
        int secondlastValue = num_list[num_list.length - 2]; // 마지막에서 두번째 원소

        if (lastValue > secondlastValue) {
            int result = lastValue - secondlastValue;
            arrResult[arrResult.length - 1] = result;

        } else {
            int result = lastValue * 2;
            arrResult[arrResult.length - 1] = result;
        }

        return arrResult;
    }
}
