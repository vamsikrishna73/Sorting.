
//given an array of size n --->which may contain negative numbers
//return the least positive no in the array
//with o(n) space complexity

public class Missingpositivenum {

    public static void main(String[] args) {
        int[] array = {3,1,2,8};
        System.out.println(getleastpositive(array));
    }

    static int getleastpositive(int[] array){
        int i = 0;
        while (i< array.length){
            int correct = array[i]-1;
            if (array[i]>0 && array[i] != array[correct] && array[i]<array.length){
                swap(array,i,correct);
            }else {
                i++;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] != j+1){
                return j+1;
            }
        }
        return array.length+1;
    }

    static void swap(int[] array,int first,int second){
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }


}
