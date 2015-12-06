// containers/UniqueWords.java
// �2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
import java.util.*;
import java.nio.file.*;

public class UniqueWords {
  public static void main(String[] args) throws Exception {
    List<String> lines =
      Files.readAllLines(Paths.get("SetOperations.java"));
    Set<String> words = new TreeSet<>();
    for(String line : lines)
      for(String word : line.split("\\W+"))
        if(word.trim().length() > 0)
          words.add(word);
    System.out.println(words);
  }
}
/* Output:
[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L,
M, N, Output, Set, SetOperations, String, System, X, Y, Z,
add, addAll, added, args, class, containers, contains,
containsAll, false, from, import, in, java, main, new, out,
println, public, remove, removeAll, removed, set1, set2,
split, static, to, true, util, void]
*/
