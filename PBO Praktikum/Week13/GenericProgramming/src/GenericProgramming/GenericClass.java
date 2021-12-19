package GenericProgramming;

public class GenericClass<T> {
	private  T GenClass;

	
	public GenericClass(T GenClass) {
		this.GenClass = GenClass;
	}

	public T getGenClass() {
		return GenClass;
	}

	public void setGenClass(T genClass) {
		this.GenClass = genClass;
	}
}
