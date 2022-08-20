public class Main {
    public static void main(String[] args) {
        // Задание 1
        int cat = 7;
        short dog = 9;
        byte tiger = 12;
        long monkey = 23L;
        double potatoWeight = 5.3;
        float tomatoesWeight = 3.5f;
        boolean dogIsAdult = dog > 10;
        char d = 68;
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(tiger);
        System.out.println(monkey);
        System.out.println(potatoWeight);
        System.out.println(tomatoesWeight);
        System.out.println(dogIsAdult);
        System.out.println(d);

        //Задание 2
        double boxerMaxim = 78.2;
        double boxerDinar = 82.7;
        double boxersWeight = boxerMaxim + boxerDinar;
        System.out.println("Вес обоих боксёров " + boxersWeight + " кг");
        double boxersWeightDifference = boxerDinar - boxerMaxim;
        System.out.println("Разница в весе у боксёров " + boxersWeightDifference + " кг");

        // Задание 3
        int banana = 5;
        int bananaWeight = banana * 80;
        int milk = 200 / 100;
        int milkWeight = milk * 105;
        System.out.println(milkWeight);
        int icecream = 2;
        int icecreamWeight = icecream * 100;
        int eggs = 4;
        int eggsWeight = eggs * 70;
        int breakfastWeightInGr = bananaWeight + milkWeight + icecreamWeight + eggsWeight;
        System.out.println("Вес завтрака в граммах " + breakfastWeightInGr);
        int grPerKg = 1000;
        float breakfastInKg = breakfastWeightInGr/(float)grPerKg;
        System.out.println("Вес спорт-завтрака " + breakfastInKg + " кг");

        // Задание 4
        int overweight = 7 * 1000;
        int weightLoss500 = overweight / 500;
        System.out.println("Теряя по 500 грамм в день, спортсмен похудеет за " + weightLoss500 + " дней");
        int weightLoss250 = overweight / 250;
        System.out.println("Теряя по 500 грамм в день, спортсмен похудеет за " + weightLoss250 + " дней");
        int average = (weightLoss250 + weightLoss500) / 2;
        System.out.println(average);

        // Задание 5
        double salaryMasha = 67_760;
        double salaryDenis = 83_690;
        double salaryChristina = 76_230;
        double awardMasha = (salaryMasha / 100) * 10;
        double awardDenis = (salaryDenis / 100) * 10;
        double awardChristina = (salaryChristina / 100) * 10;
        double salaryAfterAwardMasha = salaryMasha + awardMasha;
        double salaryAfterAwardDenis = salaryDenis + awardDenis;
        double salaryAfterAwardChristina = (float)salaryChristina + awardChristina;
        System.out.println("Маша теперь получает " + salaryAfterAwardMasha + " рублей. Годовой доход вырос на " + awardMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryAfterAwardDenis + " рублей. Годовой доход вырос на " + awardDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryAfterAwardChristina + " рублей. Годовой доход вырос на " + awardChristina + " рублей");

    }
}