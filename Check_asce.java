import java.util.Scanner;
public class Check_asce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elemnts in array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean isascending=true;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                isascending=false;
            }
            else{
                isascending=true;
            }
        }
        if(isascending){
            System.out.println("array sorted in ascendig orde");

        }
        else{
            System.out.println("array elemets are not sorted in ascending order");
        }
    }
}
