import java.util.Scanner;

public class OnlineExaminationSystem {

    static Scanner sc = new Scanner(System.in);

    static String username = "admin";
    static String password = "1234";

    static int score = 0;

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("      ONLINE EXAMINATION SYSTEM");
        System.out.println("=======================================");

        login();
    }

    public static void login() {

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {

            System.out.println("\nLogin Successful!\n");
            menu();

        } else {

            System.out.println("\nInvalid Username or Password.");

        }

    }

    public static void menu() {

        while (true) {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Start Exam");
            System.out.println("2. Update Password");
            System.out.println("3. Logout");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    startExam();
                    break;

                case 2:
                    updatePassword();
                    break;

                case 3:
                    logout();
                    return;

                default:
                    System.out.println("Invalid Choice!");

            }

        }

    }

    public static void updatePassword() {

        sc.nextLine();

        System.out.print("Enter New Password: ");

        password = sc.nextLine();

        System.out.println("Password Updated Successfully!");

    }

    public static void startExam() {

        score = 0;

        System.out.println("\n----- EXAM STARTED -----");

        question1();
        question2();
        question3();
        question4();
        question5();

        System.out.println("\n======================");
        System.out.println("Exam Completed!");
        System.out.println("Your Score: " + score + " / 5");
        System.out.println("======================");

    }

    public static void question1() {

        System.out.println("\n1. Which language is used for Android App Development?");

        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.println("4. HTML");

        int ans = sc.nextInt();

        if (ans == 1)
            score++;

    }

    public static void question2() {

        System.out.println("\n2. Java is a:");

        System.out.println("1. Operating System");
        System.out.println("2. Programming Language");
        System.out.println("3. Browser");
        System.out.println("4. Database");

        int ans = sc.nextInt();

        if (ans == 2)
            score++;

    }

    public static void question3() {

        System.out.println("\n3. Which symbol is used to end a statement in Java?");

        System.out.println("1. .");
        System.out.println("2. :");
        System.out.println("3. ;");
        System.out.println("4. ,");

        int ans = sc.nextInt();

        if (ans == 3)
            score++;

    }

    public static void question4() {

        System.out.println("\n4. Which company developed Java?");

        System.out.println("1. Microsoft");
        System.out.println("2. Sun Microsystems");
        System.out.println("3. Google");
        System.out.println("4. Apple");

        int ans = sc.nextInt();

        if (ans == 2)
            score++;

    }

    public static void question5() {

        System.out.println("\n5. Which keyword is used to create an object?");

        System.out.println("1. object");
        System.out.println("2. class");
        System.out.println("3. new");
        System.out.println("4. create");

        int ans = sc.nextInt();

        if (ans == 3)
            score++;

    }

    public static void logout() {

        System.out.println("\nLogged Out Successfully.");
        System.out.println("Thank You!");

    }

}
