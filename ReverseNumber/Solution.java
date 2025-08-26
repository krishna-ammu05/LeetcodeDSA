package ReverseNumber;
import java.util.Scanner;
public class Solution {
  
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

   
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum =0;
    while(n !=0){
       int rem=n%10;
       sum=rem+sum*10;
       n=n/10;
    }
    System.out.println("reverse of a number"+sum);
}
}


