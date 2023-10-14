public class OperationsBigNumber {
    public long convertNumber(int[] numberArray){
        long number = 0;
        for(int i = 0; i < numberArray.length; i++){
            number += numberArray[i];
            number *= 10;
        }

        return number;
    }

    public long[] convertArray(long number){
        int lenNumber = countDigits(number);
        long[] numberArray = new long [lenNumber];

        for(int i = lenNumber - 1; i >= 0; i--){
            numberArray[i] = number % 10;
            number /= 10;
        }

        return numberArray;
    }

    public int countDigits(long number){
        int count = 0;

        while (number > 0){
            number /= 10;
            count++;
        }

        return count;
    }

    public long[] sumNumbers(int[] numberArray1, int[] numberArray2){
        long number1 = convertNumber(numberArray1);
        long number2 = convertNumber(numberArray2);

        long sum = number1 + number2;
        return convertArray(sum);
    }

    public long[] diffNumbers(int[] numberArray1, int[] numberArray2){
        long number1 = convertNumber(numberArray1);
        long number2 = convertNumber(numberArray2);

        long diff;
        if(number1 > number2)
            diff = number1 - number2;
        else
            diff = number2 - number1;

        return convertArray(diff);
    }

    public long[] mulNumbers(int[] numberArray1, int digit){
        long number1 = convertNumber(numberArray1);

        long mul = number1 * digit;

        return convertArray(mul);
    }

    public long[] divNumbers(int[] numberArray1, int digit){
        long number1 = convertNumber(numberArray1);

        long div = number1 / digit;

        return convertArray(div);
    }
}
