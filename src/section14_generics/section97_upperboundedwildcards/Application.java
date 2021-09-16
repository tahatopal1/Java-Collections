package section14_generics.section97_upperboundedwildcards;

public class Application {

	public static void main(String[] args) {
		
		// Same types
		DataNode<Integer> node2 = new DataNode<Integer>(20, null);
		DataNode<Integer> node1 = new DataNode<Integer>(35, node2);
		
		// Different types (Number-Double)
		DataNode<Double> node22 = new DataNode<Double>(20.9, null);
		DataNode<Number> node33 = new DataNode<Number>(Double.valueOf(22.1), node22);
		
	}

}
