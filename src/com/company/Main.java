package com.company;

import com.company.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Frillish frillish = new Frillish("Фриллиш", 1);
        Gallade gallade = new Gallade("Галлада", 1);
        Jellicent jellicent = new Jellicent("Джеллисент", 1);
        Kirlia kirlia = new Kirlia("Кирлия", 2);
        Ralts ralts = new Ralts("Ральтс", 1);
        Rayquaza rayquaza = new Rayquaza("Райкваза", 1);
        b.addAlly(frillish);
        b.addAlly(gallade);
        b.addAlly(jellicent);
        b.addFoe(kirlia);
        b.addFoe(ralts);
        b.addFoe(rayquaza);
        b.go();
    }
}
