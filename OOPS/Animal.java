public class Animal{
    public static void main(String[] args) {
        fish t = new fish();
        t.eat();
    }
}
class animalx{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breaths(){
        System.out.println("breaths");
    }

}
class fish extends animalx{
    int fins;
    void swims(){
        System.out.println("swims");
    }
}