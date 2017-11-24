import java.util.Arrays;
import java.util.Stack;

public class NextGreatest {
	public int[] nextGreater(int[] A) {
        Stack<Integer> s = new Stack<Integer>();
		s.push(A[A.length-1]);
		A[A.length-1] = -1;
		int temp = 0;
		for(int i=A.length-2;i>=0;i--){
			if(A[i]<s.peek()){
				temp = A[i];
				A[i] = s.peek();
				s.push(temp);
			}
			else if(A[i]>=s.peek()){
				while(!s.isEmpty() && A[i]>=s.peek()){
					s.pop();
				}
				if(s.isEmpty()){
					temp = A[i];
					A[i] = -1;
					s.push(temp);
				}
				else{
					temp = A[i];
					A[i] = s.peek();
					s.push(temp);
				}
			}
		}
        return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given an array, find the next greater element G[i] for every element A[i] in the array. 
		// The Next greater Element for an element A[i] is the first greater element on the right side of A[i] in array. 
		NextGreatest ng = new NextGreatest();
		int[] arr = {39, 27, 11, 4, 24, 32, 32, 1 };
		System.out.println(Arrays.toString(ng.nextGreater(arr)));
	}
}