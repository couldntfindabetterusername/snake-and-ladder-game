public class App {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static int checkOption() {
        int option = (int) (Math.random() * 3);

        return option;
    }

    public static int rollDice() {
        int roll = (int) (Math.random() * 6) + 1;

        return roll;
    }

    public static int playTurn(int position) {
        if (position == 100) {
            return position;
        }

        int currOption = checkOption();
        int currDiceRoll = rollDice();

        switch (currOption) {
            case SNAKE:
                System.out.println("Your current option is snake");
                position = (position - currDiceRoll) < 0 ? 0 : position - currDiceRoll;
                break;

            case LADDER:
                System.out.println("Your current option is ladder");
                position = (position + currDiceRoll) > 100 ? position : position + currDiceRoll;
                position = playTurn(position);
                break;

            default:
                System.out.println("Your current option is no play");
                break;
        }

        return position;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to snake and ladders game");

        int player1Pos = 0;
        int player2Pos = 0;
        System.out.println("Starting position of player-1: " + player1Pos);
        System.out.println("Starting position of player-2: " + player2Pos);

        int numOfDiceRolls = 0;

        while (player1Pos < 100 && player2Pos < 100) {
            numOfDiceRolls += 1;
            System.out.println("Turn: " + numOfDiceRolls);

            player1Pos = playTurn(player1Pos);
            System.out.println("New position of player-1: " + player1Pos);

            player2Pos = playTurn(player2Pos);
            System.out.println("New position of player-2: " + player2Pos);

            if (player1Pos == 100) {
                System.out.println("Player 1 has won the game in " + numOfDiceRolls + " --------------");
                break;
            } else if (player2Pos == 100) {
                System.out.println("Player 2 has won the game in " + numOfDiceRolls + " --------------");
                break;
            }

            System.out.println();
        }

    }
}
