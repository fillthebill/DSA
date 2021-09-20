public class ArrayDeque<T> {

    private ArrayList<T> alist;

    public ArrayDeque(){
        alist = new ArrayList();
    }

    /**public ArrayDeque ( int length){
        alist = new ArrayList<T>(length);
    }*/

    public void addFirst (T item){
        alist.addFirst(item);
    }

    public void addLast(T item){
        alist.addLast(item);
    }

    public boolean isEmpty(){
        if (alist.used == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return alist.used;
    }

    public void printDeque(){
        alist.printlist();
    }

    public T removeFirst(){
        return alist.removeFirst();
    }

    public T removeLast(){
        return alist.removeLast();
    }

    public T get(int index){
        return alist.get(index);
    }


    /**public static void main(String[] args){
        ArrayDeque<String> A = new ArrayDeque();
        A.addLast("third");
        /**A.addFirst("Second");
        A.addFirst("First");
        A.addFirst("zero");
        A.removeFirst();
        A.removeLast();
        A.printDeque();
    }*/
}
