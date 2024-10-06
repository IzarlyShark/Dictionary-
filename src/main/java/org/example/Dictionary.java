package org.example;

import java.util.Objects;

public class Dictionary {
    private KvPair[] pairs = new KvPair[100];
    public void setValue(String key,String value){
        for (int i=0;i<pairs.length;i++){
            if (pairs[i] == null){
                pairs[i] = new KvPair(key,value);
                System.out.println("Added: " + key + " -> " + value);

                break;
            }
            if (Objects.equals(pairs[i].getKey(),key)){
                pairs[i].setValue(value);
                System.out.println("Updated: " + key + " -> " + value);

                break;
            }
        }
    }
    public boolean delete(String key) {
        for (int i=0;i< pairs.length;i++) {
            if (pairs[i] != null && Objects.equals(pairs[i].getKey(), key)) {
                pairs[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "Dictionary:\n";
        boolean hasEntries = false;
        for (KvPair pair : pairs) {
            if (pair != null) {
                result += "Key: " + (pair.getKey() != null ? pair.getKey() : "null") +
                          "Value: " + (pair.getValue() != null ? pair.getValue() : "null" + "\n");
                hasEntries = true;
            }
        }
        if (!hasEntries) {
            result += "Dictionary is empty";
        }
        return result;
    }
}
