package strategy;

public class Main {
    public static void main(String[] args) {
        FileCompressor compressor = new FileCompressor();

        // Usando la estrategia ZIP
        compressor.setCompressionStrategy(new ZipCompressionStrategy());
        compressor.compressFile("miArchivo.txt");

        // Cambiando a la estrategia RAR
        compressor.setCompressionStrategy(new RarCompressionStrategy());
        compressor.compressFile("miArchivo.txt");
    }
}
