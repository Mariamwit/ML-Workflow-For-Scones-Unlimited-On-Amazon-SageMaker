/**
* @author Mariamwit Filfile
* CS 5160, Fall 2022
* Project 1
*/
package filfile_project_1;
import java.util.Scanner;
/**
 * This program calculates the resistance index in ohms and kilo-ohms.  
 * The program will prompt for input from the user, calculate
 * and output resistance results.
 */
public class project1 
{
/**
  * Prompts the user to enter three band colors in until the user
  * provides valid inputs.Allows the user to repeat the process as long as the user wishes.
  * @param args
  */
    public static void main(String[] args) 
    {
        //declaring variables
        String band1Color,band2Color,band3Color,yesorNo;
        int digitalValue1,digitalValue2,multiplierValue,resistanceValue;
        double resistanceValue2;
        
        //initialize variables
        digitalValue1=0;
        digitalValue2=0;
        multiplierValue=0;
        
        //declare a Scanner object (keyboard)
        Scanner keyboard=new Scanner(System.in);
        
        //using do while loop to repeat the process as long as the user wishes.
        do
        {
            //get the first band color
            System.out.print("Enter the color of band1: ");
            band1Color=keyboard.nextLine().toLowerCase();
            
            //validate the entered color band 
            while((!band1Color.equals("black"))&&(!band1Color.equals("brown"))&&(!band1Color.equals("red"))&&(!band1Color.equals("orange"))&&(!band1Color.equals("yellow"))&&(!band1Color.equals("green"))&&(!band1Color.equals("blue"))&&(!band1Color.equals("violet"))&&(!band1Color.equals("gray"))&&(!band1Color.equals("white")))
            {
                System.out.print("That is not a valid color. Re-enter the color of band 1: ");
                band1Color=keyboard.nextLine().toLowerCase();
            }
            
            //get the second band color
            System.out.print("Enter the color of band2: ");
            band2Color=keyboard.nextLine().toLowerCase();
            
            //validate the second entered color band
            while((!band2Color.equals("black"))&&(!band2Color.equals("brown"))&&(!band2Color.equals("red"))&&(!band2Color.equals("orange"))&&(!band2Color.equals("yellow"))&&(!band2Color.equals("green"))&&(!band2Color.equals("blue"))&&(!band2Color.equals("violet"))&&(!band2Color.equals("gray"))&&(!band2Color.equals("white")))
            {
                System.out.print("That is not a valid color. Re-enter the color of band 2: ");
                band2Color=keyboard.nextLine().toLowerCase();
            }
        
            //get the third band color
            System.out.print("Enter the color of band3: ");
            band3Color=keyboard.nextLine().toLowerCase();
           
            //validate the third entered color band
            while((!band3Color.equals("black"))&&(!band3Color.equals("brown"))&&(!band3Color.equals("red"))&&(!band3Color.equals("orange"))&&(!band3Color.equals("yellow"))&&(!band3Color.equals("green"))&&(!band3Color.equals("blue"))&&(!band3Color.equals("violet"))&&(!band3Color.equals("gray"))&&(!band3Color.equals("white")))
            {
                System.out.print("That is not a valid color. Re-enter the color of band 3: ");
                band3Color=keyboard.nextLine().toLowerCase();
            }
        
            //assign the digital value for the first band color entered
            switch (band1Color)
            {
                case "black" -> digitalValue1=0;
                case "brown" -> digitalValue1=1;
                case "red" -> digitalValue1=2;
                case "orange" -> digitalValue1=3;
                case "yellow" -> digitalValue1=4;
                case "green" -> digitalValue1=5;
                case "blue" -> digitalValue1=6;
                case "violet" -> digitalValue1=7;
                case "gray" -> digitalValue1=8;
                case "white" -> digitalValue1=9;
            }
                
            //assign the value of the digital value for the second entered color band
            switch(band2Color)
            {
                case "black" -> digitalValue2=0;
                case "brown" -> digitalValue2=1;
                case "red" -> digitalValue2=2;
                case "orange" -> digitalValue2=3;
                case "yellow" -> digitalValue2=4;
                case "green" -> digitalValue2=5;
                case "blue" -> digitalValue2=6;
                case "violet" -> digitalValue2=7;
                case "gray" -> digitalValue2=8;
                case "white" -> digitalValue2=9;
            }
                
            //assign a multiplier value for the third entered color band
            switch(band3Color)
            {
                case "black" -> multiplierValue=1;
                case "brown" -> multiplierValue=10;
                case "red" -> multiplierValue=(int) Math.pow(10,2);
                case "orange" -> multiplierValue=(int) Math.pow(10,3);
                case "yellow" -> multiplierValue=(int) Math.pow(10,4);
                case "green" -> multiplierValue=(int) Math.pow(10,5);
                case "blue" -> multiplierValue=(int) Math.pow(10,6);
                case "violet" -> multiplierValue=(int) Math.pow(10,7);
                case "gray" -> multiplierValue=(int) Math.pow(10,8);
                case "white" -> multiplierValue=(int) Math.pow(10,9);
            }
            
            //compute the Resistance Value for the entered color bands
            resistanceValue=(digitalValue1*10+digitalValue2)*multiplierValue;
            System.out.printf("The resistance index is %,d",resistanceValue);
            resistanceValue2=(double)resistanceValue/1000;
            System.out.printf(" ohms or %,.3f",resistanceValue2);
            System.out.println(" kilo-ohms.");
            System.out.println();
          
            //ask if the user want to repeat the process as long as the user wishes.
            System.out.println("Do you want to decode another resistor (y/n)?");
            yesorNo=keyboard.nextLine().toLowerCase();
        }
        while(yesorNo.equals("y"));
        
    }//end main
}//end class