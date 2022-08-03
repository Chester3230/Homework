public class Main {

    public static void main(String[] args) {
        // Задача 1
        int human = 27;
        byte chair = 6;
        short car = 3;
        long stars = 10000000000L;
        double fruitWeight = 7.7;
        float vegetablesWeight = 5.5f;
        boolean humanIsAdult = human > 18;
        char brace = 41;

        // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);

        // Задача 3
        float bananas = 5*80/1000f;
        System.out.println ("Перевел вес бананов в кг. " + bananas);
        float milk = (float) (200/100)*105/1000f;
        System.out.println ("Перевел вес с мл. в кг. " + milk);
        float iceCream = 2*100/1000f;
        System.out.println ("Перевел вес мороженного в кг. " + iceCream);
        float eggs = 4*70/1000f;
        System.out.println ("Перевел вес яиц в кг. " + eggs);
        float totalWeight = (bananas + milk + iceCream + eggs);
        System.out.println("Общий вес завтрака в кг " + totalWeight);

        // Задача 4
        int loseWeight = 7;
        int quantityOfDays1 = 7000/250;
        System.out.println("Количество дней, при сбросе веса на 250 гр. каждый день " + quantityOfDays1);
        int quantityOfDays2 = 7000/500;
        System.out.println("Количество дней, при сбросе веса на 500 гр. каждый день " + quantityOfDays2);
        int averageWeightToReset = 250+500/2;
        double averageNumberOfDays = 7000f/averageWeightToReset;
        System.out.println("Среднее количество дней для сброса веса " + averageNumberOfDays);

        // Задача 5
        int mishaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double mishaSalaryIncrease = mishaSalary/100f*10;
        int mishaSalaryHasIncreased = (int) (mishaSalaryIncrease+mishaSalary);
        System.out.println("Миша теперь получает " + mishaSalaryHasIncreased);
        int theDifferenceInMishaAnnualIncome = (int) (mishaSalaryIncrease*12);
        System.out.println("Годовой доход Миши вырос на " + theDifferenceInMishaAnnualIncome);
        double denisSalaryIncrease = denisSalary/100f*10;
        int denisSalaryHasIncreased = (int) (denisSalaryIncrease+denisSalary);
        System.out.println("Денис теперь получает " + denisSalaryHasIncreased);
        int theDifferenceInDenisAnnualIncome = (int) (denisSalaryIncrease*12);
        System.out.println("Годовой доход Дениса вырос на " + theDifferenceInDenisAnnualIncome);
        double kristinaSalaryIncrease = kristinaSalary/100f*10;
        int kristinaSalaryHasIncreased = (int) (kristinaSalaryIncrease+kristinaSalary);
        System.out.println("Кристина теперь получает " +kristinaSalaryHasIncreased);
        int theDifferenceInKristinaAnnualIncome = (int) (kristinaSalaryIncrease*12);
        System.out.println("Годовой доход Кристины вырос на " + theDifferenceInKristinaAnnualIncome);
    }
}