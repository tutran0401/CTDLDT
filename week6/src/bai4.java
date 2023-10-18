import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCgpa() != s2.getCgpa()) {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        } else if (!s1.getName().equals(s2.getName())) {
            return s1.getName().compareTo(s2.getName());
        } else {
            return Integer.compare(s1.getId(), s2.getId());
        }
    }
}

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = scanner.nextInt();
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < totalStudents; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = scanner.nextDouble();
            studentList.add(new Student(id, name, cgpa));
        }

        Collections.sort(studentList, new StudentComparator());

        for (Student student : studentList) {
            System.out.println(student.getName());
        }
    }
}
