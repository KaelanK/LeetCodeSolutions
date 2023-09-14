/* Remove Duplicates From Sorted Array, Question 3 */

public class RemoveDuplicatesFromSortedArrayII {
	
	// insert data from old index into new index, shift everything from
	// after old index down and then shift everything up to make room for
	// new index
	public static void Insert(int[] a, int nindex, int oindex) {
		int temp = a[oindex];
		for (int i = oindex; i < a.length; i++) {
			if (i == a.length - 1) {
				break;
			}
			a[i] = a[i+1];
		}
		for (int i = a.length - 1; i > nindex; i--) {
			a[i] = a[i-1];
		}
		a[nindex] = temp;
	}

    public static int removeDuplicatesII(int[] nums) {
    	int cvalue = nums[0];
    	int slider = 0;
    	for (int i = 0; i < nums.length; i++) {
    		if (i == 0) {
    			cvalue = nums[i] + 1;
    		}
    		if (cvalue != nums[i]) {
    			cvalue = nums[i];
    			if (i == nums.length - 1) {
    				Insert(nums, slider, i);
    				slider++;
    			} else if (nums[i] != nums[i+1]) {
        			Insert(nums, slider, i);
        			slider++;
        		} else if (nums[i] == nums[i+1]) {
        			Insert(nums, slider, i);
        			slider++;
        			i++;
        			Insert(nums, slider, i);
        			slider++;
        		}
    		}
    		
    		
    	}
    	return slider;
    }
    	
	
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 2, 2, 3};
		//Insert(nums, 0, 1); //it's perfect
		int k = removeDuplicatesII(nums);
		
		System.out.print("done");
		

	}
}
    
/* int cvalue = nums[0];
	for (int i = 0; i < nums.length; i++) {
	if (cvalue != nums[i]) {
		break;
	}
	if (i == nums.length - 1) {
		return 2;
	}
}
int k = 0;
if (nums.length == 1) {
	return 1;
} else if (nums.length == 2) {
	return 2;
}
for (int i = 0; i < nums.length; i++) {
	if (cvalue > nums[i]) {
		k = i;
		break;
	}
    if (cvalue != nums[i]) {
        cvalue = nums[i];
    }
    if (i == nums.length - 1) {
    	k = 3;
    	break;
    }
    if (cvalue == nums[i+1]) {
        for (int j = i + 2; j < nums.length; j++) {
        	if (j == nums.length - 1) {
            	if (nums[j] == nums[0]) {
            		return 2;
            	}
        		return 3;
        	}
            if ( nums[j] == nums[i]) {
                insertBack(nums, j);
                j--;
            }
            if ( nums[j] != nums[i]) {
            	i++;
                break;
            }
        }
    }
}
return k;
} */