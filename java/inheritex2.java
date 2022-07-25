class shape{
    double breadth;
    double height;
    //shape(){
       // height=10;
        //breadth=20;
    
    
    void print_sup(){
        System.out.println("I am in superclass");
        
    }
}


class triangle extends shape{
    String s;
    triangle( double h,double b){
        height=h;
        breadth=b;
    }
         double area(){
            return (height*breadth)/2;
         }     
        
         void print_sub(){
            System.out.println("I am in subclass extending shape");
         }  
    }       

public class inheritex2 {
    
    public static void main(String[] args) {
        triangle t1=new triangle(10,10);
        t1.print_sup();
        t1.print_sub();
        System.out.println("area="+t1.area());
    }
    
}
