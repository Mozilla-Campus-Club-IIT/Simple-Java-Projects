import java.util.Scanner;
public class Sorter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,j;
        System.out.println("enetr the elements :");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int loc=i;
            for(j=i;j<n;j++){
                if(a[j]<a[loc]){
                    loc=j;
                }
                int t=a[loc];
                a[loc]=a[i];
                a[i]=t;
            }
        }
        System.out.println("the sorted array is ");
        for( i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }
}
