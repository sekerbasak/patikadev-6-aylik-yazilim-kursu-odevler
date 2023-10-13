import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCGPA() != s2.getCGPA()) {
            return Double.compare(s2.getCGPA(), s1.getCGPA()); // Higher CGPA first
        } else if (!s1.getName().equals(s2.getName())) {
            return s1.getName().compareTo(s2.getName()); // Alphabetical order of names
        } else {
            return Integer.compare(s1.getID(), s2.getID()); // Ascending order of IDs
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
       PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new StudentComparator());


        List<Student> remainingStudents = new ArrayList<>();

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                Student student = new Student(id, name, cgpa);
                priorityQueue.add(student);
            } else if (parts[0].equals("SERVED")) {
                priorityQueue.poll(); // Serve the highest priority student
            }
        }

        while (!priorityQueue.isEmpty()) {
            remainingStudents.add(priorityQueue.poll());
        }

        return remainingStudents;
    }
}

public class Main {
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