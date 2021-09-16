public class testIntlist {

    public static void main (String[] args){

/**
        IntList A = IntList.of(1,2,3,4);
        IntList B = IntList.of(5,6);
        IntList.dcatenate(A,B);

        while (A.rest!= null){
            System.out.println(A.first);
            A = A.rest;
        }
        System.out.println(A.first);
*/
        IntList C = IntList.of(1,2,3,4);
        IntList D = IntList.of(9,111);
        IntList E = IntList.catenate(C,D);

        while (E.rest!= null){
            System.out.println(E.first);
            E = E.rest;
        }
        System.out.println(E.first);

    }





}
