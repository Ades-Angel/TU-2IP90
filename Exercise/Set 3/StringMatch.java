/*
Chloe Antonozzi
1670980
05/10/2021

Coding Bat
*/
public int stringMatch(String a, String b) {
  int len = Math.min(a.length(), b.length());
  int count = 0;
  
  for (int i=0; i<len-1; i++) {
    String substringA = a.substring(i, i+2);
    String substringB = b.substring(i, i+2);
    if (substringA.equals(substringB)) {
      count++;
    }
  }

  return count;
}
