class fib {
    public static void main(String[] args) {
        // Your code
        int ans=fibformula(50);
        System.out.println(ans);
    }
    static int fibformula(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}