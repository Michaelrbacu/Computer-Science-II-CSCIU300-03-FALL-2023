package Practice;

public class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Override the equals method to compare students based on studentId and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // If the objects are the same, they are equal
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false; // If the other object is null or of a different class, they are not equal
        }

        Student otherStudent = (Student) obj; // Cast the object to Student
        return studentId == otherStudent.studentId && name.equals(otherStudent.name);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(1, "Alice");

        System.out.println(student1.equals(student2)); // false, different student IDs and names
        System.out.println(student1.equals(student3)); // true, same student ID and name
    }
}
