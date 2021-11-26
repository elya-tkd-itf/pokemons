package com.company.pokemons;

import com.company.moves.physical.RockSlide;
import com.company.moves.special.IceBeam;
import com.company.moves.status.Confide;
import com.company.moves.status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jellicent extends Pokemon {
    public Jellicent(String name, int level) {
        super(name, level);
        setData();
    }

    private void setData() {
        setStats(100, 60, 70, 85, 105, 60);
        setType(Type.WATER, Type.GHOST);
        setMove(new Confide(), new RockSlide(), new DoubleTeam(), new IceBeam());
    }
}
