import java.util.*;
class FirstNonRepeatingCharacter{
    public static void main(String[] args) {
        System.out.print("Enter the String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char ch=entry.getKey();
            if(entry.getValue()==1){
                System.out.print("The First Non Repeating Character is:"+ch);
                break;
            }
        }
    }
}