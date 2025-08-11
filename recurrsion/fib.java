class fib {
    public static void main(String[] args) {
        // Your code
        int ans=fib(2);
        System.out.println(ans);
    }
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}