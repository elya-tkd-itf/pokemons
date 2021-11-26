package com.company.pokemons;

import com.company.moves.status.Confide;
import com.company.moves.status.DoubleTeam;
import com.company.moves.status.StunSpore;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kirlia extends Pokemon {
    public Kirlia(String name, int level) {
        super(name, level);
        setData();
    }

    private void setData() {
        setStats(38, 35, 35, 65, 55, 50);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Confide(), new DoubleTeam(), new StunSpore());
    }
}
