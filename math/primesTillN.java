
public class primesTillN {
    public static void main(String[] args) {
        int n=4000;
        boolean[] primes=new boolean[n+1];
        prime(n, primes);
    }
    static void prime(int n, boolean[] primes) {
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.println(i);
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
    }
}
