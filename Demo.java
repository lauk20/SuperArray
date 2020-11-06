public class Demo{

  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i < s.size(); i++){
      if (s.indexOf(s.get(i)) != i){
        s.remove(i);
        i = i - 1;
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray newOne = new SuperArray();

    for (int i = 0; i < a.size(); i++){
      if (b.contains(a.get(i))){
        newOne.add(a.get(i));
      }
    }

    removeDuplicates(newOne);

    return newOne;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    System.out.println();

    SuperArray A = new SuperArray();
    SuperArray B = new SuperArray();

    System.out.println("Overlap here");
    A.add("9"); A.add("1"); A.add("2"); A.add("2"); A.add("3"); A.add("4");
    B.add("0"); B.add("4"); B.add("2"); B.add("2"); B.add("9");

    System.out.println(A);
    System.out.println(B);

    System.out.println(findOverlap(A, B).toString());
    System.out.println(findOverlap(B, A));

    SuperArray C = new SuperArray();
    SuperArray D = new SuperArray();


    for(int i = 0; i < 10; i++){
      C.add("1");
    }

    for(int i = 0; i < 10; i++){
      D.add("1");
    }

    System.out.println(findOverlap(C, D));

    System.out.println(C);

    removeDuplicates(C);

    System.out.println(C);
  }

}
