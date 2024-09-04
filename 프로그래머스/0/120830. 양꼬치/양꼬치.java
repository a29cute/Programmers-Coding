class Solution {
    public int solution(int n, int k) {
        int food = 12000;
        int juice = 2000;
        int result = 0;

        if(n>=10){
            result = (food*n)+(juice*k);
            result -= juice*(n/10);
        } else {
            result = (food*n)+(juice*k);
        }
        
        return result;
    }
}