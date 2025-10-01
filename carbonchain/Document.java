import java.security.MessageDigest;

public class Document {
    String projectId;
    String docId;
    String hash;

    public Document(String projectId, String docId, String content) {
        this.projectId = projectId;
        this.docId = docId;
        this.hash = sha256(content + projectId + docId);
    }

    private String sha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes());
            StringBuilder hex = new StringBuilder();
            for (byte b : hashBytes) hex.append(String.format("%02x", b));
            return hex.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Doc[Project=" + projectId + ", ID=" + docId + ", Hash=" + hash.substring(0, 10) + "...]";
    }
}
