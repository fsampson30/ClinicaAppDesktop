package Controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConverteData {

    public String retornaData(String data) {
        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6, 10);
        String dataConvertida = ano + "-" + mes + "-" + dia;
        return dataConvertida;
    }

    public String retornaDataHoje() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
        return sf.format(cal.getTime());
    }

    public String retornaDataHojeMenosDias(int diasAMenos) {
        Date dataFinal = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataFinal);
        int numeroDiasParaSubtrair = diasAMenos;
        cal.add(Calendar.DATE, numeroDiasParaSubtrair);
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
        return sf.format(cal.getTime());
    }
}
