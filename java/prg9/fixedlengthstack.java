package prg9;


    public class fixedlengthstack implements issimplestack{

        private char[] data;
        private int tos;
    
        fixedlengthstack(int size)
        {
            data=new char[size];
            tos=0;
        }
    public void push(char ch)
    {
        if(isfull()){
            System.out.println("stack is full");
            return;
    
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
        return tos==data.length;
    }
    }
        
        
    
    
    

