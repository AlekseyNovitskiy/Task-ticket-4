public class Main {
    public static void main(String[] args) {
        String[] listName = {"Alex", "Alex", "Grom", "Nikola", "Garry", "Nikola"};
        int t = 0;
        for (int i = listName.length -1; i > 0; i--) {
            for (int j = i-1; j > -1; j--) {
                if(listName[i].equals(listName[j])) {
                    listName[i] = null;
                    break;
                }
            }
        }
        StringBuilder allName = new StringBuilder();
        for (int i = 0; i < listName.length; i++) {
            if (listName[i] != null)
                allName.append(listName[i] + " ");
        }
        System.out.println(allName);
    }
}