package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public Iterator<String> createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator{
        private BrowseHistory browseHistory;
        private int index;

        public ListIterator(BrowseHistory browseHistory){
            this.browseHistory = browseHistory;
        }

        @Override
        public boolean hasNext() {
            return index < browseHistory.urls.size();
        }

        @Override
        public Object current() {
            return browseHistory.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
