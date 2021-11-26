package com.company.pokemons;

import com.company.moves.status.Confide;
import com.company.moves.status.DoubleTeam;
import com.company.moves.status.StunSpore;
import com.company.moves.status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gallade extends Pokemon {
    public Gallade(String name, int level) {
        super(name, level);
        setData();
    }

    private void setData() {
        setStats(68, 125, 65, 65, 115, 80);
        setType(Type.PSYCHIC, Type.FIGHTING);
        setMove(new Confide(), new DoubleTeam(), new StunSpore(), new Swagger());
    }
}
