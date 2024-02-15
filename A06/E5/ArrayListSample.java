package A06.E5;

import java.util.ArrayList;

public class ArrayListSample {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    System.out.println(list.size());
    list.add("Java入門講座");
    list.add("ここまで");
    list.add("よく頑張りましたね");
    System.out.println(list.size());

    list.remove(1);
    System.out.println(list.size());
    for (int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
