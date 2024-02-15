package A04.E10;

public class Taxi extends Vehicle implements Stopable{
  public Taxi(int crewNum){
    super.crewNum = crewNum;
  }
  public void showCrewNum(){
    System.out.println("タクシーの乗客:" + crewNum + "名");
  }
  public void stop(){
    System.out.println("ここでおります");
  }
}
