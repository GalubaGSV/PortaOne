# PortaOne

* Split the initial string into an array of words.
* Iterate through this array and pass each word to a method that returns the first unique character.
* The method iterates through all the characters in the word and creates a LinkedHashMap, where the character is the key and the count of occurrences is the value.
* The method returns the first character that has only one occurrence in the word.
* Based on these characters, construct a new string using a StringBuilder.
* Pass this new string to the method that finds the first unique character.
