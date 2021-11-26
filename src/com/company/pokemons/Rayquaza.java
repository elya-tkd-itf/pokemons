package com.company.pokemons;

import com.company.moves.physical.BodySlam;
import com.company.moves.physical.RazorLeaf;
import com.company.moves.special.MagicalLeaf;
import com.company.moves.status.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rayquaza extends Pokemon {
    public Rayquaza(String name, int level) {
        super(name, level);
        setData();
    }

    private void setData() {
        setStats(105, 150, 90, 150, 90, 95);
        setType(Type.DRAGON, Type.FLYING);
        setMove(new BodySlam(), new MagicalLeaf(), new SwordsDance(), new RazorLeaf());
    }
}
