package org.example;

public class DictionaryUtilsTest {
    public  static void main(String[] args) {
        testAddAll();
        testRemoveAll();
    }

    public static void testAddAll() {
        Dictionary dictionary = new Dictionary();

        String[] keys = {"key1", "key2", "key3"};
        String[] values = {"value1", "value2", "value3"};

        DictionaryUtils.addAll(dictionary, keys, values);

        String expectedOutput = "Dictionary:\n" +
                "Key: key1, Value: value1\n" +
                "Key: key2, Value: value2\n" +
                "Key: key3, Value: value3\n";

        assert expectedOutput.equals(dictionary.toString()) : "Ошибка в добавлении нескольких значений";

        String[] invalidKeys = {"key4", "key5"};
        String[] invalidValues = {"value4"}; // Массивы разной длины
        DictionaryUtils.addAll(dictionary, invalidKeys, invalidValues); // Должно вывести сообщение об ошибке

        System.out.println("Тест testAddAll пройден");
    }

    public static void testRemoveAll() {
        Dictionary dictionary = new Dictionary();

        String[] keysToAdd = {"key1", "key2", "key3"};
        String[] valuesToAdd = {"value1", "value2", "value3"};
        DictionaryUtils.addAll(dictionary, keysToAdd, valuesToAdd);

        String[] keysToRemove = {"key1", "key3"};
        DictionaryUtils.removeAll(dictionary, keysToRemove);

        String expectedOutputAfterRemoval = "Dictionary:\n" +
                "Key: key2, Value: value2\n";

        assert expectedOutputAfterRemoval.equals(dictionary.toString()) : "Ошибка в удалении нескольких значений";

        System.out.println("Тест testRemoveAll пройден");
    }

}
