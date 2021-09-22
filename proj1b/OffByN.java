public class OffByN implements  CharacterComparator {

    private int tol;
    OffByN(int n) {
        tol = n;
    }

    @Override
    public boolean equalChars(char x, char y) {
        int diff = x - y;
        if ( (diff >tol) || (diff <-1*tol) ){
            return false;
        }
        else {
            return  true;
        }
    }
}
