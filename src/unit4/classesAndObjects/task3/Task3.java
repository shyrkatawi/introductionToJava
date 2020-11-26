package unit4.classesAndObjects.task3;

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
                System.out.printf("Student with good performance: %s, %s\n",st.getSurname(),st.getGroupId());
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
            students[i] = new Student(surname, initials, groupId, performance);
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
}
