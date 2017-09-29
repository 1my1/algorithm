/**
 * 地上有一个m行和n列的方格。
 * 一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 * 
 * @author wanghao
 * @Date Sep 29, 2017
 * @Time 5:57:42 PM
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
