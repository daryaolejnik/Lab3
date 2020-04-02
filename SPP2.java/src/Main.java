import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        int choice = 100;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println(ANSI_YELLOW +
                        "        Menu           " + "\n" +
                        "-------------------------" + "\n" +
                        "| 0 - Exit               |" + "\n" +
                        "-------------------------" + "\n" + ANSI_PURPLE +
                        "| 1 - Derivative         |" + "\n" +
                        "-------------------------" + "\n");
                choice = scanner.nextInt();
                switch (choice) {
                    case 0: {
                        System.out.println("U selected to exit");
                        System.exit(0);
                        break;
                    }

                    case 1: {
                        System.out.println("Choose number of function(1-st or 2 -nd)");
                        int choose = scanner.nextInt();
                        System.out.println("Enter some value of function");
                        double par1 = scanner.nextInt();
                        System.out.println("Enter the (const) coefficient ");
                        double par2 = scanner.nextInt();
                        switch (choose) {
                            case 1: {
                                final Function expression = new FirstSol(new FirstFunc(par2), new ConstFunction(par2));
                                System.out.println(ANSI_YELLOW + "f(" + par1 + ") = " + expression.calculate(par1));
                                System.out.println(ANSI_YELLOW + "f'(" + par1 + ") = " + expression.derivative(par1));
                                break;
                            }
                            case 2 :{
                                final Function expression = new SecondSol(new FirstFunc(par2), new ConstFunction(par2));
                                System.out.println(ANSI_YELLOW + "f(" + par1 + ") = " + expression.calculate(par1));
                                System.out.println(ANSI_YELLOW + "f'(" + par1 + ") = " + expression.derivative(par1));
                                break;
                            }
                        }
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value");

                scanner.nextLine();
            }
        } while (choice != 0);
    }
}

