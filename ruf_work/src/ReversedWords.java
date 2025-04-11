class RversedWord {
    public static void main(String[] args) {
        String sentence = "Hello World from Copilot";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" "); // Split the sentence into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" "); // Append the reversed word to the result
        }

        return result.toString().trim(); // Trim trailing spaces
    }
}