package 泛型.自定义泛型类;

public class Box<E> {

    private E element;

    public Box() {
    }

    public Box(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
