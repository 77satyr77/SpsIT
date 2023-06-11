public class RetazceSTRING {
    public static void main(String[] args) {
        String txt01 = "dobry den sa praje";
        System.out.println(txt01);
        System.out.println("dobry den sa praje,\npriatelia");// \n zalomi riadok
        System.out.println("text obsahuje :" +txt01.length() + " znakov");
        //  .length() vypis mnozstva znakov
        //  .toUpperCase()  vypise vsetky znaky velkym pismom
        //  .toLowerCase() vypise vsetky znaky malym pismom
        System.out.println(txt01.indexOf("sa")); // .indexOf() vrati zaciatocnu poziciu zvoleneho retazca
        String txt02 = " priatelia";
        System.out.println(txt01.concat(txt02)); //.concat()  retazenie dvoch retazcov "String"
        System.out.println("dnes bol \"krasny\" den");
        // vlozit " ' \ do text v ""   ....\'text\'


       /* Ďalšie bežné únikové sekvencie, ktoré sú platné v Jave, sú:

        Code	Result	Try it
        \n	New Line
        \r	Carriage Return
        \t	Tab
        \b	Backspace
        \f	Form Feed
            */
    }
}
