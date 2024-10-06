package org.example;

public class KvPairTest {

    public static void main(String[] args) {
        testConstructorAndGetters();
        testSetters();
        testEquals();
        testHashCode();
    }

    public static void testConstructorAndGetters(){
        KvPair kvPair = new KvPair("key1", "value1");
        assert "key1".equals(kvPair.getKey()) : "Значение должно быть 'key1";
        assert "value1".equals(kvPair.getValue()) : "Значение должно быть 'value1";
        System.out.println("Тест testConstructorAndGetters пройден");
    }

    public static void testSetters() {
        KvPair kvPair = new KvPair("key1", "value1");
        kvPair.setKey("newKey");
        kvPair.setValue("newValue");
        assert "newKey".equals(kvPair.getKey()) : "Ключ должен быть 'newKey'";
        assert "newValue".equals(kvPair.getValue()) : "Значение должно быть 'newValue'";
        System.out.println("Тест testSetters пройден");
    }

    public static void testEquals() {
        KvPair kvPair1 = new KvPair("key1", "value1");
        KvPair kvPair2 = new KvPair("key1", "value2");
        KvPair kvPair3 = new KvPair("key2", "value3");

        assert kvPair1.equals(kvPair1) : "Объект должен быть равен самому себе";
        assert kvPair1.equals(kvPair2) : "Объекты с одинаковыми ключами должны быть раны";
        assert !kvPair1.equals(kvPair3) : "Объекты с разными ключами не должны быть одинаковыми";

        System.out.println("Тест testEquals пройден");
    }

    public static void testHashCode() {
        KvPair kvPair1 = new KvPair("key1", "value1");
        KvPair kvPair2 = new KvPair("key1", "value2");

        assert kvPair1.hashCode() == kvPair2.hashCode() : "Хэш-коды должны быть одинаковыми для одного и того же ключа";

        System.out.println("Тест testHashCode пройден");
    }
}