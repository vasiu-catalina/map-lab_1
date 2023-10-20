public class Main {
    public static void main(String[] args) throws Exception{

        // test OperationsArray
        /*TestOperationsArray testOperationsArray = new TestOperationsArray();

        testOperationsArray.testExpectedMaxNumber(new OperationsArray());
        testOperationsArray.testExpectedMinNumber(new OperationsArray());
        testOperationsArray.testExpectedMaxSum(new OperationsArray());
        testOperationsArray.testExpectedMinSum(new OperationsArray());*/

        // test Grades
        TestGrades testGrades = new TestGrades();

        testGrades.testExpectedNotEnoughGrade(new Grades());
        testGrades.testExpectedAverageNumber(new Grades());
        testGrades.testExpectedRoundGrade(new Grades());
        testGrades.testExpectedRoundGradeMax(new Grades());

        testGrades.testUnexpectedNotEnoughGrade(new Grades());
        testGrades.testUnexpectedAverageNumber(new Grades());
        testGrades.testUnexpectedRoundGrade(new Grades());
        testGrades.testUnexpectedRoundGradeMax(new Grades());

        // test OperationsBigNumber
        /*TestOperationsBigNumber testOperationsBigNumber = new TestOperationsBigNumber();

        testOperationsBigNumber.testExpectedSumNumbers(new OperationsBigNumber());
        testOperationsBigNumber.testExpectedDiffNumbers(new OperationsBigNumber());
        testOperationsBigNumber.testExpectedMulNumbers(new OperationsBigNumber());
        testOperationsBigNumber.testExpectedDivNumbers(new OperationsBigNumber());*/

        // test ElectronicsStore
        /*TestElectronicsStore electronicsStore = new TestElectronicsStore();

        electronicsStore.testExpectedCheapKeyboard(new ElectronicsStore());
        electronicsStore.testExpectedExpensiveObject(new ElectronicsStore());
        electronicsStore.testExpectedExpensiveUSB(new ElectronicsStore());
        electronicsStore.testExpectedTotalPrice(new ElectronicsStore());*/
    }
}
