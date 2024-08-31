package strategy;

public class ZipCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String data) {
        System.out.println("Compresión ZIP aplicada a: " + data);
    }
}
