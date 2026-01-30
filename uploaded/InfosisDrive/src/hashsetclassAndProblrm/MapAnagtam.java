package hashsetclassAndProblrm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapAnagtam {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	String str[] = new String[size];
	for(int i = 0;i<=size-1;i++) {
		str[i]=sc.next();
	}
	List<List<String>> result = groupAnagram(str);
	System.out.println(result);
}
    public static List<List<String>> groupAnagram(String []str){
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	for(String word:str) {
    		char [] ch = word.toCharArray();
    		Arrays.sort(ch);
    		String key = new String(ch);
    		map.putIfAbsent(key, new ArrayList<String>());
    		map.get(key).add(word);
    	}
    	
	return new ArrayList<>(map.values());
}
}
