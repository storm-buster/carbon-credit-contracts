import java.util.*;

public class Blockchain {
    List<Block> chain = new ArrayList<>();
    Block current;
    int blockCount = 1;

    public Blockchain() {
        current = new Block(blockCount);
    }

    public void addDoc(Document d) {
        if (current.isFull()) {
            chain.add(current);
            blockCount++;
            current = new Block(blockCount);
        }
        current.addDoc(d);
    }

    public void finalizeChain() {
        if (!current.docs.isEmpty()) chain.add(current);
    }

    public void printChain() {
        for (Block b : chain) {
            System.out.println(b);
            for (Document d : b.docs) System.out.println("   " + d);
        }
    }

    public void filterByProject(String projectId) {
        System.out.println("\nFilter results for project " + projectId + ":");
        for (Block b : chain) {
            for (Document d : b.docs) {
                if (d.projectId.equals(projectId)) {
                    System.out.println("   " + d);
                }
            }
        }
    }
}
