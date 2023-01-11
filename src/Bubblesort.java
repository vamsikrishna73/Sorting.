import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        int[] arr = {4,9,1,3,20,11};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = {1,2,0,-67,-23,23,69};
        selectionsort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    static void bubblesort(int[] array){
        //comparing adjacent elements
        //the outer loop will run array.length-1 times
        //after each pass un get the greatest elements in the last
        //so afterv each step--->u can ignore the right side elements which are already sorted
        for (int i = 0; i < array.length-1; i++) {
            boolean swapped = false;
            for (int j = 1; j < array.length-1; j++) {
                if (array[j]<array[j-1]){

                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }


    //selection sort

    static void selectionsort(int[] array){
        //select the largs=est element and place at its correct index...that is at last in each step
        //for each step reduce the array length

        for (int i = 0; i < array.length; i++) {
           //swap the last element with the max ele int the remainig array
            int last = array.length-i-1;
            int maxIndex = getmaxIndex(array,0,last);
            int temp = array[maxIndex];
            array[maxIndex] = array[last];
            array[last] = temp;
        }
    }

    static int getmaxIndex(int[] array,int start,int end){
        int max = array[0];
        int maxIndex = 0;
        for (int i = start; i <= end; i++) {
            if(array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
