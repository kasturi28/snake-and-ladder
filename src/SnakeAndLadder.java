import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to snake and ladder game...");
		
		int position = 0;
        System.out.println("Starting position of player = " + position);
        
        Random random = new Random();
        int x1 = random.nextInt(6);
        
        System.out.println("Player got the position " +x1);
        

	}

}
