public class Main {
    public static void main(String[] args) {
//        Квадрат
//       int x = 10;
//       for (int i = 0; i < x; i++) {
//           for (int j = 0; j < x; j++) {
//               if (i == 0 || i == 9 || j == 0 || j == x - 1) {
//                   System.out.print(" X ");
//               } else {
//                   System.out.print("   ");
//               }

//           }
//           System.out.println();
//       }
//        Прямоугольный треугольник 1
//        int x = 10;
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < i; j++) {
//                if ( i == 9 || j == 0 || j == i - 1) {
//                    System.out.print(" X ");
//                } else {
//                    System.out.print("   ");
//                }

//            }
//            System.out.println();
//        }
//        int x = 10;
//        for (int i = 0; i < x; i++) {
//            for (int j = x - 1; j > i; j--) {
//                if (j == x - 1 || i == 0 || j == i + 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 10; i++) {
//           for (int j = 9; j > i; j--) {
//               System.out.print(" ");}
//           for (int k = -1; k < i * 2; k++) {
//               System.out.print("*");
//               }
//           System.out.println("1");
//           }
        int x = 10;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i; j++) {
                if (j == x - i - 1) {
                    for (int k = 0; k <= i * 2; k++) {
                        if (i == 0 || i == x - 1 || k == 0||k==i*2) {
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}