package foreacharray;
//import java.util.Scanner;

public class school{
    public static void main(String[] args){
        int num[] = {65,32,87,98,41,13};

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }


        //foreach same output like above[var and i are same ]

        for(int var:num){
            System.out.println(var);
        }

    }}