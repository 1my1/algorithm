import java.util.ArrayList;
import java.util.Collections;

public class MedianOfFlow {
	static ArrayList<Integer> list = new ArrayList<>();
    public static void Insert(Integer num) {
    	list.add(num);
        Collections.sort(list);
    }

    public static Double GetMedian() {
    	if(list.size() == 0 || list.isEmpty()){
    		return 0.0;
    	}else if(list.size() == 1){
    		return list.get(0)/1.0;
    	}
    	int size = list.size();
        int mid = size/2;
        if((size%2) == 1) return list.get(mid)/1.0;
        else return (list.get(mid-1) + list.get(mid))/2.0;
    }
    
    public static void main(String[] args) {
		Insert(5);
    	Insert(2);
    	Insert(3);
    	System.out.println(GetMedian());
	}
}
