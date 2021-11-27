package typecheck.topol;

import universe.qual.Any;
import universe.qual.Peer;
import universe.qual.Rep;

public class SmallArrayVP {
    int [] pi;
    int [] ri;
    int [] ai;

    Object [] por;
    Object [] rop;

    void objOnReceiver() {
        SmallArrayVP pavp = new SmallArrayVP();

        Object po;

        // ok
        po = pavp.por[0];

        po = pavp.rop;

    }
}
