/*
Chloe Antonozzi
1670980

05/10/2021
Coding Bat
*/

public boolean nestParen(String str) {
    if(str.length() == 0)
        return true;
          
    if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
        return nestParen(str.substring(1, str.length()-1));
                    
    return false;
}
