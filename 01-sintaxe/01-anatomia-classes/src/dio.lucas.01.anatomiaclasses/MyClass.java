package dio.lucas.01.anatomiaclasses;

public class MyClass {
    
public static void main (String[] args) {
    
    String firtName = "Lucas";
    String lastName = "Anjos";
    
    String nameCompleted = nameComplete(firtName, lastName);

    System.out.print(nameCompleted);

}

public static String nameComplete (String firstName, String lastName) {
    return firstName.concat(" ").concat(lastName);
}

}
