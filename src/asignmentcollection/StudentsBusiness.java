package asignmentcollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentsBusiness {
//    /**
//     * Check Mark is digit and Greater than equals zero
//     * @param mark is Mark student
//     * @return value mark when valid
//     * @throws Exception Mark is not digit
//     *                   Mark is greater than equals zero
//     */
//    public float checkMark(String mark) throws Exception {
//        //Write code here
//        return 0;
//    }
//    /**
//     * Check name Is not null and not empty
//     * @param name value of name
//     * @return state name
//     */
//    public boolean checkName(String name) {
//        //Write code here
//        return false;
//    }
//
//    /**
//     * Here is a method sort student
//     *
//     * @param listStudent
//     *            list Student
//     * @return List Student is Sorted
//     */
//    public List<Student> sortStudent(List<Student> listStudent) {
//        //Write code here
//        return null;
//    }
//
//    /**
//     * Here is a method display student information
//     *
//     * @param listStudent
//     *            list Student
//     */
//    public void display(List<Student> listStudent) {
//        //Write code here
//        return;
//    }
//    /**
//     * Using when sort Student
//     * @author TuanNV
//     * @version 1.0
//     */
//    class StudentComparator implements Comparator<Student> {
//        @Override
//        public int compare(Student student1, Student student2) {
//            return student1.getName().compareTo(student2.getName());
//        }
//    }



    public static class InvalidMarkException extends Exception {
        public InvalidMarkException(String message) {
            super(message);
        }
    }

    public float checkMark(String mark) throws Exception {
        try {
            float markValue = Float.parseFloat(mark);
            if (markValue < 0) {
                throw new InvalidMarkException("Mark cannot be negative.");
            }
            return markValue;
        } catch (NumberFormatException e) {
            throw new InvalidMarkException("Mark must be a number.");
        }
    }

    public boolean checkName(String name) {
        return name != null && !name.isEmpty();
    }

    public List<Student> sortStudent(List<Student> listStudent) {
        Collections.sort(listStudent, new StudentComparator());
        return listStudent;
    }

    public void display(List<Student> listStudent) {
        for (Student student : listStudent) {
            System.out.println("\n-------------------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Classes: " + student.getClasses());
            System.out.println("Mark: " + student.getMark());
        }
    }

    class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getName().compareTo(student2.getName());
        }
    }
}

