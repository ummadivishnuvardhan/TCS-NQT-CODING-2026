import java.util.*;
class SecondSmallestAndLargest{
    public static int SecondLargest(int[] arr){
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]<first&&arr[i]>second){
                second=arr[i];
            }
        }
        return second;
    }
      public static int SecondSmallest(int[] arr){
        int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>first&&arr[i]<second){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of elements:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second Largest element:"+SecondLargest(arr));
        System.out.println("Second Smallest element:"+SecondSmallest(arr));
    }
}