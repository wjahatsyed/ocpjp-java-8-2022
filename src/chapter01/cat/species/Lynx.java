package chapter01.cat.species;

import chapter01.cat.BigCat;

/**
 * @author Syed Muhammad Wajahat
 * Creation date: 19/09/2022
 */
public class Lynx extends BigCat {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println("" +
                "cat.name is accessible because it has a public modifier in the class BigCat =>" +
                " " + BigCat.class + " ");
        Lynx l = new Lynx();
        System.out.println(l.hasFur + " "+
                "l.hasFur is accessible because we are using the subclass.");
        BigCat bc = new Lynx();
        System.out.println("protected variable are only accessible through inheritance." +
                "\nCheck this class: " + Lynx.class);

       /* System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
        System.out.println(cat.id);*/
        System.out.println("cat.hasPaws and cat.id are not accessible as" +
                "one of them is private and the other is default");

        System.out.println("default is not accessible outside the package but" +
                "\nprotected is accessible through inheritance if outside the package.");
    }
}
