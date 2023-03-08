import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Display the available genres
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        System.out.println("Choose your favourite genre from the following:");
        for (String genre : genres) {
            System.out.println("- " + genre);
        }
        
        // Prompt the user to enter their name and favourite genre
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your favourite genre: ");
        String genre = input.nextLine();
        
        // Create the user's profile
        UserProfile userprofile = new UserProfile(name, genre);
        
        // Display a message confirming that the profile was created
        System.out.println("Your userProfile was created.");
    }
}
