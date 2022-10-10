public class Main {
    public static void main(String[] args) {
        String[] listName = {"Alex", "Alex", "Grom", "Nikola", "Garry", "Nikola"};
        String[] listName1 = new String[listName.length];
        int t = 0;
        for (int i = 0; i < listName.length; i++) {
            boolean duplicatFound = false;
            for (int j = i+1; j < listName.length ; j++) {
                if (listName[i].equals(listName[j])) {
                    duplicatFound = true;
                    break;
                }
            }
            if (!duplicatFound) {
                listName1[t] = listName[i];
                t++;
            }
        }
        String newString = "";
        for (int i = 0; i < listName1.length; i++) {
            if (listName1[i] != null) {
                newString = newString + " " + listName1[i];
            } else {
                break;
            }

        }
        System.out.println(newString);

    }
}