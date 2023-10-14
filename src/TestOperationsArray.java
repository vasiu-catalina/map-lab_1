public class TestOperationsArray {
    public void testExpectedMaxNumber(OperationsArray operationsArray){
        int[] array = {4, 8, 3, 10, 17};

        try {
            assert operationsArray.maxNumber(array) == 17;
        } catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedMaxNumber(OperationsArray operationsArray){
        int[] array = {4, 8, 3, 10, 17};

        try {
            assert operationsArray.maxNumber(array) == 10;
        } catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testExpectedMinNumber(OperationsArray operationsArray){
        int[] array = {4, 8, 3, 10, 17};

        try {
            assert operationsArray.minNumber(array) == 3;
        } catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedMinNumber(OperationsArray operationsArray){
        int[] array = {4, 8, 3, 10, 17};

        try {
            assert operationsArray.minNumber(array) == 10;
        } catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testExpectedMaxSum(OperationsArray operationsArray){
        int[] array = {4, 8, 3, 10, 17};

        try {
            assert operationsArray.maxSum(array) == 39;
        } catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedMaxSum(OperationsArray operationsArray){
        int[] array = {4, 8, 3, 10, 17};

        try {
            assert operationsArray.maxSum(array) == 30;
        } catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testExpectedMinSum(OperationsArray operationsArray){
        int[] array = {4, 8, 3, 10, 17};

        try {
            assert operationsArray.minSum(array) == 25;
        } catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedMinSum(OperationsArray operationsArray){
        int[] array = {4, 8, 3, 10, 17};

        try {
            assert operationsArray.minSum(array) == 10;
        } catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }
}
