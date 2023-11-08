package basic;

public class NoAllowedJava {


    //Declaraciones

/*
3DPointClass // identifiers cannot begin with a number
 hollywood@vine // @ is not a letter, digit, $ or _
*$coffee // * is not a letter, digit, $ or _
    public // public is a reserved word
   */


    private void declarationAllowd() {
        String okidentifier;
        String $OK2Identifier;
        String _alsoOK1d3ntifi3r;
        String __SStillOkbutKnotsonice$;
    }

    static int MAX_LENGTH = 5;
    int length;
   static int y = 10;
    static int x; // x is declared here

    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
            System.out.println(length);
        }
    }

    public static void main(String[] args) {

        NoAllowedJava noAllowedJava= new NoAllowedJava();
        noAllowedJava.grow(1);
        int reply = x + y;
        System.out.println(reply);
    }

}
