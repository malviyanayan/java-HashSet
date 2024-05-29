import java.util.HashSet;

class Ex1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(56);
        set.add(12);
        set.add(68);
        set.add(21);
        set.add(19);
        
        // System.out.println(set.contains(78));
        System.out.println(set.contains(68));
    }    
}