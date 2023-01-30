
//given an array of integers nums containing 'n+1' integers where each iteger is in the range of [1,n] inclusive
//there is nonly one repeated number,return it
//mustb be solved without modifying the array
public class Repeatednumber {

    public static void main(String[] args) {

        int[] arr = {1,3,2,4,5,2};//------>range = [1,n] & no elements = "n+1"
        System.out.println(reapeatedval(arr));
        System.out.println(repeatedvalue2(arr));


    }

    static int reapeatedval(int[] array){
        //cyclic sort
        int i = 0;
        while (i<array.length){
            int correct = array[i]-1;
            if (array[i] != array[correct]){
                swap(array,i,correct);
            }if (array[i] == array[correct] && i != correct){
                return array[i];
            }else {
                i++;
            }
        }
        return -1;
    }

    static int repeatedvalue2(int[] array){


        int i = 0;
        while(i<array.length){
            int correct = array[i]-1;
            if( array[i]<array.length && array[i] != array[correct]){
                swap(array, i, correct);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < array.length; j++) {
            if(array[j] != j+1){
                return array[j];
            }
        }
        return -1;

    }

    static void swap(int[] array,int first,int second){
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }
}
