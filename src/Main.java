public class Main {
    public static void main(String[] args) {

        String[][] tateti = new String[3][3];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                tateti[i][j] = " ";
            }
        }

        tateti[1][1] = "X";
        tateti[0][2] = "O";

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(tateti[i][j]);
                if(j<2) {
                    System.out.print(" | ");
                }
            }
            //acá ya terminó de recorrer columnas
            if(i < 2) {
                System.out.println("\n----------");
            }
        }


    }
}