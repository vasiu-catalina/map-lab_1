public class TestElectronicsStore {
    public void testExpectedCheapKeyboard(ElectronicsStore electronicsStore){
        int[] priceKeyboard = {40, 35, 70, 15, 45};

        try {
            assert electronicsStore.cheapKeyboard(priceKeyboard) == 15;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedCheapKeyboard(ElectronicsStore electronicsStore){
        int[] priceKeyboard = {40, 35, 70, 15, 45};

        try {
            assert electronicsStore.cheapKeyboard(priceKeyboard) == 35;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testExpectedExpensiveObject(ElectronicsStore electronicsStore){
        int[] priceKeyboard = {15, 20, 10, 35};
        int[] priceUSB = {20, 15, 40, 15};

        try {
            assert electronicsStore.expensiveObject(priceKeyboard, priceUSB) == 40;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedExpensiveObject(ElectronicsStore electronicsStore){
        int[] priceKeyboard = {15, 20, 10, 35};
        int[] priceUSB = {20, 15, 40, 15};

        try {
            assert electronicsStore.expensiveObject(priceKeyboard, priceUSB) == 35;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testExpectedExpensiveUSB(ElectronicsStore electronicsStore){
        int[] priceUSB = {15, 45, 20};

        try {
            assert electronicsStore.expensiveUSB(priceUSB, 30) == 20;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedExpensiveUSB(ElectronicsStore electronicsStore){
        int[] priceUSB = {15, 45, 20};

        try {
            assert electronicsStore.expensiveUSB(priceUSB, 30) == 45;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testExpectedTotalPrice(ElectronicsStore electronicsStore){
        int[] priceKeyboard = {40, 50, 60};
        int[] priceUSB = {8, 12};

        try {
            assert electronicsStore.totalPrice(priceKeyboard, priceUSB, 60) == 48;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }

    public void testUnexpectedTotalPrice(ElectronicsStore electronicsStore){
        int[] priceKeyboard = {40, 50, 60};
        int[] priceUSB = {8, 12};

        try {
            assert electronicsStore.totalPrice(priceKeyboard, priceUSB, 60) == 72;
        }
        catch (AssertionError e){
            System.out.println("Not the expected answer!");
        }
    }
}
