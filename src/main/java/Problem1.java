public class Problem1 {

    /* Explanation:
     * I tried using the video you made but got a bit lost with how to actually type everything out but kept the variables.
     * Essentially what I got is that we would have the p0, p1 and p2 as variables and compare p0 and p1 for each position to switch the numbers in the array if p0 is greater than p1 until we got to p2.
     * This would make sure that we go through the array once.
     * I was going to use a forloop but thought it would go over more than once so I decided to use a switch statement that would go through each number in the array and sort/move it depending on what it was.
     * If it's 0 then it moves to the front, if it's 1 it stays wherever it is, and then if it's 2 it goes to the back and in doing this I had to create a placeholder to help move the numbers around.
=    */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int p0 = 0; //start
        int p1 = 0; //changing
        int p2 = nums.length - 1; //end
        int placeholder = 0; // hold value while p0 and p2 switch values

        while (p0 < p2) { //for (int i = 0; i < nums.length; i++
            switch (nums[p0]) {
                case 0: {
                    p1 = nums[p0];
                    nums[p0] = nums[p1];
                    nums[p1] = placeholder;
                    p0++;
                    p1++;
                }
                case 1: {
                    p1++;
                    break;
                }
                case 2: {
                    nums[p1] = nums[p2];
                    p2++;
                    break;
                }
            }
        }
    }
}
// video link: https://youtu.be/dggtt9JUqMk
//links looked at when doing hw:
//https://www.geeksforgeeks.org/how-to-sort-an-array-in-a-single-loop/,
//https://www.geeksforgeeks.org/sort-binary-array-using-one-traversal/
//https://stackoverflow.com/questions/31968697/how-to-sort-an-array-in-a-single-loop specifically looked at the c++ example
