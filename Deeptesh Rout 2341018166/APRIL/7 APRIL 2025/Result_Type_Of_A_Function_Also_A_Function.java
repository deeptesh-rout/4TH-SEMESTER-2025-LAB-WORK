
interface MarksFunction {
    void printMarks();
}

class A {

    public MarksFunction getMarks(int total) {
        return new MarksFunction() {
            @Override
            public void printMarks() {
                System.out.println("Maths 90");
                System.out.println("Science 85");
                System.out.println("English 88");
            }
        };
    }
}

public class Result_Type_Of_A_Function_Also_A_Function {
    public static void main(String[] args) {
        A a = new A();

        MarksFunction marksFunction = a.getMarks(100);
        marksFunction.printMarks();
    }
}
