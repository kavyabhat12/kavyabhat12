import java.util.Scanner;

public class prg3 {
    public static void main(String[] args) {
        System.out.println("Enter The String=");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.capacity());
        sb=new StringBuffer(sb.reverse());
       System.out.println(sb.toString().toUpperCase());
       System.out.println(sb.append(s).toString());

       
        
    
        
        
    }
    
}
