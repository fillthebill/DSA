/** include sentinel node to deal with the possibility of empty list*/

/** improve it into a double direction linked list, with only one sentinel node.
 * which means that we have to change the class Node*/

public class List <T>{

    public Node<T> sentinel ;
    public int size;

    public List(){
        int artificial = 999;
        sentinel = new Node(artificial,null,null);
        sentinel.pred = sentinel;
        sentinel.rest = sentinel;
        size =0;
        }

    public List( T init){
        int artificial = 999;
        sentinel = new Node(artificial,null,null);
        Node<T> first = new Node<>(init,sentinel,sentinel);
        sentinel.rest = first;
        sentinel.pred = first;
        size = 1;
    }

    public  void addFirst( T element){
        Node<T> temp = new Node<>(element,sentinel.rest,sentinel);

        sentinel.rest.pred = temp;
        sentinel.rest = temp;
        size +=1;

    }

    public void addLast( T element){
        Node<T> temp = new Node<>(element,sentinel,sentinel.pred);
        sentinel.pred.rest = temp;
        sentinel.pred = temp;

        size +=1;
    }

    public T removeFirst(){
        T p = sentinel.rest.item;

        size -= 1;
        sentinel.rest.rest.pred = sentinel;
        sentinel.rest = sentinel.rest.rest;
        return p;
    }

    public T removeLast(){
        T p = sentinel.pred.item;
        size -=   1;
        sentinel.pred.pred.rest = sentinel;
        sentinel.pred = sentinel.pred.pred;
        return p;
    }

    public T getFirst(){
        return sentinel.rest.item;

    }

    public int size(){
        return size;
    }

    public T get( int index){
        int i;
        Node<T>p = sentinel.rest;
        for (i=0;i< index;i++){
            p = p.rest;
        }
        return p.item;
    }

    public static void main (String[] args){
        List trylist = new List();

        trylist.addFirst("third");
        trylist.addFirst("sec");

        trylist.addFirst("first");
        trylist.addLast("fourth");
        trylist.removeLast();
        trylist.removeFirst();

        int i =0;
        for (i = 0;i < trylist.size();i++){
        System.out.println(trylist.get(i));}

    }
}
