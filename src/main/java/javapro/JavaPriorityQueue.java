package javapro;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Kanahaiya Gupta
 *
 */


public class JavaPriorityQueue {
    static class Student {
        private final int token;
        private final String fname;
        private final double cgpa;

        public Student(int id, String fname, double cgpa) {
            super();
            this.token = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getToken() {
            return token;
        }

        public String getFname() {
            return fname;
        }

        public double getCgpa() {
            return cgpa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        PriorityQueue<Student> data = new PriorityQueue<>((o1, o2) -> {
            if (o1.getCgpa() < o2.getCgpa()) {
                return 1;
            } else if (o1.getCgpa() > o2.getCgpa()) {
                return -1;
            } else {
                if (o1.getFname().compareTo(o2.getFname()) == 0) {
                    return Integer.compare(o1.getToken(), o2.getToken());

                } else {
                    return o1.getFname().compareTo(o2.getFname());
                }
            }
        });
        for (int i = 0; i < t; i++) {
            String op = sc.next();
            switch (op) {
                case "ENTER":
                    String name = sc.next();
                    double cgpa = sc.nextDouble();
                    int id = sc.nextInt();
                    Student s = new Student(id, name, cgpa);
                    data.add(s);
                    break;
                case "SERVED":
                    if (data.isEmpty()) {
                        break;
                    }
                    data.remove();

            }
        }
        if (data.isEmpty())
            System.out.println("EMPTY");
        else {
            while (!data.isEmpty()) {
                Student st = data.poll();
                System.out.println(st.getFname());
            }
        }
        sc.close();
    }
}



//MyCode
/*
import java.util.PriorityQueue;
        import java.util.stream.Collectors;
class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID() { return this.id; }
    String getName() { return this.name; }
    double getCGPA() { return this.cgpa; }

}

class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(
                (Student s1, Student s2) -> {
                    if (s1.getCGPA() < s2.getCGPA()) return 1;
                    if (s1.getCGPA() > s2.getCGPA()) return -1;
                    if (s1.getName().compareTo(s2.getName()) == 0) {
                        if (s1.getID() < s2.getID()) return 1;
                        if (s1.getID() > s2.getID()) return -1;
                        return 0;
                    }
                    return s1.getName().compareTo(s2.getName());
                }
        );
        for (String event : events) {
            String[] s = event.split(" ");

            if (s[0].equals("ENTER")) {
                String name = s[1];
                double cgpa = Double.parseDouble(s[2]);
                int id = Integer.parseInt(s[3]);
                Student st = new Student(id, name, cgpa);
                pq.add(st);
            }
            if (s[0].equals("SERVED")) pq.poll();
        }
        return pq.stream().sorted(pq.comparator()).collect(Collectors.toList());
    }
}*/
