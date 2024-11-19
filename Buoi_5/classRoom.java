import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class ClassRoom {
    public static List<Student> studentList = new ArrayList<>();
    // Method to sort students by GPA (descending)
    public void sortByGpa() {
        studentList.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    // Input list of students
    public void inputList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n= ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Thông Tin sinh viên thứ " + (i + 1) + ":");
            Student student = new Student();
            student.input();

            studentList.add(student);
        }
    }

    // Output list of students
    public void outputList() {
        System.out.printf("|%-10s|%-20s|%-5s|%-25s|%-5s|%-20s|%-20s|%-20s|%-10s|\n",
                "ID", "NameClass", "GPA", "Name", "Age", "City", "District", "Commune", "Check");
        for (Student student : studentList) {
            student.output();
            if( student.checkFall()){
                System.out.print("quit\n");
            }else{
                System.out.print("even\n");
            }
        }
    }

    // Remove student by ID
    public boolean removeById(int id) {
        return studentList.removeIf(student -> student.getId() == id);
    }

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
        Scanner scanner = new Scanner(System.in);

        // Input student list
        classRoom.inputList();

        // Display unsorted student list
        System.out.println("Unsorted list of students:");
        classRoom.outputList();

        // Sort students by GPA
        classRoom.sortByGpa();
        System.out.println("\nList of students sorted by GPA:");
        classRoom.outputList();

        // Remove a student by ID
        System.out.print("\nEnter the ID of the student to remove: ");
        int idToRemove = scanner.nextInt();
        if (classRoom.removeById(idToRemove)) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student with ID " + idToRemove + " not found.");
        }

        // Display updated list
        System.out.println("\nUpdated list of students:");
        classRoom.outputList();
    }
}