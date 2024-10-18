public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
        System.out.println(person1.hashCode()); // Example output: some hash code
        System.out.println(person1); // Output: Person{name='Alice', age=30}
    }
}
