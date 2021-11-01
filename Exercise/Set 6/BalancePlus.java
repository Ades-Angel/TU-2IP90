/*
Chloe Antonozzi
1670980

05/10/2021
Coding Bat
*/

boolean canBalancePlus(int[] nums) {
  int lSum = 0;
  
  for (int i=0; i<nums.length; i++){
    lSum += nums[i];
    int rSum = 0;
    
    for (int j = nums.length -1; j >i; j--){
      rSum += nums[j];
    }
    if (lSum == rSum){
      return true;
    }
  }
  return false;
}
