package A06.E7;

import java.util.ArrayList;

public class NameArray {
  public static void main(String[] args) {
    ArrayList <String> list = new ArrayList<String>();
    list.add("桜井");
    list.add("田原");
    list.add("中川");
    list.add("鈴木");
    // String[] names = {"桜井", "田原", "中川", "鈴木"};
    String search = args[0];
    // boolean result = false;

    int i;
    for (i = 0; i < list.size(); i++){
      if (search.equals(list.get(i))){
        // result = true;
        break;
      }
    }
    if (i < list.size()){
      System.out.println(search + "さんは含まれています");
    }else{
      System.out.println(search + "さんは含まれていません");
    }
  }
}
