package CreationalPatterns.FactoryPattern;

import java.util.Map;

public interface IViewEngine {
    String render(String viewName, Map<String, Object> context);
}
