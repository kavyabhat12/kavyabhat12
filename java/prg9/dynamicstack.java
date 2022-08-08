package prg9;

public class dynamicstack implements issimplestack{

    private char[] data;
    private int tos;

    dynamicstack(int size)
    {
        data=new char[size];
        tos=0;
    }   
    public void push(char ch){
        if(tos==data.length){
            char[]t=new char[data.length*2];
            for(int i=0;i<tos;i++)
            t[i]=data[i];
            data=t;
        }
            data[tos]=ch;
            tos++;
        }
        public char pop(){
            if(isempty()){
                System.out.println("Stack is empty");
                return(char)0;

            }
            tos--;
            return data[tos];
        }
        public boolean isempty(){
            return tos==0;
        }
        public boolean isfull(){
            return false;
        }
    }
    

