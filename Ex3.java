import java.util.HashSet;

class Ex3{
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Student a = new Student("mohan",23);
        set.add(new Student("mohan",23));
        set.add(new Student("tohan",25));
        set.add(new Student("johan",24));
        set.add(new Student("eohan",20));
        set.add(new Student("rohan",26));

        System.out.println(set);
        System.out.println(set.contains(a));


        Student b = new Student("om",23);

        // System.out.println("Hashcode is : " + a.hashCode());
        // System.out.println("Hashcode is : " + b.hashCode());
        
        

    }    
}



class Student{
    String name ;
    int age;

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name + " - " + this.age;
    }

    public boolean equals(Object obj){
        boolean flag = false;

        if(obj instanceof Student){
            Student obj2 = (Student)obj;

            flag = this.name.equals(obj2.name) && this.age == obj2.age;
        }

        return flag;
    }


    public int hashCode() {
        int hashcode = 0;
        String name = this.name;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch >= 97 && ch <= 122) {  // lowercase letters 'a' to 'z'
                hashcode += ch - 97 + 1;
            } else if (ch >= 65 && ch <= 90) {  // uppercase letters 'A' to 'Z'
                hashcode += ch - 65 + 1;
            }
    }

    return hashcode;
}

}