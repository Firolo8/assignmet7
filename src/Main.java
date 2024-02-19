import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome! Please enter your friends' first name. Press \"d\" when you are done.");
        String input = scan.nextLine();

        ArrayList<String> friendsList = new ArrayList<String>();


        while (!(input.equals("d"))){
            friendsList.add(input);
            input = scan.nextLine();

        }
        System.out.println("You have entered " + friendsList.size() + " friends.");
        System.out.println("Here is your list of friends: ");
        for (int i = 0; i < friendsList.size(); i++) {
            System.out.println((i + 1) + ". " + friendsList.get(i));
        }


        int random = (int)(Math.random() * friendsList.size());
        int random2 = (int)(Math.random() * friendsList.size());

        if (random == random2) {
            while (random == random2) {
                random = (int) (Math.random() * friendsList.size());
                random2 = (int) (Math.random() * friendsList.size());
            }
        }
        String randomFriend1 = friendsList.get(random);
        String randomFriend2 = friendsList.get(random2);

        System.out.println("The two friends that have been randomly chosen to go to the movies with you are: \n" + randomFriend1 + " and " + randomFriend2);

        System.out.println("Which fiends would you like to take off your friend list and add to your best\n" +
                "friend list? " + "(Indicate with the index number of each name. Press \"0\" to end)");

        ArrayList<String> bffsList = new ArrayList<String>();

        int bffs = scan.nextInt();
        while (bffs != 0) {
            if (bffs <= friendsList.size() && bffs > 0)
            {
                bffsList.add(friendsList.remove(bffs - 1));
                bffs--;
            }
            else
            {
                System.out.println("Please enter a valid friend number or 0 to end.");
            }
            bffs = scan.nextInt();
        }

        System.out.println("\nHere is your list of friends:");
        for (int i = 0; i < friendsList.size(); i++) {
            System.out.println((i + 1) + ". " + friendsList.get(i));
        }

        System.out.println("\nHere is your list of best friends:");
        for (int i = 0; i < bffsList.size(); i++) {
            System.out.println((i + 1) + ". " + bffsList.get(i));
        }
    }
}
