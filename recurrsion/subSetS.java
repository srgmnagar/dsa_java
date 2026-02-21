

import java.util.ArrayList;

public class subSetS {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> ans=substr("",str);
        System.out.println(ans.size());
    }
    static ArrayList<String> substr(String p, String up){
        if(up.length()==0){
             ArrayList<String> list=new ArrayList<>();
             list.add(p);
             return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0, i);
            String b=p.substring(i, p.length());
            ans.addAll(substr(f+ch+b,up.substring(1 )));
        }
        return ans;
        }
}
