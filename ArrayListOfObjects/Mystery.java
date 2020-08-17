import java.util.*;

/**
 * Write a description of class Mystery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mystery
{
    /**
     * Runs some mystery code.
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        Student a = new Student(62, 160, true);
        Student b = new Student(62, 120, false);
        Student c = new Student(65, 135, true);
        Student d = new Student(67, 180, true);
        Student e = new Student(67, 170, false);
        Student f = new Student(70, 200, true);
        Student g = new Student(70, 150, false);
        Student h = new Student(75, 200, true);
        Student i = new Student(75, 160, false);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students.add(e);
        students.add(f);
        students.add(g);
        students.add(h);
        students.add(i);

        Student newStudent = new Student(73, 200, false);

        boolean bool = predict(newStudent, students);
        System.out.println(bool);
    }

    public static boolean predict(Student s, ArrayList<Student> originalStudents) {
        // make a copy of the ArrayList
        ArrayList<Student> students = new ArrayList<Student>(originalStudents);

        ArrayList<Student> selectStudents = mystery(s, students);

        int countTrue = 0;
        int countFalse = 0;
        for (Student a : selectStudents) {
            // System.out.println(a);
            if (a.getAthlete()) {
                countTrue++;
            }
            else {
                countFalse++;
            }
        }

        return countTrue > countFalse;
    }

    public static ArrayList<Student> mystery(Student s, ArrayList<Student> students) {
        ArrayList<Student> selectStudents = new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {
            double minDist = dist(s, students.get(0));
            int minStudentIndex = 0;

            for (int j = 1; j < students.size(); j++) {
                // System.out.println(students.get(j) + " " + dist(s, students.get(j)));
                if (dist(s, students.get(j)) < minDist) {
                    minDist = dist(s, students.get(j));
                    minStudentIndex = j;
                }
            }

            // System.out.println("min " + students.get(minStudentIndex));
            selectStudents.add(students.remove(minStudentIndex));
        }

        return selectStudents;
    }

    public static double dist(Student a, Student b) {
        return Math.sqrt(Math.pow(a.getHeight() - b.getHeight(), 2) +
            Math.pow(a.getWeight() - b.getWeight(), 2));
    }
}
