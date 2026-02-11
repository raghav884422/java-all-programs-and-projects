package arrayListFuctioning;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Initialize the Scanner and LinkedList
        LinkedList ll = new LinkedList();
        int n = sc.nextInt(); //2
        for(int i = 0;i<=n-1;i++){  //0,1,2
            ll.addFirst(sc.nextLine());
        }
        System.out.println("Number of tasks "+ n);
        System.out.println("Tasks: ");
        Iterator itr = ll.iterator();
        int count = 0;
        while(itr.hasNext()){
            System.out.println(itr.next());
            count++;
        }
        // TODO: Read the number of tasks (n)
        // TODO: Read n tasks and add them to the LinkedList using addFirst()
        // TODO: Print the size of the LinkedList
        // TODO: Print all tasks in the LinkedList
    }
}