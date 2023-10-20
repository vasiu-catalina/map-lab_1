public class ElectronicsStore {
    public int cheapKeyboard(int[] priceKeyboard) throws Exception{
        if(priceKeyboard.length == 0)
            throw new Exception("Array is empty!");

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < priceKeyboard.length; i++){
            if(priceKeyboard[i] < min)
                min = priceKeyboard[i];
        }

        return min;
    }

    public int expensiveObject(int[] priceKeyboard, int[] priceUSB) throws Exception{
        if(priceKeyboard.length == 0 && priceUSB.length == 0)
            throw new Exception("Array is empty!");

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < priceKeyboard.length; i++){
            if(priceKeyboard[i] > max)
                max = priceKeyboard[i];
        }

        for(int i = 0; i < priceUSB.length; i++){
            if(priceUSB[i] > max)
                max = priceUSB[i];
        }

        return max;
    }

    public int expensiveUSB(int[] priceUSB, int budget) throws Exception{
        if(priceUSB.length == 0)
            throw new Exception("Array is empty!");

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < priceUSB.length; i++){
            if(priceUSB[i] > max && priceUSB[i] <= budget)
                max = priceUSB[i];
        }

        return max;
    }

    public int totalPrice(int[] priceKeyboard, int[] priceUSB, int budget) throws Exception{
        if(priceKeyboard.length == 0 || priceUSB.length == 0)
            throw new Exception("Array is empty!");

        int min = Integer.MAX_VALUE;
        int money = cheapKeyboard(priceKeyboard);

        for(int i = 0; i < priceUSB.length; i++){
            if(priceUSB[i] < min)
                min = priceUSB[i];
        }

        money += min;

        if(money > budget)
            return -1;

        return money;
    }
}
