import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 * @author wh
 *
 */
public class PascalTriangle {
	
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
	
	public static List<List<Integer>> generate(int rowNums){
		List<List<Integer>> allRow = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for(int i = 0; i < rowNums; i++){
			row.add(0, 1);
			for(int j = 1; j < row.size() - 1; j++){
				row.set(j, row.get(j)+row.get(j+1));
			}
			allRow.add(new ArrayList<>(row));
		}
		return allRow;
	}

}
