
package spitali;

import java.time.Period;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import spitali.infermier;
import spitali.Ekonomisti;

public class Spitali {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        ArrayList<infermier> arrli1 = new ArrayList<infermier>();
        ArrayList<mjeku> arrli2 = new ArrayList<mjeku>();
        ArrayList<mjetet> arrli3 = new ArrayList<mjetet>();
        ArrayList<Sanitare> arrli4 = new ArrayList<Sanitare>();
        ArrayList<Ekonomisti> arrli5 = new ArrayList<Ekonomisti>();
        ArrayList<pacienti> arrli6 = new ArrayList<pacienti>();

        String emri, mbiemri, ditelindja1, shkolla, semundja, llojimjek;
        char gjinia;
        LocalDate ditelindja = null;
        int nrCel, nrDhome, mosha, rroga, noperacioneve;
        LocalDate dob;
        boolean exit = false;

do
        {	System.out.println("Shtypni 1 per te krijuar pacient.\n "
                + "Shtypni 2 per te krijuar mjek. \n "
                + "Shtypni 3 per te krijuar ekonomist. \n "
                + "Shtypni 4 per te krijuar sanitare.\n"
                + "Shtypni 5 per te afishuar pacientet e nje dhome.\n"
                + "Shtypni 6 per te afishuar infermieret mbi 30 vjec.\n"
                + "Shtypni 7 per kirurget qe kane studiuar jashte vendit.\n"
                + "Shtypni 8 per te treguar mjetet ne gjendje te degraduar.\n"
                + "Shtypni 9 per te treguar pacientet me diabet"
                + "\nShtypni 10 per te afishuar mjeket." 
               + "\nShtypni 11 per te afisuar infermieret."
                + "\nShtypni 12 per te afishuar pacientet."
               + "\nShtypni 13 per te afishuar ekonomistet."
               + "\nShtypni 14 per te shtuar pediater."
               +"\nShtypni 15 per te afishuar listen e pediaterve."
               +"\nShtypni 16 per te shtuar mjete. "
                +"\nShtypni 17 per te shtuar nje infermier. "
               +"\n Shtypni 0 per te dale.");
            int vlera=in.nextInt();

            switch (vlera) {
                case 1:
                    System.out.println("Jepni emrin:");
                    emri = in.next();

                    System.out.println("Jepni mbiemrin:");
                    mbiemri = in.next();

                    System.out.println("Jepni datelindjen:");
                    ditelindja1 = in.next();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    dob = LocalDate.parse(ditelindja1, formatter);
                    mosha = calculateAge(dob);

                    System.out.println("Jepni gjinine:");
                    gjinia = in.next().charAt(0);
                    System.out.println("Jepni numrin e celularit:");
                    nrCel = in.nextInt();
                    System.out.println("Jepni numrin e dhomes:");
                    nrDhome = in.nextInt();
                    System.out.println("Jepni llojin e semundjes: ");
                    semundja = in.next();


                    pacienti s = new pacienti(emri, mbiemri, mosha, gjinia, semundja, nrDhome, nrCel, ditelindja);
                    arrli6.add(s);
                    break;


                case 2:
                    System.out.println("Jepni emrin:");
                    emri = in.next();
                    System.out.println("Jepni mbiemrin:");
                    mbiemri = in.next();
                    System.out.println("Jepni gjinine:");
                    gjinia = in.next().charAt(0);
                    System.out.println("Jepni datelindja:");

                    ditelindja1 = in.next();
                    DateTimeFormatter formatterCase2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    dob = LocalDate.parse(ditelindja1, formatterCase2);
                    mosha = calculateAge(dob);

                    System.out.println("Jepni numrin e celularit:");
                    nrCel = in.nextInt();
                    System.out.println("Jepni llojin e mjekut: ");
                    llojimjek = in.next();
                    System.out.println("Jepni rrogen:");
                    rroga = in.nextInt();
                    System.out.println("Jepni numrin e operacioneve:");
                    noperacioneve = in.nextInt();
                    System.out.println("Jepni vendin e universitetit ku keni studiuar:");
                    shkolla = in.next();

                    if (llojimjek.equals("Kardiolog")) {
                        kardiolog kardio = new kardiolog(emri, mbiemri, mosha, ditelindja, nrCel, gjinia, llojimjek, rroga, noperacioneve, shkolla);
                        arrli2.add(kardio);
                    } else if (llojimjek.equals("Neurolog")) {
                        neurolog neuro = new neurolog(emri, mbiemri, mosha, ditelindja, nrCel, gjinia, llojimjek, rroga, noperacioneve, shkolla);
                        arrli2.add(neuro);
                    } else if (llojimjek.equals("Pediater")) {
                        pediater pedi = new pediater(emri, mbiemri, mosha, ditelindja, nrCel, gjinia, llojimjek, rroga, noperacioneve, shkolla);
                        arrli2.add(pedi);
                    } else {
                        System.out.println("Keni vendosur llojin e gabuar te mjekut.");
                        break;
                    }
                    break;

                case 3:
                    System.out.println("Jepni emrin:");
                    emri = in.next();
                    System.out.println("Jepni mbiemrin:");
                    mbiemri = in.next();
                    System.out.println("Jepni gjinine:");
                    gjinia = in.next().charAt(0);
                    System.out.println("Jepni datelindja:");
                    ditelindja1 = in.next();
                    DateTimeFormatter formatterCase3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    dob = LocalDate.parse(ditelindja1, formatterCase3);
                    mosha = calculateAge(dob);
                    System.out.println("Jepni numrin e celularit:");
                    nrCel = in.nextInt();
                  Ekonomisti eko = new Ekonomisti(emri, mbiemri, nrCel, gjinia,ditelindja);
                    break;

                case 4:
                    System.out.println("Jepni emrin:");
                    emri = in.next();
                    System.out.println("Jepni mbiemrin:");
                    mbiemri = in.next();
                    System.out.println("Jepni rrogen:");
                    rroga = in.nextInt();
                    System.out.println("Jepni datelindja:");
                    ditelindja1 = in.next();
                    DateTimeFormatter formatterCase4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    dob = LocalDate.parse(ditelindja1, formatterCase4);
                    mosha = calculateAge(dob);
                    System.out.println("Jepni numrin e celularit:");
                    nrCel = in.nextInt();
                    Sanitare san = new Sanitare(emri, mbiemri, rroga, ditelindja, nrCel);
                    break;

                case 5:
                    System.out.println("Zgjidhni numrin e dhomes qe kerkoni:");
                    int n = in.nextInt();
                    afishopacientetenjedhome(arrli6, n);
                    break;

                case 17:
                    System.out.println("Jepni emrin:");
                    emri = in.next();
                    System.out.println("Jepni mbiemrin:");
                    mbiemri = in.next();
                    System.out.println("Jepni gjinine:");
                    gjinia = in.next().charAt(0);
                    System.out.println("Jepni datelindja:");
                    ditelindja1 = in.next();

                    // Parse the datelindja1 to LocalDate
                    dob = LocalDate.parse(ditelindja1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    mosha = calculateAge(dob);

                    System.out.println("Jepni numrin e celularit:");
                    nrCel = in.nextInt();
                    infermier inf = new infermier(emri, mbiemri, nrCel, gjinia, dob, mosha);  // Use dob here
                    arrli1.add(inf);
    break;

                case 6:
    System.out.println("Infermieret mbi 30 vjec:");
    for (infermier llogaritje : arrli1) {
        int MoshaInfermierit = llogaritje.getMosha();  // Use the getMosha() method
        if (MoshaInfermierit > 30) {
            System.out.println(llogaritje);
        }
    }
    break;

                case 7:
                    mjeket_jashte(arrli2);
                    break;
                
                case 8:
                    displayDegradedMjete(arrli3);
                    break;

                case 9:
                    pacientmeDiabet(arrli6);
                    break;
               
                    case 10: // Add a case to display mjeket
                    displayMjeket(arrli2);
                    break;

                case 11: // Add a case to display infermieret
                    displayInfermieret(arrli1);
                    break;

                case 12: // Add a case to display pacientet
                    displayPacientet(arrli6);
                    break;

                case 13: // Add a case to display ekonomistet
                    displayEkonomistet(arrli5);
                      break;
                case 14:
                    createPediater(arrli2);   
                    break;
                case 15:
                    displayPediater(arrli2);
                     break;
            
                case 16:
                    addMjete(arrli3);
                    break;
                case 0:
                    exit = true;
                    break;
            }
        } while (!exit);
    }

