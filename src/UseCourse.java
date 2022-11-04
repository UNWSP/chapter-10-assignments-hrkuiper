import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class UseCourse {
		
	public static void main(String[] args) {
		String department = JOptionPane.showInputDialog(null, "please enter the course department");
		String courseNumber = JOptionPane.showInputDialog(null, "please enter course number");
		String courseCredits = JOptionPane.showInputDialog(null, "please enter course credits");
		
		int corNum = Integer.parseInt(courseNumber);
		int cred = Integer.parseInt(courseCredits);
		
		// creating an array to hold classed that would qualify as labCourse
			ArrayList<String> labCourse = new ArrayList<>(List.of ("BIO", "CHM", "CIS", "PHY"));


			CollegeCourse course1 = (labCourse.contains(department))?
					new LabCourse(department, corNum, cred) : new CollegeCourse(department, corNum, cred);
			course1.display();
	}
	
	
		
		
	

	

}

