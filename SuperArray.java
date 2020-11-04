public class SuperArray{

  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if (size == data.length){
      resize();
    }

    data[size] = element;
    size = size + 1;
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String replaced = data[index];
    data[index] = element;

    return replaced;
  }

  private void resize(){
    String[] newArray = new String[data.length + 10];

    for (int i = 0; i < size; i++){
      newArray[i] = data[i];
    }

    data = newArray;
  }

  public boolean isEmpty(){
    return size == 0;
  }

}
