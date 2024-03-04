import java.util.Scanner;

public class JPA103{
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        System.out.println("Please input:");
        
        float a=scn.nextFloat();
        float b=scn.nextFloat();
        float c=scn.nextFloat();
        float Average=(a+b+c)/3;
        System.out.printf("Average: %.2f",Average);
        scn.close();

    }
}    
        /* 
        if(scn.hasNextFloat())
        a=scn.next();
        System.out.println("Average: "+a/3);
        scn.close();
        
    }
}
/* */