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

        A.addLast("10");
        A.addFirst("9");
        A.addFirst("8");
        A.addFirst("7");
        A.addFirst("6");

        A.addLast("11");
        A.addFirst("5");
        A.addFirst("4");
        A.addFirst("3");

        A.addLast("12");
        A.addFirst("2");
        A.addFirst("1");
        A.addFirst("0");

        A.removeFirst();
        A.removeFirst();
        A.removeFirst();
        A.removeFirst();
        A.removeFirst();

        A.removeLast();
        A.removeLast();
        A.removeLast();
        A.printDeque();
    }*/
}
