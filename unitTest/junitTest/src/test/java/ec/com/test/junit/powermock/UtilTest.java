package ec.com.test.junit.powermock;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(PowerMockRunner.class)
class UtilTest {

    @Test
    void test_getNumber() throws Exception {
        int obj = Whitebox.invokeMethod(new Util(), "getNumber");
        assertEquals(obj, 1);
    }

    @Test
    public void test_getLanguages() throws Exception {
        List obj = Whitebox.invokeMethod(new Util(), "getLanguages");
        assertEquals(obj.get(0), "Java");
    }

    @Test
    public void test_addLanguage() throws Exception {
        List languages = new ArrayList();
        languages.add("Java");
        languages.add("Sql");
        languages.add("JavaScript");

        Whitebox.invokeMethod(new Util(), "addLanguage", languages, "Python");
        assertEquals(languages.get(0), "Java");
    }

    @Test
    public void test_getLanguageClass() throws Exception
    {
        Object obj =Whitebox.invokeMethod(new Util(),"getJavaLanguageClass");
        assertEquals(obj.getClass().getDeclaredField("languageId").get(obj), 1);
        assertEquals(obj.getClass().getDeclaredField("languageName").get(obj), "Java");
        assertEquals(obj.getClass().getDeclaredField("noOfEnrolments").get(obj), 100);
    }

    @Test
    public void test_createLanguageClass() throws Exception
    {
        Object obj =Whitebox.invokeMethod(new Util(),"createLanguageClass",2,"Sql",240);
        assertEquals(obj.getClass().getDeclaredField("languageId").get(obj), 2);
        assertEquals(obj.getClass().getDeclaredField("languageName").get(obj), "Sql");
        assertEquals(obj.getClass().getDeclaredField("noOfEnrolments").get(obj), 240);
    }
    @Test
    public void test_addLanguageClass() throws Exception
    {
        Object programmingLanguages = new Object();
        Class clazz = Whitebox.getInnerClassType(Util.class, "ProgrammingLanguages");
        Constructor constructor = Whitebox.getConstructor(clazz,Util.class);
        programmingLanguages = constructor.newInstance(new Util());
        Field field =  null;

        field = programmingLanguages.getClass().getDeclaredField("languageId");
        field.setAccessible(true);
        field.set(programmingLanguages, 1);

        field = programmingLanguages.getClass().getDeclaredField("languageName");
        field.setAccessible(true);
        field.set(programmingLanguages, "Java");

        field = programmingLanguages.getClass().getDeclaredField("noOfEnrolments");
        field.setAccessible(true);
        field.set(programmingLanguages, 100);

        List obj = Whitebox.invokeMethod(new Util(),"addLanguageClass",programmingLanguages);
        assertEquals(obj.get(0).getClass().getDeclaredField("languageId").get(obj.get(0)), 1);
        assertEquals(obj.get(0).getClass().getDeclaredField("languageName").get(obj.get(0)), "Java");
        assertEquals(obj.get(0).getClass().getDeclaredField("noOfEnrolments").get(obj.get(0)), 100);
    }

}