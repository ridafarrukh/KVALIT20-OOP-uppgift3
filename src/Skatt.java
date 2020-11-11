/**
 * created by Rida Warsi
 * Date : 2020-11-10
 * Time : 12:01
 * Project : KVALIT20-OOP-Inlämningsuppgift3
 * Copyright : MIT
 */

public class Skatt {

    //Instansvariabler
    String namn;
    int åik;    //årsinkomst


    // flera viktiga Instansvariabler
    String inkomstskatt;
    int grundAvdrag;
    int Besk;     // beskattningsbarförvärvsinkomst
    int ösg;      // övre skiktgränsen
    int nsg;     // nedre skiktgränsen
    int ööp;     // över ösg skatt
    int möns;    // mellan ösg till nsg skatt
    int iks;    // inkomstskatt
    int es;    // efterskatt


    // skapa instansmetoder

    /**
     * En instansmetod som returnerar namnet
     *
     * @return "Namn"
     */

    public String getName() {

        return this.namn;
    }

    /**
     * En instansmetod som beräknar Besk (Beskattningsbar förvärvsinkomst)
     *
     * @return Besk
     */

    public int getBesk() {

        return Besk = åik - grundAvdrag;
    }


    /**
     *
     * En instansmetod som beräknar Inkomstskatt i olika nivåer
     *
     * @return Inkomstskatt
     */

    public String getInkomstskatt() {
        int skatt = this.getBesk();

        String category = "";

        if (Besk <= nsg)
            // behövs inte betala statlig inkomstskatt
            category = " 0 kr";

        else if (Besk > nsg && Besk <= ösg) {
            //behöv betala 20%  statlig inkomstskatt.
            möns = Besk - nsg;
            iks = möns / 100 * 20;
            category = iks + " kr ";
        }
        else if (Besk > ösg){
            // behovs betala 25% statlig inkomstskatt
            ööp =(Besk - ösg)/100 * 5;
            möns =(ösg - nsg)/100 * 20;
            iks = ööp + möns;
            category = iks + " kr ";
        }

        return category;


    }

    /**
     * En instansmetod som beräknar ÅrsInkomst ( efterskatt)
     *
     * @return Inkomst
     */

    public int getInkomst(){
        es = Besk - iks;
        return this.es;


    }
}

