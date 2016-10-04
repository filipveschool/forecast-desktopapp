package ui;

import javax.swing.*;

/**
 * Created by filip on 27/9/2016.
 */
public class MainScreen {

    public MainScreen(){

    }

    public void start2(){

        // a jframe here isn't strictly necessary, but it makes the example a little more real
        JFrame frame = new JFrame("InputDialog Example #1");

        //Ask the country
        String land = JOptionPane.showInputDialog("Land (bv. BE):");

        //Ask the city
        String city = JOptionPane.showInputDialog("Stad:");

        String citystring = "Het is nu 20 graden in " + city;

        String verwachtingen = "We verwachten:" + "\n" +
                "22 graden op 17-09-2016" + "\n"+
                "22 graden op 18-09-2016" + "\n" +
                "21 graden op 19-09-2016" + "\n" +
                "21 graden op 20-09-2016";

        JOptionPane.showMessageDialog(null, citystring + "\n\n" + verwachtingen);


        // prompt the user to enter their name
        //String name = JOptionPane.showInputDialog(frame, "What's your name?");

        // get the user's input. note that if they press Cancel, 'name' will be null
        //System.out.printf("The user's name is '%s'.\n", name);
        System.exit(0);

    }

    public void start(){
        String keuzemenu = createKeuzeMenu();

        int keuze = -1;
        while(keuze != 0){
            String keuzestring = JOptionPane.showInputDialog(keuzemenu);
            if(keuzestring == null){
                keuze = 0;
            }else{
                try{
                    keuze = Integer.parseInt(keuzestring);
                    dispatch(keuze);
                } catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Gelieve een geldige keuze te maken");
                } catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }

    private String createKeuzeMenu(){
        String keuze = "1. Registreer software.\n" +
                "2. Toon alle beschikbare software.\n" +
                "3. Toon totale prijs van alle beschikbare software.\n" +
                "\n" +
                "0. Stop.";
        return keuze;
    }

    private void dispatch(int keuze) throws IllegalArgumentException{
        switch (keuze) {
            case 1:
                toonAlleBeschikbareSoftware();
                break;
            case 2:
                toonTotalePrijsAlleBeschikbareSoftware();
                break;
            default:
                break;
        }
    }


    private void toonAlleBeschikbareSoftware(){
        //String overzicht = beheer.toString();
      //  JOptionPane.showMessageDialog(null, overzicht);
    }



    private void toonTotalePrijsAlleBeschikbareSoftware(){
        //double prijs = beheer.getTotaleWaardeBeschikbareSoftware();
        //JOptionPane.showMessageDialog(null, "Totale prijs van alle beschikbare software = " + prijs +"�");
    }

}
