package design_pattern.solidPrinciples.iterfacesss;

import java.util.List;

public interface Filter<T> {
	List<T> filter(List<T> list,Specification<T> specification);
}
