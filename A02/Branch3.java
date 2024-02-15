class Branch3 {
  public static void main(String[] args){
    String[] args1 = new String[1];
    args1[0] = "3";
    int x = Integer.parseInt(args1[0]);
    String price;

    switch (x) {
      case 1:
        price = "8,400";
        System.out.println("入園料金:" + price + "円");
        break;
      case 2:
        price = "7,000";
        System.out.println("入園料金:" + price + "円");
        break;
      default:
        price = "5,000";
        System.out.println("入園料金:" + price + "円");
        break;

    }
  }
}
