import java.util.Scanner;
public class JPA105 {
     public static void main(String[] args) {
        Scanner name = new Scanner (System.in);
        Scanner money=new Scanner (System.in);
        System.out.print("請輸入您的姓名:");
        String n = name.nextLine();
        System.out.println("Hi, " + n+",請輸入您的銅板的個數：");
        System.out.printf("請輸入1元的數量:");
        int a=money.nextInt();
        System.out.printf("請輸入5元的數量:");
        int b=money.nextInt();
        System.out.printf("請輸入10元的數量:");
        int c=money.nextInt();
        System.out.printf("請輸入50元的數量:");
        int d=money.nextInt();
        int total=a*1+b*5+c*10+d*50;
        int a1=total%10;
        int b1=(total%100)/10;
        int c1=(total%1000)/100;
        int d1=total/1000;
        System.out.printf("您的錢總共有:%d 千 %d 百 %d 十 %d 元",d1,c1,b1,a1);
        name.close();
        money.close();
     }
}
