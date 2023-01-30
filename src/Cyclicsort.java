import java.util.Arrays;

public class  Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        cyclicsort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    //instead of 2 --->use one for loop
    //************when given nos from range 1,N --->use cyclic sort**********
    //every unique element is onl getting swa[ped once
    //value-1 = index
    //worst case - n-1 swaps required+n(last check when all elements are at their correct position-n comparisions)
    //o(n)--->2n-1 comparisions

    static void cyclicsort(int[] array){
        for (int i = 0; i < array.length; i++) {
            while (array[i]-1 != i){
                swap(array,i,array[i]-1);
            }
        }
    }

    static void cyclicsort2(int[] array){
        int i = 0;
        while (i< array.length){
            int correct = array[i]-1;
            if (array[i] != array[correct]){
                swap(array,i,correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] array,int first,int second){
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }


}
