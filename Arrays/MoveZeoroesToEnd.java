//[4,5,0,1,9,0,5,0]

import java.util.*;
class MoveZeoroesToEnd{
     public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
       public static void main(String[] args) {
            System.out.print("Enter the number of elements:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0,right=0;
        while(right<arr.length){
            if(arr[right]!=0){
           
           int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
        }
        right++;
        }
        display(arr);
    }
}