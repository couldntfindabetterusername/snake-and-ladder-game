public class App {

    public static int rollDice() {
        int roll = (int) (Math.random() * 6) + 1;

        return roll;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to snake and ladders game");

        int position = 0;
        System.out.println("Starting position of player: " + position);

        int currTurn = rollDice();
        System.out.println("Current turn: " + currTurn);

    }
}
