package hashSet;

import java.util.*;

public class hashmanpProblem {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        Map<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < N; i++) {
	            int roll = sc.nextInt();
	            int marks = sc.nextInt();
	            map.put(roll, marks);
	        }

	        eliminateDuplicatesAndSort(map);
	    }

	    public static void eliminateDuplicatesAndSort(Map<Integer, Integer> map) {

	        // Step 1: Count frequency of marks
	        Map<Integer, Integer> markCount = new HashMap<>();
	        for (int marks : map.values()) {
	            markCount.put(marks, markCount.getOrDefault(marks, 0) + 1);
	            System.out.println(marks);
	        }

	        // Step 2: Store only unique marks in TreeMap (sorted by roll)
	        TreeMap<Integer, Integer> result = new TreeMap<>();
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (markCount.get(entry.getValue()) == 1) {
	                result.put(entry.getKey(), entry.getValue());
	                System.out.println(entry);
	            }
	        }

	        // Step 3: Print result
	        if (result.isEmpty()) {
	            System.out.println("EMPTY");
	        } else {
	            for (Map.Entry<Integer, Integer> e : result.entrySet()) {
	                System.out.println(e.getKey() + " " + e.getValue());
	            }
	        }
	    }
	}


