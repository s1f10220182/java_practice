package I9;

class Car2 {
  private int no;
  private int speed;

  public Car2(){
    no = 0;
  }
  public Car2(int n){
    no = n;
  }
  public void run(int s){
    speed = s;
  }
  public void brake(){
    speed = 0;
  }
  public void brake(int s){
    speed -= s;
  }
  void display(){
    System.out.println("No." + no + "の速度は" + speed + "です");
  }
}
