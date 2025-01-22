import javax.swing.JOptionPane;

class Person {
    private String name;
	
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
	
    public boolean isPalindrome() {
        
        String cleanedName = cleanName(name);
		
        int left = 0;
        int right = cleanedName.length() - 1;

        while (left < right) {
            if (cleanedName.charAt(left) != cleanedName.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
    }

    
    public String cleanName(String name) {
		
        String cleanedName = "";
		
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
			
            if (c != ' ') {
                cleanedName += Character.toLowerCase(c); 
            }
        }

        return cleanedName; 
    }
}

class PalindromeChecker {
	
    public static void checkPalindrome() {
        String nameInput = JOptionPane.showInputDialog("Enter a name to check if it is a palindrome:");
		
        if (nameInput == null || nameInput.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No name entered. Exiting program.");
            return; 
        }
		
        Person person = new Person();
        person.setName(nameInput); 
		
        if (person.isPalindrome()) {
            JOptionPane.showMessageDialog(null, person.getName() + " is a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, person.getName() + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
		
        checkPalindrome();
    }
}