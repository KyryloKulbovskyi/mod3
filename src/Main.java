import java.util.Scanner;

public class Main {
    public int calculateFinalPrice(int price, boolean isOutlet, boolean isBlackFriday) {
        if (isBlackFriday) {
            Scanner in = new Scanner(System.in);
            System.out.println("Is it Black Friday? (yes or no): ");
            String ans = in.nextLine();
            boolean isBlack = ans.equals("yes");
            return price / 2;
        }
        if (isOutlet) {
            return price * 9 / 10;
        }
        return price;
    }
}
