public class OperationsArray {
    public int maxNumber(int[] array){
        int max = -1;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
        }

        return max;
    }

    public int minNumber(int[] array){
        int min = 101;

        for(int i = 0; i < array.length; i++){
            if(array[i] < min)
                min = array[i];
        }

        return min;
    }

    public int maxSum(int[] array){
        int sumMax = 0;

        for(int i = 0; i < array.length; i++){
            sumMax += array[i];
        }

        int min = minNumber(array);
        sumMax -= min;

        return sumMax;
    }

    public int minSum(int[] array){
        int sumMin = 0;

        for(int i = 0; i < array.length; i++){
            sumMin += array[i];
        }

        int max = maxNumber(array);
        sumMin -= max;

        return sumMin;
    }
}
