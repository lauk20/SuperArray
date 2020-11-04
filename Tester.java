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
    B.add("10");
    System.out.println(B.size());
    System.out.println(B.get(10));
    System.out.println();
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
    C.clear();
    C.isEmpty();
    System.out.println(C.get(0));
    System.out.println(C.toString());
    System.out.println();

    SuperArray D = new SuperArray(50);
    System.out.println(D.get(49));
  }
}
