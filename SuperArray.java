public class SuperArray{

  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity < 0){
      throw new IllegalArgumentException("InitialCapacity cannot be negative: " + initialCapacity);
    }

    data = new String[initialCapacity];
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

  public void add(int index, String element){
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Index is out of bounds or negative. Size is " + size + " Index is " + index);
    }

    if (size == data.length){
      resize();
    }

    for(int i = size - 1; i >= index; i = i - 1){
      data[i + 1] = data[i];

      /*if (i == index){
        data[i] = element;
        System.out.println(data[i]);
      }*/
    }

    data[index] = element;

    size = size + 1;
  }

  public String remove(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index is out of bounds or negative. Size is " + size + " Index is " + index);
    }

    String removedItem = data[index];

    for (int i = index + 1; i < size; i++){
      data[i - 1] = data[i];
      if (i == size - 1){
        data[i] = null;
      }
    }

    size = size - 1;

    return removedItem;
  }

  public String get(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index is out of bounds or negative. Size is " + size + " Index is " + index);
    }

    return data[index];
  }

  public String set(int index, String element){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index is out of bounds or negative. Size is " + size + " Index is " + index);
    }

    String replaced = data[index];
    data[index] = element;

    return replaced;
  }

  private void resize(){
    String[] newArray = new String[data.length * 2 + 1];

    for (int i = 0; i < size; i++){
      newArray[i] = data[i];
    }

    data = newArray;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public void clear(){
    for (int i = 0; i < size; i++){
      data[i] = null;
    }

    size = 0;
  }

  public String toString(){
    String result = "[";

    for (int i = 0; i < size; i++){
      if (data[i] != null){
        result = result + data[i];
        if (size - 1 != i){
          result = result + ", ";
        }
      }
    }

    result = result + "]";

    return result;
  }

  public boolean contains(String s){
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)){
        return true;
      }
    }

    return false;
  }

  public int indexOf(String s){
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)){
        return i;
      }
    }

    return -1;
  }

  public int lastIndexOf(String value){
    int result = -1;

    for (int i = 0; i < size; i++){
      if (data[i].equals(value)){
        result = i;
      }
    }

    return result;
  }

  public String[] toArray(){
    String[] newArray = new String[size];

    for (int i = 0; i < size; i++){
      newArray[i] = data[i];
    }

    return newArray;
  }

  public boolean equals(SuperArray other){
    if (size == other.size){
      for (int i = 0; i < size; i++){
        if (!data[i].equals(other.data[i])){
          return false;
        }
      }
      return true;
    }

    return false;
  }

}
