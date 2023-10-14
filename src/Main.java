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

        // test Grades
        TestGrades testGrades = new TestGrades();

        testGrades.testExpectedNotEnoughGrade(new Grades());
        testGrades.testUnexpectedNotEnoughGrade(new Grades());

        testGrades.testExpectedAverageNumber(new Grades());
        testGrades.testUnexpectedAverageNumber(new Grades());

        testGrades.testExpectedRoundGrade(new Grades());
        testGrades.testUnexpectedRoundGrade(new Grades());

        testGrades.testExpectedRoundGradeMax(new Grades());
        testGrades.testUnexpectedRoundGradeMax(new Grades());

        // test OperationsBigNumber
        TestOperationsBigNumber testOperationsBigNumber = new TestOperationsBigNumber();

        testOperationsBigNumber.testExpectedSumNumbers(new OperationsBigNumber());
        testOperationsBigNumber.testUnexpectedSumNumbers(new OperationsBigNumber());

        testOperationsBigNumber.testExpectedDiffNumbers(new OperationsBigNumber());
        testOperationsBigNumber.testUnexpectedDiffNumbers(new OperationsBigNumber());

        testOperationsBigNumber.testExpectedMulNumbers(new OperationsBigNumber());
        testOperationsBigNumber.testUnexpectedMulNumbers(new OperationsBigNumber());

        testOperationsBigNumber.testExpectedDivNumbers(new OperationsBigNumber());
        testOperationsBigNumber.testUnexpectedDivNumbers(new OperationsBigNumber());

        // test ElectronicsStore
        TestElectronicsStore electronicsStore = new TestElectronicsStore();

        electronicsStore.testExpectedCheapKeyboard(new ElectronicsStore());
        electronicsStore.testUnexpectedCheapKeyboard(new ElectronicsStore());

        electronicsStore.testExpectedExpensiveObject(new ElectronicsStore());
        electronicsStore.testUnexpectedExpensiveObject(new ElectronicsStore());

        electronicsStore.testExpectedExpensiveUSB(new ElectronicsStore());
        electronicsStore.testUnexpectedExpensiveUSB(new ElectronicsStore());

        electronicsStore.testExpectedTotalPrice(new ElectronicsStore());
        electronicsStore.testUnexpectedTotalPrice(new ElectronicsStore());
    }
}
