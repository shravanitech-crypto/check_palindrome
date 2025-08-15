public class Palindrome {
    public static void main(String[] args) {
        
        System.out.println(isPalindrome(121));
    }
    static boolean isPalindrome(int x){
        int temp=x;
        System.out.println("the number is "+x);
        int rem;
        int rev=0;
        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        if(rev==temp){
            return true;

        }
        else{
            return false;
        }

    }
  

}
