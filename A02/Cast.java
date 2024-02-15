class Cast {
  public static void main(String[] args){
    String[] args1 = new String[1];
    args1[0] = "10";
    int price = Integer.parseInt(args1[0]);
    double rate = 0.08;
    int amount;

    amount = (int)(price * (1 + rate));
    System.out.println("税込価格" + amount + "円");
  }
}
