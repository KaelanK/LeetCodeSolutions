/*Remove Element, Question 2*/

public class RemoveElement{
	
	public static int[] insertBack(int[] a, int i) {
        int temp = a[i];
        for (int l = i; l < a.length; l++) {
            int m = l+1;
            if (m > a.length-1) {
                break;
            }
            a[l] = a[m];
        }
        a[a.length-1] = temp;
        return a;
    }
	
	public static Boolean checkRest(int[] array, int i) {
		int val = array[i];
		for (int j = i+1; j < (array.length - 1); j++) {
			if (array[j] != val) {
				return false;
			}
		}
		return true;
	}
	
	public static int removeElement(int[] nums, int val) {
        //check for k
        int vals = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == val) {
        		vals++;
        	}
        }
        int k = nums.length - vals;
        //Sort the array
            for (int i = 0; i < nums.length; i++) {
            	
                if (nums[i] == val) {
                    vals++;
                    nums = insertBack(nums, i);
                    Boolean sorted = checkRest(nums, i);
                    if ( sorted == false) {
                    	i--;
                    }
                    else {break;}
                }
            }
        
        return k;
    }
	
	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int[] breakcase = {4, 5};
		int val = 2;
		int bval = 4;
		// sorts vals to back of nums and returns the elements that aren't
		// the val
		int k = removeElement(breakcase, bval);
		System.out.print("done");
	}
}
