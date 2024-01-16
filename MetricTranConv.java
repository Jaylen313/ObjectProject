
import java.util.Scanner;
public class MetricTranConv {
    public static void main(String[] args)  
    {
       




    
     
        Scanner userinput = new Scanner(System.in);
            int MetricPick;
            float a, b;
        


            System.out.println("****************");
            System.out.println("*--------------*");
            System.out.println("M     M TTTTTTTT");
            System.out.println("MM   MM    TT  ");
            System.out.println("M M M M    TT  ");
            System.out.println("M  M  M    TT  ");
            System.out.println("M     M    TT  ");
            System.out.println("*--------------*");
            System.out.println("****************");
            System.out.println("                ");





            System.out.println("***********************\n");
            System.out.println("Welcome to Metric Trans, your go to solution for simple metric conversions.\n"); 
            System.out.println("The simple metric converter app allows users to convert between centimeters, inches,\n");
            System.out.println("feet, and meters. Simply choose your conversion type (1-6), input the value, and recieve\n");
            System.out.println("the results. We have also included a easy exit option by entering 0.\n");
            System.out.println("***********************\n");
        
        
        
        
        
            do
            {
                System.out.println("\n**Enter a metric conversion choice (1-6):**\n");
                System.out.println("1 = Centimetres to Inches\n2 = Inches to Centimetres\n3 = Inches to Feet\n");
                System.out.println("4 = Feet to Inches\n5 = Feet to Meters\n6 = Meters to Feet\n");
                MetricPick = userinput.nextInt();
        
                switch (MetricPick)
                {
                case 1:
        
                    System.out.println("Enter value for centimeters\n");
                    b = userinput.nextFloat();
                    b = b*0.3937f;
                    
                    System.out.println("----------");
                    System.out.printf("%.2f inches\n", b);
                    System.out.println("----------");
                    break;
        
                case 2:
        
                System.out.println("Enter value for inches\n");
                    b = userinput.nextFloat();
                    b = b*2.54f;
                    
                    System.out.println("----------");
                    System.out.printf("%.2f centimetres\n", b);
                    System.out.println("----------");
                    break;
        
                case 3:
        
                System.out.println("Enter value for inches\n");
                    b = userinput.nextFloat();
                    b = b*0.0833f;
                   
                    System.out.println("----------");
                    System.out.printf("%.2f feet\n", b);
                    System.out.println("----------");
                    break;
        
                case 4:
        
                System.out.println("Enter value for feet\n");
                    b = userinput.nextFloat();
                    b = b*12f;
                    
                    System.out.println("----------");
                    System.out.printf("%.2f inches\n", b);
                    System.out.println("----------");
                    break;
        
                case 5:
        
                System.out.println("Enter value for feet\n");
                    b = userinput.nextFloat();
                    b = b*0.3048f;
                    
                    System.out.println("----------");
                    System.out.printf("%.2f meters\n", b);
                    System.out.println("----------");
                    break;
        
                case 6:
        
                System.out.println("Enter value for meters\n");
                    b = userinput.nextFloat();
                    b = b*3.28084f;
                    
                    System.out.println("----------");
                    System.out.printf("%.2f feet\n", b);
                    System.out.println("----------");
                    break;
        
                case 0:
        
                System.out.println("Exiting the program. Have a nice day!\n");
                    break;
        
                default:
        
                System.out.println("Choose a option 1-6 or 0 to exit");
                    break;
                }
            } while (MetricPick != 0);
        
        
       userinput.close();






















    }
    
}
