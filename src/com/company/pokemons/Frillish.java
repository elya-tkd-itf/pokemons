package com.company.pokemons;

import com.company.moves.physical.RockSlide;
import com.company.moves.status.Confide;
import com.company.moves.status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Frillish extends Pokemon {
    public Frillish(String name, int level) {
        super(name, level);
        setData();
    }

    private void setData() {
        setStats(55, 40, 50, 65, 85, 40);
        setType(Type.WATER, Type.GHOST);
        setMove(new Confide(), new RockSlide(), new DoubleTeam());
    }
}
