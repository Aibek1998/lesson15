public class Main {
    public static void main(String[] args) {
       Fish fish = new Fish();
       Dog dog = new Dog();
       Cat cat = new Cat();
       Parrot parrot = new Parrot();
       fish.setName("Nemo");
       fish.setColor("Red");
       fish.setFeature("Cartoon Hero");
       fish.setCharacter("Swim");
       cat.setName("Garfild");
       cat.setColor("Ginger");
       cat.setFeature("The slacer");
       cat.setCharacter("Cartoon Hero");
       dog.setName("Hachiko");
       dog.setColor("White");
       dog.setCharacter("Faithful");
       dog.setFeature("Film Hero");
       parrot.setName("Blu");
       parrot.setColor("Blue");
       parrot.setCharacter("Cartoon Hero");
       parrot.setFeature("Rare breed");
       System.out.println();
       System.out.println( "      Fish        ");
       System.out.println("===================");
       System.out.println("Name : "+fish.getName()+"\n"+
               "Color : "+fish.getColor()+"\n"+
               "Feature : "+fish.getFeature()+"\n"+
               "Hero : "+fish.getCharacter());
       System.out.println("====================");
       System.out.println();
       System.out.println("        Dog        ");
       System.out.println("===================");
       System.out.println("Name : "+dog.getName()+"\n"+
               "Color : "+dog.getColor()+"\n"+
               "Feature : "+dog.getFeature()+"\n"+
               "Hero : "+dog.getCharacter());
       System.out.println("====================");
       System.out.println();
       System.out.println("         Cat       ");
       System.out.println("===================");
       System.out.println("Name : "+cat.getName()+"\n"+
               "Color : "+cat.getColor()+"\n"+
               "Feature : "+cat.getFeature()+"\n"+
               "Hero : "+cat.getCharacter());
       System.out.println("====================");
       System.out.println();
       System.out.println("      Parrot       ");
       System.out.println("===================");
       System.out.println("Name : "+parrot.getName()+"\n"+
               "Color : "+parrot.getColor()+"\n"+
               "Feature : "+parrot.getFeature()+"\n"+
               "Hero : "+parrot.getCharacter());
       System.out.println("====================");
       System.out.println();


    }
}