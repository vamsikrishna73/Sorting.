
//u are given an array of n elements in the range[1,n]
//in this array one no is repeated and one no is omitted
//return an array containing the repeated and missing no
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Setmismatch {

    public static void main(String[] args) {
        int[] array = {4,2,6,3,5,5};
        System.out.println(Arrays.toString(mismatch(array)));
    }

    static int[] mismatch(int[] array){
        //cyclic sort
        int i = 0;
        while (i<array.length){
            int correct = array[i]-1;
            if (array[i] != array[correct]){
                swap(array,i,correct);
            }else{
                i++;
            }
        }
        //ArrayList list = new ArrayList();
        for (int j = 0; j < array.length; j++) {
            if (array[j] != j+1){
                //list.add(j+1);
                //list.add(array[j]);
                return new int[] {array[j],j+1};
            }
        }
        return new int[] {};
    }

    static void swap(int[] array,int first,int second){
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }
}
