package A06.E7;

import java.util.ArrayList;
import java.util.Iterator;

public class NameList2 {
  public static void main(String[] args) {
    ArrayList <String> list = new ArrayList<String>();
    list.add("桜井");
    list.add("田原");
    list.add("中川");
    list.add("鈴木");
    String search = args[0];
    boolean result = false;

    Iterator <String> it = list.iterator();
    while (it.hasNext()){
      if (search.equals(it.next())){
        result = true;
      }
    }
    if (result){
      System.out.println(search + "さんは含まれているよーーん");
    }else{
      System.out.println(search + "さんは含まれてない!!!");
    }
  }
}
