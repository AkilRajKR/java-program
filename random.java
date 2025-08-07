import java.util.Random;

public class random {
    public static void main(String[] args){
        Random rand=new Random();
        int newnum=rand.nextInt(51);
        System.out.println(newnum);

    }
}
/*PS E:\placement\java> java random.java
9
PS E:\placement\java> java random.java
25
PS E:\placement\java> java random.java
49
PS E:\placement\java> java random.java
6
PS E:\placement\java> java random.java
41 */