public class Generics <T> {
    public T element;
    Generics(T element){
        this.element=element;
    }

    public T getElement(){
        return element;
    }

    public <V> boolean compareElement(V element){
        return this.element.getClass() == element.getClass(); 
    }
}
