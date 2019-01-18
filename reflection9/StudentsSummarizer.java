package reflection9;

import java.util.List;
import java.util.stream.Collectors;

public class StudentsSummarizer {

    private StudentsReader studentsReader = new StudentsReader();
    private List<Student> students = studentsReader.getStudents("reflection9/students-performance.csv");

    public Long getStudentsNumber() {
        return students.stream()
                .map(e -> e.getGender())
                .count();
    }

    public Long getMaleNumber() {
        return students.stream()
                .filter(e -> e.getGender().equals("male"))
                .count();
    }

    public Long getFemaleNumber() {
        return students.stream()
                .filter(e -> e.getGender().equals("female"))
                .count();
    }

    public List<String> getParentalLevelsOfEducation() {
        return students.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public Long getScoreHigherThan90() {
        return students.stream()
                .filter(e -> e.getMathScore() > 90)
                .filter(e -> e.getReadingScore() > 90)
                .filter(e -> e.getWritingScore() > 90)
                .count();

    }

    public Long getScore100() {
        return students.stream()
                .filter(e -> e.getMathScore() == 100)
                .filter(e -> e.getReadingScore() == 100)
                .filter(e -> e.getWritingScore() == 100)
                .count();
    }

    public List<String> getScore100Gender() {
        return students.stream()
                .filter(e -> e.getMathScore() == 100)
                .filter(e -> e.getReadingScore() == 100)
                .filter(e -> e.getWritingScore() == 100)
                .map(e->e.getGender())
                .collect(Collectors.toList());

    }


}

/*
How many boys and girls are there?
Which are the distinct parental levels of education sorted alphabetically?
How many students scored higher than a 90 on every topic?
How many students scored exactly 100 on every topic? Which ones are their genders?

 */