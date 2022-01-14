public class primitiveData {
    public static void main(String args[]){
        //in the case of numbers there are 6 primitive data types.
        //Byte, occupies 8 bits of value and can represent values from -128 to 127 or 255 numbers.
        Byte var1= Byte.MIN_VALUE;
        System.out.println("MIN "+var1);
        var1=Byte.MAX_VALUE;
        System.out.println("MAX "+var1);
        //short, occupies 16 bits of value, two times byte size and can represent values from -32768 to 32767.
        Short var2= Short.MIN_VALUE;
        System.out.println("MIN "+var2);
        var2=Short.MAX_VALUE;
        System.out.println("MAX "+var2);
        //int, occupies 32 bits of value, two times short size and can represent values from -2147483648 to 2147483647
        int var3= Integer.MIN_VALUE;
        System.out.println("MIN "+var3);
        var3=Integer.MAX_VALUE;
        System.out.println("MAX "+var3);
        //long, occupies 64 bits of value, two times int size and can represent values from -9223372036854775808 to 9223372036854775807
        long var4=Long.MIN_VALUE;
        System.out.println("MIN "+var4);
        var4=Long.MAX_VALUE;
        System.out.println("MAX "+var4);
        //float, is used to store decimal numbers with floating point, with simple 32-bit precision.
        //double, is used to store real numbers in floating point and is much more precise than float, so if we need precision we will use double.
        //char, is used to store a letter or simbol.
        //boolean, is used to store a boolean value, true or false.
    }
}