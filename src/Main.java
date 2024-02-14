import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome! Please enter your friends' first name. Press \"d\" when you are done.");
        String input = scan.nextLine();

        ArrayList<String> friendsList = new ArrayList<String>();
        int friendsNumber = 0;

        while (!(input.equals("d"))){
            friendsList.add(input);
            input = scan.nextLine();
            friendsNumber++;
        }
        System.out.println("You have entered " + friendsNumber + " friends.");
        System.out.println("Here is your list of friends: " +friendsList);


        int random = (int)(Math.random() * friendsList.size());
        String randomFriend1 = friendsList.get(random);

        int random2 = (int)(Math.random() * friendsList.size());
        String randomFriend2 = friendsList.get(random);
        while(random == random2) {
            if (random == random2) {

            }
        }

        System.out.println("The two friends that have been randomly chosen to go to the movies with you are: \n" + randomFriend1 + " and " + randomFriend2);
    }
}
