public class AccessInstanceWithStatic {
    int instanceVar = 10; // Instance variable

    void instanceMethod() { // Instance method
        System.out.println("Instance method called. Instance variable value: " + instanceVar);
    }

    static void staticMethod() { // Static method
        // Create an instance of MyClass to access instance variables and methods
        AccessInstanceWithStatic  obj = new AccessInstanceWithStatic ();
        System.out.println("Static method called. Accessing instance variable: " + obj.instanceVar);
        obj.instanceMethod(); // Accessing instance method
    }
    public static void main(String[] args) {
        AccessInstanceWithStatic.staticMethod();
    }
}
    