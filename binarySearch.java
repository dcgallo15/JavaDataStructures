class binarySearch {
	public static boolean binarySearch(String elem, String[] elems, int lower, int upper) {
		System.out.print("LOWER: ");
		System.out.println(lower);
		System.out.print("UPPER: ");
		System.out.println(upper);
		if (lower > upper) {
			return false;
		}
		int mid = lower + (upper - lower) / 2 + (elems.length % 2) + -1;
		System.out.print("MID: ");
		System.out.println(mid);
		int comparisonVal = elems[mid].compareTo(elem);
		System.out.print("Comparison VAL:");
		System.out.println(comparisonVal);
		System.out.print("Compared to ");
		System.out.println(elems[mid]);
		if (comparisonVal == 0) {
			return true;
		}

		if (comparisonVal > 0) {
			return binarySearch(elem, elems, lower, mid - 1);
		}

		else {
			return binarySearch(elem, elems, mid + 1, upper);
		}
	}

	public static void main(String[] args) {
		final String[] STOPWORDS = {"a", "able", "about", "across", "after", "all", "almost", "also", "am", "among", "an", "and", "any", "are", "as", "at", "be", "because", "been", "but", "by", "can", "cannot", "could", "dear", "did", "do", "does", "either", "else", "ever", "every", "for", "from", "get", "got", "had", "has", "have", "he", "her", "hers", "him", "his", "how", "however", "i", "if", "in", "into", "is", "it", "its", "just", "least", "let", "like", "likely", "may", "me", "might", "most", "must", "my", "neither", "no", "nor", "not", "of", "off", "often", "on", "only", "or", "other", "our", "own", "rather", "said", "say", "says", "she", "should", "since", "so", "some", "than", "that", "the", "their", "them", "then", "there", "these", "they", "this", "tis", "to", "too", "twas", "us", "wants", "was", "we", "were", "what", "when", "where", "which", "while", "who", "whom", "why", "will", "with", "would", "yet", "you", "your"};
		String test = "be";
		System.out.println(binarySearch(test, STOPWORDS, 0, STOPWORDS.length));
	}
}
