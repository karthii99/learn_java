import java.io.*;
import java.util.*;

public class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String input = sc.next();
            try{
                long x = Long.parseLong(input);
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");}
                if(x>=-32768 && x<=32767){
                    System.out.println("* short");}
                if(x>=-2147483648L && x<=2147483647L){
                    System.out.println("* int");}
                if(x>=-9223372036854775808L && x<=9223372036854775807L){
                    System.out.println("* long");
                }
                }
                catch (Exception e) {
                    System.out.println(input+"5 can't be fitted anywhere.");
                    sc.next();
            }
        }
        
        
    }
}
