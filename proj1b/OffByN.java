public class OffByN implements  CharacterComparator {

    private int tol;
    public OffByN(int n) {
        tol = n;
    }

    @Override
    public boolean equalChars(char x, char y) {
        int diff = x - y;
        if ( (diff == tol ) || (diff == -tol) ){
            return true;
        }
        else {
            return  false;
        }
    }
}
