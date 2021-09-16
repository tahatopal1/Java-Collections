package section12_lambda.section76_consumer;

import java.util.function.Consumer;

public class ConsumerApplication {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s.length());
		c.accept("Productivity");
	}

}
