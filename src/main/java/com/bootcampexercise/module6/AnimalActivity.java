package com.bootcampexercise.module6;

public class AnimalActivity {
    /**
     * @author Markuss
     * @purpose print Mammal object attributes
     * @output Animal with name: Rufus is ...Cat is sleeping!
     * Animal with name: Rufus is ...Cat says: 'Meow Meow'!
     * Animal with name: Rufus is ...Dog is sleeping!
     * Animal with name: Rufus is ...Dog says: 'Gav Gav'!
     *
     * Process finished with exit code 0
     */
    static void main() {

        //TODO: Use interfaces to declare identifiers instead of the actual classes

        //TODO: Create Dog and Cat using interface Animal
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        //TODO: For mammal set animal to cat
        Mammal myMammal = new Mammal("Rufus");
        myMammal.setAnimal(myCat);

        //TODO: execute for mammal animalIsSleeping()
        myMammal.animalIsSleeping();
        //TODO: execute for mammal animalIsSpeaking()
        myMammal.animalIsSpeaking();

        //TODO: For mammal set animal to dog
        myMammal.setAnimal(myDog);

        //TODO: execute for mammal animalIsSleeping()
        myMammal.animalIsSleeping();
        //TODO: execute for mammal animalIsSpeaking()
        myMammal.animalIsSpeaking();

    }
}
