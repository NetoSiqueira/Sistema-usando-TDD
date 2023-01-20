

import modelo.Funcionario;
import org.junit.jupiter.api.Test;
import service.BonusService;


import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BonusServiceTest {

    private BonusService service = new BonusService();


    @Test
    public void bonusDeveriaZerar(){
    assertThrows(IllegalArgumentException.class,
            ()->   service.calcularBonus(new Funcionario("Neto", LocalDate.now(),  new BigDecimal("25000"))));


    }

    @Test
    public void bonusDeveriaSerMenor(){
        BigDecimal bonus =  service.calcularBonus(new Funcionario("Neto", LocalDate.now(),  new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.0"), bonus);
    }
    @Test
    public void bonusDeveriaSerMesmoValor(){
        BigDecimal bonus =  service.calcularBonus(new Funcionario("Neto", LocalDate.now(),  new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.0"), bonus);
    }





}
