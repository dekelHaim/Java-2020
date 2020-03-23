
public class Pair <T,K>{
	
	private T first;
	private K second;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Pair(T first, K second, int age) {
		this.first = first;
		this.second = second;
		this.age=age;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public K getSecond() {
		return second;
	}

	public void setSecond(K second) {
		this.second = second;
	}
	
}
