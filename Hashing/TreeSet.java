//HashSet stores single data in sorted manner and you can't add null
import java.util.*;
import java.util.TreeSet;
import java.util.Set;
public class Hashing{
    public static void main(String args[]){
        TreeSet<Integer>hs=new TreeSet<>();
        hs.add(34);
        hs.add(12);
        hs.add(23);
        hs.add(67);
        System.out.println(hs);//output->[12, 23, 34, 67]
        System.out.println(hs.contains(100));//if contain return true else false
        System.out.println(hs.remove(34));//return false if the key not exists else return true
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        hs.clear();
        System.out.println(hs.size());
        //option-1
        Iterator it=hs.iterator();
        while(it.hasNext()){
           System.out.println(it.next());
        }
        //option-2
        for(Integer i:hs){
            System.out.println(i);
        }
    }
}
