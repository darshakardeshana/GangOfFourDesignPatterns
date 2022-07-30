package MomentoPattern;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentState> documentStateList = new ArrayList<DocumentState>();

    public void push(DocumentState documentState){
        documentStateList.add(documentState);
    }

    public DocumentState pop(){
        return documentStateList.remove(documentStateList.size() - 1);
    }
}
