package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicAnagrams {


    private static boolean isAnagram(String a, String b) {
        Boolean flag = true;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            list1.add(a.substring(i, i + 1).toUpperCase());
        }
        for (int i = 0; i < b.length(); i++) {
            list2.add(b.substring(i, i + 1).toUpperCase());
        }
        BasicAnagrams basicAnagrams = new BasicAnagrams();
        List<DataAnagram> inputDataAnagram = basicAnagrams.inputData(list1, list2);
        inputDataAnagram.stream().forEach(System.out::println);
        flag = inputDataAnagram.stream().allMatch(f -> f.getFrecuencyA() == f.getFrecuencyB());

        if (!(list1.size() == list2.size()))
            flag = false;


        return flag;
    }

    private List<DataAnagram> inputData(List<String> list1, List<String> list2) {
        DataAnagram dataAnagram = new DataAnagram();
        List<DataAnagram> dataAnagrams = new ArrayList<>();
        for (String v : list1) {
            if (!isExistsInDatasAnagrams(v, dataAnagrams)) {
                dataAnagram.setDato(v);
                dataAnagram = validateListA(v, list1, dataAnagram);
                dataAnagram = validateListB(v, list2, dataAnagram);
                dataAnagrams.add(dataAnagram);
                dataAnagram = new DataAnagram();
            }
        }
        return dataAnagrams;
    }


    private Boolean isExistsInDatasAnagrams(String validar, List<DataAnagram> lists) {
        Boolean isExists = false;
        for (DataAnagram dataAnagram : lists) {
            if (dataAnagram.getDato().equals(validar))
                isExists = true;
        }
        return isExists;
    }


    private DataAnagram validateListA(String validar, List<String> lisValidates, DataAnagram dataAnagram) {
        int cont = 0;
        for (String l : lisValidates) {
            if (validar.equals(l)) {
                cont++;
                dataAnagram.setFrecuencyA(cont);
            }
        }

        return dataAnagram;
    }

    private DataAnagram validateListB(String validar, List<String> lisValidates, DataAnagram dataAnagram) {
        int cont = 0;
        for (String l : lisValidates) {
            if (validar.equals(l)) {
                cont++;
                dataAnagram.setFrecuencyB(cont);
            }
        }
        return dataAnagram;
    }


    // Modelo DataAnagram
    static class DataAnagram {
        private String dato;
        private Integer FrecuencyA;
        private Integer FrecuencyB;

        public String getDato() {
            return dato;
        }

        public void setDato(String dato) {
            this.dato = dato;
        }

        public Integer getFrecuencyA() {
            return FrecuencyA;
        }

        public void setFrecuencyA(Integer frecuencyA) {
            FrecuencyA = frecuencyA;
        }

        public Integer getFrecuencyB() {
            return FrecuencyB;
        }

        public void setFrecuencyB(Integer frecuencyB) {
            FrecuencyB = frecuencyB;
        }

        @Override
        public String toString() {
            return "DataAnagram{" +
                    "dato='" + dato + '\'' +
                    ", FrecuencyA=" + FrecuencyA +
                    ", FrecuencyB=" + FrecuencyB +
                    '}';
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }


}