   public static void mjeket_jashte(ArrayList<mjeku> arrli2) {
    for (int i = 0; i < arrli2.size(); ++i) {
        if (!arrli2.get(i).getUni().equals("Shqiperi")) {
            System.out.println(arrli2.get(i).toString());
        }
    }
}



    public static int calculateAge(LocalDate birthdate) {
    LocalDate currentDate = LocalDate.now();
    return Period.between(birthdate, currentDate).getYears();
}

    public static void pacientmeDiabet(ArrayList<pacienti> arrli6) {
    System.out.println("Pacientet me semundjen Diabet:");
    boolean found = false;

    for (int i = 0; i < arrli6.size(); i++) {
        if (arrli6.get(i).getSemundja().equalsIgnoreCase("Diabet")) {
            System.out.println(arrli6.get(i).toString());
            found = true;
        }
    }

    if (!found) {
        System.out.println("Nuk ka paciente me semundjen Diabet.");
    }
}

    public static void afishopacientetenjedhome(ArrayList<pacienti> arrli6, int n) {
    System.out.println("Pacientet ne dhome " + n + ":");
    boolean found = false;

    for (pacienti pac : arrli6) {
        if (pac.getNrDhome() == n) {
            System.out.println(pac.toString());
            found = true;
        }
    }

    if (!found) {
        System.out.println("Nuk ka paciente ne dhome " + n);
    }
}
    
