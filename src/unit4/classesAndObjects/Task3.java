package unit4.classesAndObjects;

import java.util.Arrays;
import java.util.Random;

/**
 * 3. Создайте класс с именем Student, содержащий поля:
 * фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 * Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Task3 {
    public static void main(String[] args) {
        Student[] students = createRandomStudents(10);
        for (Student st : students) {
            if (st.isPerformanceMoreThanNine()) {
                System.out.printf("Student with good performance: %s, %s\n",st.getSurname(),st.groupId);
            }
        }
    }

    static Student[] createRandomStudents(int size) {
        Student[] students = new Student[size];
        for (int i = 0; i < students.length; i++) {
            String surname = "name" + i;
            String initials = "A.A" + i;
            String groupId = "group" + i;
            int[] performance = createRandomPerformance(5);
            students[i] = new Task3().new Student(surname, initials, groupId, performance);
        }
        return students;
    }

    static int[] createRandomPerformance(int size) {
        int[] performance = new int[size];
        for (int i = 0; i < performance.length; i++) {
            performance[i] = new Random().nextInt(10) + 1;
        }
        return performance;
    }

    class Student {
        private String surname;
        private String initials;
        private String groupId;
        private int[] performance;

        public Student(String surname, String initials, String groupId, int[] performance) {
            this.surname = surname;
            this.initials = initials;
            this.groupId = groupId;
            this.performance = performance;
        }

        public String getSurname() {
            return surname;
        }

        public String getGroupId() {
            return groupId;
        }

        boolean isPerformanceMoreThanNine() {
            for (int i : performance) {
                if (i < 9) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "surname='" + surname + '\'' +
                    ", initials='" + initials + '\'' +
                    ", groupId='" + groupId + '\'' +
                    ", performance=" + Arrays.toString(performance) +
                    '}';
        }
    }
}
