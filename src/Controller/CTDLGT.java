package Controller;

import java.util.*;

public class CTDLGT {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("Pro");
        aList.add("Hung");

        aList.remove(0);
       // System.out.println(aList.get(0));

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Pro");
        linkedList.add("Hung");
        linkedList.addFirst("kynt");
        linkedList.addLast("truong");

        Stack<String> slist = new Stack();
        slist.push("Pro");
        slist.push("Hung");
         String a = slist.pop();
        //System.out.println(a);

        Queue<String> qlist = new LinkedList();
        qlist.add("Pro");
        qlist.add("Hung");
      //  System.out.println(qlist.poll());

        HashMap<Integer, String> hlist = new HashMap<>();
        hlist.put(1, "Pro");
        hlist.put(2, "Hung");
        hlist.put(3, "kynt");
        // System.out.println(hlist.get(2));

        HashSet<String> setList = new HashSet<>();
        setList.add("Pro");
        setList.add("Hung");
        System.out.println(setList);
    }
}
