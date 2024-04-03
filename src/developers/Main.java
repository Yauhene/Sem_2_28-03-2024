package developers;

/*
Описать команду разработчиков. В команде могут находиться бэкэндеры, которые в состоянии писать серверный код,
фронтэндеры, которые могут программировать экранные формы и фуллстэк-разработчики, совмещающие в себе обе компетенции.
Реализовать класс фуллстэк-разработчика, создать экземпляр и последовательно вызвать все его методы.
 */
public class Main {
    public static void main(String[] args) {
        Backender backender = new Backender("John", 33);
        Frontender fronender = new Frontender("Bob", 22);
        Fullstack fullstackDeveloper = new Fullstack("Mike", 44);
        Backendable fullstack2 = new Fullstack("Nick", 55);

        System.out.println("Backender try work!");
        backender.doBackendWork();
        backender.doFrontendWork();

        System.out.println("Frontender try work!");
        fronender.doBackendWork();
        fronender.doFrontendWork();

        System.out.println("Fullstack-developer try work!");
        fullstackDeveloper.doBackendWork();
        fullstackDeveloper.doFrontendWork();

        fullstack2.doBackendWork();

        System.out.println("Собственно, по домашнему заданию:");
        Developer vasia = new Frontender("Vasia", 94);
        vasia.developGUI();
    }
}
