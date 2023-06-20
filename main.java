import java.util.Random;
import java.util.Scanner;

public class main {

        public static void main(String[] args) {
        System.out.println("Welcome to 'Rock, Paper, Scissor'!");

        while(true) {
            System.out.println("You choose: ");
            Scanner input = new Scanner(System.in);
            String playerChoice = input.nextLine().toLowerCase();

            if (!playerChoice.equals("scissor") && !playerChoice.equals("rock") && !playerChoice.equals("paper")) {
                System.out.println("invalid option, use 'rock' 'paper' or 'scissor'");
                continue;
            }

            String computerChoice = compChoose();

            System.out.println("Computer choose: " + computerChoice);

            String result = checkWin(playerChoice, computerChoice);
            System.out.println("result: " + result);
            System.out.println("");

            System.out.println("Play again? (y/n)");
            String playAgain = input.nextLine().toLowerCase();
            if(playAgain.equals("n")) {
                break;
            }
        }
    }

    public static String checkWin(String playerChoice, String computerChoice) {
        if(playerChoice.equals(computerChoice)) {
            return "Draw";
        } else if(playerChoice == "rock" && computerChoice == "scissors") {
            return "Player wins";
        } else if(playerChoice == "paper" && computerChoice == "rock") {
            return "Player wins";
        } else if(playerChoice == "scissors" && computerChoice == "paper") {
            return "Player wins";
        } else {
            return "Computer wins";
        }
    }
    
    public static String compChoose() {
        String[] compChoice = {"rock", "paper", "scissor"};
        Random random = new Random();
        int index = random.nextInt(compChoice.length);
        return compChoice[index];
    }
}
