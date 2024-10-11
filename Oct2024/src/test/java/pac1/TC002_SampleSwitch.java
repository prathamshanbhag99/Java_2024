package pac1;

public class TC002_SampleSwitch {
    public static void main(String args[]) {
        for(int i = 0; i <= 4; i++) {
            switch(i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two.");
                    break;
                case 3:
                    System.out.println("i is three.");
                    break;
                default:
                    System.out.println("i is greater than 3.");
            }
        }
        
        int j=0;
        
        while(j<=4)
        {
        	System.out.println("J value is "+j);
        	j++;
        }
        
        do 
        {
        	System.out.println("J value is "+j);
        	j++;
        }while (j<=10);
        	
    }
}
