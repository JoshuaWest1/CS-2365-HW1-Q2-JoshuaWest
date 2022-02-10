
package HW1Q2;
import javax.swing.JOptionPane;

public class TestEmployee {
	   public static void main(String[] args) {
		   
		   
		  String name1 = null,name2 = null,name3 = null;//Declaration of name variables
		  int ID1 = 0,ID2=0,ID3 = 0;//Declaration of ID variables
		  String position1 = null,position2=null,position3 = null;//Declaration of Position Variables
		  
		  name1 = JOptionPane.showInputDialog("What is Employee 1's Name?");//input employee 1's name
		  ID1 = Integer.parseInt(JOptionPane.showInputDialog("What is Employee 1's ID? Numbers Only "));//their id
		  position1 = JOptionPane.showInputDialog("What is Employee 1's Position?");//their position
		  Employee E1 = new Employee(name1, ID1, position1);//create a new employee object with the newly defined variables
		  
		  
		  //Repeat for Employee 2
		  name2 = JOptionPane.showInputDialog("What is Employee 2's Name?");
		  ID2 = Integer.parseInt(JOptionPane.showInputDialog("What is Employee 2's ID Numbers Only ?"));
		  position2 = JOptionPane.showInputDialog("What is Employee 2's Position?");
		  Employee E2 = new Employee(name2, ID2, position2);
		  
		  
		  //Repeat for Employee 3
		  name3 = JOptionPane.showInputDialog("What is Employee 3's Name?");
		  ID3 = Integer.parseInt(JOptionPane.showInputDialog("What is Employee 3's ID? Numbers Only "));
		  position3 = JOptionPane.showInputDialog("What is Employee 3's Position?");
		  Employee E3 = new Employee(name3, ID3, position3);
		  
		  //outputs the 3 objects
		  JOptionPane.showMessageDialog(null, 
				  "Employee 1:\n" + E1.getName()+"\n"+E1.getID()+"\n"+E1.getPosition()+"\n\n"+
				  "Employee 2:\n" + E2.getName()+"\n"+E2.getID()+"\n"+E2.getPosition()+"\n\n"+
				  "Employee 3:\n" + E3.getName()+"\n"+E3.getID()+"\n"+E3.getPosition());

		   
	   }
}

