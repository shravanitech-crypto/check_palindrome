
import java.util.Scanner;
class Main {

    public static void odd(int n){
        int sum=0;
        int i;
        for(i=1;i<=n;i++){
          if(i%2!=0){
            sum=sum+i;
             
        
        }
        System.out.println(""+i);//printing numbers
    }
   
    System.out.println("sum of odd numbers= "+sum);//printing sum of odd numbers
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number that you want");
        int n=sc.nextInt();
        odd(n);
        }
}