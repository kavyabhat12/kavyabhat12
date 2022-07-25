class shape{
    double breadth;
    double height;
    shape(double h,double b){
        height=h;
        breadth=b;
    }
    
    void print_sup(){
        System.out.println("I am in superclass");
        
    }
}

class triangle extends shape{
    String s;
   triangle(double h,double b){
    super(b,h);
    
   }
         double area(){
            return (height*breadth)/2;
         }     
         void print_sub(){
            System.out.println("I am in subclass extending shape");
         }  
    }       


public class inherit1 {
    public static void main(String[] args) {
        triangle t1=new triangle(10,20);
        t1.print_sup();
        t1.print_sub();
        System.out.println("area="+t1.area());
    }
    
}