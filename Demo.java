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

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray combine = new SuperArray();

    for (int i = 0; i < a.size() || i < b.size(); i++){
      if (i < a.size()){
        combine.add(a.get(i));
      }
      if (i < b.size()){
        combine.add(b.get(i));
      }
    }

    return combine;
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

    System.out.println("DEMO ZIP TEST\n");

    SuperArray E = new SuperArray();
    SuperArray F = new SuperArray();

    E.add("a"); E.add("b"); E.add("c"); E.add("d"); E.add("e"); E.add("f");
    F.add("0"); F.add("1"); F.add("2"); F.add("3");

    System.out.println(zip(E, F));

    E.clear();
    F.clear();

    E.add("a"); E.add("b"); E.add("c");
    F.add("0"); F.add("1"); F.add("2"); F.add("3"); F.add("4");

    System.out.println(zip(E, F));

    E.clear();
    F.clear();

    E.add("1"); E.add("3"); E.add("5");
    F.add("2"); F.add("4"); F.add("6"); F.add("7"); F.add("8");

    System.out.println(zip(E, F));

    E.clear();
    F.clear();

    System.out.println(zip(E, F));

    E.add("1"); E.add("3"); E.add("5");

    System.out.println(zip(E, F));

    System.out.println(zip(F, E));
  }

}
