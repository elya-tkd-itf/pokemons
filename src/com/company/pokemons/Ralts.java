package com.company.pokemons;

import com.company.moves.status.Confide;
import com.company.moves.status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon {
    public Ralts(String name, int level) {
        super(name, level);
        setData();
    }

    private void setData() {
        setStats(28, 25, 25, 45, 35, 40);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Confide(), new DoubleTeam());
    }
}
