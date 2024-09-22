import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String forward;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a word you would like to reverse:");
        forward = scanner.nextLine();
        
        scanner.close();
        
        System.out.println(forward);
    }
}