class LinearProbingHash {
    private int[] hashTable;
    private int tableSize;
    private int numElements;

    public LinearProbingHash(int size) {
        tableSize = size;
        hashTable = new int[tableSize];
        numElements = 0;
    }

    private int hashFunction(int key) {
        return key % tableSize;
    }

    public void insert(int key) {
        if (numElements == tableSize) {
            System.out.println("Hash table is full. Cannot insert more elements.");
            return;
        }

        int hash = hashFunction(key);
        while (hashTable[hash] != 0) {
            hash = (hash + 1) % tableSize; // Linear probing
        }

        hashTable[hash] = key;
        System.out.println(key+" inserted at position "+hash);
        numElements++;
    }
}

public class LinearProbingHashTable {
    public static void main(String[] args) {
        LinearProbingHash hashTable = new LinearProbingHash(10);

        hashTable.insert(5);
        hashTable.insert(2);
        hashTable.insert(12);
        hashTable.insert(25);
        hashTable.insert(7);


    }
}
