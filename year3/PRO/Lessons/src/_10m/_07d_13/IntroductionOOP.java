package _10m._07d_13;

/**
 * TŘÍDY A OBJEKTY - zapouzdření
 * vhodné, aby si programátor mohl definovat vlastní datové typy pro použití popisu stavu daného problému => objektové typy, resp. třídy
 * .... př. grafický editor, kde uživatel bude moci kreslit obrázky složené ze zákldních tvarů (bodů, úseček atd..)
 * ........ - bod:  určen souřadnicemi (x, y) plus barva (př. 3 čísla - RGB model)
 * ................ dále potřebujeme popis operací, co se s bodem dá dělat
 * ........ - Př. Vytvořit, zrušit, zobrazit, přemístit atd...
 * ........ - Tyto operace nazýváme v OOP metody
 * datová reprezentace objektu = datové složky = atributy = členské proměnné = stav objektu
 * datová reprezentace stavu plus operace s datovým typem => zapouzdření
 * není žádoucí každý bod vytvážet s celým popisem zvlášť => instance třídy, resp. objekty
 * Objekt = datový prvek, který je vytvořen dle vzoru třídy = instance třídy
 **/
public class IntroductionOOP {

    public static void main(String[] args) {
        pointExample();
//        rectangleExample();
        rectangleConstructorExample();
    }

    private static void pointExample() {
        Point a = new Point();
        Point b = new Point();
        a.setX(12);
        System.out.println(a.getX());
        System.out.println(b.getColor());
        b.setColor(200);
        System.out.println(b.getColor());

        System.out.println(b);
    }

    private static void rectangleExample() {
        Rectangle r = new Rectangle();
        r.widht = 3;
        r.height = 4;
        System.out.println(r);
    }

    private static void rectangleConstructorExample() {
        RectangleConstructor rC = new RectangleConstructor(15, 6);
        System.out.println(rC);
    }
}
