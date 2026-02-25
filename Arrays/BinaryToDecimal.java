import java.util.*;
class BinaryToDecimal{
   
       public static void main(String[] args) {
            System.out.print("Enter the Binary value:");
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
       int pow=1,ans=0;
       while(binary>0){
            int unit_digit=binary%10;
            ans+=pow*unit_digit;
            binary=binary/10;
            pow=pow*2;
       }
        System.out.print("Decimal Value is:"+ans);
    }
}