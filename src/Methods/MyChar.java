package Methods;

public class MyChar {

    private final char ch;

    public MyChar(char ch) {
    this.ch = ch;
    }
    public boolean isVowel( ){
       if( ch == 'a' || ch == 'A' )
           return true;
        if( ch == 'e' || ch == 'E' )
            return true;
        if( ch == 'i'  || ch=='I' )
            return true;
        if( ch == 'o' || ch == 'O' )
            return true;
        if( ch == 'u' || ch == 'U' )
            return true;
        return false;
    }

    public boolean isDigit(){
        if(ch >= 48 && ch <=57)
        return true;
        return false;
    }
    public boolean isAlphabet()
    {
        if(ch >= 97 && ch <=122)   // between 'a' and 'z'
        return true;
        if(ch >= 65 && ch <= 90)    // between A and Z
            return true;

        return  false;
    }
    public boolean isConsonant(){
        if( isAlphabet() && !isVowel())
            return true;

        return false;

    }
    public static void printLowerCaseAlphabet(){    // print a to z in lower case
        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            System.out.print(ch + " ");
        }
    }
      public static void printUpperCaseAlphabet(){    // print A to Z in upper case
        for(char ch = 'A'; ch <= 'Z'; ch++ ){
            System.out.print(ch + " ");
        }
      }

}

