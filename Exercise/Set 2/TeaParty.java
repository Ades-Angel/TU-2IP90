/*
Chloe Antonozzi
1670980

05/10/2021
Coding Bat
*/

public int teaParty(int tea, int candy) {
  if (tea+tea <= candy || candy+candy <= tea){
    if (tea>=5 && candy>=5){
      return 2;
    }else{
      return 0;
    }
  }else if (tea>=5 && candy>=5){
    return 1;
  }else{
    return 0;
  }
}
