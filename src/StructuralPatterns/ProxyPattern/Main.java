package StructuralPatterns.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c", "d"};

        for (String file : fileNames) {
            library.add(new EbookProxy(file) {
            });
        }

        library.openEbook("a");
    }
}
