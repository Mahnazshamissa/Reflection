package reflection9;

public class StudentsApplication {
    public static void main(String[] args) {
        StudentsSummarizer summarizer = new StudentsSummarizer();

        System.out.println("Total number of student performance entries: " + summarizer.getStudentsNumber());
        System.out.println("Number of female students: " + summarizer.getFemaleNumber());
        System.out.println("Number of male students: " + summarizer.getMaleNumber());
        System.out.println("Parental education levels sorted alphabetically:\n" + summarizer.getParentalLevelsOfEducation())  ;
        System.out.println("Number of students with scores higher than 90: " + summarizer.getScoreHigherThan90());
        System.out.println("Number of students with scores equal to 100: " + summarizer.getScore100());
        System.out.print("Genders of these students are: " + summarizer.getScore100Gender() );
    }
}
