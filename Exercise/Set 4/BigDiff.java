/*
Chloe Antonozzi
1670980

05/10/2021
Coding Bat
*/
public int bigDiff(int[] nums) {
  int min = nums[0];
  int max = nums[0];
  
  for(int i=1; i<nums.length; i++){
    min = Math.min(min, nums[i]);
    max = Math.max(max, nums[i]);
  }
  return max-min;
}
