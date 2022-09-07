public class Main {
    public static void main(String[] args) {
        int clientOS=1;
        if(clientOS==0)
            System.out.println("установите прилодение для iOS");
            if(clientOS==1)
                System.out.println("установите приложение для Android");
            else
                System.out.println("не поддерживается операционная система");
            int clientDeviceYear=2017;
            if(clientDeviceYear>2015)
                System.out.println("Установите полную версию приложения");
            if(clientDeviceYear<2015)
                System.out.println("установите облегченную версию приложения");
            else
            System.out.println("операционная система не поддерживается");
        {
            int deliveryDistance=95;
            if(deliveryDistance<20)
                System.out.println("доставка займет 1 день");
            if(deliveryDistance>20 && deliveryDistance<60)
                System.out.println("доставка займет 2 дня");
            if(deliveryDistance>60 && deliveryDistance<100)
                System.out.println("доставка займет 3 дня");
            else
            System.out.println("дальше 100 км не доставляем");

            {
                int year=2022;
                int highGradeYear4=year%4;
                int highGradeYear100=year%100;
                int highGradeYear400=year%400;
                if (highGradeYear100!=0 || highGradeYear4==0 || highGradeYear400==0)
                    System.out.println("год высокосный");
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