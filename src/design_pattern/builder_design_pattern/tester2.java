package design_pattern.builder_design_pattern;

public class tester2 {
	public static void main(String[] args) {
		CodeBuilder cb=new CodeBuilder("Person");
		cb.addField("name", "String")
		.addField("age", "int")
		.addField("kaskf", "String")
		;
	System.out.println(cb);
	}

}
