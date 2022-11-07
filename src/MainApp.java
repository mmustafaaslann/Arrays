public class MainApp {
    public static void main(String[] args) {

          // Array (dizi) nasıl tanımlanır :
          /*
          int [] numbers ;
          String [] futbolcular ;
          String [] days ;

           */
        int [] numbers = new int[5];
        numbers [0]=15;//numbers isimli diziye 15 atadık
        numbers [1] = 20;
        numbers [2] = 50;
        numbers [3] = 85;

        int tolam = 0;
        double ortalama = 0.0;
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]);
            tolam+=numbers[i];


        }
        double ort = tolam/ (double)numbers.length;
        System.out.println(tolam);
        System.out.println(ortalama);





    }
}
