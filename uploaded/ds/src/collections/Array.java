package collections;

final public class Array {
    int arr[];
    int size;
	public Array(int size) {
	arr = new int[size];
		this.size= size;
	}
	public void insert(int value,int index) {
		if(index>=0 && index<=arr.length-1) {
			arr[index] = value;
		} else {
			System.out.println("enter the vailid input between 0 to " + (arr.length-1));
		}
	}
	public void insertAll(int value ) {
		for(int i = 0;i<=arr.length-1;i++) {
			arr[i] = value;
		}
	}
	public void display() {
		for(int i = 0;i<=arr.length-1;i++) {
			
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	public boolean search(int key) {
		for(int i =0;i<=arr.length-1;i++) {
			if(key ==arr[i]) {
				return true;
			}
		}
		return false;
		
	}
	public void delete(int index) {
		if(index>=0 && index<=arr.length-1) {
			arr[index]=0;
			System.out.println(arr[index]);
		} else {
			System.out.println("enter the vailid input between 0 to " + (arr.length-1));
		}
	}

}