    private static void createPediater(ArrayList<mjeku> arrli2) {
    // Input for pediater
    // Prompt the user for necessary information
    System.out.println("Jepni emrin:");
    String emri = in.next();
    System.out.println("Jepni mbiemrin:");
    String mbiemri = in.next();
    System.out.println("Jepni gjinine:");
    char gjinia = in.next().charAt(0);
    System.out.println("Jepni datelindjen:");
    String ditelindjaStr = in.next();
    LocalDate ditelindja = LocalDate.parse(ditelindjaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.println("Jepni numrin e celularit:");
    int nrCel = in.nextInt();
    System.out.println("Jepni llojin e mjekut (Pediater):");
    String llojimjek = in.next();
    System.out.println("Jepni rrogen:");
    int rroga = in.nextInt();
    System.out.println("Jepni numrin e operacioneve:");
    int noperacioneve = in.nextInt();
    System.out.println("Jepni vendin e universitetit ku keni studiuar:");
    String shkolla = in.next();

    // Create a new pediater object and add it to the list
    pediater pedi = new pediater(emri, mbiemri, calculateAge(ditelindja), ditelindja, nrCel, gjinia, llojimjek, rroga, noperacioneve, shkolla);
    arrli2.add(pedi);
    System.out.println("Pediateri u shtua me sukses.");
}
    
    

 private static void displayMjeket(ArrayList<mjeku> mjeket) {
        System.out.println("Mjeket:");
        for (mjeku m : mjeket) {
            System.out.println(m.toString());
        }
    }

    // Method to display infermieret
    private static void displayInfermieret(ArrayList<infermier> infermieret) {
        System.out.println("Infermieret:");
        for (infermier i : infermieret) {
            System.out.println(i.toString());
        }
    }

    // Method to display pacientet
    private static void displayPacientet(ArrayList<pacienti> pacientet) {
        System.out.println("Pacientet:");
        for (pacienti p : pacientet) {
            System.out.println(p.toString());
        }
    }
public static void displayEkonomistet(ArrayList<Ekonomisti> ekonomistet){
    System.out.println("Ekonomistet: ");
    for(Ekonomisti e: ekonomistet){
        System.out.println(e.toString());
    }
}
private static void displayPediater(ArrayList<mjeku> mjeket) {
    System.out.println("Pediateret:");
    for (mjeku m : mjeket) {
        if (m instanceof pediater) {
            System.out.println(m.toString());
        }
        
        
    }
}

private static void addMjete(ArrayList<mjetet> arrli3) {
    // Input for mjete
    // Prompt the user for necessary information
    System.out.println("Jepni llojin e mjeteve:");
    String lloji = in.next();
    System.out.println("Jepni gjendjen e mjeteve:");
    String gjendja = in.next();
    System.out.println("Jepni vitin e prodhimit:");
    int vitprodhimi = in.nextInt();
    System.out.println("Jepni koston e mjeteve:");
    int kosto = in.nextInt();

    // Create a new mjetet object and add it to the list
    mjetet mjete = new mjetet(lloji, gjendja, vitprodhimi, kosto);
    arrli3.add(mjete);
    System.out.println("Mjetet u shtuan me sukses.");
}

private static void displayDegradedMjete(ArrayList<mjetet> mjeteList) {
    System.out.println("Degraded Mjete:");
    boolean found = false;

    for (mjetet mjete : mjeteList) {
        if (mjete.getGjendja().equalsIgnoreCase("degraduar")) {
            System.out.println(mjete.toString());
            found = true;
        }
    }

    if (!found) {
        System.out.println("Nuk u gjenden mjete te degraduara");
    }
}

}

