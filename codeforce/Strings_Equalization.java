/*import java.util.*;

public class Strings_Equalization{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=0;i<a;i++){
            String l1=sc.nextLine();
           
            String l2=sc.nextLine();
        int[] arr=new int[26];
        for(int j=0;j<l1.length();j++){
                char c=l1.charAt(j);
                arr[c-'a']++;
        }
         for(int j=0;j<l2.length();j++){
                char c=l2.charAt(j);
                arr[c-'a']--;
        }
        String result="NO";
       for(int k=0;k<26;k++){
        if(arr[k]!=0){
            result="YES";
            break;
        }
      
       }
       System.out.println(result);
    
        }
           sc.close();
    }
}*/

import java.util.*;

public class Strings_Equalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine()); 

        for (int i = 0; i < q; i++) {
            String s = sc.nextLine();
            String t = sc.nextLine();

            boolean possible = false;

            for (char c : s.toCharArray()) {
                if (t.indexOf(c) != -1) {
                    possible = true;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
