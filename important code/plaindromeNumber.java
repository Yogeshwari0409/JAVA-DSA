class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;

        int num=x;
        int reverse=0;

        while(num>0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }

        return x==reverse;
        
    }
}