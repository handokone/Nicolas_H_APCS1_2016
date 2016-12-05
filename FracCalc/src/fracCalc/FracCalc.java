package fracCalc;
import java.util.*;

public class FracCalc {

	public static void main(String[] args) 
    {
    	String userInput = "";
    	Scanner scanInput = new Scanner(System.in);
    	while(userInput != "quit"){
    		userInput = scanInput.nextLine();
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
        int[] firstOperand = new int[3];
        int[] secondOperand = new int[3];
        // Creates new Arrays for each Operand. 
        // Does this so does not have to make an int represent a type of the operator during parseOperand. 
        firstOperand = parseOperand(operand1);
        if(firstOperand[2] == 0){
        	return("ERROR: Cannot divide by zero.");
        }
        secondOperand = parseOperand(operand2);
        if(secondOperand[2] == 0){
        	return("ERROR: Cannot divide by zero.");
        }
        int[] improperOperand1 = toImproperFrac(firstOperand[0], firstOperand[1], firstOperand[2]);
        int[] improperOperand2 = toImproperFrac(secondOperand[0], secondOperand[1], secondOperand[2]);
        int[] answer = new int[2];
        if(operator.equals("*")){
        	answer = multiply(improperOperand1[0], improperOperand1[1], improperOperand2[0], improperOperand2[1]);
        } else if(operator.equals("+")){
        	answer = add(improperOperand1[0], improperOperand1[1], improperOperand2[0], improperOperand2[1]);
        } else if(operator.equals("/")){
        	answer = divide(improperOperand1[0], improperOperand1[1], improperOperand2[0], improperOperand2[1]);
        } else if(operator.equals("-")){
        	answer = subtract(improperOperand1[0], improperOperand1[1], improperOperand2[0], improperOperand2[1]);
        } else{
        	//Extra credit
        	//Throw exception if the input is of an invalid format (i.e "++", "--", "-+", etc.)
        	return("ERROR: Input is in an invalid format.");
        }
        return answer[0] + "/" + answer[1];
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static int[] toImproperFrac(int wholeNum, int numerator, int denominator){
    	if(wholeNum < 0){
    		numerator = (wholeNum * denominator) - numerator;
    	} else{
    		numerator = (wholeNum * denominator) + numerator;
    	}
    	int[] improperFrac = new int[2];
    	improperFrac[0] = numerator; 
    	improperFrac[1] = denominator;
    	return improperFrac;
    }
    
    public static int[] multiply(int numer1, int denom1, int numer2, int denom2){    	
    	int newNumer = numer1 * numer2;
    	int newDenom = denom1 * denom2;
    	int[] newFraction = {newNumer, newDenom};
    	return newFraction;
    }
    
    public static int[] divide(int numer1, int denom1, int numer2, int denom2){
    	int newNumer = numer1 * denom2;
    	int newDenom = numer2 * denom1;
    	int[] newFraction = {newNumer, newDenom};
    	return newFraction;
    }
    
    public static int[] add(int numer1, int denom1, int numer2, int denom2){
    	int newNumer;
    	int newDenom;
    	if(denom1 != denom2){
    		newDenom = denom1 * denom2;
    		newNumer = (numer1 * denom2) + (numer2 * denom1);
    	} else{
    		newDenom = denom1;
    		newNumer = numer1 + numer2;
    	}
    	int[] newFraction = {newNumer, newDenom};
    	return newFraction;
    }
    
    public static int[] subtract(int numer1, int denom1, int numer2, int denom2){
    	int newNumer;
    	int newDenom;
    	if(denom1 != denom2){
    		newDenom = denom1 * denom2;
    		newNumer = (numer1 * denom2) - (numer2 * denom1);
    	} else{
    		newDenom = denom1;
    		newNumer = numer1 - numer2;
    	}
    	int[] newFraction = {newNumer, newDenom};
    	return newFraction;
    }
    
    public static int[] parseOperand(String operand){
    	String[] splitFraction = operand.split("_");
    	String wholeNum;
    	String numerator;
    	String denominator;
    	if(splitFraction.length == 2){
        	wholeNum = splitFraction[0];
            String[] splitFractionAgain = splitFraction[1].split("/");
        	if(splitFractionAgain.length == 1){
        		numerator = splitFractionAgain[0];
        		denominator = "1";
        	} else{
        		numerator = splitFractionAgain[0];
        		denominator = splitFractionAgain[1];
        	}
        } else{
        	wholeNum = "0";
            String[] splitFractionAgain = splitFraction[0].split("/");
        	if(splitFractionAgain.length == 1){
        		numerator = splitFractionAgain[0];
        		denominator = "1";
        	} else{
        		numerator = splitFractionAgain[0];
        		denominator = splitFractionAgain[1];
        	}
        }
    	int[] fractionArray = new int[3];
    	fractionArray[0] = Integer.parseInt(wholeNum);
    	fractionArray[1] = Integer.parseInt(numerator);
    	fractionArray[2] = Integer.parseInt(denominator);
    	return fractionArray;
    }
}