/* Remove Duplicates From Sorted Array, Question 3 */

public class RemoveDuplicatesFromSortedArray {
	
	public static int[] delete(int[] array, int a) {
		int[] narray = new int[array.length - 1];
		for (int i = 0; i < narray.length; i++) {
			if (i < a) {
				narray[i] = array[i];
			}
			else {
				narray[i] = array[i+1];
			}
		}
		return narray;
	}
	
	public static int removeDuplicates(int[] nums) {
		int current = 0;
		int[] nums2 = new int[nums.length];
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = nums[i];
		}
		for (int i = 0; i < nums2.length; i++) {
			current = nums2[i];
			for (int j = i + 1; j < nums2.length; j++) {
				if (nums2[j] == current) {
					nums2 = delete(nums2, j);
				}
			}
		}
		int k = nums2.length;
		for (int i = 0; i < nums2.length; i++) {
			nums[i] = nums2[i];
		}
		return k;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
	//	int[] test = delete(nums, 1);
		int k = removeDuplicates(nums);
		
		System.out.print("done");
		

	}
}

/* Old working version for awhile, until negative numbers and inabliity
to use null

public static int removeDuplicates(int[] nums) {
// Create a second array to store unique values
Integer[] nums2 = new Integer[nums.length];
//placement tracks where we put the new unique element, as well
//as how many there are
int placement = 0;
// Check the copy if it has the current element, if it doesn't
// add it to the copy, it it does, do not, go to next element
Boolean exists = false;
for (int i = 0; i < nums.length; i++) {
	exists = false;
    for (int j = 0; j < nums2.length; j++) {
        if (nums[i] == nums2[j]) {
        	exists = true;
        	break;
        }
    }
    if (exists == false) {
    	nums2[placement] = nums[i];
    	placement++;
    }
}
//nums = nums2;
// For some reason, it doesn't allow the above code, so for loop
// copying is the way
for (int i = 0; i < nums.length; i++) {
	nums[i] = nums2[i];
}
return placement;
} */