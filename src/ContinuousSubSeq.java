
public class ContinuousSubSeq {
	public int numRange(int[] A, int B, int C) {
        int length = A.length;
		int count = 0;
		int sum = 0;
		int index = 0;
		int i = 0;
		while (index<length) {
			sum = sum+A[i];
	        if(B<=sum && sum<=C) {
	            count++;
	        }
	        else if(sum>C) {
	            sum = 0;
	            i = index++;
	        }
	        i++;
	        if(i==length) {
	            sum = 0;
	            index++;
	            i = index;
	        }
	    }
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given an array of non negative integers A, and a range (B, C), 
		// find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C
		ContinuousSubSeq cs = new ContinuousSubSeq();
		int[] arr = {10, 5, 1};
		int b = 6;
		int c = 8;
		System.out.println(cs.numRange(arr, b, c));
	}
}
