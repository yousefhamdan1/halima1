package rev1;

public class Main88 {
    String breed;
    String name;
    String color;
    void bark() {
        System.out.println(name+" can bark");
    }

   void run() {
       System.out.println(name+" can bark");
   }
    void play(){
        System.out.println(name+" can bark");
    }

    public static void main(String[] args) {
        Main88 husky=new Main88();
        Main88 bulldog=new Main88();
        Main88 Labrador=new Main88();
        husky.name="husky";
        husky.bark();
        husky.run();
        husky.play();
        bulldog.name="Bulldog";
        bulldog.bark();
        bulldog.run();
        bulldog.play();
        Labrador.name="Labrador";
        Labrador.bark();
        Labrador.run();
        Labrador.play();


    }
}

