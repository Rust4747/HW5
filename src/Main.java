public class Main {
    public static void main(String[] args) {
        int clientOS=1;
        if(clientOS==0)
            System.out.println("установите прилодение для iOS");
            else
                System.out.println("установите приложение для Android");
            int clientDeviceYear=2017;
            if(clientDeviceYear>2015)
                System.out.println("Установите полную версию приложения");
            else
                System.out.println("установите облегченную версию приложения");

        {
            int deliveryDistance=95;
            int deliveryDay=1;
            if(deliveryDistance>20)
                deliveryDay++;
            if(deliveryDistance>60)
                deliveryDay++;
                   System.out.println("потребуется дней "+deliveryDay);

            {
                int year=2022;
                if (year%4==0 && year%100!=0 && year%400==0)
                    System.out.println("год высокосный "+year);
                else
                    System.out.println("год не высокосный");

            }



        }
        {
            int monthNumber=12;
            switch (monthNumber){
                case 1:
                    System.out.println("январь");
                case 2:
                    System.out.println("февраль");
                    System.out.println("зима");
                    break;
                case 3:
                    System.out.println("март");
                case 4:
                    System.out.println("апрель");
                case 5:
                    System.out.println("май");
                    System.out.println("весна");
                    break;
                case 6:
                    System.out.println("июнь");
                case 7:
                    System.out.println("июль");
                case 8:
                    System.out.println("август");
                    System.out.println("лето");
                    break;
                case 9:
                    System.out.println("сентябрь");
                case 10:
                    System.out.println("октябрь");
                case 11:
                    System.out.println("ноябрь");
                    System.out.println("осень");
                    break;
                case 12:
                    System.out.println("декабрь");
                    System.out.println("зима");
                    break;
                default:
                    System.out.println("13 месяца нет");

            }
        }




    }
    {



    }
}