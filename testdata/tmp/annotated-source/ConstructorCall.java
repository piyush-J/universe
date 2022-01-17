import universe.qual.Any;
import universe.qual.Self;
import universe.qual.*;

class C {
	public C(@Any Object o){}
}

public class ConstructorCall {

	void foo(@Self ConstructorCall this, @Peer Object op) {
		// :: fixable-error: (argument.type.incompatible)
		@Any C c = new @Rep C(op);
	}
}
