import java.util.Arrays;

public class ExcerciseArray {
    public static void main(String[] args) {


    }
    class DynamicArray<E>{
        private Object[] elements = new Object[1];
       private int size = 0;

        boolean add(E element){
            elements[size]= element;
            size++;
            //TODO: increase elements array: Growing
            if (size >= elements.length){
                Object[] newElements = new Object[size * 2];
                for (int i = 0; i < elements.length; i++) {
                    newElements[i] = elements[i];
                }
                elements = newElements;
            }
            return true;

        }
        E get(int index){
            checkIndex(index);
            return (E) elements[index];

        }
        private void checkIndex(int index) {
            if (index < 0 || index >= size);{
                throw new IllegalArgumentException();
            }
        }
        E set(int index, E element){

            elements[index] = element;
            return element;

        }
        E remove(int index){
            E oldElement = (E) elements[index];
            for (int i = index; i < size - 1; i++) {

                    elements[index] = elements[index + 1];

            }
            size --;
            return oldElement;

        }
        int size(){
            return this.size();

        }
    }


}
