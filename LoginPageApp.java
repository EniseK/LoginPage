import java.util.Scanner;

public class LoginPageApp {
    /*Project: Design a log-in and sign-up page.

    menu: Show the users an options menu

    register: Get first name, last name, e-mail address, and password info from the user

    login: enter email and password
    if the email's not found, give a notification saying "this email address is not registered on our system, please sign-up.
    if the email and the password are correct, they can enter the website.

    email validation: .no space
                      .must include '@'
                      .must end with gmail.com or yahoo.com etc.
                      .before @ there can only be letters, numbers, or '-' , '.' , '_' symbols.

    password validation: .no space
                         .at least 6 characters
                         .at least 1 lower case letter
                         .at least 1 uppercase letter
                         .at least 1 number
                         .at least 1 symbol

        */
    public static void main(String[] args) {

        start();
        // a User class for common properties of users
        //a UserService class for other user operations


    }

    private static void start() {
        Scanner input = new Scanner(System.in);
        //show a menu

        int select;
        do {
            System.out.println(" ==== WELlCOME === ");
            System.out.println(" 1) Sign-up");
            System.out.println(" 2) Log-in");
            System.out.println(" 0) Exit");

            select = input.nextInt();

            switch (select) {
                case 1:
                    break;

                case 2:
                    break;

                case 0:
                    break;
            }

        } while (select != 0);


    }

}
