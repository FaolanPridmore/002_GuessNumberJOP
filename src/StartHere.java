
public class StartHere {

	public static void main(String[] args) {

		String first_welcome = "Yo! You're in my program! Welcome";
		String second_welcome = "In this first program, we are going to play a guess a number game";
		String third_welcome = "Are you ready to play";

		CreateMsg welcome = new CreateMsg();
		welcome.msg(first_welcome);
		welcome.msg(second_welcome);
		welcome.msg(third_welcome);
		
		GuessNumber guessOne = new GuessNumber();

		guessOne.startGame();

	}

}
