/*
Chloe Antonozzi
1670980

05/10/2021
Coding Bat
*/
public String middleTwo(String str) {
  int position;
  int length;
  
  if (str.length() % 2 == 0){
    position = str.length()/2 -1;
    length = 2;
  }else{
    position = str.length()/2;
    length = 1;
  }
  return str.substring(position, position + length);
}
