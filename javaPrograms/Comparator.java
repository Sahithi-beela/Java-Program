import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
               
                int lenCompare = Integer.compare(s1.length(), s2.length());
                
                if (lenCompare != 0) {
                    return lenCompare;
                }
                return s1.compareTo(s2); 
            }
        };

        
        Set<String> treeSet = new TreeSet<>(lengthComparator);

        
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("kiwi");
        treeSet.add("pear");
        treeSet.add("orange");
        treeSet.add("grape");

        
        System.out.println("TreeSet sorted by length:");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
