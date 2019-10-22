import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";


        while (!userInput.equalsIgnoreCase("end")  ) {
            System.out.println(" ");
            userInput = keyboard.next();
            System.out.println(userInput);
        }

    }
}
