import java.util.Scanner;
public class JPA104 {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.print("輸入第1組的x和y座標:");
        float x1=scn.nextFloat();
        float y1=scn.nextFloat();
        System.out.print("輸入第2組的x和y座標:");
        float x2=scn.nextFloat();
        float y2=scn.nextFloat();
        double distance=Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f。", x1, y1, x2, y2, distance);
        scn.close();

    }
}
