package CreationalPatterns.Singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManger {
    private Map<String, Object> settings = new HashMap<>();
    private ConfigManger instance = new ConfigManger();

    private ConfigManger(){
    }

    public void set(String key, Object value){
        settings.put(key, value);
    }

    public Object get(String key){
        return settings.get(key);
    }

    public ConfigManger getInstance(){
        return instance;
    }
}
