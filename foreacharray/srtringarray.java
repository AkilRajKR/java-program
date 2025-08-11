package foreacharray;

public class srtringarray {
     public static void main(String[] args){
        
        String[] dum={"one","two","three","c"};

        for(int i=0;i<dum.length;i++){
            System.out.println(dum[i]);
        }


        //foreach same output like above[var and i are same ]

        for(String var:dum){
            System.out.println(var);
        }

    }
}/*one
two
three
c
one
two
three
c */
