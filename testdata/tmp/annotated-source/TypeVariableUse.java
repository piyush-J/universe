import universe.qual.Bottom;
import universe.qual.Rep;
import universe.qual.Self;
import universe.qual.Any;
import universe.qual.*;

public class TypeVariableUse{

	class D<@Bottom T extends @Any Object>{}

	void foo(@Self TypeVariableUse this) {
		// :: fixable-error: (assignment.type.incompatible)
		@Rep D<@Bottom String> D = new @Rep D<@Bottom String>();
	}
}
