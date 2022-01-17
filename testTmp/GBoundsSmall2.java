package universe;

import universe.qual.*;

class GBoundsSmall2 {

    class Data {}

    class C5<Y extends @Rep Object> {}
    class C6 extends C5<@Rep Data> {}

    class MyClass extends java.util.ArrayList<String> {}

}
