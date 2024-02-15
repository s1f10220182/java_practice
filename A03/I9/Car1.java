package I9;

class Car1 {
  int no;
  int speed;

  public void setNo(int n){
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
