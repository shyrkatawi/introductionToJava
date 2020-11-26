package unit4.classesAndObjects.task3;

import java.util.Arrays;

public class Student {
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
        return "Student: " +
                "surname='" + surname + '\'' +
                ", initials='" + initials + '\'' +
                ", groupId='" + groupId + '\'' +
                ", performance=" + Arrays.toString(performance);
    }
}
