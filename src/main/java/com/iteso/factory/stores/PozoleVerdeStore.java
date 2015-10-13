package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleVerdeStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("pollo"))
            return new PozoleVerdePollo();
        else if (meat.equals("cachete") )
            return new PozoleVerdeCachete();
        else if (meat.equals("oreja"))
            return new PozoleVerdeOreja();
        else if (meat.equals("pierna") )
            return new PozoleVerdePierna();
        else if (meat.equals("trompa"))
            return new PozoleVerdeTrompa();
        else return null;

    }
}
