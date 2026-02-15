
public class mazeAll {
  
  
    static int[][] visited;
    public static void main(String[] args) {
        int grid[][]={{0,0,0},{0,0,1},{0,0,0}};
        visited=new int[grid.length][grid[0].length];
        System.out.println(maze(0,0,grid.length,grid[0].length,grid));
    }

    static int maze(int i, int j, int m, int n, int[][] grid){
        if(i==m-1 && j==n-1 && grid[i][j]==0){
            return 1;
        }
        if(i>=m || j>=n || i<0 ||j<0){
            return 0;
        }
        if(visited[i][j]==1){
            return 0;
        }
        if(grid[i][j]==1){
            return 0;
        }
        int count=0;
        visited[i][j]=1;
        count+=(maze(i+1,j,m,n,grid)+maze(i,j+1,m,n,grid)+maze(i-1,j,m,n,grid)+maze(i,j-1,m,n,grid));
        visited[i][j]=0;
        return count;
    }

}
