import java.util.ArrayList;
import java.util.List;

public class AllMissingno {

    public static void main(String[] args) {
        int[] array = {1,3,4,7,2,8,3,7,2};            //!!!!!!!array must contain n no of elements
        System.out.println(missingno(array));
    }

    static List missingno(int[] array){
        int i = 0;
        while (i<array.length){
            int correct = array[i]-1;
            if (array[i] != array[correct]){
                swap(array,i,correct);
            }else{
                i++;
            }
        }

        //missing numbers

        ArrayList list = new ArrayList();
        for (int j = 0; j < array.length ; j++) {
            if (array[j] != j+1){
                list.add(j+1);
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
