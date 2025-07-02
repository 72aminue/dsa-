import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //collecting the number of days
        System.out.println("How many day's temperature: ");
        int days= scanner.nextInt();
        int[]temps=new int[days];// to store temperature
        int sum=0;
        for(int i=0; i<temps.length;i++){
            System.out.println("Day "+(i+1)+"'s temperature: ");
            temps[i]=scanner.nextInt();// storing temperature in array
            sum+=temps[i];
        }
        double average=sum/days;
        int above=0;
        for (int temp : temps) {
            if (temp > average) {
                above++;
            }
        }

        System.out.println("The average is: "+average);
        System.out.println();
        System.out.println(above+" days have more temperature than average");

    }
}