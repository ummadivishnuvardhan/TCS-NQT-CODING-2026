
import java.util.*;
class LargestNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
         System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        System.out.print("The maximun element is:"+min);
    }
}