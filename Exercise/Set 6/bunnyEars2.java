/*
Chloe Antonozzi
1670980
05/20/2021

Coding Bat
*/
public int bunnyEars2(int bunnies) {
  if (bunnies == 0){
    return 0;
  }else if(bunnies % 2 == 0){
    return 3 + bunnyEars2(bunnies -1);
  }else{
    return 2 + bunnyEars2(bunnies -1);
  }
}
