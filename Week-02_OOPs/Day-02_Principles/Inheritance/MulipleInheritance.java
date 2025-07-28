class Animal{
    Animal(){
        System.out.println("Class 1");
    }
}
class Dog{
    Dog(){
        System.out.println("Class 2");
    }
}
// Java does not support multiple inheritance via classes due to ambiguity problem.

// class Puppy extends Dog, Animal{
//     Puppy(){
//         System.out.println("Class 3");
//     }
// }