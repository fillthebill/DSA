public class Palindrome {
    public Deque<Character> wordToDeque(String word) {
        LinkedListDeque <Character> l = new LinkedListDeque<>();
        for (int i =0; i< word.length(); i++) {
            l.addLast( word.charAt(i));
        }
        return l;
    }

    public boolean isPalindrome(String word, CharacterComparator cc) {
        if ( word.length() <2){
            return true;
        }

        Deque<Character> temp = wordToDeque(word);
        char f = temp.removeFirst();
        char l = temp.removeLast();

        if (cc.equalChars(f,l) == false) {
            System.out.println("f == " + f);
            System.out.println("l == "+ l);
            return false;

        }
        if ( (temp.size() < 2) && (cc.equalChars(f,l) == true) ) {
            System.out.println("f == " + f);
            System.out.println("l == "+ l);
            return true;

        }

        int flag = 0;
        while(temp.size() >1) {
            temp.printDeque();
            System.out.println("f == " + f);
            System.out.println("l == "+ l);
            if ( cc.equalChars(f,l) == true) {
                f = temp.removeFirst();
                l = temp.removeLast();
            }
            else {
                flag = 1;
                break;
            }
        }

        if (flag ==1) {
            return false;
        }

        else if (cc.equalChars(f,l) == true) {
            return true;
        }

        else {
            return  false;
        }

    }

    public boolean isPalindrome(String word) {
        if ( word.length() <2) {
            return true;
        }

        Deque<Character> temp = new LinkedListDeque<>();
        temp = wordToDeque(word);
        char f = temp.removeFirst();
        char l = temp.removeLast();
        if (f !=l) {
            return false;
        }

        if (temp.size() <=1) {
            return true;
        }
        int flag = 0;

        while(temp.size() >=2) {

            if ( f ==l ) {
                f = temp.removeFirst();
                l = temp.removeLast();
            }
            else {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            return false;
        }
        if (f != l) {
            return false;
        }
        else {
            return true;
        }
    }

}
