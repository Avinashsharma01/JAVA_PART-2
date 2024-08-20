package OOPs.AccessModifier.Private;

/**
 * Private access modifier only gives the access within the class
 */



public class Private {
    private String name="Avinash";

    public String IhaveTheAccess(){
        return name;
    }

    public static void main(String[] args) {
        Private p1 = new Private();
        String name= p1.IhaveTheAccess();
        System.out.println(name);
    }
}
