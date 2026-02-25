import java.util.*;
class FirstAndLastIndex{
    
    public static void main(String[] args){
           System.out.print("Enter the number of elements:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
         System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target:");
        int tar=sc.nextInt();


        int[] res={-1,-1};
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar){
                res[0]=mid;
                high=mid-1;
            }
            else if(tar<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar){
                res[1]=mid;
                low=mid+1;
            }
            else if(tar<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("First Index:"+res[0]);
        System.out.println("Last Index:"+res[1]);
    }
}