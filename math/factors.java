public class factors {
	public static void main(String[] args) {
		factors(24);
	}
    static void factors(int n){
        for (int i = 1; i*i<= n; i++) {
            if (n % i == 0) {
                if (i*i == n) {
                    System.out.println(i);
                } else {
                    System.out.println(i+" "+n/i);
                }
            }
        }
    }
}
