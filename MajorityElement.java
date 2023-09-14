public class MajorityElement {
	
	private static void Sort(int[] a) {
		Boolean sorted = false;
		
		while (sorted != true) {
			int check = 0;
			for (int i = 0; i < a.length - 1; i++) {
				if (i+1 > a.length) {
					break;
				}
				if (a[i] <= a[i+1]) {
					check++;
				}
				if (a[i] > a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
				
			}
			if (check == a.length - 1 ) {
				sorted = true;
			}
		}
	}
	
	private static int MajorityElement(int[] nums) {
		Sort(nums);
		int index;
		if (nums.length % 2 == 0) {
			index = nums.length / 2;
		} else {
			index = (nums.length - 1) / 2;
		}
		return nums[index];
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 0, 1};
		//Sort(nums);
		int k = MajorityElement(nums);
		System.out.print("%k");
	}

	
}