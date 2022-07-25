class shape{
    double breadth;
    double height;
    shape(){
        height=10;
        breadth=20;
    }
    
    void print_sup(){
        System.out.println("I am in superclass");
        
    }
}

class traingle extends shape{
    String s;
   
         double area(){
            return (height*breadth)/2;
         }     
         void print_sub(){
            System.out.println("I am in subclass extending shape");
         }  
    }       


public class inherit2 {
    public static void main(String[] args) {
        traingle t1=new traingle();
        t1.print_sup();
        t1.print_sub();
        System.out.println("area="+t1.area());
    }
    
}
