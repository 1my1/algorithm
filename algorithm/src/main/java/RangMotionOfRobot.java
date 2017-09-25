/**
 * 
 * @author Administrator
 *
 */
public class RangMotionOfRobot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bitNum(35));
		System.out.println(movingCount(18,35,37));
	}
	
	public static int movingCount(int threshold, int rows, int cols){
		int sum = 0;
		boolean[][] visited = new boolean[rows][cols];
		return help(threshold, 0, 0, rows, cols, visited);
    }
	
	public static int help(int threshold, int i, int j, int rows, int cols, boolean[][] visited){
		int num = bitNum(i) + bitNum(j);
		if(i < 0 || j < 0 || i >= rows || j >= cols ||num > threshold || visited[i][j]){
			return 0;
		}
		visited[i][j] = true;
		return help(threshold,i-1,j,rows,cols,visited)+
				help(threshold,i+1,j,rows,cols,visited)+
				help(threshold,i,j-1,rows,cols,visited)+
				help(threshold,i,j+1,rows,cols,visited)+1;
	}
	
	public static int bitNum(int num){
		int result = 0;
		do{
			result += num % 10;
		}while((num = num / 10) > 0);
		return result;
	}

}
