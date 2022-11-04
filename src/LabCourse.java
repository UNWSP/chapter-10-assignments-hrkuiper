import javax.swing.JOptionPane;

public class LabCourse extends CollegeCourse {
	// creating method to add 50 and overide the display method
	double finalCost;
	public LabCourse(String dep, int corNum, int cred) {
		super(dep, cred, cred);
		
		this.courseFee += 50; // Officially adding 50 to fee
		
		// overriding the display method
		
	}
	@Override
	public void display() {
		super.display();
		JOptionPane.showMessageDialog(null, "this is a lab course" + "" + courseFee + "" + department + "" + courseNum + "" + credits); // how do I print data from parent class into here?
	}

}
