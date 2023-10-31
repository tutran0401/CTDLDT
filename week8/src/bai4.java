import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Comparator;
class Student implements Comparable<Student>
{
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID(){return id;}
    String getName(){return name;}
    double getCGPA(){return cgpa;}

    public int compareTo(Student s2)
    {
        if(cgpa > s2.getCGPA()) return -1;
        else if(cgpa < s2.getCGPA()) return 1;
        else
        {
            if(name.compareTo(s2.getName()) < 0) return -1;
            else if(name.compareTo(s2.getName()) > 0) return 1;
            else
            {
                if(id < s2.getID()) return -1;
                else if(id > s2.getID()) return 1;
            }
        }
        return 0;
    }
}

class Priorities
{
    Priorities(){}
    List<Student> getStudents(List<String> events)
    {
        PriorityQueue<Student> pQueue = new PriorityQueue<>();
        for(int i = 0; i < events.size(); i++)
        {
            String tmp[] = events.get(i).split("\\s+");
            if(tmp.length == 1) pQueue.poll();
            else
            {
                Student tmpStudent = new Student(Integer.valueOf(tmp[3]), tmp[1], Double.valueOf(tmp[2]));
                pQueue.add(tmpStudent);
            }
        }
        List<Student> res = new ArrayList<>();
        while(pQueue.isEmpty() == false) res.add(pQueue.poll());
        return res;
    }
}
public class bai4 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
