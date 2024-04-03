package developers;

abstract class Developer implements Frontendable, Backendable {
    String name;
    int age;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void developGUI() {
        this.doFrontendWork();
        this.doBackendWork();
    }
}
