import java.util.Scanner;
public class lettercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
            String a=sc.nextLine();
            String b=sc.nextLine();
 
       /*  if(a.equalsIgnoreCase(b)){
            System.out.println("0");
        }else{*/
           int out=a.compareToIgnoreCase(b);
           if(out>0){
            System.out.println("1");
           }else if(out==0){
            System.out.println("0");
           }
           else{
             System.out.println("-1");
           }  sc.close();
        }
        
      
    }

