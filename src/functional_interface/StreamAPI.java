package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		Consumer<String> con=s -> System.out.println(s);//Void
		con.accept("Hello! world");
		
		Supplier<Double> sup=()->Math.random();//
		System.out.println(sup.get());
		
		Predicate<Integer> pre=n->n%2==0;//boolean
		System.out.println(pre.test(1));
		
		Function<String,Integer> fun=s->s.length();
		System.out.println(fun.apply("Ramakullai"));
		
		List<String> name=Arrays.asList("ram","ravi","siva","Krishna","sreenu");
		List<String> names=name.stream().filter(nameses->nameses.startsWith("r")).collect(Collectors.toList());
		System.out.println(names);

	}

}
