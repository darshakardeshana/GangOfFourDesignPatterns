package StructuralPatterns.DecoratorPattern;

public class CloudStreamEncryptor implements Stream{
    private Stream stream;

    public CloudStreamEncryptor(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("Encrypting Data");
        var encryptedData = encryptData(data);
        stream.write(encryptedData);
    }

    private String encryptData(String data) {
        return "@#$$#$%#$@#$@#$@";
    }
}
