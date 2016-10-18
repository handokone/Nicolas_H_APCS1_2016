/**
 * 
 * @author Nicolas Handoko
 * @since 10/11/16
 */
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("No") >= 0) {
			response = "Wow, okay. Rude.";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0) {
			response = "Tell me more about your family.";
		} 
		else if (statement.indexOf("brother") >= 0){
			response = "My brother, I miss him. I have not seen my brother since the accident.";
		}
		else if (statement.indexOf("Ms. Dreyer") >= 0) {
			response = "What a lovely teacher, despite the fact that I have never seen her before.";
		}
		else if(statement.indexOf("Hi") >= 0) {
			response = "Hello mortal! I lack emotions :D!";
		}
		else if(statement.indexOf("Pokemon") >= 0){
			response = "GOTTA CATCH 'EM ALL!";
		}
		else if(statement.trim().length() == 0){
			response = "Hello? Answer me you foolish mortal!";
		}
		else if(statement.indexOf("name") >= 0){
			response = "And his name is John Cena!";
		}
		else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "That's nice";
		} else if (whichResponse == 5) {
			response = "Wow, that is really cool.";
		}

		return response;
	}
}
