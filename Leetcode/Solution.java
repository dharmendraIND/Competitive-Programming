import java.util.Scanner;

public class Solution {
    

  static int[] twoSum(int[] nums, int target) 
  {
    for(int i=0; i<nums.length; i++)
    {
	for (int j=i+1; j<nums.length; j++)
	{
	  return new int[] {i,j};
	}

    }

    return null;
  }



  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    

    System.out.print("Enter the number of elements: " );
    int n = input.nextInt();
    int[] nums = new int[n];
    
    for (int i=0; i<n; i++) {

      nums[i] = input.nextInt();
    }
    
    System.out.print("Enter target value: ");
    int target = input.nextInt();
    
    int[] indices = twoSum(nums, target);

    if (indices != null){
      System.out.print("print the indices" +  indices[0] + " " + indices[1]);
    }
      else {
      System.out.print(" no solution");
    }

}
}
