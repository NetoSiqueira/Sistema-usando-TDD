package service;

import modelo.Funcionario;

import util.Propriedades;

import java.math.BigDecimal;

import static util.Propriedades.Desempenho.A_DESEJAR;

public class ReajusteService {
   private BigDecimal reajuste ;
    public void concederReajuste(Funcionario funcionario, Propriedades.Desempenho desempenho) {

       switch (desempenho){
           case A_DESEJAR:
             reajuste   =  funcionario.getSalario().multiply(new BigDecimal("0.03"));
               funcionario.reajustarSalario(reajuste);
            break;

           case BOM:
              reajuste =  funcionario.getSalario().multiply(new BigDecimal("0.15"));
               funcionario.reajustarSalario(reajuste);
               break;

           case OTIMO:
               reajuste =  funcionario.getSalario().multiply(new BigDecimal("0.20"));
               funcionario.reajustarSalario(reajuste);
               break;
       }




    }
}
