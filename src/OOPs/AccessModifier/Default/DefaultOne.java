package OOPs.AccessModifier.Default;

/**
 * Default access modifier gives only access within the same package
 */

public class DefaultOne {
    String name = "Avinash";

    void DefaultAccessModifier(){
        System.out.println("DefaultAccessModifier");
    }

    public static void main(String[] args) {
        DefaultOne d1 = new DefaultOne();
        d1.DefaultAccessModifier();
    }
}
