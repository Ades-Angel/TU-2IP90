/*
Chloe Antonozzi
1670980

05/10/2021
Coding Bat
*/
public int fibonacci(int n) {
  if (n <= 1){
    return n;
  }else{
    return fibonacci(n -1) + fibonacci(n -2);
  }
}
