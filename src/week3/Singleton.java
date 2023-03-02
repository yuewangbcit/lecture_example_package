package src.week3;

class Singleton {
    private static Singleton singleInstance = null;
    private String language;

    // Private constructor that cannot be called directly
    private Singleton(String language) {
        this.language = language;
    }

    // Obtain the only one instance of the class
    public static Singleton getInstance(String language) {
        if (singleInstance == null) {
            // A new instance is created only if singleInstance is not initialized
            singleInstance = new Singleton(language);
        }
        return singleInstance;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static void main(String[] args) {
        Singleton eng = getInstance("English");
        Singleton ger = getInstance("German");

        System.out.println(eng.getLanguage());
        System.out.println(ger.getLanguage());
        System.out.println(eng==ger);
    }
}
