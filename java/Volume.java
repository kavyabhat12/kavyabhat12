class Box
{
    double l;
    double b;
    double h;
    Box(double l,double b,double h)
    {
        this.l=l;
        this.h=h;
          this.b=b;
        }

    Box(double l)
    {
       this.l=b=h=l;
    }
    double vol()
    {
      return l*b*h;
    }
    void print()
    {
        System.out.println("Method Overloading");
    }
    void print(double vol)
    {
        System.out.println("Volume of Box="+""+vol+"\n");
    }
        

    }

public class Volume{
    public static void main(String[] args) {
        double r1,r2;
        Box b1= new Box(2);
        Box b2=new Box(2, 3, 4);
        r1=b1.vol();
        r2=b2.vol();
        b1.print();
        b2.print();
        b1.print(r1);
        b2.print(r2);
        
    }
}
