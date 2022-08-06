package StructuralPatterns.AdapterPattern.FilterLib;

import StructuralPatterns.AdapterPattern.Image;

public class GlowFilter {
    void init(){
        //some pre-processing
    }

    public void render(Image image){
        System.out.println("GlowFilter is Applied");
    }
}
