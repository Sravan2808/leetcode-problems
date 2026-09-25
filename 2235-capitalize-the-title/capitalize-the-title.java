class Solution {
    public String capitalizeTitle(String title) {
        String array[] = title.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : array) {
            int n = word.length();
            if (n <= 2)
                word = word.toLowerCase();
            else
                word = word.substring(0, 1).toUpperCase() + word.substring(1, n).toLowerCase();
            if (result.length() > 0)
                result.append(" ");
            result.append(word);
        }
        return result.toString();
    }
}