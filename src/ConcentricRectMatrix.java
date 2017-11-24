
public class ConcentricRectMatrix {
	public int[][] prettyPrint(int A){
		int size = 2 * A - 1;
        int[][] arr = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if (i+j < size) {
                    arr[i][j] = A - Math.min(i, j);
                } else {
                    arr[i][j] = A - (size - Math.max(i, j)) + 1;
                }
            }
        }
        return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print concentric rectangular pattern in a 2d matrix.
		ConcentricRectMatrix cr = new ConcentricRectMatrix();
		int a = 3;
		cr.prettyPrint(a);
	}
}
