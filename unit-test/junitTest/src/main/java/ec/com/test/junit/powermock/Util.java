package ec.com.test.junit.powermock;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public void runMethods(String[] args) {
        //Public method uses all private methods
    }

    private static int getNumber() {
        return 1;
    }

    private List<String> getLanguages() {
        List languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("Sql");
        languages.add("Javascript");
        return languages;
    }

    private void addLanguage(List languages, String language) {
        languages.add(language);
    }

    private ProgrammingLanguages getJavaLanguageClass() {
        ProgrammingLanguages languages = new ProgrammingLanguages();
        languages.setLanguageId(1);
        languages.setLanguageName("Java");
        languages.setNoOfEnrolments(100);
        return languages;
    }

    private ProgrammingLanguages createLanguageClass(int languageId, String languageName, int noOfEnrolments) {
        ProgrammingLanguages languages = new ProgrammingLanguages();
        languages.setLanguageId(languageId);
        languages.setLanguageName(languageName);
        languages.setNoOfEnrolments(noOfEnrolments);
        return languages;
    }

    private List<ProgrammingLanguages> addLanguageClass(ProgrammingLanguages language) {
        List<ProgrammingLanguages> languageList = new ArrayList<ProgrammingLanguages>();
        languageList.add(language);
        return languageList;
    }

    class ProgrammingLanguages {
        int languageId;
        String languageName;
        int noOfEnrolments;

        public int getLanguageId() {
            return languageId;
        }

        public void setLanguageId(int languageId) {
            this.languageId = languageId;
        }

        public String getLanguageName() {
            return languageName;
        }

        public void setLanguageName(String languageName) {
            this.languageName = languageName;
        }

        public int getNoOfEnrolments() {
            return noOfEnrolments;
        }

        public void setNoOfEnrolments(int noOfEnrolments) {
            this.noOfEnrolments = noOfEnrolments;
        }
    }
}