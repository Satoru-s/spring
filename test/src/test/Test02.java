package test;

/**
 * @author Administrator 泛型2
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String str = "111a";
		Pair<Integer> pair = new Pair<Integer>(123, 456);
		System.out.println(pair.toString());
		System.out.println(Pair.create(str, 2).toString());
	}
}

class Pair<T> {
	private T first;
	private T second;

	/**
	 * @return the first
	 */
	public T getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(T first) {
		this.first = first;
	}

	/**
	 * @return the second
	 */
	public T getSecond() {
		return second;
	}

	/**
	 * @param second the second to set
	 */
	public void setSecond(T second) {
		this.second = second;
	}

	public Pair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}

	public static <K> Pair<K> create(K first, K second) {
		return new Pair<K>(first, second);
	}

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

}