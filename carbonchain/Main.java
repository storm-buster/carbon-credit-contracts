public class Main {
    public static void main(String[] args) {
        Blockchain bc = new Blockchain();

        // Add 12 docs (2 blocks will form)
        bc.addDoc(new Document("001", "D001", "P1 Doc1"));
        bc.addDoc(new Document("001", "D002", "P1 Doc2"));
        bc.addDoc(new Document("002", "D001", "P2 Doc1"));
        bc.addDoc(new Document("002", "D002", "P2 Doc2"));
        bc.addDoc(new Document("003", "D001", "P3 Doc1"));
        bc.addDoc(new Document("003", "D002", "P3 Doc2"));
        bc.addDoc(new Document("001", "D003", "P1 Doc3"));
        bc.addDoc(new Document("002", "D003", "P2 Doc3"));
        bc.addDoc(new Document("003", "D003", "P3 Doc3"));
        bc.addDoc(new Document("001", "D004", "P1 Doc4"));
        bc.addDoc(new Document("002", "D004", "P2 Doc4"));
        bc.addDoc(new Document("003", "D004", "P3 Doc4"));

        bc.finalizeChain();

        // Print blockchain
        bc.printChain();

        // Filter by project 003
        bc.filterByProject("003");
    }
}
