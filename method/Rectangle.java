
class Rect{
    int length;
    int breadth;

    Rect(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}

public class Rectangle {
    public static void main(String[] args){
       Rect re=new Rect(10,20);
       System.out.println("Length is: "+re.length);
   System.out.println("breadth is: "+re.breadth);
    }
}

