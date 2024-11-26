/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20241126_4id_nahio_verifica;

/**
 *
 * @author ospite
 */
import java.util.Scanner;

public class Main {

    public void setNOMEDOCENTEMATE() {
        Scanner scan = new Scanner(System.in);
        String nomeD;
        System.out.println("Inserisci cognome Docente matematica");
        nomeD = scan.nextLine();
    }

    public void setNOMEDOCENTEINFO() {
        Scanner scan = new Scanner(System.in);
        String nomeD;
        System.out.println("Inserisci cognome Docente informatica");
        nomeD = scan.nextLine();
    }

    public void setNOMEDOCENTEITAL() {
        Scanner scan = new Scanner(System.in);
        String nomeD;
        System.out.println("Inserisci cognome Docente italiano");
        nomeD = scan.nextLine();
    }

    public void setNOMESTUDENTE() {
        Scanner scan = new Scanner(System.in);
        String nomeS;
        System.out.println("Inserisci nome Studente e cognome ");
        nomeS = scan.nextLine();
    }

    public void setDETT_STUDENTEPRIMO() {
        Scanner scan = new Scanner(System.in);
        int voto;
        double somma = 0.0;
        int j = 0;
        int n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Inserisci voto matematica,informatica,italiano del primo studente (SCRIVI 0 SE NON LO HA RICEVUTO/scrivi i voti uno alla volta)");
            voto = scan.nextInt();
            n++;
            if (voto < 6 && voto >= 1) {
                System.out.println("\nHAI RICEVUTO IL DEBITO ");
                
            } else {
                System.out.println("Non hai ricevuto il debito ");
            }
            if (voto == 0) {
                j++;
                System.out.println("Lo studente non ha ricevuto " + j + "voti/o");
                n--;
            }
            somma = somma + voto;
        }
        double media = 0.0;
        media = somma / n;

        System.out.println("La somma dei voti del primo studente è " + somma + "la media dei voti invece è " + media);

    }

    public void setDETT_STUDENTESECONDO() {
        Scanner scan = new Scanner(System.in);
        int voto;
        double somma = 0.0;
        int j = 0;
        int n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Inserisci voto matematica, informatica e italiano del secondo studente (SCRIVI 0 SE NON LO HA RICEVUTO)");
            voto = scan.nextInt();
            n++;
            if (voto < 6 && voto >= 1) {
                System.out.println("\nHAI RICEVUTO IL DEBITO ");
               
            }else {
                 System.out.println("Non hai ricevuto il debito ");
            }
            if (voto == 0) {
                j++;
                System.out.println("Lo studente non ha ricevuto " + j + "voti/o");
                n--;
            }
            somma = somma + voto;
        }
        double media = 0.0;
        media = somma / n;

        System.out.println("La somma dei voti del secondo studente è " + somma + " la media dei voti invece è " + media);

    }

    public static void main(String[] args) {
        Main scuola = new Main();
        scuola.setNOMEDOCENTEMATE();
        scuola.setNOMEDOCENTEINFO();
        scuola.setNOMEDOCENTEITAL();
        scuola.setNOMESTUDENTE();
        scuola.setDETT_STUDENTEPRIMO();
        scuola.setNOMESTUDENTE();
        scuola.setDETT_STUDENTESECONDO();

    }

}
