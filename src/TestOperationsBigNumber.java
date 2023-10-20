import java.util.Arrays;

public class TestOperationsBigNumber {
    public void testExpectedSumNumbers(OperationsBigNumber operationsBigNumber) throws Exception{
        int[] number1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] number2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        try {
            assert Arrays.equals(operationsBigNumber.sumNumbers(number1, number2), expected);
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedSumNumbers(OperationsBigNumber operationsBigNumber){
        int[] num1 = {};
        int[] num2 = {};

        try {
            operationsBigNumber.sumNumbers(num1, num2);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void testUnexpectedSumNumbers1(OperationsBigNumber operationsBigNumber){
        int[] num1 = {1, 2};
        int[] num2 = {5};

        try {
            operationsBigNumber.sumNumbers(num1, num2);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void testExpectedDiffNumbers(OperationsBigNumber operationsBigNumber) throws Exception{
        int[] number1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] number2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {2, 9, 0, 0, 0, 0, 0, 0, 0};

        try {
            assert Arrays.equals(operationsBigNumber.diffNumbers(number1, number2), expected);
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedDiffNumbers(OperationsBigNumber operationsBigNumber){
        int[] num1 = {};
        int[] num2 = {};

        try {
            operationsBigNumber.diffNumbers(num1, num2);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void testUnexpectedDiffNumbers1(OperationsBigNumber operationsBigNumber){
        int[] num1 = {1, 2};
        int[] num2 = {5};

        try {
            operationsBigNumber.diffNumbers(num1, num2);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void testExpectedMulNumbers(OperationsBigNumber operationsBigNumber) throws Exception{
        int[] number1 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int[] expected = {4, 7, 2, 0, 0, 0, 0, 0, 0};

        try {
            assert Arrays.equals(operationsBigNumber.mulNumbers(number1, 2), expected);
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedMulNumbers(OperationsBigNumber operationsBigNumber){
        int[] num1 = {};

        try {
            operationsBigNumber.mulNumbers(num1, 2);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void testExpectedDivNumbers(OperationsBigNumber operationsBigNumber) throws Exception{
        int[] number1 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int[] expected = {1, 1, 8, 0, 0, 0, 0, 0, 0};

        try {
            assert Arrays.equals(operationsBigNumber.divNumbers(number1, 2), expected);
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedDivNumbers(OperationsBigNumber operationsBigNumber){
        int[] num1 = {};

        try {
            operationsBigNumber.divNumbers(num1, 2);
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
