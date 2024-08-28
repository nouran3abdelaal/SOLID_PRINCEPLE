package org.example.liskovSubstitutionPrinciple.goodExample;

import org.example.liskovSubstitutionPrinciple.goodExample.Bird;
import org.example.liskovSubstitutionPrinciple.goodExample.Penguin;

public class LSPMain {
        public static void main(String[] args) {
            Bird b1 = new Bird();
//            Bird b1 = new Penguin();
            b1.eat();

        }
}
