package com.cb.stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int x) {
		if (isFull()) {
			int[] newArr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		super.push(x);
	}

	public static void main(String[] args) throws Exception {
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.push(70);
//		ds.pop();
		ds.peek();
		ds.display();
	}
}
