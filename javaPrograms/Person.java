public class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Person person = (Person) obj; 
        return age == person.age && name.equals(person.name); 
    }

   
    @Override
    public int hashCode() {
        int result = name.hashCode(); 
        result = 31 * result + age; 
        return result;
    }

   
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}"; 
    }

        public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // false

        
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());

        
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("person3: " + person3);
    }
}
