/*
Chloe Antonozzi
1670980
05/10/2021

Coding Bat
*/
boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) return false;
  if (i+1 >= str.length()) return false;
  return str.substring(i+1, i+2).equals("x");
}
