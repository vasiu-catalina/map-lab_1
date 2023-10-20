public class OperationsArray {
    public int maxNumber(int[] array) throws Exception{
        if(array.length == 0)
            throw new Exception("Array is empty!");

        int max = -1;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
        }

        return max;
    }

    public int minNumber(int[] array) throws Exception{
        if(array.length == 0)
            throw new Exception("Array is empty!");

        int min = 101;

        for(int i = 0; i < array.length; i++){
            if(array[i] < min)
                min = array[i];
        }

        return min;
    }

    public int maxSum(int[] array) throws Exception{
        if(array.length == 0)
            throw new Exception("Array is empty!");

        int sumMax = 0;

        for(int i = 0; i < array.length; i++){
            sumMax += array[i];
        }

        int min = minNumber(array);
        sumMax -= min;

        return sumMax;
    }

    public int minSum(int[] array) throws Exception{
        if(array.length == 0)
            throw new Exception("Array is empty!");

        int sumMin = 0;

        for(int i = 0; i < array.length; i++){
            sumMin += array[i];
        }

        int max = maxNumber(array);
        sumMin -= max;

        return sumMin;
    }
}
