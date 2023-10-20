import java.util.Arrays;

public class TestGrades {
    public void testExpectedNotEnoughGrade(Grades grades) throws Exception{
        int[] gradesArray = {100, 20, 25, 70, 39};
        int[] expected = {20, 25, 39};

        try {
            assert Arrays.equals(grades.notEnoughGrade(gradesArray), expected);
        }
        catch (Exception e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedNotEnoughGrade(Grades grades){
        int[] gradesArray = {};

        try {
            grades.notEnoughGrade(gradesArray);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void testExpectedAverageNumber(Grades grades) throws Exception{
        int[] gradesArray = {100, 20, 25, 70, 39};

        try{
            assert grades.averageNumber(gradesArray) == 50;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedAverageNumber(Grades grades){
        int[] gradesArray = {};

        try {
            grades.averageNumber(gradesArray);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void testExpectedRoundGrade(Grades grades) throws Exception{
        int[] gradesArray = {99, 29, 84, 79, 38};
        int[] expected = {100, 29, 85, 80, 40};

        try{
            assert Arrays.equals(grades.roundGrade(gradesArray), expected);
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedRoundGrade(Grades grades){
        int[] gradesArray = {};

        try {
            grades.roundGrade(gradesArray);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void testExpectedRoundGradeMax(Grades grades) throws Exception{
        int[] gradesArray = {99, 29, 84, 79, 38};
        int[] result = grades.roundGrade(gradesArray);

        try{
            assert grades.roundGradeMax(result) == 100;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedRoundGradeMax(Grades grades){
        int[] gradesArray = {};

        try {
            grades.roundGradeMax(gradesArray);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
