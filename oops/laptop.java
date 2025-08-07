package oops;

public class laptop {

    String name="";
    String proc="";
    int ram=0;
    int price=0;

    public static void main(String[] args){
        laptop lap1=new laptop();
        lap1.name="HP";
        lap1.proc="as12";
        lap1.ram=8;
        lap1.price=50000;

         laptop lap2=new laptop();
        lap2.name="Lenova";
        lap2.proc="df78";
        lap2.ram=12;
        lap2.price=70000;

        System.out.println("lap1: "+lap1.name);
              System.out.println("lap2: "+lap2.price); 
    }
}/*lap1: HP
lap2: 70000
 */
