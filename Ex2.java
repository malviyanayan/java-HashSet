import java.util.HashSet;

class Ex2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("mohan");
        set.add("sohan");
        set.add("kallue");
        set.add("tohan");
        set.add("hohan");
        
        System.out.println(set);
        // System.out.println(set.contains(78));
        System.out.println(set.remove("mohan"));
        System.out.println(set);
    }    
}