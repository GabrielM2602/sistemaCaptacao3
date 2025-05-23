package Aplicacao;

import Entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.");
        isabela.calcularSalarioExtra(10, 5.60);

        System.out.println("Servidor: "+ isabela.getNome());
        System.out.printf("Salario mensal: RS %.2f ",isabela.getSalarioFinal());

    }
}
