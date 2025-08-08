package oops;

public class sumfun {
    
    void add(int a,int b){
        System.out.println("Sum of numbers:"+ (a+b));
    }


        void sub (int a,int b){
        System.out.println("sub of numbers:"+ (a-b));
    }

        void mul(int a,int b){
        System.out.println("mul of numbers:"+ (a*b));
    }

        void div(int a,int b){
        System.out.println("div of numbers:"+ (a/b));
    }


    public static void main(String[] args){
        sumfun cls=new sumfun();
        cls.add(10,20);
         cls.sub(10,20);
          cls.mul(10,20);
           cls.div(100,20);

    }
}
/*Sum of numbers:30
sub of numbers:-10
mul of numbers:200
div of numbers:5
*/