import java.util.Scanner;
public class Time_Difference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter strating time: ");
        System.out.println("enter hours: ");
        int start_hours=sc.nextInt();
        System.out.println("enter minutes: ");
        int start_minutes=sc.nextInt();
        System.out.println("enter seconds: ");
        int start_sec=sc.nextInt();
        System.out.println("enter finishing time: ");
        System.out.println("enter hours: ");
        int finish_hours=sc.nextInt();
        System.out.println("enter minutes: ");
        int finish_minutes=sc.nextInt();
        System.out.println("enter seconds: ");
        int finish_sec=sc.nextInt();
        int result_hours=0,result_minutes,result_sec;
        if(finish_sec-start_sec<0){
            start_minutes+=1;
            result_sec=60+(finish_sec-start_sec);
        }
        else{
            result_sec=finish_sec-start_sec;
        }
        if(finish_minutes-start_minutes<0){
            start_hours+=1;
            result_minutes=60+(finish_minutes-start_minutes);
        }
        else{
            result_minutes=finish_minutes-start_minutes;
        }
        if(finish_hours-start_hours<0){
            System.out.println("error invalid operation");
        }
        else{
            result_hours=finish_hours-start_hours;
        }
        System.out.println("the Difference of the start time and finish time is "+result_hours+" : "+result_minutes+" : "+result_sec);
    }
    
}
