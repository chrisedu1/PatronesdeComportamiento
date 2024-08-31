package strategy;

public class RarCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String data) {
        System.out.println("Compresión RAR aplicada a: " + data);
    }
}
