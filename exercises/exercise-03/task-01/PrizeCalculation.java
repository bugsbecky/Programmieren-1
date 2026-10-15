import java.util.Scanner;
import java.util.InputMismatchException;

public class PrizeCalculation {
    public static void main(String[] args) {
        int workedHours;
        int kilometers;

        try {
            System.out.println("Please enter the hours you have worked!");
            System.out.println("only fully worked hours count");
            workedHours = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please only enter whole numbers!");
            return();
        }
        
        try {
            System.out.println("Please enter how many kilometers it took you, to get to the customer");
            System.out.println("only fully driven kilometers count");
            kilometers = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please only enter whole numbers!");
            return;
        }

        double hourlyPayment = 120.00;   //in €
        double prizePerKilometer = 0.75; //in €

        double finKilometerPrize = kilometers * prizePerKilometer;
        double sumOfHourlyPayment = workedHours * hourlyPayment;
        double finPayment = finKilometerPrize + sumOfHourlyPayment;

        System.out.println("This is your Payment: " + finPayment);
    
    }
}
