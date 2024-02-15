class Branch1 {
  public static void main(String[] args){
    String[] args1 = new String[1];
    args1[0] = "1000";
    int price = Integer.parseInt(args1[0]);
    double rate = 0.10;
    int discount, amount;

    if (price >= 5000){
      discount = 500;
    }else if (price >= 3000){
      discount = 300;
    }else{
      discount = 0;
    }

    amount = (int)((price - discount) * (1 + rate));
    System.out.println("値引き金額" + discount + "円");
    System.out.println("税込価格" + amount  + "円");
  }
}
