import java.util.*;
//sum of left elements=sum of right elements
class EquilibriumElement{
    public static void main(String[] args) {
        System.out.print("Enter the number of elements:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        int leftSum=0,rightSum=sum;
        for(int i=0;i<n;i++){
            rightSum=rightSum-arr[i];
            if(rightSum==leftSum){
                System.out.println("The Equilibrium index is:"+i);
                break;
            }
            leftSum=leftSum+arr[i];
        }
    }
}