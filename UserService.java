import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();

    //gather name-last name from the user following the rules.
    public void signup() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String fullName = inp.nextLine();
//if the email is faulty, it needs to be entered again. Therefore, it is best to use a do-while loop.
        boolean isValid;
        boolean isExist;
        do {
            System.out.println("Please enter your email address: ");
            String email = inp.nextLine();
            isValid = validateEmail(email);
            isExist = this.emails.contains(email);
            if (isExist) {
                System.out.println("The email address you have entered is already registered to our system. Please try to log-in.");
                isValid = false;
            }

        } while (!isValid);

//password creation.


    }

    private boolean validateEmail(String email) {
        return true;
    }

    public void login() {
    }


}
