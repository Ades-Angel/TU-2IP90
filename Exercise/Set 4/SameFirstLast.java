/*
Chloe Antonozzi
1670980
05/10/2021

Coding Bat
*/
public boolean sameFirstLast(int[] nums) {
  if (nums.length> 0 && nums[0] == nums[nums.length-1]){
    return true;
  }
  return false;
}
