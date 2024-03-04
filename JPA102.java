import java.util.Scanner;

public class JPA102 {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);  //宣告 Scanner 類別的物件名為：sc
		System.out.print("Please input:");
		double k=scn.nextDouble();                         //宣告變數str                   //輸入字串，給str存放
		System.out.println(k+" kg = "+(k*2.20462)+" pounds");
        scn.close();                          //關閉

	}
}
