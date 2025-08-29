package ReverseNumber;
class Solution {
    public int reverse(int n) {
    int sum =0;
    while(n !=0){
       int rem=n%10;
    //    sum=rem+sum*10;
       n=n/10;
    

    if (sum > Integer.MAX_VALUE /10 ||
        ( sum == Integer.MAX_VALUE /10 && rem >7)){
    return 0;
    }
    if (sum < Integer.MIN_VALUE /10 ||
         (sum == Integer.MIN_VALUE /10 && rem <-8)){
    return 0;
    }
     sum=rem+sum*10;
}
return sum;
}
}