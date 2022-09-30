package sec07.exam01_generic_extends_implements;

public class StorageImpl<T> implements Storage<T> {

	private T[] array; // Tv[] array;
	
	public StorageImpl(int capacity) {
		// this.array = (Tv[]) (new Object[capacity]);
		this.array = (T[]) (new Object[capacity]);
	}
	
	@Override
	public void add(T item, int index) { // add(Tv item, int idex)
		array[index] = item;
		
	}

	@Override
	public T get(int index) {  // Tv get(int index)
		// TODO Auto-generated method stub
		return array[index];
	}

}
