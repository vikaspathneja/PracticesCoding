package design_pattern.solidPrinciples.iterfacesss;

public interface Specification<T> {
	boolean isSpecificationSatified(T t);
}
