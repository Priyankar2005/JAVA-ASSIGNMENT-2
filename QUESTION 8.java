//Author Priyankar

import javax.swing.JOptionPane;

class Student {
    private int age;
	
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
	
    public boolean isEligibleToVote() {
        return age >= 18;  
    }
}

class VotingEligibility {

    public static void checkVotingEligibility() {
        String input = JOptionPane.showInputDialog("Enter student's age:");
        int age = Integer.parseInt(input);

        
        Student student = new Student();
        student.setAge(age);
		
        if (student.isEligibleToVote()) {
            JOptionPane.showMessageDialog(null, "The student is eligible to vote.");
        } else {
            JOptionPane.showMessageDialog(null, "The student is not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        
        checkVotingEligibility();
    }
}