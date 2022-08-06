package StructuralPatterns.AdapterPattern;

public class VintageFilter implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("Vintage Filter is Applied");
    }
}
