/*This is a CLI interface where the user can choose to view, add, or delete appointments, customers, and tasks.*/

package repair.appointments;
import java.util.ArrayList;

public class Main {
    // Initialize objects for testing purposes
    private static ArrayList<Tool> tools = new ArrayList<Tool>();

    public static void main(String[] args) {
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
            System.out.println(i + ". " + tools.get(i).getName());
        }
    }
}