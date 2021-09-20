public class ArrayList<T> {

    private T [] array;
    public int size; /** Number of meaningful elements*/
    public int nextfirst;
    public int nextlast;
    private int bound = 100;
    /**these two elements are essential to keep the running time of add and remove to be constant*/
    public int used = 0;

    /**
     * save the first place for the sentinel, to make it possible to initiate a empty ADeque;
     * index for the first item, index for the last item:"first + used" */
    public ArrayList( int length){
        int bigger;
        if (length < bound){
            bigger = bound;
        }
        else bigger = length;

        array = (T []) new Object[bigger];
        nextfirst = bigger/2;
        nextlast = nextfirst +1;
        size = bigger;
    }

    /**initiate an empty list, such that when excution add follows, a new array of T would be constructed.*/
    public ArrayList(){
        array = (T[]) new Object[bound];
        size = bound;
        nextfirst = bound/2;
        nextlast = nextfirst +1;


    }

    /** resize should be used to both resize up and down.*/
    public void resizeup(){

        T[] duplicate = (T[]) new Object[2*size];
        System.arraycopy(array, nextfirst+1, duplicate, nextfirst + size/2, size);
        array = duplicate;
        size = size*2;
        nextfirst = nextfirst + size/2 -1;
        nextlast = nextfirst + size;
    };

    public void sizedown(){
        T [] duplicate = (T[]) new Object[size/2];
        System.arraycopy(array,nextfirst+1,duplicate,size/4,size);
        array = duplicate;
        size = size/2;
        nextfirst = size/4-1;
        nextlast = size/4 + size;

    }

    public int is_full(){
        if (used == size){
            return 1;
        }
        return 0;
    };

    public void addFirst( T item) {
        if ( (this.is_full() == 1)|| (nextfirst == -1) ){
            this.resizeup();
        }
        array[nextfirst] = item;
        used +=1;
        nextfirst-=1;
    }

    public void addLast(T item){
        if((this.is_full() == 1)||(nextlast == size)){
            this.resizeup();
        }
        array[nextlast] = item;
        nextlast +=1;
        used +=1;
    }

    public T removeFirst(){
        if( used == 0){
            return null;
        }
        T p = array[nextfirst+1];
        array[nextfirst + 1] = null;
        nextfirst +=1;
        used -=1;

        if ( (size >=200) && (used < size/2)){
            this.sizedown();
        }
        return p;
    }

    public T removeLast(){

        if ( used == 0){
            return null;
        }
        T p = array[nextlast-1];
        array[nextlast-1] = null;
        nextlast -=1;
        used -=1;

        if ((size > 200) && (used < size/2)){
            this.sizedown();
        }
        return p;
    }

    public T get(int index){
        if (index <0){
            return null;
        }
        if (index >=used){
            return null;
        }
        return array[index + nextfirst +1];
    }

    public void printlist(){

        for ( int i =0; i< used;i++){

            System.out.print(array[nextfirst +1 +i] + " ");
        }
    }

}
