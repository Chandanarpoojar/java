class CycleRunner
{
    public static void main(String[] args)
    {
        String[] names = {"hero", "hercules", "cannondale", "avon"};
        String[] CycleNames = Cycle.cycleNames(names);
        for(int name = 0; name< names.length; name++)
        {
            System.out.println(names[name]);
        }

        int[] prices = {5000, 15000, 25000, 8000};
        int[] cyclePrices = Cycle.prices(prices);
        for(int num= 0; num< prices.length; num++)
        {
            System.out.println(prices[num]);
        }

        long[] serials = {9999999666666L, 2456789654567L, 39876433567L, 489776345676L};
        long[] cycleSerials = Cycle.serialNumbers(serials);
        for(int number = 0; number< serials.length; number++)
        {
            System.out.println(serials[number]);
        }

        float[] ratings = {4.5f, 4.2f, 4.8f, 3.9f};
        float[] cycleRatings = Cycle.ratings(ratings);
        for(int star = 0; star< ratings.length; star++)
        {
            System.out.println(ratings[star]);
        }

        double[] sizes = {348.5, 470.0, 402.5, 244.0};
        double[] cycleSizes = Cycle.sizes(sizes);
        for(int cycle = 0; cycle< sizes.length; cycle++)
        {
            System.out.println(sizes[cycle]);
        }

        char[] types = {'A', 'B', 'A', 'C'};
        char[] Types = Cycle.types(types);
        for(int type = 0; type< types.length; type++)
        {
            System.out.println(types[type]);
        }

        boolean[] smart = {true, false, true, false};
        boolean[] smarts = Cycle.isCycleIsGood(smart);
        for(int value = 0;value < smart.length; value++)
        {
            System.out.println(smart[value]);
        }
    }
}