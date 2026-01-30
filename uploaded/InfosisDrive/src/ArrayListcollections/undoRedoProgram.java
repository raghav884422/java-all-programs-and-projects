package ArrayListcollections;

import java.util.*;

public class undoRedoProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> action = new ArrayList<String>();
		Stack<String> redoStack = new Stack<String>();
		
		while(true) {
			System.out.println("enter 1-> action 2-> undo 3->redo 4->Show 5->tata bye bye");
			int choice = scan.nextInt();
			scan.nextLine();
			switch (choice) {
			case 1-> {
				System.out.println("Enter the action to perform");
				action.add(scan.nextLine());
				redoStack.clear();
			}
			case 2-> {
				if(action.isEmpty()==false) {
					String removeAction = action.remove(action.size()-1);
					redoStack.add(removeAction);
					System.out.println("Un did is "+removeAction);
				}else {
					System.out.println("nothing to undo");
				}
			}
			case 3 -> {
				if(redoStack.isEmpty()==false) {
					String newAction = redoStack.pop();
					action.add(newAction);
					System.out.println("red did -> " + newAction);
				}
				else {
					System.out.println("Nothing to redo");
				}
			}
			case 4-> {
				System.out.println("action-> "+action);
			}
			default->{
				System.out.println("tata bye bye");
			return;
			}
			}
			
			
		}
	}

}
