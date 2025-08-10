package methodoverload;

public class school {

        void display(){
            System.out.println("Hello world");
        }

        void display(int a){
            System.out.println("Hellow world@:"+a);
        }

     public static void main(String[] args){
        school sh=new school();

        sh.display();
        sh.display(846);
     }
}
/*PS E:\placement\java\methodoverload> java school.java 
   sh.display();    ->Hello world
   sh.display(846);  ->Hellow world@:846 
   
   
   
why it is method overloading means-->

the function or method (i.e display) have been created   

*/