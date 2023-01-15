/*
Given an array containing n distinct nos int the rahge [0,n],return the only no in rh erange that is missingfrom thearray
range of 0 to n --->cyclic sort
o(1) extra space complexity and o(n) run time complexity--->cycliic sort
*/

import java.util.Arrays;

public class Missingnumber {
    public static void main(String[] args) {
        int[] array = {4,0,2,1};
        System.out.println(missingnumber(array));
        System.out.println(Arrays.toString(array));
    }



    //whenever u find value - n--->ignore it becauase u can't find it's corresponding index(n) in the array

    static void swap(int[] array,int first,int second){
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }


    //cyclic sort

    static int missingnumber(int[] array){

        int i = 0;
        while (i < array.length){
            int correct = array[i];
            if (array[i] < array.length && array[i] != array[correct] ){
                swap(array,i,correct);
            }
            else {
                i++;
            }
        }

        //finidng the missng no
        for (int j = 0; j < array.length; j++) {
            if (array[j] != j){
                return j;

            }

        }
        //case 2--->when all elements are at their correct indices-->the last element is missing
        return array.length;
    }
}

