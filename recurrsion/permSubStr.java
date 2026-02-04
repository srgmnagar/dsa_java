
import java.util.ArrayList;

public class permSubStr {

   public static void main(String[] var0) {
      String var1 = "abc";
      ArrayList var2 = substr("", var1);
      System.out.println(var2);
   }

   static ArrayList<String> substr(String var0, String var1) {
      ArrayList var2;
      if (var1.length() == 0) {
         var2 = new ArrayList();
         var2.add(var0);
         return var2;
      } else {
         var2 = new ArrayList();
         char var3 = var1.charAt(0);

         for(int var4 = 0; var4 < var0.length(); ++var4) {
            String var5 = var0.substring(0, var4);
            String var6 = var0.substring(var4, var0.length());
            var2.addAll(substr(var5 + var3 + var6, var1));
         }

         return var2;
      }
   }
}
