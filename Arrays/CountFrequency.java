import java.util.*;
class CountFrequency{
    public static Map<Integer,Integer> countFreq(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return map;
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
         Map<Integer,Integer> result=countFreq(arr);
        for(Map.Entry<Integer,Integer> entry:result.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}