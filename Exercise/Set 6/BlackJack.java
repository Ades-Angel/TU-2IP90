/*
Chloe Antonozzi
1670980

05/10/2021
Coding Bat
*/
public int blackjack(int a, int b) {
  if (a <=21 && b <=21){
    if (a > b){
      return a;
    }else{
      return b;
    }
  }else if( a <= 21){
    return a;
  }else if(b <=21){
    return b;
  }else{
    return 0;
  }
}
