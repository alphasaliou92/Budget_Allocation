import java.util.ArrayList;
import java.util.Scanner;
public class Program {
    public static void main (String[] args){
        System.out.println("How much can you spend? ");
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        double sum = 0;
        int i = 0;
        ArrayList<Double> proportion = new ArrayList<Double>();
        System.out.println("Enter your proportion of various expenses. ");
        System.out.println("The system stops if cumulative proposrtion exceeds 100%");
        do{
            System.out.println("Your proportion of expense " +
                    (i+1) + ";");
            double value = scan.nextDouble();
            proportion.add(value);
            sum += proportion.get(i);
        } while (sum <= 100);
        scan.close();
        if (sum > 100){
            double cumulativeSum = 0.0;

        }
    }
}
