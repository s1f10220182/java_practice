package I9;

class DriveCar2 {
  public static void main(String[] args){
    Car2 c1 = new Car2();
    c1.run(30);
    c1.display();


    Car2 c2 = new Car2(2525);
    c2.run(50);
    c2.display();
    // c2.no = 999;
    // c2.display();
  }
}
