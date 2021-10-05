/*
Chloe Antonozzi
1670980
05/10/2021

Coding Bat
*/
public int blackjackPlus(int a, int b) { 
  int aa = bj(a);
  int bb = bj(b);
  int r = max( aa, bb);
  
  return r;
}

int max(int a, int b){
  if (a > b){
    return a;
  }else{
    return b;
  }
}

int bj(int n){
  if(n <=21){
    return n;
  }else{
    return 0;
  }
}
