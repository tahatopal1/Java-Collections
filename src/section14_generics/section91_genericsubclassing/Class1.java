package section14_generics.section91_genericsubclassing;

interface NonGenericsInterface{
	
}

interface GenericsInterface<T>{
	
}

// Usage of GenericsInterface<T> is not valid
public class Class1 implements GenericsInterface<String>{

}

class Class2{}

// Valid
class Class3<T> extends Class2 implements NonGenericsInterface{
	
}

class Class5<T> implements NonGenericsInterface{
	
}

class Class6<T> extends Class3<T> implements GenericsInterface<Integer>{
	
}

