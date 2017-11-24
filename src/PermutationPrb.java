import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationPrb {
	public void swap(int[] data, int k, int l) {
		int temp = data[k];
		data[k] = data[l];
		data[l] = temp;
	}
	
	public boolean permuteR(int[] data){
		int k = data.length - 2;
	    while (data[k] >= data[k + 1]) {
	        k--;
	        if (k < 0) {
	            return false;
	        }
	    }
	    int l = data.length - 1;
	    while (data[k] >= data[l]) {
	        l--;
	    }
	    swap(data, k, l);
	    int length = data.length - (k + 1);
	    for (int i = 0; i < length / 2; i++) {
	        swap(data, k + 1 + i, data.length - i - 1);
	    }
	    return true;
	}
	public int[][] permute(int[] A){
		if (A.length == 1){
			int[][] ret = new int[1][1];
			ret[0] = A;
			return ret;	
		}
		
		Arrays.sort(A);
		List<List<Integer>> ret = new ArrayList<>();
		List<Integer> l = new ArrayList<Integer>();
		for (int i=0;i<A.length;i++)
			l.add(A[i]);
		
		ret.add(l);
		while(permuteR(A)){
			l = new ArrayList<Integer>();
			// System.out.println(Arrays.toString(arr));
			for (int i=0;i<A.length;i++)
				l.add(A[i]);
			ret.add(l);
	    }
		
		int[][] retInt = new int[ret.size()][A.length];
		for(int i=0;i<ret.size();i++){
			l = ret.get(i);
			for (int j=0; j < l.size(); j++)
				retInt[i][j] = l.get(j);
		}
		return retInt;
	}
	
	public void print(int[][] ret){
    	for(int i=0;i<ret.length;i++){
    		System.out.println(Arrays.toString(ret[i]));
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationPrb p = new PermutationPrb();
		int[] arr = {3,2,1};
		int[][] ret = p.permute(arr);
		p.print(ret);
	}
}
