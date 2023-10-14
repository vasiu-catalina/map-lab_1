public class Grades {
    public int[] notEnoughGrade(int[] gradesArray){
        int[] notEnoughGradeArray = new int[gradesArray.length];
        int count = 0;

        for(int i = 0; i < gradesArray.length; i++){
            if(gradesArray[i] < 40){
                notEnoughGradeArray[count] = gradesArray[i];
                count++;
            }
        }

        return notEnoughGradeArray;
    }

    public int averageNumber(int[] gradesArray){
        int average = 0;

        for(int i = 0; i < gradesArray.length; i++)
            average += gradesArray[i];

        return average / gradesArray.length;
    }

    public int[] roundGrade(int[] gradesArray){
        int[] roundGradeArray = new int[gradesArray.length];

        for(int i = 0; i < gradesArray.length; i++){
            if(gradesArray[i] < 38 || (((gradesArray[i] / 5) * 5 + 5) - gradesArray[i]) >= 3)
                roundGradeArray[i] = gradesArray[i];
            else
                roundGradeArray[i] = (gradesArray[i] / 5) * 5 + 5;
        }

        return roundGradeArray;
    }

    public int roundGradeMax(int[] gradesArray){
        int[] roundGradeArray = roundGrade(gradesArray);
        int max = -1;

        for(int i = 0; i < roundGradeArray.length; i++){
            if(roundGradeArray[i] > max)
                max = roundGradeArray[i];
        }

        return max;
    }
}
