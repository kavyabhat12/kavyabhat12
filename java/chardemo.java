public class chardemo {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        System.out.println("buffer="+sb);
        System.out.println("capacity="+sb.capacity());
        System.out.println("charAt(1) before="+sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after="+sb);
        System.out.println("capacity="+sb.capacity());
        System.out.println("charAt(1) After="+sb.charAt(23));


        

    }
    
}

    

