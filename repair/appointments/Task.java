/*This class stores task objects which contain the task's name, description, and estimated time to complete.
* Written by Docilia Eugene.
*/

package repair.appointments;

// Needs a display() method that returns a string (see the Tool class for an example)
public class Task {
  String name;
  String description;
  int time;
  
  public void setName(String name){
    this.name= name;
  }
  public void setDescription(String description){
    this.description= description;
  }
  public void setTime(int Time){
    this.time= time;
  }
  public String getName(){
    return name;
  }
  public String getDescription(){
    return description;
  }
  public int getTime(){
    return time;
  }
  public String display(){
    return name + description + time;
  }
  
}
