public class basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
        //default public static and final(since final hence no child enums)
    }
    public static void main(String[] args) {
        Week week=Week.Monday;
        System.out.println(week);
        System.out.println();
        for(Week day:Week.values()){
            System.out.println(day);
        }
    }
}
