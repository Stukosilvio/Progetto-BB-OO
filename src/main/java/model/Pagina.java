package model;

import java.util.ArrayList;

public class Pagina {
    public String titolo;

    Autore autorePagina;

    public Testo testo;

    ArrayList<String> frasiLinkate = new ArrayList<>();

    
     public Pagina(){
        autorePagina=new Autore(this);// devo dire all istanza di Autore di aggiungere, al suo vettore di oggetti Pagina, questa istanza di pagina
        testo=new Testo(this);//in modo che il testo poi venga collegato a questa pagina
        //i collegamenti che dovrebbe avere me li devo mettere con dei metodi a parte
    }



    //io credo che i costruttori con i parametri servano solo per le funzioni nelle quali vengono messe
    public Pagina(Frase f){//costruttore per crearmi il collegamento
        frasiLinkate.add(f);
    }

    public Pagina(Testo t) {//costruttore che assegna alla pagina creata il testo passato come parametro
        //e crea un autore che nel suo vettore di Pagina ha questa pagina che sto creando
        testo=t;
        autorePagina=new Autore(this);//
    }
}

}
