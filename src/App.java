public class App {
    static int NO_PLAY = 0;
    static int LADDER = 1;
    static int SNAKE = 2;

    public static int checkOption() {
        int option = (int) (Math.random() * 3);

        return option;
    }

    public static int rollDice() {
        int roll = (int) (Math.random() * 6) + 1;

        return roll;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to snake and ladders game");

        int position = 0;
        System.out.println("Starting position of player: " + position);

        int currOption = checkOption();

        if (currOption == NO_PLAY) {
            System.out.println("Your current option is no play");
            return;
        }

        System.out.println("Your current option is " + (currOption == LADDER ? "ladder" : "snake"));

        int currTurn = rollDice();
        System.out.println("Current turn: " + currTurn);

        if (currOption == LADDER)
            position += currTurn;
        else
            position -= currTurn;

        System.out.println("Your new position is " + position);
    }
}
