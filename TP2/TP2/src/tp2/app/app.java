package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class app {
    public static void main(String[] args){
        TipoDocumento x = TipoDocumento.CUC;
        LocalDate dataValidade = null;
        LocalDate dataCarregamento = null;


        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuu");
        dataValidade = LocalDate.parse("12-05-2001",format);
        DocumentoID d1 = new DocumentoID("123",x);

        EpassStudent p1 = new EpassStudent(100.5,40.5,dataCarregamento,dataValidade,10,"ESASP");
        EpassStudent p2 = new EpassStudent(100.5,40.5,dataCarregamento,dataValidade,p1);

        p2.carregar(40.5);
        p1.carregar(100);

        //p1.pagarViagem();
        //p2.pagarViagem();
    }
}
