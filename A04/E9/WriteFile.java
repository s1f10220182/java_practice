package A04.E9;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;

import java.io.*;


public class WriteFile {
  public static void main(String[] args) {
    try{
      BufferedReader r = new BufferedReader(
        new InputStreamReader(System.in));
      PrintWriter w = new PrintWriter(
        new BufferedWriter(new FileWriter("output.txt")));

      String str;
      while ((str = r.readLine()) != null) {
        w.println(str);
      }
      r.close();
      w.close();
    } catch(IOException e){
      System.out.println(e);
    }
  }
}
