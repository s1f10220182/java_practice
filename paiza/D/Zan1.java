package paiza.D;

// class Zan1 {
//   public static void main(String[] args){
//     int n = Integer.parseInt(args[0]);
//     int m = Integer.parseInt(args[1]);

//     int zan = n - m;
//     System.out.println(zan);
//   }
// }


import java.util.*;
public class Zan1 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("入力してください");
        String line = sc.nextLine();
        String line2 = sc2.nextLine();

        // int n = Integer.parseInt(sc);
        int n = Integer.parseInt(line);
        int m = Integer.parseInt(line2);

        int ans = n - m;

        System.out.println(ans);
        // System.out.println(m);
    }
}
