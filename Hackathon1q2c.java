import java.util.Scanner;

public class Hackathon1q2c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter morning energy generation (in kWh): ");
        double morning = sc.nextDouble();

        
        System.out.print("Enter evening energy generation (in kWh): ");
        double evening = sc.nextDouble();

        
        double total = calculateTotalEnergy(morning, evening);

        
        System.out.println("The total energy generated is: " + total + " kWh");

        sc.close();
    }

    
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
}
