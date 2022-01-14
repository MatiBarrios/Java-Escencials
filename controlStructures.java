public class controlStructures {
    public static void main (String arg[]){
        byte var1=3,var2=4,var3=0;
        //if
        if (var1==var2){
            System.out.println("var1 and var2 are equals");
        }
        //else if
        else if(var1==var3){
            System.out.println("var1 and var3 are equals");
        }
        //else
        else{
            System.out.println("var1 is alone :C");
        }
        //?
        var3= (byte) (var1<var2?1:0);
        //switch
        switch (var3){
            case 0:
            System.out.println("var1 is high");
            break;
            default:
            System.out.println("var2 is high");
        }
    }
}
