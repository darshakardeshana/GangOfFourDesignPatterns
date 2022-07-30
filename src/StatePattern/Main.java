package StatePattern;

import javax.tools.Tool;

public class Main {
    public static void main(String[] args) {
        ITool tool = new PaintBrush();
        SkretchBoard skretchBoard = new SkretchBoard();
        skretchBoard.setCurrentTool(tool);

        skretchBoard.clickDown();
        skretchBoard.clickUp();
    }
}
