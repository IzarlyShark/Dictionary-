package org.example;

public class KvPair {
    private String key;
    private String value;

    public KvPair(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() { return key; }
    public String getValue() { return  value; }

    public  String setKey(String key) { return this.key = key; }
    public  String setValue(String value) { return this.value = value; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        KvPair kvPair = (KvPair) obj;
        return key.equals(kvPair.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

}
