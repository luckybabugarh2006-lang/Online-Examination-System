import java.util.Scanner;

public class OnlineExamination {
    static Scanner sc = new Scanner(System.in);
    static String username = "admin";
    static String password = "1234";

    public static void main(String[] args) {
        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        // Login
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {
            System.out.println("\nLogin Successful!");

            while (true) {
                System.out.println("\n1. Update Profile");
                System.out.println("2. Change Password");
                System.out.println("3. Start Exam");
                System.out.println("4. Logout");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter new username: ");
                        username = sc.nextLine();
                        System.out.println("Profile Updated!");
                        break;

                    case 2:
                        System.out.print("Enter new password: ");
                        password = sc.nextLine();
                        System.out.println("Password Changed!");
                        break;

                    case 3:
                        startExam();
                        break;

                    case 4:
                        System.out.println("Logged Out Successfully!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        } else {
            System.out.println("Invalid Username or Password!");
        }
    }

    static void startExam() {
        int score = 0;

        System.out.println("\nExam Started!");

        System.out.println("Q1. Java is a?");
        System.out.println("1. Programming Language");
        System.out.println("2. Database");
        System.out.print("Answer: ");
        int ans = sc.nextInt();
        if (ans == 1)
            score++;

        System.out.println("Q2. HTML stands for?");
        System.out.println("1. Hyper Text Markup Language");
        System.out.println("2. High Transfer Machine Language");
        System.out.print("Answer: ");
        ans = sc.nextInt();
        if (ans == 1)
            score++;

        System.out.println("\nExam Submitted Automatically!");
        System.out.println("Your Score: " + score + "/2");
    }
}
