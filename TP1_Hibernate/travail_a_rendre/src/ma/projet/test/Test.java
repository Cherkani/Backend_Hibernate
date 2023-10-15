package ma.projet.test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import ma.projet.entities.Femme;
import ma.projet.entities.Homme;
import ma.projet.entities.Mariage;
import ma.projet.entities.MariageKey;
import ma.projet.service.FemmeService;
import ma.projet.service.HommeService;
import ma.projet.service.MariageService;

public class Test {
 /////date creation pour eviter problem de date dans my sql   

    public static Date generateDateFormat(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, 0, 0, 0);
        Date date = calendar.getTime();
        return date;
    }

    public static void main(String[] args) throws ParseException {
        HommeService HS = new HommeService();
        FemmeService FS = new FemmeService();
        MariageService MS = new MariageService();

//creation de mariage
//Mariage mariage = new Mariage(new MariageKey(2, 7, generateDateFormat(2022,01,01)));
//MS.create(mariage);
//    
        //10-1----------------------------------------------
////Homme
//    for (int i=1;i<=5;i++){
//        
//        Random random = new Random();
//        //date aleatoire
//        int annee=random.nextInt(2)+2001;
//        int mois=random.nextInt(12)+1;
//        int jour=random.nextInt(29)+1;
//        //numero
//        String num="06";
//        for(int j=1;j<=8;j++){
//            int alnum=random.nextInt(10);
//            num=num+alnum;
//        }
//        int numero=Integer.parseInt(num);
//        
//       Homme homme1=new Homme("nom"+i,"prenom"+i,numero,"adresse"+i,generateDateFormat(annee, mois, jour)); 
//          HS.create(homme1);
//    }
//    //Femme
//  for (int i=1;i<=10;i++){
//        
//        Random random = new Random();
//        //date aleatoire
//        int annee=random.nextInt(2)+2001;
//        int mois=random.nextInt(12)+1;
//        int jour=random.nextInt(29)+1;
//        //numero
//        String num="06";
//        for(int j=1;j<=8;j++){
//            int alnum=random.nextInt(10);
//            num=num+alnum;
//        }
//        int numero=Integer.parseInt(num);
//        
//       Femme femme1=new Femme("nom"+i,"prenom"+i,numero,"adresse"+i,generateDateFormat(annee, mois, jour)); 
//          FS.create(femme1);
//    }
//10-2
//System.out.println("La liste des femmes est :");
//System.out.println("----------------------------------------------");
//for(Femme femmeinfo:FS.getAll()){
//    System.out.println(femmeinfo);
//}
//3   -----------test ex3
//      HS.displayGetWives(2, generateDateFormat(2020, 01, 01), generateDateFormat(2024, 02, 01));

        
        ///test question4
        
  //  FS.displayCountEnfantsFemmeEntreDates(6, generateDateFormat(2020, 01, 01), generateDateFormat(2024, 02, 01));
        
        //ex6
//        FS.displayWomenMarriedMultipleTimes();
        
        //ex 8
    //   HS.displayMenMarriedByFourWomenBetweenDates( generateDateFormat(2020, 01, 01), generateDateFormat(2025, 02, 01));
      //ex9
        HS.displayAllMarriagesOfMan(2);
    }
}
