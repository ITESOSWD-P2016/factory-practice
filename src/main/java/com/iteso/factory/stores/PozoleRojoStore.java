package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleRojoStore extends PozoleStore{
    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("pollo"))
            return new PozoleRojoPollo();
        else if (meat.equals("cachete") )
            return new PozoleRojoCachete();
        else if (meat.equals("oreja"))
            return new PozoleRojoOreja();
        else if (meat.equals("pierna") )
            return new PozoleRojoPierna();
        else if (meat.equals("trompa"))
            return new PozoleRojoTrompa();
        else return null;


    }
}
