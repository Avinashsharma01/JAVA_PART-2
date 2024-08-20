package String;

public class Avinash {
    public static void main(String[] args) {
        int marks = 40;
        String name = "Avinash";
        System.out.printf("Hello %s your marks is this %d", name, marks);

        System.out.println();

        //This is StringBuilder
        StringBuilder sb = new StringBuilder("I am default value");
        sb.append(", i am avinash");
        System.out.println(sb);

        //This is StringFuffer
        System.out.println();
        StringBuffer sbb = new StringBuffer("I am StringBuffer");
        sbb.append(", and I am appended");
        System.out.println(sbb);

    }
}
