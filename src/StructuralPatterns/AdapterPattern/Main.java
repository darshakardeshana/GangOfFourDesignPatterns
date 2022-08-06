package StructuralPatterns.AdapterPattern;

import StructuralPatterns.AdapterPattern.FilterLib.GlowFilter;
import StructuralPatterns.AdapterPattern.FilterLib.GlowFilterAdapter;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.applyFilter(new VintageFilter());
        imageView.applyFilter(new GlowFilterAdapter(new GlowFilter()));
    }
}
