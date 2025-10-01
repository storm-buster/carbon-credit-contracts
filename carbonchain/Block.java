import java.util.*;

public class Block {
    int number;
    List<Document> docs = new ArrayList<>();

    public Block(int number) {
        this.number = number;
    }

    public void addDoc(Document d) { 
        docs.add(d); 
    }

    public boolean isFull() { 
        return docs.size() >= 10; 
    }

    @Override
    public String toString() {
        return "Block " + number + " (" + docs.size() + " docs)";
    }
}
