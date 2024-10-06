package org.example;

public final class DictionaryUtils {
    public static void addAll(Dictionary dict, String[] keys, String[] values) {
        if (keys.length != values.length) {
            System.out.println("Ошибка: Длины масссивов ключей и значение не совпадают.");
            return;
        }
        for (int i=0;i< keys.length;i++) {
            dict.setValue(keys[i], values[i] );
        }
    }
    public static void removeAll(Dictionary dict, String[] keys) {
        for (String key : keys) {
            dict.delete(key);
        }
    }



}
