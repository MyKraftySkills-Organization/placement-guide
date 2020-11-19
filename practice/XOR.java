/**
 * ^	XOR - Sets each bit to 1 if only one of the two bits is 1	
 *      5 ^ 1	0101 ^ 0001	 =   0100	 4
 */
import java.util.Scanner;
// brute force
class XOR{

    static int pairOrSum(int arr[], int n){
        int ans = 0;

        for(int i = 0; i < n; i++)
            for(int j = i+1; j < n; j++)
                ans += arr[i] ^ arr[j];        
        return ans;
    }
    public static void main(String []args){
        int arr[] = { 7, 3, 5 };
        int n = arr.length;

        System.out.println(pairOrSum(arr, n));
    }
}