import java.util.*;
public class tomriddle_diary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        Map<String,Integer> dict=new HashMap<>();
        for(int i=0;i<a;i++){
            
            String b=sc.nextLine();

            dict.put(b, dict.getOrDefault(b,0)+1);
            if(dict.get(b)==1){
                System.out.println("NO");
            }else{
               System.out.println("YES"); 
            }

        }
        sc.close();
    }
}
