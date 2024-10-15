package pac1;

class SwipeMachine1 
{
    void readcard()
    {
        System.out.println("Read Card from the Parent");
    }
}

class ChipCardMachine extends SwipeMachine1 {
   
    void readcard()
    {
    	super.readcard();
        System.out.println("Read Card from Child");
    }
}

public class SwipeMachine {
    public static void main(String[] args) {
        // Creating an object of ChipCardMachine
        SwipeMachine1 obj1 = new ChipCardMachine();
        obj1.readcard();  
        obj1=new SwipeMachine1();
        obj1.readcard(); 
        
        
    }
}
