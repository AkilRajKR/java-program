import java.util.Scanner;

public class IndexSentence{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       sc.nextLine();
       
     for(int i=0;i<a;i++){
        String word="";
         String sentence=sc.nextLine();
         String[] arr=sentence.split(" ");
         int len=arr.length;
         for(int j=0;j<len;j++){
              word+=arr[j].charAt(0);
         }
        System.out.println(word);
     }
     sc.close();
    }
    
}