import java.util.Scanner;

public class PhonePayment {
    public static void main(String[] args) {
        double monthlyPayment = 9.95;

        int inclusiveDatavolume = 5;
        double costsOf500mbExtraDatavolume = 2.95; //in €

        int inclusivePhonecallMinutes = 100;
        double costOf1ExtraPhonecallMin = 0.9; //in €

        Scanner scanner = new Scanner(System.in);


        System.out.println("Bitte monatliche Telefonminuten eigeben: ");
        int monthlyPhonecallMinutes = scanner.nextInt();

        System.out.println("Bitte monatlich genutztes Datenvolumen eingeben: ");
        int monthlyUsedDatavolume = scanner.nextInt();

        
        int extraMinutesUsed = monthlyPhonecallminutes - inclusivePhonecallMinutes;
        int extraDataVolume = monthlyUsedDatavolume - inclusiveDatavolume;
        double additionalCosts = (extraMinutesUsed * costOfExtraPhonecallMin) + (extraDataVolume * costsOf500mbExtradatavolume);  
        double finCosts = 12 * monthlyPayment + additionalCosts;
        
        System.out.println("Gesamtkosten: " + finCosts);

        /* ohne if nicht fehlerlos machbar*/
    }
}
