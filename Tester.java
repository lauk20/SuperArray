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
  }
}
