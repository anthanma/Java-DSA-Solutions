class Solution {
    public double myPow(double x, int n) {
        long N=n;  // preventing stack overfllow if value of n is too big 
        if(n<0){
            x=1/x;
            N=-N;
        } 
        return fastPow(x,N);
    }
    public double fastPow(double x, long N){
        if(N==0){
            return 1;
        }
        double half= fastPow(x, N/2);//logatmic way of doing this 

        //combining two halves to get the full ans 
        if(N%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
}
