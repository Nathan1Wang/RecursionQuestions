//Nathan Wang, Phidget section 

//import doodlepad.*;
package gettingstarted;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class TrueOrFalse {
	 public static void main(String[] args) throws Exception{
		  //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        int numCorrect = 0;
        System.out.println("Welcome to recursion jeopardy! The green button is true, the red is false.");
        System.out.println("Each recursive call has its own set of local variables and formal parameters. (True/False)");
        while (true) {
            if(redButton.getState()){
                redLED.setState(true);
                System.out.println("incorrect");
                break;
            }
            if(greenButton.getState()){
                greenLED.setState(true);
                System.out.println("correct!");
                numCorrect++;
                break;
			}
            Thread.sleep(150);
        }
        Thread.sleep(500);
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(1500);

       
        System.out.println("Merge sort starts in the middle of a sorted array and splits it in half until the desired value is found.");
        while (true) {
             if( redButton.getState()){
                redLED.setState(true);
                System.out.println("correct");
                break;
            }
            if(greenButton.getState()){
                greenLED.setState(true);
                System.out.println("incorrect");
                numCorrect++;
                break;
			}
            Thread.sleep(150);
        }
        Thread.sleep(500);
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(1500);
        
        System.out.println("A recursive method contains at least one base case and at least two recursive calls.");
        while (true) {
             if(redButton.getState()){
                redLED.setState(true);
                System.out.println("correct");
                break;
            }
            if(greenButton.getState()){
                greenLED.setState(true);
                System.out.println("incorrect");
                numCorrect++;
                break;
			}
            Thread.sleep(150);
        }
        Thread.sleep(500);
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(1500);
        
        System.out.println("Not all recursive solutions can be replicated through the use of an iterative approach.");
        while (true) {
            if( redButton.getState()){
                redLED.setState(true);
                System.out.println("correct");
                break;
            }
            if(greenButton.getState()){
                greenLED.setState(true);
                System.out.println("incorrect");
                numCorrect++;
                break;
			}
            Thread.sleep(150);
        }
        Thread.sleep(500);
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(1500);
        System.out.println("Game over. You got " + numCorrect + " out of 4 questions correct.");

	}
}
