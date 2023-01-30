public class RainwaterTrappingppblm {

    public static void main(String[] args) {
        int[] array = { 1, 0, 2 ,0, 0, 1};
        System.out.println(answer(array));
    }


    //u have to  return the total volume of water that can be trapped bw the the blocks
    //and the height of the blocks is given by the corresponding element in the array
    //water can only be trapped -->if the right and left blocks of an element are greater than the element at current position
    //total water that can be trapped at a given positiipn or a block is given by --->min(lef block,righht block)-height of current block
    //but for example {4,2,1,5}-->here 5 units of water can be stored in the whole array
    //so even if the preceeding element is checked--> u have to consider the element preceeding the preceedimg element
    //cuz here if the element before and after 1 is taken(2 and 5)--->total volume of water that can b stored is only 1 unit
    //but actually 3 units is stored in that position
    //so the maximum element in that whole preceending part(left block of array-->the part preceeding the current element or block) has to be taken into consideratiom
    //in the same way {4,0,1,3,2}--->total 5 units can be stored
    // now at element '0' -->if the right ele is taken (1)-->only 1 unit can be stored at that element
    //but actually 3 units are stored
    //therefore the maximun element of the right side part of array should be taken into consideration
    //hence we create two arrays
    //1--->which contains all the maximum values of elements from the left side
    //this array contains maximum element corresponding (as compared to the) current elemnt wrt to left part of array

    //2--->which contains all the maximum values from the rigth side
    //this array contains maximum element corresponding (as compared to the) current elemnt wrt to right part of array

    //example-->{4,0,1,3,2}
    //left max array--->{4,4,4,4,4}
    //**********!!!!!!!!for right max array u have to compare from the right side of array--->so u need to start from the end of array and decrement until array[0]

    //right max array--->{4,3,3,3,2}

    //now get the minium of each corresponding index from left and right
    //why min??? because if left = 4 and rigght = 5---> u can store 4 units only not 5
    //i.e. u can only store the min unit of water of the given two left and rigth maximums

    //--->4,3,3,3,2



    static int answer(int[] heights){



        int[] leftmax = new int[heights.length];
        int[] rigthmax = new int[heights.length];

        leftmax[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            leftmax[i] = Math.max(leftmax[i-1],heights[i]);
        }
        rigthmax[heights.length-1] = heights[heights.length-1];
        for (int j = heights.length-2; j >= 0 ; j--) {
            rigthmax[j] = Math.max(rigthmax[j+1],heights[j]);
        }

        //now for the answer take minmum value of each corresponding element and subtract it from the original height of the block u are currently at

        int sum = 0;

        for (int k = 0; k < heights.length; k++) {
            sum += Math.min(leftmax[k],rigthmax[k])-heights[k];
        }
        return sum;



    }


}
