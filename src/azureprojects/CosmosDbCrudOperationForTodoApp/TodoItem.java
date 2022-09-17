package com.microsoft.azure.cosmos.sample.tester;

//@Data
//@Builder
public class TodoItem {
	private String id;
    private String name;

    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TodoItem() {
		// TODO Auto-generated constructor stub
	}

	public TodoItem(String id, String name) {
		this.name = name;
		this.id=id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TodoItem [id=" + id + ", name=" + name + "]";
	}
	
	
    
    
}