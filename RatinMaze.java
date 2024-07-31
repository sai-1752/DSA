import java.util.Scanner;

public class RatinMaze{
    public static boolean solveMaze(int[][] maze){
        int n=maze.length;
        int[][] solution=new int[n][n];

        if (Maze(maze, 0, 0, solution)) {
            printsol(solution);
            return true;
        }
        else{
            System.out.println("No solution");
            return false;
        }

    }

    public static boolean Maze(int[][] maze,int x,int y,int[][] solution){
        int n=maze.length;

        if (x==n-1&&y==n-1&&maze[x][y]==1) {
            solution[x][y]=1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            solution[x][y]=1;

            if (Maze(maze, x+1, y, solution)) {
                return true;
            }
            if (Maze(maze, x, y+1, solution)) {
                return true;
            }

            solution[x][y]=0;
            return false;
        }
        return false;
    }
    public static boolean isSafe(int[][] maze,int x,int y){
        int n=maze.length;
        return x>=0 && x<n && y>=0 && y<n && maze[x][y]==1;
    }

    public static void printsol(int[][] solution){
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution.length; j++) {
                System.out.print(solution[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the maze: ");
        
        int n=scanner.nextInt();

        int[][] maze=new int[n][n];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j]=scanner.nextInt();
            }
        }
        solveMaze(maze);

        scanner.close();
    }

}