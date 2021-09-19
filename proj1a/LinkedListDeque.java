public class LinkedListDeque <T>{

/**data include nothing but a Linked List as written in List.java */

    public List<T> ListinDeque;

    public LinkedListDeque ( T init){
        ListinDeque = new List<T>(init);
    }
    public LinkedListDeque(){
        ListinDeque = new List();
    }


    public void addFirst (T item){
        ListinDeque.addFirst(item);
    }

    public void addLast(T item){
        ListinDeque.addLast(item);
    }

    public boolean isEmpty(){
        if (ListinDeque.size() == 0) { return true;}
        return false;
    }

    public int size(){
        return ListinDeque.size();
    }


/**the urgent stuff is the spacing of the output*/
    public void printDeque(){

        for (int i = 0; i< ListinDeque.size(); i ++){

        System.out.print(ListinDeque.get(i) + " ");

        }
    }

    public T removeFirst(){
        T p = ListinDeque.removeFirst();
        return p;
    }

    public T removeLast(){
        T p = ListinDeque.removeLast();
        return p;
    }

    public T get(int index){
        T p = ListinDeque.get(index);
        return p;
    }

    /** get the elements with index x using recursion
     * the difficult design issue is that calling the get recursive function would change the structure of
     * ListinDeque;
     *
     * let's return ListinDeque in its original form.
     *
     * */

    public T getRecursive(int index){
    /** get the desired element without changing the LinkedList*/
        if (index == 0){
            T m = ListinDeque.getFirst();

            return m;
        }

        T temp = ListinDeque.removeFirst();

        T R = this.getRecursive( index-1);

        ListinDeque.addFirst(temp);

        return R;
    }


    public static void main (String [] args){
    /**LinkedListDeque<String> l = new LinkedListDeque<>("hhhh") ;*/
    LinkedListDeque<String> l = new LinkedListDeque<>();
    l.addFirst("hhh");
    l.addLast("hhhhhhh");
    System.out.println(l.get(1));
    System.out.println(l.getRecursive(1));
    System.out.println(l.size());

    l.printDeque();
    }
}


