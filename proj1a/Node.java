public class Node<T> {

        public T item;
        public Node<T> rest;
        public Node<T> pred;

        public Node(){
        }

        public Node( T init, Node<T> restadd, Node<T>predadd){
            item = init;
            rest = restadd;
            pred= predadd;
        }

}
