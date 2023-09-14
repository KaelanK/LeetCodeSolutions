public class RotateArray {
	
	  public static void rotate(int[] nums, int k) {
		  if (k > nums.length) {
			  k = k % nums.length;
		  }
		  for (int i = 0; i < k; i++) {
			  int temp = nums[nums.length - 1];
		      for (int j = (nums.length - 1); j > 0; j--) {
		    	  nums[j] = nums[j-1];
		      }
		      nums[0] = temp;
		  }
	  }
	  
	  public static void rotate2(int[] nums, int k) {
		  if (k > nums.length) {
			  k = k % nums.length;
		  }
		  int[] numss = new int[nums.length];
		  // write the new front of the array using k and beyond
		  int l = nums.length - k;
		  for (int i = 0; i < k; i++) {
			  if (l > nums.length - 1) {
				  k = i;
				  break;
			  }
			  numss[i] = nums[l];
			  l++;
		  }
		  int j = 0;
		  for (int i = k; i < numss.length; i++) {
			  numss[i] = nums[j];
			  j++;
		  }
		  for (int i = 0; i < nums.length; i++) {
			  nums[i] = numss[i];
		  }
	  }
	  
	  // simple swap, a and b mean nothing to rotate3
	  public static void swap(int[] nums, int a, int b) {
		  int temp = nums[a];
		  nums[a] = nums[b];
		  nums[b] = temp;
	  }
	  
	  public static void rotate3(int[] nums, int k) {
		  if (k > nums.length) {
			  k = k % nums.length;
		  }
		  int b = k;
		  int c = nums.length - k;
		  int d = b + (nums.length - c);
		  int ogk = c;
		  for (int a = 0; a < nums.length; a++) {
			  if ( c < nums.length) {
				  if (d >= nums.length) {
					  break;
				  }
				  swap(nums, a, c);
				  swap(nums, c, b);
				  swap(nums, c, d);
				  c++;
				  b++;
				  d++;
			  } else {
				  if (ogk > nums.length-1) {
					  break;
				  }
				  swap(nums, d, ogk);
				  ogk++;
				  d++;
			  }
		  }
	  }
	
	  /// This was accepted on leetcode, rotate 2 was the one that worked
	  // I feel like using memory is cheating but I guess not.
	public static void main(String args[]) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		rotate2(nums, 3);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}