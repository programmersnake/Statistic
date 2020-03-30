package statistic;

import java.util.ArrayList;
import java.util.Scanner;

public class Statistic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList days  = new ArrayList<Integer>();
        int kolvo_days=scan.nextByte();
        for(int i=0;i<kolvo_days;i++)
            days.add(scan.nextInt());        
        System.out.println(isFour(days));
    }
    
    static boolean isFour(ArrayList<Integer> days){
        ArrayList ChetnieD = new ArrayList();
        ArrayList NeChetnieD = new ArrayList();
        days.forEach((day) -> {
            if(day%2==0) 
                ChetnieD.add(day);
            else 
                NeChetnieD.add(day);
        });
        System.out.println(ChetnieD);
        System.out.println(NeChetnieD);
        return (ChetnieD.size()>=NeChetnieD.size());
    }
    
}
