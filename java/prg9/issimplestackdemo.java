package prg9;

public class issimplestackdemo {
    public static void main(String[] args){
       fixedlengthstack f=new fixedlengthstack(10);
      dynamicstack d=new dynamicstack(5);
       issimplestack istack;
        istack=f;
       System.out.println("\nContent of Fixed Stack");
        for(int i=0;i<10;i++)
               istack.push((char)('A'+i));
       
       for(int i=0;i<10;i++)
               System.out.print(istack.pop()+"\t");
               istack=d;
        System.out.println("\nContent of Dynamic Stack");
       for(int i=0;i<10;i++)
               istack.push((char)('A'+i));
       
       for(int i=0;i<10;i++)
               System.out.print(istack.pop()+"\t");
       
}
}
    

