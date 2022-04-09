package h06;

public class DoubleHashing<T> implements BinaryFct2Int<T>
{
	/**
	 * Hash function 1 used in object internal operations. Set in the constructor.
	 */
	private final Hash2IndexFct<T> fct1;

	/**
	 * Hash function 2 used in object internal operations. Set in the constructor.
	 */
	private final Hash2IndexFct<T> fct2;

	/**
	 * Creates an object of the DoubleHashingTableIndexFct class.
	 * The object uses the hash functions specified in the "internalHashFunction0" and "internalHashFunction1" parameters.
	 * Therefore the hash functions are stored in the object attributes of the same name for further use.
	 * @param fct1 The first hash function to be used in upcoming tasks.
	 * @param fct2 The second hash function to be used in upcoming tasks.
	 */
	public DoubleHashing(Hash2IndexFct<T> fct1, Hash2IndexFct<T> fct2)
	{
		// TODO
		throw new RuntimeException("Not implemented");
	}

	/**
	 * Returns the current table size.
	 * @return Current table size.
	 */
	@Override
	public int getTableSize()
	{
		// TODO
		throw new RuntimeException("Not implemented");
	}

	/**
	 * Sets the current table size for both internal hash functions.
	 * @param tableSize New table size.
	 */
	@Override
	public void setTableSize(int tableSize)
	{
		// TODO
		throw new RuntimeException("Not implemented");
	}

	/**
	 * Calculates the hash value of parameter "key" using "internalHashFunction0"
	 * and "internalHashFunction1" as well as parameter "factor".
	 * @param key The key from which to calculate the hash value.
	 * @param factor The factor that is multiplied by the second hash function result.
	 * @return ModuloUtil.addModulo(hash0(key), offset * hash1(key), max(tableSize, offset * hash1(key)) % tableSize
	 */
	@Override
	public int apply(T key, int factor)
	{
		// TODO
		throw new RuntimeException("Not implemented");
	}
}
