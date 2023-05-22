package  Hashing;
class QuadraticProbingHash {
    private int[] hashTable;
    private int tableSize;
    private int numElements;

    public QuadraticProbingHash(int size) {
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
        int probeCount = 0;
        while (hashTable[hash] != 0) {
            probeCount++;
            hash = (hash + probeCount * probeCount) % tableSize; // Quadratic probing
        }

        hashTable[hash] = key;
        System.out.println(key + " inserted at position " + hash);
        numElements++;
    }
}

public class QuadraticProbingHashTable {
    public static void main(String[] args) {
        QuadraticProbingHash hashTable = new QuadraticProbingHash(10);

        hashTable.insert(5);
        hashTable.insert(2);
        hashTable.insert(12);
        hashTable.insert(25);
        hashTable.insert(7);
    }
}
