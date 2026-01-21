class skipChar{
    static char ch='m';
    
    public static void main(String[] args) {
        String str="dedfmmwmmft";
        System.out.println(skip(str));
    }
    static String skip(String str) {
        if(str.length()==0){
            return "";
        }
        if(str.charAt(0)==ch){
            return skip(str.substring(1));
        }
        else{
            return str.charAt(0)+skip(str.substring(1));
        }
 }
}