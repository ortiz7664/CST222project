/*Creates dummy Tasks, Tools, Clients, and Locations so that
we have something to play around with when the program first boots up.*/

package repair.appointments;

public class InitialValues {
    public static void create() {
        Tool hammer = new Tool("Hammer", "Used to pound nails into wood.");
        Tool screwdriver = new Tool("Screwdriver", "Used to turn screws.");
    }
}
