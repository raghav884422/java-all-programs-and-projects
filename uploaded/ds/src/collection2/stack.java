package collection2;

import java.util.Iterator;

import collections.Array;

class stack {

	private int size;
	private String stack[];

	public stack(int size) {
		stack = new String[size];
	  this.size=size;
	}
	int top = -1;
	public void push(int value) {
		top++;
		if (top+1>=0 &&top<=stack.length-1) {
		
		}
	}
}