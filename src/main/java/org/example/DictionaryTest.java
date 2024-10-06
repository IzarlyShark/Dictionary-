package org.example;

public class DictionaryTest {
    public static void main(String[] args) {
        testSetValue();
        testDelete();
        testToString();

    }

    public static void testSetValue(){
        Dictionary dictionary = new Dictionary();
        dictionary.setValue("key1", "value1");
        assert "Dictionary:\nKey: key1, Value: value1\n".equals(dictionary.toString()) : "Ошибка в добавлении значения";

        dictionary.setValue("key1", "newValue1");
        assert "Dictionary:\nKey: key1, Value: newValue1\n".equals(dictionary.toString()) : "Ошибка в обновлении значения";

        dictionary.setValue("key2", "value2");
        assert "Dictionary:\nKey: key1, Value: newValue1\nKey: key2, Value: value2\n".equals(dictionary.toString()) : "Ошибка в добавлении второго значения";

        System.out.println("Тест testSetValue пройден");

    }

    public static void testDelete() {
        Dictionary dictionary = new Dictionary();

        dictionary.setValue("key1", "value1");
        assert dictionary.delete("key1") : "Ошибка при удалении существующего ключа";
        assert !dictionary.delete("key1") : "Ошибка: ключ не должен существовать после удаления";

        System.out.println("Тест testDelete пройден");
    }

    public static void testToString() {
        Dictionary dictionary = new Dictionary();

        assert "Dictionary is empty".equals(dictionary.toString()) : "Ошибка в выводе пустого словаря";

        dictionary.setValue("key1", "value1");
        dictionary.setValue("key2", "value2");

        String expectedOutput = "Dictionary:\n" +
                "Key: key1, Value: value1\n" +
                "Key: key2, Value: value2\n";

        assert expectedOutput.equals(dictionary.toString()) : "Ошибка в выводе словаря с элементами";

        System.out.println("Тест testToString пройден");
    }
}

