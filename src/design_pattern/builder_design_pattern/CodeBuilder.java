package design_pattern.builder_design_pattern;


class CodeBuilder
{
    StringBuilder sb=new StringBuilder();
    public CodeBuilder(String className)
    {
        sb.append("public class ");
        sb.append(className);
        sb.append("\n  {");
    }
    
    public CodeBuilder addField(String name, String type)
    {
         sb.append("\n   public ");
         sb.append(type);
         sb.append(" ");
         sb.append(name);
         sb.append(";");
         return this;
    }
    
    @Override
    public String toString()
    {
        sb.append("\n  }");
        return sb.toString();
    }
}