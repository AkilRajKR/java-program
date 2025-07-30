import java.util.Scanner;
public class Stringcompare {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("First str: ");
        String a=sc.nextLine();
         System.out.print("second str: ");
         String b=sc.nextLine();

         String c="apple"; //here for d tthe java just use the reference of c donot create new string
         String d="apple";

         String e=new String("apple");
           String f=new String("apple");
          

           System.out.println(c==d);//reference checked no content
           System.out.println(e==f);//when new seperate obj created 
           System.out.println(a==b);
           System.out.println(a.equals(b));
           System.out.println(e.equals(f));
           System.out.println(c.equals(d));
    }
}

/*First str: apple
second str: apple
true
false
false
true
true
true */
