package singletonPackage;

import java.io.Serializable;

public enum CustomEnum implements Serializable,Cloneable {
	instance;
	private SingletonObj obj=SingletonObj.INSTANCE;
	
	public SingletonObj getObj() {
		return obj;
	}

	public void setObj(SingletonObj obj) {
		this.obj = obj;
	}

	
	

}