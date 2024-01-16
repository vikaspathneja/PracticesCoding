package singletonPackage;
public enum SingletonObj{
	INSTANCE;
	private int objintvalue;
	public int getObjintvalue() {
		return objintvalue;
	}
	public void setObjintvalue(int objintvalue) {
		this.objintvalue = objintvalue;
	}
	
	@Override
	public String toString() {
		return "Object into string:"+getObjintvalue()+"   value via instance "+INSTANCE.getObjintvalue();
	}
}

