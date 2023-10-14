import java.util.Arrays;

public class TestGrades {
    public void testExpectedNotEnoughGrade(Grades grades){
        int[] gradesArray = {100, 20, 25, 70, 39};
        int[] expected = {20, 25, 39};

        try {
            assert Arrays.equals(grades.notEnoughGrade(gradesArray), expected);
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedNotEnoughGrade(Grades grades){
        int[] gradesArray = {100, 20, 25, 70, 39};
        int[] unexpected = {20, 25, 70};

        try {
            assert Arrays.equals(grades.notEnoughGrade(gradesArray), unexpected);
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testExpectedAverageNumber(Grades grades){
        int[] gradesArray = {100, 20, 25, 70, 39};

        try{
            assert grades.averageNumber(gradesArray) == 50;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedAverageNumber(Grades grades){
        int[] gradesArray = {100, 20, 25, 70, 39};

        try{
            assert grades.averageNumber(gradesArray) == 51;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testExpectedRoundGrade(Grades grades){
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
        int[] gradesArray = {99, 29, 84, 79, 38};
        int[] unexpected = {100, 29, 85, 80, 38};

        try{
            assert Arrays.equals(grades.roundGrade(gradesArray), unexpected);
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testExpectedRoundGradeMax(Grades grades){
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
        int[] gradesArray = {99, 29, 84, 79, 38};
        int[] result = grades.roundGrade(gradesArray);

        try{
            assert grades.roundGradeMax(result) == 99;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }
}
