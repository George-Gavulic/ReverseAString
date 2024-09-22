import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String forward;
        Scanner scanner = new Scanner(System.in);

        System.out.println( "\n \nPlease input a word you would like to reverse:");
        forward = scanner.nextLine();
        scanner.close();
        
        for (int i = forward.length() - 1; i >= 0; i--) {
            System.out.print(forward.charAt(i));
        }
    }
}