
//given an array of n elements in the range [1,n]
//find all the values that get repeated---->each value gets repeated once or twice only

import java.util.ArrayList;
import java.util.List;

public class Allduplicates {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,2,3,1};
        System.out.println(duplicatevals(arr));
    }

    static List duplicatevals(int[] array){
        ArrayList list = new ArrayList();
        //cyclic sort

        int i = 0;
        while (i< array.length){
            int correct = array[i]-1;
            if (array[i] != array[correct]){
                swap(array,i,correct);
            }else {
                i++;
            }
        }
        for (int j = 0; j < array.length; j++) {

            if (array[j] != j+1){
                list.add(array[j]);
            }
        }
        return list;
    }

    static void swap(int[] array,int first,int second){
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }
}


