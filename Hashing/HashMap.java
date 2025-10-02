//HashMap->store data into (key,value) format
import java.util.Set;
import java.util.HashMap;
public class Hashing{
    public static void main(String args[]){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",140);
        hm.put("West Bengal",20);
        hm.put("Hooghly",5);
        System.out.println(hm);//output->{Hooghly=5, West Bengal=20, India=140}
        hm.put("India",100);
        System.out.println(hm.get("India"));//100->if we add existing key then value will be updated
        System.out.println(hm.containsKey("Tribeni"));//if exists return true else false
        System.out.println(hm.remove("West Bengal"));//return 20->value of the key
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
        System.out.println(hm.entrySet());//[Hooghly=5, West Bengal=20, India=140]
        // the entrySet() method provides a Set view of the mappings in the HashMap. Each element in the set is a Map.Entry object that represents a key-value pair.
        //public Set<Map.Entry<K, V>> entrySet()
    }
}
