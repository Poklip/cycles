public class Main {
    public static void main(String[] args) {
        //for (int = 1; i <= 1; i += 1) {}
        //while (condition) {}

        //Задача №1.
        byte counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter += 1;
        }
        System.out.println();

        for (byte i = 10; i > 0; i --) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача №2.
        byte fridayReport = 3; //число месяца, соответствующее первой пятнице
        byte monthLength = 31; //длина месяца
        for (byte i = 0; i < monthLength; i++) {
            if (i % 7 == fridayReport - 1){
                System.out.println("Сегодня пятница, " + (i + 1) + "-e число. Необходимо подготовить отчёт.");
            }
        }
        System.out.println();

        /*Задача №3 с рандомным первым появлением
        int currentYear = 2021; //текущий год - вариант задачи
        int firstObservableAppearance = (int) (currentYear - 200 + Math.random() * 79);
        while (firstObservableAppearance <= currentYear + 100) {
            System.out.println(firstObservableAppearance);
            firstObservableAppearance += 79;
        }
        System.out.println();

         */

        //Задача №3.
        int currentYear = 2021; //текущий год
        for (int i = 0; i <= currentYear + 100; i += 79) {
            if (i >= currentYear - 200) {
                System.out.println(i);
            }
        }
        System.out.println();


        //Задача №4.
        String strike;
        for (byte i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                strike = "ping pong";
            } else if (i % 3 == 0) {
                strike = "ping";
            } else if (i % 5 == 0) {
                strike = "pong";
            } else {
                strike = "";
            }
            System.out.println(i + ": " + strike);
        }
        System.out.println();

        //Задача №5.
        int numberFibonacci_0 = 0;
        int numberFibonacci_1 = 1;
        byte lengthFibonacci = 10; //количество чисел последовательности, для теста
        for (byte i = 0; i < lengthFibonacci; i++) {
            if (i % 2 == 0) {
                System.out.print(numberFibonacci_0 + " ");
                numberFibonacci_0 += numberFibonacci_1;
            } else {
                System.out.print(numberFibonacci_1 + " ");
                numberFibonacci_1 += numberFibonacci_0;
            }
        }

    }
}