public class TwoSum {

  static int[] twoSum(int[] nums, int target) {

    for (int x = 0; x<nums.length; x++) {            //first iteration starts with fist element 
      for (int y=x+1; y<nums.length; y++) {          //second loop starts with 2 element to final element of the array

	if (nums[x] + nums[y] == target) { 
	  return new int[] {x,y};                /* if u r creating a method that returns an initialized array,
						    you will have to use the new keyword with curly braces. 
						    when returning an array in a method, curly braces alone won't work; */
	
	}
      }
    } 
    return null;
    
  }

public static void main(String[] args) {          /* so there is no object in the program so method should be static otherwise 
						   it show error 'that no non-static method cannot be referenced from a static  
						   context' */
  int[] nums = {1,2,3,4,5,6,7};
  int target = 8;

  int[] indices = twoSum( nums, target);

  System.out.println("target indices: " + indices[0] + " " +  indices[1]);

}
}

