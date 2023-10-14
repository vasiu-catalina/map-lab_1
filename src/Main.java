public class Main {
    public static void main(String[] args) {

        // test OperationsArray
        TestOperationsArray testOperationsArray = new TestOperationsArray();

        testOperationsArray.testExpectedMaxNumber(new OperationsArray());
        testOperationsArray.testUnexpectedMaxNumber(new OperationsArray());

        testOperationsArray.testExpectedMinNumber(new OperationsArray());
        testOperationsArray.testUnexpectedMinNumber(new OperationsArray());

        testOperationsArray.testExpectedMaxSum(new OperationsArray());
        testOperationsArray.testUnexpectedMaxSum(new OperationsArray());

        testOperationsArray.testExpectedMinSum(new OperationsArray());
        testOperationsArray.testUnexpectedMinSum(new OperationsArray());
    }
}
