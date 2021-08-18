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
    // First screen user sees. User can access other parts of the program from here.
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
        System.out.println("99. Exit the program");
        System.out.println("----------------");

        System.out.print("Choose a number >>> ");
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
                addTool();
                break;
            case 11:
                viewTools();
                break;
            case 12:
                removeTool();
                break;
            case 99:
                System.exit(0);
        }
    }
    // Takes the user back to the home screen
    public static void returnToHome() {
        System.out.print("Press enter to return to the home screen or type 'X' to exit >>> ");
        String response = keyboard.nextLine();
        if(response.equalsIgnoreCase("x")) {
            System.exit(0);
        } else {
            homeScreen();
        }
    }
    // Access testing
    public static void test() {
        createInitialValues();
        returnToHome();
    }
    // Creates dummy data so we can test the program
    public static void createInitialValues() {
        // Add some tools
        Tool hammer = new Tool("Hammer", "Used to pound nails into wood.");
        tools.add(hammer);
        Tool screwdriver = new Tool("Screwdriver", "Used to turn screws.");
        tools.add(screwdriver);
    }
    // 10. Add tool to memory
    public static void addTool() {
        System.out.print("Enter tool name >>> ");
        String name = keyboard.nextLine();
        System.out.print("Enter tool description >>> ");
        String description = keyboard.nextLine();
        Tool newTool = new Tool(name, description);
        tools.add(newTool);
        System.out.println("Added " + newTool.getName() + ".");
        returnToHome();
    }
    // 11. Lists all tools currently in memory
    public static void viewTools() {
        listTools();
        returnToHome();
    }
    public static void listTools() {
        for(int i = 0; i < tools.size(); ++i) {
            System.out.println(i + ". " + tools.get(i).display());
        }
    }
    // 12. Remove a tool from memory
    public static void removeTool() {
        listTools();
        System.out.print("Enter a tool's number to delete it >>> ");
        int response = keyboard.nextInt();
        Tool removed = tools.get(response);
        tools.remove(response);
        System.out.println("Removed " + removed.getName());
        returnToHome();
    }
}