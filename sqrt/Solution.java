package sqrt;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int results = mysqrt(n);
        int resultsBS = mysqrtBS(n);
        System.out.println(results);
        System.out.println(resultsBS);
        sc.close();

    }
    public static int mysqrt(int n){
        int i=1;
        while(i*i <=n){
            i++;
        }
        return i-1;
    }

    public static int mysqrtBS(int n){
        if(n ==0||n==1){
            return n;
        }
        int low =0,high =n,ans =0;
        while(low <=high){
            int mid = low+(high-low)/2;

            long sq =(long)mid*mid;
            if(sq == n){
                return mid;
            }else if(sq<n){
                ans = mid;
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }

}
