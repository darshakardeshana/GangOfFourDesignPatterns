package BehavioralPatterns.StatePattern;

public class SkretchBoard {
    private ITool currentTool;

    public ITool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ITool currentTool) {
        this.currentTool = currentTool;
    }

    public void clickDown(){
        currentTool.clickDown();
    }

    public void clickUp(){
        currentTool.clickUp();
    }
}
