package StructuralPatterns.DecoratorPattern;

public class CloudStreamCompressor implements Stream{
    private Stream stream;

    public CloudStreamCompressor(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("Compressing Data");
        var compressed = compressData(data);
        stream.write(compressed);
    }

    private String compressData(String data) {
        return data.substring(0, 2);
    }
}
