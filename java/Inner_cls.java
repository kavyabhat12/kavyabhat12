class Outer
{
    int outer_x=100;
    class Inner{
        int inner_y=200;
        void imethod()
        {
            System.out.println("Accessing from inner class");
            System.out.println(outer_x);
            System.out.println(inner_y+outer_x);
    

        }
    }
    void display()
    {
        Inner ob1=new Inner();
        System.out.println("The value of inner class variable is"+ob1.inner_y);
        System.out.println("The value of outer variable is"+outer_x);
    }
}
public class Inner_cls {
    public static void main(String[] args) {
        Outer obname=new Outer();
        obname.display();
        Outer.Inner ob2=obname.new Inner();
        ob2.imethod();

    }
    
}
