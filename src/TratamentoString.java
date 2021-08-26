public class TratamentoString {
    
    //Método para tornar a palavra um titulo;
    //Recebe uma string como parâmetro;
    //Recebe frases e as torna um titulo...
    // a partir dos espacos em branco " "
    
    public static int getNumeroDeEspacos(String string){
        
        int numeroDeEspacos = 0;
        for (int i=0; i< string.length(); i++) {
            if (string.charAt(i) == ' '){
                numeroDeEspacos += 1;
            }
        }
        return numeroDeEspacos;
    }

    
    public static String toTitle(String string) {
        
        if (string.length() == 1){
            return string.toUpperCase();
        }

        else if (string.length() == 0){
            return "";
        }

        else if (TratamentoString.getNumeroDeEspacos(string) != 0){
            int letraAMudar;
            String primeiraLetraFrase = string.substring(0, 1);
            primeiraLetraFrase = primeiraLetraFrase.toUpperCase();
            String restoFrase = string.substring(1, string.length());
            String stringRetornoFrase = primeiraLetraFrase + restoFrase;
            
            for (int index = stringRetornoFrase.indexOf(" ");
                index >= 0;
                index = stringRetornoFrase.indexOf(" ", index + 1)){
                letraAMudar = index + 1;
                String parteAnterior = stringRetornoFrase.substring(0, letraAMudar);
                String primeiraLetra = stringRetornoFrase.substring(letraAMudar, letraAMudar+1);
                primeiraLetra = primeiraLetra.toUpperCase();
                String resto = stringRetornoFrase.substring(letraAMudar+1, string.length());
                stringRetornoFrase = parteAnterior + primeiraLetra + resto;
            }   
            
            return stringRetornoFrase;
        }


        else{
            String primeiraLetra = string.substring(0, 1);
            primeiraLetra = primeiraLetra.toUpperCase();
            String resto = string.substring(1, string.length());
            String stringRetorno = primeiraLetra + resto;
            return stringRetorno;
        }
    }
}