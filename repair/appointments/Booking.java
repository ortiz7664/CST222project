/*This is the class that handles user requests to create or delete appointments.
* Written by Fernando Ortiz.
*/

package repair.appointments;

// Needs a display() method that returns a string (see the Tool class for an example)
public class Booking {
}
public static void main (String[]args)
  Scanner scanner = new Scanner(System.in);
Task tasks = newTasks();
System.out.print("Would you like to make a new appointment?[Y-N]:";
                 String answer = scanner.nextLine();
                 Appointment appointment;
                 Customer customer;
                 Vehicle vehicle;
                 if (answer.equalsIgnoreCase("y")
                     Random random = new Random();
                     int id = random.nextInt(100)+1;
                     String date;
                     System.out.println("\nLet's create a new customer.\n");
                     customer = tasks.getCustomer();
                     System.out.prinbtln("\nGive us more information about your vehicle.\n");
                     vehicle = tasks.getVehicle();
                     System.out.println("\nWhen are you available?\n");
                     date = tasks.getAppointmentDate();
                     
               
