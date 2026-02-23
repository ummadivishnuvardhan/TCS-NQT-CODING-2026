import java.util.*;
class ReverseArray{

    public static void reverse(int[] arr){
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;    
            st++;
            end--;
        }
    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
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
        System.out.println("The reversed Array:");
        reverse(arr);
        display(arr);

    }
}