public class ArrayList<T> {

    private T [] array;
    public int size; /** Number of meaningful elements*/
    public int nextfirst;
    public int nextlast;
    /**these two elements are essential to keep the running time of add and remove to be constant*/
    public int used = 0;

    /**
     * save the first place for the sentinel, to make it possible to initiate a empty ADeque;
     * index for the first item, index for the last item:"first + used" */
    public ArrayList( int length){
        int bigger;
        if (length < 100){
            bigger = 100;
        }
        else bigger = length;

        array = (T [])new Object[bigger];
        nextfirst = bigger/2;
        nextlast = nextfirst +1;
        size = bigger;
    }

    /**initiate an empty list, such that when excution add follows, a new array of T would be constructed.*/
    public ArrayList(){
        array = (T[])new Object[100];
        size = 100;
        nextfirst = 100/2;
        nextlast = nextfirst +1;


    }
    public void resize(){

        T[] duplicate = (T[])new Object[2 * size];
        System.arraycopy(array, nextfirst+1, duplicate, nextfirst + size/2, size);
        array = duplicate;
        size = size*2;
        nextfirst = nextfirst + size/2 -1;
        nextlast = nextfirst + size;
    };

    public int is_full(){
        if (used == size){
            return 1;
        }
        return 0;
    };

    public void addFirst( T item) {
        if ( (this.is_full() == 1)|| (nextfirst == -1) ){
            this.resize();
        }
        array[nextfirst] = item;
        used +=1;
        nextfirst-=1;
    }

    public void addLast(T item){
        if((this.is_full() == 1)||(nextlast == size)){
            this.resize();
        }
        array[nextlast] = item;
        nextlast +=1;
        used +=1;
    }

    public T removeFirst(){

        T p = array[nextfirst+1];
        array[nextfirst + 1] = null;
        nextfirst +=1;
        used -=1;

        return p;
    }

    public T removeLast(){

        T p = array[nextlast-1];
        array[nextlast-1] = null;
        nextlast -=1;
        used -=1;

        return p;
    }

    public T get(int index){
        return array[index + nextfirst +1];
    }

    public void printlist(){

        for ( int i =0; i< used;i++){

            System.out.print(array[nextfirst +1 +i] + " ");
        }
    }

}
