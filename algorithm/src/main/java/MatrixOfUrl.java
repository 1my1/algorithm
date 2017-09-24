/**
 * 矩阵中的路径
 * 题目描述：
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，
 * 则该路径不能再进入该格子。 例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bcced"的路径，
 * 但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 * @author Administrator
 *
 */
public class MatrixOfUrl {
	
	public static void main(String[] args) {
		char[] matrix = {'a','b','c','e','s','f','c','s','a','d','e','e'};
		char[] str = {'b','c','c','e','d'};
		System.out.println(hasPath(matrix,2,3,str));
	}
	
	public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
    	boolean[] visited = new boolean[matrix.length];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(search(matrix,rows,cols,i,j,0,visited, str)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean search(char[] martix, int rows, int cols, int i, int j, int index, boolean[] visited, char[] str){
        if(i < 0 || j < 0 || i >= rows || j >= cols || visited[i * cols + j] || martix[i * cols + j] != str[index]){
            return false;
        }
        if(index == str.length - 1) return true;
        visited[i * cols + j] = true;
        //上下左右
        if(search(martix,rows,cols,i - 1,j,index + 1,visited,str)||
            search(martix,rows,cols,i + 1,j,index + 1,visited,str)||
            search(martix,rows,cols,i,j - 1,index + 1,visited,str)||
            search(martix,rows,cols,i,j + 1,index + 1,visited,str))
            return true;
        visited[i * cols + j] = false;
        return false;
    }
	
}
