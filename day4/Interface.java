public class Interface {
    public static void main(String[] args) {
// Two interfaces with one abstract method each
        interface Interface1 {
            void method1();
        }

        interface Interface2 {
            void method2();
        }

// Class implementing both interfaces
        class MyClass implements Interface1, Interface2 {
            public void method1() {
                System.out.println("Method 1 implementation");
            }

            public void method2() {
                System.out.println("Method 2 implementation");
            }
        }

// Parent class with one instance variable
        class Parent {
            protected int parentVariable;

            public Parent(int parentVariable) {
                this.parentVariable = parentVariable;
            }
        }

// Child class with a second instance variable and constructors
        class Child extends Parent {
            private int childVariable;

            public Child(int parentVariable, int childVariable) {
                super(parentVariable);
                this.childVariable = childVariable;
            }

            public Child(int childVariable) {
                super(0);
                this.childVariable = childVariable;
            }
        }

// Class with a static variable and static method
        class StaticClass {
            static int staticVariable;

            static {
                staticVariable = getStaticValue();
            }

            static int getStaticValue() {
                return 42;
            }
        }

// Final class with a final variable and method accessible within the same package
        final class FinalClass {
            final int finalVariable = 10;

            final void finalMethod() {
                System.out.println("Final method implementation");
            }
        }

// Main class to test the above scenarios
        // public class Main {
        // public static void main(String[] args) {
        // Implementing interfaces using a single class
        MyClass myClass = new MyClass();
        myClass.method1(); // Output: Method 1 implementation
        myClass.method2(); // Output: Method 2 implementation

        // Testing parent and child classes
        Child child = new Child(10, 20);
        System.out.println("Parent variable: " + child.parentVariable); // Output: Parent variable: 10
        System.out.println("Child variable: " + child.childVariable); // Output: Child variable: 20

        // Testing static class and static method
        System.out.println("Static variable: " + StaticClass.staticVariable); // Output: Static variable: 42

        // Testing final class and final method
        FinalClass finalObj = new FinalClass();
        System.out.println("Final variable: " + finalObj.finalVariable); // Output: Final variable: 10
        finalObj.finalMethod(); // Output: Final method implementation
    }
}


