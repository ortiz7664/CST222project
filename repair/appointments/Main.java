/*This is a CLI interface where the user can choose to view, add, or delete appointments,
* customers, tools, and tasks.
* Written by Bryan Bezerra.
*/

package repair.appointments;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Object arrays to hold data in memory
    private static ArrayList<Tool> tools = new ArrayList<Tool>();
    private static ArrayList<Client> clients = new ArrayList<Client>();
    private static ArrayList<Task> tasks = new ArrayList<Task>();
    private static ArrayList<Location> locations = new ArrayList<Location>();
    // Take input from the user
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        homeScreen();
    }
    public static void homeScreen(){
        System.out.println("Welcome to the repairs appointment center!");
        System.out.println("Options:");
        System.out.println("0. Test");
        System.out.println("1.  Add appointment");
        System.out.println("2.  View appointments");
        System.out.println("3.  Delete appointment");
        System.out.println("4.  Add customer");
        System.out.println("5.  View customers");
        System.out.println("6.  Delete customer");
        System.out.println("7.  Add task");
        System.out.println("8.  View tasks");
        System.out.println("9.  Delete task");
        System.out.println("10. Add tool");
        System.out.println("11. View tools");
        System.out.println("12. Delete tool");
        System.out.println("----------------");

        System.out.print("Choose a number: ");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        switch(choice) {
            case 0:
                test();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;


        }
    }
    public static void test() {
        createInitialValues();
        listTools();
    }
    // Creates dummy data so we can test the program
    public static void createInitialValues() {
        // Add some tools
        Tool hammer = new Tool("Hammer", "Used to pound nails into wood.");
        tools.add(hammer);
        Tool screwdriver = new Tool("Screwdriver", "Used to turn screws.");
        tools.add(screwdriver);
    }
    // Lists all tools currently in memory
    public static void listTools() {
        for(int i = 0; i < tools.size(); ++i) {
            System.out.println(i + ". " + tools.get(i).display());
        }
    }
}