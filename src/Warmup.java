import java.util.Scanner;

public class Warmup {

    private static final int INPUTTOTAL = 3;

    public static String[] userInputs = { };

    public static void main(String[] args) ////
        int input = 1

        while (input <= INPUTTOTAL)

             Scanner scanner = new Scanner(System.in);
             String numberEnteredByUser = scanner.nextLine();
             userInputs[input-1] = numberEnteredByUser;

              if (input > INPUTTOTAL) {
                  System.out.println("Sum of numbers");
    }


}
