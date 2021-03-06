package fracCalc;
import java.util.*;

public class FracCalcCheck2 {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	
    	String userInput = "";
    	Scanner scan = new Scanner(System.in);
    	while(userInput != "quit"){
    		//System.out.println("Please input your equation: ");
    		userInput = scan.nextLine();
    		System.out.println(produceAnswer(userInput));
    	}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	
        String[] stringSplit = input.split(" ");
        String operand1 = stringSplit[0];
        String operator = stringSplit[1];
        String operand2 = stringSplit[2];
        String[] splitOperand1 = operand1.split("_");
        String wholeNum;
        String numerator;
        String denominator;
        String wholeNum1;
        String numerator1;
        String denominator1;
        if(splitOperand1.length == 2){
        	wholeNum = splitOperand1[0];
            String[] splitOperand1Again = splitOperand1[0].split("/");
        	if(splitOperand1Again.length == 1){
        		numerator = splitOperand1Again[0];
        		denominator = "1";
        	} else{
        		numerator = splitOperand1Again[0];
        		denominator = splitOperand1Again[1];
        	}
        } else{
            String[] splitOperand1Again = splitOperand1[0].split("/");
            wholeNum = "0";
        	if(splitOperand1Again.length == 1){
        		numerator = splitOperand1Again[0];
        		denominator = "1";
        	} else{
        		numerator = splitOperand1Again[0];
        		denominator = splitOperand1Again[1];
        	}
        }
        String[] splitOperand2 = operand2.split("_");
        if(splitOperand2.length == 2){
        	wholeNum1 = splitOperand2[0];
            String[] splitOperand2Again = splitOperand2[1].split("/");
        	if(splitOperand2Again.length == 1){
        		numerator1 = splitOperand2Again[0];
        		denominator1 = "1";
        	} else{
        		numerator1 = splitOperand2Again[0];
        		denominator1 = splitOperand2Again[1];
        	}
        } else{
            String[] splitOperand2Again = splitOperand2[0].split("/");
        	if(splitOperand2Again.length == 1){
        		wholeNum1 = splitOperand2[0];
        		numerator1 = "0";
        		denominator1 = "1";
        	} else{
        		wholeNum1 = "0";
        		numerator1 = splitOperand2Again[0];
        		denominator1 = splitOperand2Again[1];
        	}
        }
        return ("whole:" + wholeNum1 + " numerator:" + numerator1 + " denominator:" + denominator1);
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
