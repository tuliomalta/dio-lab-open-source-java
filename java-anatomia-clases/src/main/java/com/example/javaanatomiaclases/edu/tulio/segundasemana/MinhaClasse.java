package com.example.javaanatomiaclases.edu.tulio.segundasemana;

public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "João";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }


    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
