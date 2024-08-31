package strategy;

public class FileCompressor {
    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compressFile(String data) {
        strategy.compress(data);
    }
}
