package JavaConceptExamples.immutable;

import JavaConceptExamples.Address;

public class ChildImmutable extends CustomObjectIntoImmutableObject {

	public ChildImmutable(String ObjName,Address addr) {
		super(ObjName, addr);
	}
	
	@Override
	public Address getAddr() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getObjectName() {
		// TODO Auto-generated method stub
		return "Hello You have been fooled";
	}
}
