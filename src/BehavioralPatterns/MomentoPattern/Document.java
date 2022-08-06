package BehavioralPatterns.MomentoPattern;

public class Document {
    private String content;

    public DocumentState getCurrentState() {
        return new DocumentState(content);
    }

    public void restoreState(DocumentState documentState){
        content = documentState.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
