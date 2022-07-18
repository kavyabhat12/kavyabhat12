class Method
{
    double l,b,h;
    double area(float b,float h)
    {
        return((b*h)/2);
    }

double area(double a){
    return a*a;
}
double area(double b,double l)
{
    return l*b;
}

}

public class Area {
    public static void main(String[] args) {
        double a1,a2,a3;
        Method v=new Method();
        a1=v.area(4, 2);
        a2=v.area(6);
        a3=v.area(4, 5);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
