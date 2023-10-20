import java.util.Arrays;

public class OperationsBigNumber {
    public int[] sumNumbers(int[] numberArray1, int[] numberArray2) throws Exception{
        if(numberArray1.length != numberArray2.length)
            throw new Exception("Array lengths do not match!");

        if(numberArray1.length == 0)
            throw new Exception("Array is empty!");

        int[] numberArraySum = new int[numberArray1.length];

        int carry = 0;
        for(int i = numberArray1.length - 1; i >= 0; i--){
            numberArraySum[i] = (numberArray1[i] + numberArray2[i] + carry) % 10;
            carry = ((numberArray1[i] + numberArray2[i] + carry) / 10) % 10;
        }

        if(carry == 0)
            return numberArraySum;

        int[] numberArraySum1 = new int[numberArray1.length + 1];
        numberArraySum1[0] = carry;

        for(int i = 0; i < numberArraySum.length; i++)
            numberArraySum1[i + 1] = numberArraySum[i];

        return numberArraySum1;
    }

    public int[] diffNumbers(int[] num1, int[] num2) throws Exception{
        if(num1.length != num2.length)
            throw new Exception("Array lengths do not match!");

        if(num1.length == 0)
            throw new Exception("Array is empty!");

        int maxLen = Math.max(num1.length, num2.length);
        int[] result = new int[maxLen];
        int carry = 0;

        for (int i = 0; i < maxLen; i++) {
            int digit1 = (i < num1.length) ? num1[num1.length - 1 - i] : 0;
            int digit2 = (i < num2.length) ? num2[num2.length - 1 - i] : 0;

            int diff = digit1 - digit2 - carry;

            if (diff < 0) {
                diff += 10;
                carry = 1;
            } else {
                carry = 0;
            }

            result[result.length - 1 - i] = diff;
        }

        int startIndex = 0;
        while (startIndex < result.length - 1 && result[startIndex] == 0) {
            startIndex++;
        }

        if (startIndex > 0) {
            result = Arrays.copyOfRange(result, startIndex, result.length);
        }

        return result;
    }

    public int[] mulNumbers(int[] numberArray1, int digit) throws Exception{
        if(numberArray1.length == 0)
            throw new Exception("Array is empty!");

        int[] numberArrayMul = new int[numberArray1.length];

        int carry = 0;
        for(int i = numberArray1.length - 1; i >= 0; i--){
            numberArrayMul[i] = (numberArray1[i] * digit + carry) % 10;
            carry = ((numberArray1[i] * digit + carry) / 10) % 10;
        }

        if(carry == 0)
            return numberArrayMul;

        int[] numberArrayMul1 = new int[numberArray1.length + 1];
        numberArrayMul1[0] = carry;

        for(int i = 0; i < numberArrayMul.length; i++)
            numberArrayMul1[i + 1] = numberArrayMul[i];

        return numberArrayMul1;
    }

    public int[] divNumbers(int[] numberArray1, int digit) throws Exception{
        if(numberArray1.length == 0)
            throw new Exception("Array is empty!");

        int[] numberArrayDiv = new int[numberArray1.length];

        int carry = 0;
        for(int i = 0; i < numberArray1.length; i++){
            numberArrayDiv[i] = (carry * 10 + numberArray1[i]) / digit;
            carry = (carry * 10 + numberArray1[i]) % digit;
        }

        int startIndex = 0;
        while (startIndex < numberArrayDiv.length - 1 && numberArrayDiv[startIndex] == 0) {
            startIndex++;
        }

        if (startIndex > 0) {
            numberArrayDiv = Arrays.copyOfRange(numberArrayDiv, startIndex, numberArrayDiv.length);
        }

        return numberArrayDiv;
    }
}
