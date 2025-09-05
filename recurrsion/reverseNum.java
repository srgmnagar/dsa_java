public class reverseNum {
    static int sum=0;
    public static void main(String[] args) {
        // reverse1(176427);
        // System.out.println(sum);

        int n=176427;
        int dig=(int)(Math.log10(n));
        int ans=reverse2(n,dig);
        System.out.println(ans);
    }
    static void reverse1(int n){
        if(n==0){
            return;
        }
        else{
            int rem=n%10;
            sum=(sum*10)+rem;
            reverse1(n/10);
           }
    }

     static int reverse2(int n, int dig){
        if(n==0){
            return 0;
        }
        else{
            return (int) (((n%10)*Math.pow(10,dig))+reverse2(n/10,dig-1));
           }
    }
}
