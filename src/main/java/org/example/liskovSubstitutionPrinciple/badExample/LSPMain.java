package org.example.liskovSubstitutionPrinciple.badExample;

public class LSPMain {
        public static void main(String[] args) {
//            Bird bird = new Bird();
            Bird bird = new Penguin();
            bird.fly(); // This will throw an UnsupportedOperationException
            bird.eat();

        }
}
