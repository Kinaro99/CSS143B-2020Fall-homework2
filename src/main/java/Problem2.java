public class Problem2 {

    /*
My idea going in was to create a loop to go through array and compare numbers to see if there are any duplicates to either side of them starting from the left.
After noting that the indexes with duplicates would be filled with a space then later pushed forward.

     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
    int placeholder = 0;
    int finalInts = 0;

        int length = nums.length;
        if (length == 0) {
            return nums.length;
        }

        if(length ==1) {
            return nums.length;
        }

        for( int i = 0; i < length-1; i++){
            placeholder = nums[i];

            if (nums[0] != placeholder) {
                finalInts = placeholder;
            }
            finalInts = placeholder;
        }
        return finalInts;
    }
}
//links used: https://stackoverflow.com/questions/13912004/remove-duplicates-from-integer-array/39969573