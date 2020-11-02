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
  }
}
