import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Iterator;
import java.util.ListIterator;
public class nodeApplication {

    static class Node<E>{
        private E element ;
        private Node<E> next;
        private Node<E> previous;

        public Node(E element, Node<E> next, Node<E> previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }
    }
    static class LinkedList<E>{
        private Node<E> head;
        private Node<E> tail;
        private  int size;

        public void add(E element) {
            Node<E>newNode = new Node<>(element,null, tail);
            if (head == null){
                head = newNode;
            }
            if (tail!=null){
                tail.setNext(newNode);// current last element changes
            }

            tail = newNode;// current tail changes
            size++;
        }
        public Node<E> getHead(){
            return head;

        }
        public void remove(Node<E> node){
            if (node.getPrevious() != null){
                node.getPrevious().setNext(node.getNext());
            }
            if (node.getNext() != null){
                node.getNext().setPrevious(node.getPrevious());
            }
            if (head == node){
               head = node.getNext();
            }
            if (tail == node){
                tail = node.getPrevious();
            }
            size--;
        }


    }
    public static void main(String[] args) {
     LinkedList<String> people = new LinkedList<>();
     people.add("Marina" );
     people.add("Louise");
     people.add("Kathrine");
     people.add("Barbara");





     Node<String> node = people.getHead();




     while (node!= null){
         if (node.getElement().equals("Louise")){
             people.remove(node);
         }else{
             System.out.println(node.getElement());

         }
         node = node.getNext();


     }
    }
}
