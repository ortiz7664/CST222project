/*This class stores tool objects which contain the tool's name and description.
* Getters and setters can be used to modify the object attributes.
* The display() function returns name and description.
* Written by Bryan Bezerra.
*/

package repair.appointments;

public class Tool {
    private String name;
    private String description;

    public Tool(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String display() {
        return name + ":\t" + description;
    }
}
