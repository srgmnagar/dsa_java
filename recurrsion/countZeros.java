public class countZeros {
    public static void main(String[] args) {
        int c=0;
        System.out.println(countZeros(10203040,c));
       }
    static int countZeros(int num,int c){
        if(num==0){
            return c;
        }
        if(num%10==0){
            c++;
        }
        return countZeros(num/10,c);
    }
}
