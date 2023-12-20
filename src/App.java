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

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to snake and ladders game");

        int position = 0;
        System.out.println("Starting position of player: " + position);

        while (position < 100) {
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
                    break;

                default:
                    System.out.println("Your current option is no play");
                    break;
            }

            System.out.println("Your new position is " + position);
            System.out.println();
        }

    }
}
