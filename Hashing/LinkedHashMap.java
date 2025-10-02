//Linked Hash Map->stores data into key value pair in order manner (based on their insertion)
import java.util.LinkedHashMap;
import java.util.Set;
public class Hashing{
    public static void main(String args[]){
        LinkedHashMap<String,Integer>hm=new LinkedHashMap<>();
        hm.put("India",100);
        hm.put("Wb",80);
        hm.put("Hooghly",70);
        System.out.println(hm);//output->{India=100, Wb=80, Hooghly=70}
        hm.put("Wb",76);
        System.out.println(hm.get("Wb"));//76->if we add existing key then value will be updated
        System.out.println(hm.size());
        System.out.println(hm.remove("Wb"));//return 76 -> value of the key
        System.out.println(hm);
        System.out.println(hm.size());
        hm.clear();//remove all elements
        System.out.println(hm.isEmpty());//return true if empty else return false
        //option 1
        Set<String>keys=hm.keySet();
        for(String k:keys){
            System.out.println(k);
        }
        //option 2
        System.out.println(hm.entrySet()); // [India=100, Hooghly=70]
        // the entrySet() method provides a Set view of the mappings in the HashMap. Each element in the set is a Map.Entry object that represents a key-value pair.
        //public Set<Map.Entry<K, V>> entrySet()
    }
}


