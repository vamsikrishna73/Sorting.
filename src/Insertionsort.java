import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {0,90,-76,44};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    //sorting the array partially-->sorting in parts
    //insert the element from the unsorted part in it's correct position on it's left hand side
    //after 1st pass i = 0-->array[0 to 1] is sorted
    //after every pass the array(given left side of array) gets sorted
    //no of swaps reduced compared to bubble sort
    //stable
    //used for smaller arrays--->works well when the array is partially sorted

    static void insertion(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (array[j]<array[j-1]){
//                    int temp = array[j];
//                    array[j] = array[j-1];
//                    array[j-1] = temp;
                    swap(array,j,j-1);
                }else{
                    break;
                }



            }
        }
    }

    static void swap(int[] array,int first,int second){
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }

}
