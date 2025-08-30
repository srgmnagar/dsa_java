public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(3));
    }
    static int fact(int n){
        if(n<=0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
