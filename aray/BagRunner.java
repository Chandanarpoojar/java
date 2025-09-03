class BagRunner
{
	public static void main(String[] ref)
	{
		boolean[] lather = {true, true, false, true};
        boolean[] baglather = Bag.isLather(lather);
        for(int bags = 0; bags< lather.length; bags++)
        {
            System.out.println(lathers[bags]);
        }
		double[] prices = {4978.99, 89349.50, 12949.75, 1967.00};
        double[] bagsPrices = Bag.prices(prices);
        for(int value= 0; value< prices.length; value++)
        {
            System.out.println(prices[value]);
        }

        float[] weights = {50.5f, 65.7f, 78.9f, 95.2f};
        float[] bagWeights = Bag.bagWeights(weights);
        for(int weight= 0; weight< weights.length; weight++)
        {
            System.out.println(weights[weight]);
        }

        char[] grades = {'A', 'B', 'A', 'C'};
        char[] bagGrades = Bag.qualityGrades(grades);
        for(int charater= 0; charater< grades.length; charater++)
        {
            System.out.println(grades[charater]);
        }
		String[] types = {"Messenger", "Cluch", "Bindle", "Pouch"};
        String[] bagTypes = Bag.bagTypes(types);
        for(int name = 0; name < types.length; name++)
        {
            System.out.println(types[name]);
        }

        int[] sizes = {90, 120, 150, 180};
        int[] bagSizes = Bag.sizes(sizes);
        for(int  size= 0; size< sizes.length;size++)
        {
            System.out.println(sizes[size]);
        }

        long[] serials = {1111111111L, 2222222222L, 3333333333L, 4444444444L};
        long[] bagSerials = Bag.serialNumbers(serials);
        for(int number = 0; number < serials.length; number++)
        {
            System.out.println(serials[number]);
        }
	}
}