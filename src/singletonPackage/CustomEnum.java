package singletonPackage;
public enum CustomEnum{
	instance;
	SingletonObj obj=SingletonObj.INSTANCE;

	public SingletonObj getObj() {
		return obj;
	}

	public void setObj(SingletonObj obj) {
		this.obj = obj;
	}

}