import universe.qual.*;

class GBoundsSmall {

    class Data {}
    class SubData extends Data {}

    class C1<X extends Object> {
        X f;
        Object m() {
            return f;
        }
    }

    class C2<X extends Object> {}
    class C3<Y extends Data> {
        C2<Y> f;
    }

    C2<SubData> gr2;
    C2<Object> go2;

//    class C4 {
//        @Peer C2<@Peer Object> f;
//        @Rep C2<@Rep SubData> g;
//        @Rep Object h = new @Rep C2<@Rep SubData>();
//
//        // :: error: (type.argument.type.incompatible)
//        @Rep C2<@Peer Object> er1;
//        // :: error: (type.argument.type.incompatible)
//        @Peer C2<@Rep Object> er2;
//        // :: error: (type.argument.type.incompatible)
//        @Rep C2<@Any Object> er3;
//        // :: error: (uts.lost.in.bounds)
//        @Any C2<@Peer Object> er4;
//
//    }
//
//    @Rep C2<@Rep SubData> grrr;
//    @Rep Object ro = grrr;
//
//    class C5<Y extends @Rep Object> {}
//    class C6 extends C5<@Rep Data> {}
//    // :: error: (type.argument.type.incompatible)
//    class C7 extends C5<@Peer Data> {}

}
