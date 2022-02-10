
package HW1Q2;

public class Employee {
private String name;
private int ID;
private String position;

public Employee(String n, int id, String p) {//Used to input the users Employee data
    name = n;  
    ID = id;
    position = p;
 }


public String getName() {//is the function to output the Name
    return name; 
  }

public int getID() {//is the function to output the ID
    return ID; 
  }

public String getPosition() {//is the function to output the Position
    return position; 
  }




}
