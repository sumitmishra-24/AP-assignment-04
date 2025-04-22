
class Student {
    
    private String name;
    private int rollNumber;
    private double marks;

    
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }
}


public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        
        s1.setName("Priya Sharma");
        s1.setRollNumber(101);
        s1.setMarks(88.5);

        
        System.out.println("Student Details:");
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNumber());
        System.out.println("Marks: " + s1.getMarks());
    }
}
/* Name: Priya Sharma
Roll Number: 101
Marks: 88.5 */