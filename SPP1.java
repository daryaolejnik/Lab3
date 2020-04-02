
import java.util.Scanner;
import java.util.Date;
import static java.lang.Math.*;

public class SPP1{

    public static void main(String[] args) {
        double a = 3.2;
        double b = 17.5;
        double x = -4.8;
        printBData(a, b, x);
        yCount(a, b, x);
        date();
        beginningData();
    }

    // print bedinning data
    public static void printBData(double a, double b, double x) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
   }

   //print result
   public static void printResult (double y, double d) {
        System.out.println("Результат: \ny = " + y);
        System.out.println("d = " + d);
   }

   //Count y and d
   public static void yCount (double a, double b, double x) {
        double y = b * Math.pow(Math.tan(x), 2) - a / Math.pow(Math.sin(x/a), 2);
        double d = a * Math.pow(Math.exp(x), -Math.sqrt(a)) * Math.cos(b * x / a);
        printResult(y, d);
}

   // Current Date
   public static void date () {
        Date date = new Date();
        String strDate = String.format("%1$s %2$tB %2$td %2$tY %2$tA", "\nДата: ", date);
        System.out.println(strDate);
   }

   //Enter beginnig data
   public static void beginningData () {
        System.out.println ("Введите a = ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println ("Введите b = ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println ("Введите x = ");
        double x = new Scanner(System.in).nextDouble();
        printBData(a, b, x);
        yCount(a, b, x);
   }

}