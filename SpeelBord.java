package VoorbereidingHerexamen.h3.Lingo;

public class SpeelBord {
    public String[][] kaart = new String[5][5];
    private String teRadenWoord = new String("Spelen");


    public void bordMaken() {
        for (int i = 0; i < 5; i++) {
            System.out.println();

            for (int j = 0; j < 5; j++) {
                System.out.print(kaart[i][j]);
            }
        }
    }
}


//       }

//        public void tonen (){
//            for (int i = 0; i < 5; i++) {
//                System.out.println();
//                for (int j = 0; j < 5; j++) {
//                    System.out.print(kaart[i][j] + '.');
//                }
//
//
//            }
//
//        }
//    }
//}
