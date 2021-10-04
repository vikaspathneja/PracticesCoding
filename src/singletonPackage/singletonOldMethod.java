package singletonPackage;

public class singletonOldMethod {

	private static singletonOldMethod obj;
	private int objintvalue;
	
	
	public int getObjintvalue() {
		return objintvalue;
	}

	public void setObjintvalue(int objintvalue) {
		this.objintvalue = objintvalue;
	}

	private singletonOldMethod() {
//		throw new InstantiationError();
	}
	
	public static singletonOldMethod getInstance() {
		if(obj==null) {
			synchronized(singletonOldMethod.class) {
				if(obj==null)
				obj=new singletonOldMethod();
			}
		}
		return obj;
	}
	
}
