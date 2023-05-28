import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private List<String> languages;

    public LanguageList() {
        languages = new ArrayList<>();
    }

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        if (!languages.isEmpty()) {
            return languages.get(0);
        }
        return null;
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }

    public static void main(String[] args) {
        LanguageList languageList = new LanguageList();

        if (languageList.isEmpty()) {
            findMoreLanguagesToLearn();
        }

        languageList.addLanguage("Kotlin");
        languageList.addLanguage("Python");

        languageList.removeLanguage("Scala");

        String firstLanguage = languageList.firstLanguage(); // "Kotlin"
        int languageCount = languageList.count(); // 2

        boolean learningPython = languageList.containsLanguage("Python"); // true
        boolean learningRuby = languageList.containsLanguage("Ruby"); // false

        boolean isExciting = languageList.isExciting(); // true for Java or Kotlin languages
    }

    private static void findMoreLanguagesToLearn() {
        // Logic to find more languages to learn
    }
}
