class shape1{
   
    double height;
    double breadth;
    shape1(double h,double b){
       height=h;
        breadth=b;
        
    }}
    class shape{
        double length;
        double breadth;
        shape(double l,double b){
           length=l;
            breadth=b;
    }
    
    
    void print_sup(){
        System.out.println("I am in superclass");
        
    }
}

class triangle extends shape1{
    String s;
   triangle(double h,double b){
    super(b,h);
    
   }
         double area1(){
            return (height*breadth)/2;
         }     
         void print_sub(){
            System.out.println("I am in subclass extending shape");
         }  
    }       
    class rectangle extends shape{
        rectangle(double l,double b){
        super(l,b);
        }
        double area2(){
            return (length*breadth)/2;
         }   

    }



public class inherit1 {
    public static void main(String[] args) {
        triangle t1=new triangle(10,20);
        rectangle r1=new rectangle(10, 10);
        
        t1.print_sub();
        System.out.println("area="+t1.area1());
        System.out.println("area="+r1.area2());
        

    }
    
}