public class pattern1 {
    public static void main(String[] args) {
        pattern2print(3,0);
    }
    static void pattern1print(int row,int col){
         if(row==0){
            return;
        }
        else if(col<row){
            System.out.print("* ");
            pattern1print(row,col+1);
        }
        
        else{
            System.out.println();
            pattern1print(row-1,0);
        
    }

}
static void pattern2print(int row,int col){
         if(row==0){
            return;
        }
        else if(col<row){
            pattern2print(row,col+1);
            System.out.print("* ");
        }
        
        else{
            pattern2print(row-1,0);
            System.out.println();
        
    }

}

}