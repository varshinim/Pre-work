import java.util.HashSet;

public class LongestConsecutive {
	public int longestConsecutive(final int[] A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int j = 0;
        int length = 0;
        for(int i=0;i<A.length;i++){
            hs.add(A[i]);
        }
        for(int i=0;i<A.length;i++){
            if(!hs.contains(A[i]-1)){
                j = A[i];
                while(hs.contains(j)){
                    j++;
                }
                if(j-A[i]>length){
                    length = j-A[i];
                }
            }
        }
        return length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
		LongestConsecutive l = new LongestConsecutive();
		int[] arr = {100, 4, 200, 1, 3, 2};
		l.longestConsecutive(arr);
	}

}
