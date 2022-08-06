package VisitorPattern;

public class HighLightOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Highlight Heading Node");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Highlight Anchor Node");
    }
}
