import java.util.Arrays;

public class Tester{
  public static void main(String[] args){
    SuperArray A = new SuperArray();
    System.out.println(A.size());
    System.out.println(A.add("YUP"));
    System.out.println(A.add("YUP2"));
    System.out.println(A.get(0));
    System.out.println(A.get(1));
    System.out.println(A.set(0, "REPLACEDYUP"));
    System.out.println(A.get(0));
    System.out.println();
    SuperArray B = new SuperArray();
    for (int i = 0; i < 10; i++){
      B.add(Integer.toString(i));
    }
    System.out.println(B.size());
    System.out.println(B.toString());
    B.remove(9);
    System.out.println(B.toString());
    B.add("10");
    System.out.println(B.toString());
    System.out.println(B.size());
    System.out.println(B.get(9));
    System.out.println();

    SuperArray C = new SuperArray();
    System.out.println(C.isEmpty());
    for (int i = 0; i < 10; i++){
      C.add(Integer.toString(i));
    }
    System.out.println(C.size());
    System.out.println(C.toString());
    C.add(5, "INSERTED");
    System.out.println(C.toString());
    System.out.println(C.contains("0"));
    System.out.println(C.indexOf("INSERTED"));
    System.out.println(C.indexOf("11212 24154325346 4574524 324236134 1425 35 hi"));
    C.remove(5);
    System.out.println(C.toString());
    C.remove(10);
    System.out.println(C.toString());
    C.remove(0);
    System.out.println(C.toString());
    C.add(0, "0");
    System.out.println(C.toString());
    C.add(10, "9");
    System.out.println(C.toString());
    String[] testing = C.toArray();
    System.out.println("BELOW IS TOARRAY TEST");
    System.out.println(testing); //see if its actually array
    System.out.println(Arrays.toString(testing));
    System.out.println("TOARRAY OVER");
    C.clear();
    C.isEmpty();
    System.out.println(C.get(0));
    System.out.println(C.toString());
    System.out.println();

    SuperArray D = new SuperArray(50);
    System.out.println(D.get(49));

    System.out.println("NEW TESTS START HERE\n");
    SuperArray E = new SuperArray();
    SuperArray F = new SuperArray();

    for (int i = 0; i < 10; i++){
      E.add("1");
    }

    for (int i = 0; i < 10; i++){
      F.add(Integer.toString(i));
    }

    System.out.println(E.lastIndexOf("1"));

    System.out.println(F.lastIndexOf("1"));
    System.out.println(F.lastIndexOf("9"));
    System.out.println(F.lastIndexOf("5"));

  }
}
