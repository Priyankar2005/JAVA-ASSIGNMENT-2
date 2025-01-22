class Teacher {
    private String tname;
    private String subject;
    private int yrsofexp;
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYrsOfExp() {
        return yrsofexp;
    }

    public void setYrsOfExp(int yrsofexp) {
        this.yrsofexp = yrsofexp;
    }
}

class Student {
    private String sname;
    private String degree;
    private String college;
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

class Relationship {  

    public static void setTeacherDetails(Teacher tea, String tname, String subject, int yrsofexp) {
        tea.setTname(tname);
        tea.setSubject(subject);
        tea.setYrsOfExp(yrsofexp);
    }

    public static void setStudentDetails(Student stud, String sname, String degree, String college) {
        stud.setSname(sname);
        stud.setDegree(degree);
        stud.setCollege(college);
    }

    public static void TeacherStudent(Teacher tea, Student stud) {
        System.out.println(stud.getSname() + " takes " + stud.getDegree() + " class under " + tea.getTname() + " Sir");
    }

    public static void TeacherStudentDetails(Teacher tea, Student stud) {
        System.out.println(tea.getTname() + " Sir teaches " + tea.getSubject() + " to " + stud.getSname() +
            " reading as " + stud.getDegree() + " in " + stud.getCollege() + " college");
    }

    public static void main(String[] args) { 
        Teacher tea = new Teacher();
        setTeacherDetails(tea, "Amitava", "OOPS DESIGN", 10);  

        Student stud1 = new Student();
        setStudentDetails(stud1, "Ankan", "Java", "UEM");  

        Student stud2 = new Student();
        setStudentDetails(stud2, "Madhu", "Btech", "UEM");  
        TeacherStudent(tea, stud1);
        TeacherStudentDetails(tea, stud2);
    }
}