/*
Chloe Antonozzi
1670980
05/10/2021

Coding Bat
*/
public int maxSpan(int[] nums) {
  int span = 0;
  int x;
  
  for (int i = 0; i < nums.length; i++){
    for (int j =0; j < nums.length; j++){
      if (nums[i] == nums[j]){
        x = j -i +1;
        span = Math.max(x,span);
      }
    }
  }
  return span;
}
