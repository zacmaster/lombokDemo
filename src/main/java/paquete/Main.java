package paquete;

public class Main {
    public static void main(String[] args) {
        Animal a = Animal.builder().age(23).color("black").name("Cebra").build();
        System.out.println(a);

        a.setAge(2);
        System.out.println(a);
    }
}
