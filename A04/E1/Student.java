package A04.E1;

public class Student extends Person{
  private int stuNo;

  public void setStuNO(int s){
    stuNo = s;
  }
  public void displayStuNo(){
    System.out.println("学籍番号" + stuNo);
  }
}
