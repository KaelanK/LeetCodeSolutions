/*Merge Sorted Array, Question 1 */
public class MergeSortedArray {
	//The function, merge the two arrays and then sort them
			public static void merge(int[] nums1, int m, int[] nums2, int n) {
				// run through the second array and find 0's in the first array to
				// switch with
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < (m+n); j++) {
		                if (nums1[j] == 0) {
		                    nums1[j] = nums2[i];
		                    break;
		                }
		            }
		        }
		        // Create a boolean for if it's sorted
		        Boolean sort = false;
		        while (sort != true) {
		        	// True until proven wrong!
		            sort = true;
		            // run through the array, i is the first variable and j is th
		            // e next, if j goes out of bounds, break out of the for loop
		            for (int i = 0; i < (m+n); i++) {
		                int j = i+1;
		                if (j == (m+n)) {
		                    break;
		                }
		                //If a number that is higher is in the wrong spot, switch
		                //it! If this has to happen, the array is not sorted!
		                if (nums1[i] > nums1[j]) {
		                    int temp = nums1[j];
		                    nums1[j] = nums1[i];
		                    nums1[i] = temp; 
		                    sort = false;
		                } 
		            }
		        }
		    }

			
			public static void main(String[] args) {
				 
				
				// Create the sample arrays and numbers
				int[] nums1 = {1, 2, 3, 0, 0, 0};
				int m = 3;
				int[] nums2 = {2, 5, 6};
				int n = 3;
				//test your function
				merge(nums1, m, nums2, n);
				//lol I just wanted to find the answer with debugging, bro does
				// nothing
				int bro = 0;
				
			}
}
