public class Literals {
    public static void main(String args[]){
        //Decimal
        byte enteroDecimal=10;
        short numberWithDashes=10_000;
        //Octal
        byte enteroOctal=010;
        //hexadecimal
        byte enteroHexa=0x010;
        System.out.println("Decimal "+enteroDecimal+"\nOctal "+enteroOctal+"\nHexadecimal "+enteroHexa);
        //and java can ignore hyphens which can be used to improve the readability of the number.
        System.out.println("Decimal "+numberWithDashes);
        //long (neets L last)
        Long longo=100L;
        //Double
        double dou=2.5;
        //float (neet F last)
        float flo=2.5f;
        //char(needs)
        char cchar='b';
        //String
        String sstring="String";
        System.out.println(longo+dou+flo+cchar+sstring);
    }
}
