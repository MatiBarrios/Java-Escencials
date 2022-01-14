public class MainGenerics {
    public static void main (String args[]){
        Generics<String> box1 = new Generics<String>("Dog");
        System.out.println(box1.element);
    }
}
