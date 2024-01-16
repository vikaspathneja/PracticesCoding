package java_8_features;

import java.util.stream.IntStream;

public class PerformDiffDemoBetweenSeqAndParallel {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		IntStream.range(1, 1000).forEach(x->System.out.println(x));
		long end=System.currentTimeMillis();
		System.out.println("---------------");
		System.out.println("SeqStream time taken:"+(end-start));
		long start2 = System.currentTimeMillis();
		IntStream.range(1, 1000).parallel().forEach(x->System.out.println(x));
		long end2=System.currentTimeMillis();
		System.out.println("ParallelStream time taken:"+(end2-start2));

	}
}
