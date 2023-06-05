public class Interface {
    public static void main(String[] args) {

        interface Interface1 {
            void method1();
        }

        interface Interface2 {
            void method2();
        }


        class MyClass implements Interface1, Interface2 {
            public void method1() {
                System.out.println("Method 1 implementation");
            }

            public void method2() {
                System.out.println("Method 2 implementation");
            }
        }


        class Parent {
            protected int parentVariable;

            public Parent(int parentVariable) {
                this.parentVariable = parentVariable;
            }
        }


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


        class StaticClass {
            static int staticVariable;

            static {
                staticVariable = getStaticValue();
            }

            static int getStaticValue() {
                return 42;
            }
        }

        final class FinalClass {
            final int finalVariable = 10;

            final void finalMethod() {
                System.out.println("Final method implementation");
            }
        }


        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2();


        Child child = new Child(10, 20);
        System.out.println("Parent variable: " + child.parentVariable);
        System.out.println("Child variable: " + child.childVariable);


        System.out.println("Static variable: " + StaticClass.staticVariable);


        FinalClass finalObj = new FinalClass();
        System.out.println("Final variable: " + finalObj.finalVariable);
        finalObj.finalMethod();
    }
}


