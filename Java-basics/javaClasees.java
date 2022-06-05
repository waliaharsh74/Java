public class javaClasees {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.legs = 4;
        a1.name = "simba";

        System.out.println(a1.legs + " " + a1.name);
    }
}

class Animal {
    int legs;
    String name;
}
