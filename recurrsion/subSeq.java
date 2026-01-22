import java.util.ArrayList;

class subSeq {
    public static void main(String[] args) {
        String str="sar";
        // subseq("",str);
        System.out.println(subseqArrList("",str));
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseqArrList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqArrList(p+ch,up.substring(1));
        ArrayList<String> right=subseqArrList(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
