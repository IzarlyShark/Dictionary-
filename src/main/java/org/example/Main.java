package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем новый словарь
        Dictionary d = new Dictionary();

        // Добавляем несколько значений в словарь
        d.setValue("hello1", "world");
        d.setValue("hello2", "no world");
        d.setValue("hello3", "no world");
        d.setValue("hello4", "no world");
        d.setValue("hello", "no world");

        // Выводим текущее состояние словаря
        System.out.println("Начальное состояние словаря:");
        System.out.println(d);

        // Добавляем новые ключи и значения
        String[] keysToAdd = {"key1", "key2"};
        String[] valuesToAdd = {"value1", "value2"};
        System.out.println("\nДобавляем новые ключи и значения:");
        DictionaryUtils.addAll(d, keysToAdd, valuesToAdd);
        System.out.println(d);

        // Удаляем добавленные ключи
        System.out.println("\nУдаляем добавленные ключи:");
        DictionaryUtils.removeAll(d, keysToAdd);
        System.out.println(d);

        // Удаляем одно из значений по ключу
        System.out.println("\nУдаляем значение по ключу 'hello4':");
        d.delete("hello4");
        System.out.println(d);

        // Пытаемся добавить некорректные значения (разные длины массивов)
        System.out.println("\nПробуем добавить некорректные значения (разные длины массивов):");
        String[] invalidKeys = {"key3", "key4"};
        String[] invalidValues = {"value3"};  // Массивы разной длины
        DictionaryUtils.addAll(d, invalidKeys, invalidValues); // Это вызовет исключение

        // Заключительное состояние словаря
        System.out.println("\nЗаключительное состояние словаря:");
        System.out.println(d);
    }
}