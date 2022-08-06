package StructuralPatterns.AdapterPattern.FilterLib;

import StructuralPatterns.AdapterPattern.Filter;
import StructuralPatterns.AdapterPattern.Image;

public class GlowFilterAdapter implements Filter {
    private GlowFilter glowFilter;

    public GlowFilterAdapter(GlowFilter glowFilter) {
        this.glowFilter = glowFilter;
    }

    @Override
    public void apply(Image image) {
        glowFilter.init();
        glowFilter.render(image);
    }
}
