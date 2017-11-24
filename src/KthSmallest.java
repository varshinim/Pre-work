
public class KthSmallest {
	public int kthsmallest(int[] A, int B) {
        int kthValue = A[0];
        int count = 1;
        for(int i=1;i<A.length;i++){
            if(kthValue<A[i]){
                if(count<B){
                    kthValue = A[i];
                    count++;
                }
            }
            else{
                int maxValue = A[i];
                for(int j=0;j<i;j++){
                    if(maxValue<A[j] && (count<B || kthValue>A[j])){
                        maxValue = A[j];
                    }
                }
                if(maxValue>=kthValue){
                    count++;
                }
                kthValue = maxValue;
            }
        }
        return kthValue;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the kth smallest element in an unsorted array of non-negative integers.
		KthSmallest s = new KthSmallest();
		int[] arr = {2,1,4,3,2};
		int k = 3;
		System.out.println(s.kthsmallest(arr, k));
	}
}
