import java.util.Scanner;

public class toolong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
       
     for(int i=0;i<a;i++){
         String sentence=sc.nextLine();
         int len=sentence.length();
       //  System.out.println(len);
         if(len>10){
             //System.out.println(sentence.charAt(0)+len-2+sentence.charAt(len-1));
             System.out.println("" + sentence.charAt(0) + (len - 2) + sentence.charAt(len - 1));

         }else{
            System.out.println(sentence);
         }
     }sc.close();
    }
}
