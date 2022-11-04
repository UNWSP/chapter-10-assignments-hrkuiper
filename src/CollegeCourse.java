import javax.swing.JOptionPane;

public class CollegeCourse {
	
	// creating data fields 
	protected String department; 
	protected int courseNum;
	protected int credits;
	protected int courseFee;
	
	public CollegeCourse(String dep, int corNum, int cred) {
		final int CREDCOST = 120;
		this.department = dep;
		this.courseNum = corNum;
		this.credits = cred;
		this.courseFee = CREDCOST * cred;
	}
	

	public void display() {
		JOptionPane.showMessageDialog(null, "" + department + "" + courseNum + "" + credits + "" + courseFee);
	}

}
