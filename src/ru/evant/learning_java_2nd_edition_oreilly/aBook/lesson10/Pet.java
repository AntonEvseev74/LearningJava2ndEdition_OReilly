package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson10;

/*
 * Методы интерфейса неявно считаются публичными и абстрактными,
 * поэтому писать слова public и abstract необязательно
 */
/*
 * Все методы интерфейса абстрактные, поэтому должны заканчиваться точкой с запятой ;
 */

/*
 * public interface Pet {
 *     public abstract void beFriendly();
 *     public abstract void play();
 * }
 */

/*
 * Так как в Java множественно наследование не поддерживается нам помогут -
 * Интерфейсы, используются скажем так для множественного наследования.
 * Мы можем имплементривоать (implements) Интерфейс в класс, тем самым расширим возможности класса
 */

interface Pet {

    void beFriendly();

    void play();
}
