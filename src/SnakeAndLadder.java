import java.util.Random;

public class SnakeAndLadder {

	public static final int SAME_POSITION = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to snake and ladder game...");

		int position = 0;
		System.out.println("Starting position of player = " + position);

		Random random = new Random();
		int dice = random.nextInt(6);
		int check = random.nextInt(3);

		System.out.println("Player got the position " + dice);

		switch (check) {
		case SAME_POSITION:
			System.out.println("Player remains on the same position..." + dice);
			break;
		case LADDER:
			position = position + dice;
			System.out.println("Player get ladder & positon of the player = " + position);
			break;
		case SNAKE:
			position = position - dice;
			if (position < 0) {
				position = 0;
				System.out.println("Player get snake & positon of the player = " + position);
			}

		}

	}

}
