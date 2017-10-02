class Randomname
{
	static String word1(String [] words)
	{
		int random = (int) (Math.random() * words.length);
		return words[random];

	}

	static void samplename(String a, String b)
	{
		System.out.println(a+" "+b);
	}
	public static void main (String [] args)
	{
		String [] organize ={"construct","coordinates","creates","establishs","forms","formulate",
		"codify","combine","compose","constitute","correlate","dispose"};

		String [] event ={"accident","act","action","affair","appearance","business","case","celebration","ceremony","circumstance","fact","holiday","incident",
		"matter","occasion","situation","story"};

		String [] c ={"tempt","encourage","woo"};

		String worduno=word1(c);
		String worddos=word1(organize);

		samplename(worduno,worddos);
	}

}


