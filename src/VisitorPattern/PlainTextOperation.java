package VisitorPattern;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Text of Heading Node");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Text of Anchor Node");
    }
}
