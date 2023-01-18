public class Calculator {
    public static void main(String[] args) {

    }

        //Домашнее задание 1.


// Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его,
// используя AssertJ
// purchaseAmount - сумма покупки
// discountAmount - размер скидки
//return 0; // Метод должен возвращать сумму покупки со скидкой

        public static double calculatingDiscount ( double purchaseAmount, int discountAmount){

            double discountedAmount = 0;

            if (purchaseAmount >= 0) {

                if (discountAmount >= 0 && discountAmount <= 100) {

                    discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
                } else {

                    throw new ArithmeticException("Скидка должна быть от 0 до 100%");
                }
            } else {

                throw new ArithmeticException("Сумма покупки не может быть отрицательной");
            }
            return discountedAmount;
        }
    }






