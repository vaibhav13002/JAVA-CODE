package Zeus;

public class GettersSetters {
        // Private instance variables
        private String name;
        private int age;
    
        // Getter method for name
        public String getName() {
            return name;
        }
    
        // Setter method for name
        public void setName(String name) {
            this.name = name;
        }
    
        // Getter method for age
        public int getAge() {
            return age;
        }
    
        // Setter method for age with data validation
        public void setAge(int age) {
            if (age >= 0 && age <= 120) { // Assuming a reasonable range for age
                this.age = age;
            } else {
                System.out.println("Invalid age. Age should be between 0 and 120.");
            }
        }
    public static void main(String[] args) {
        GettersSetters person = new GettersSetters();

        // Using setters to assign values to private instance variables
        person.setName("Alice");
        person.setAge(25);

        // Using getters to retrieve values of private instance variables
        System.out.println("Name: " + person.getName()); // Output: Alice
        System.out.println("Age: " + person.getAge());   // Output: 25

        // Attempting to set an invalid age
        person.setAge(150); // Output: Invalid age. Age should be between 0 and 120.
    }
}

