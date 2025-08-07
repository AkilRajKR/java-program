package oops;

public class clshotel {


    int coffee=25;
    int tea=20;
    public static void main(String[] args){
        //creating an object for a class
        //here server is the object
        clshotel server1=new clshotel();
        System.out.println("coffee: "+server1.coffee);

        clshotel server2=new clshotel();
        System.out.println("Tea: "+server2.tea);
    }
}
/*coffee: 25
Tea: 20 */