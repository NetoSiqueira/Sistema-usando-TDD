import modelo.Funcionario;
import org.junit.jupiter.api.Test;
import service.ReajusteService;

import util.Propriedades;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {
    private ReajusteService service = new ReajusteService();
    private Funcionario funcionario = new Funcionario("Siqueira",
            LocalDate.now(), new BigDecimal("1000.0"));

    @Test
    public void desempenhoAdesejar(){
        service.concederReajuste(funcionario, Propriedades.Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void desempenhoBom(){
        service.concederReajuste(funcionario, Propriedades.Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void desempenhoOtimo(){
        service.concederReajuste(funcionario, Propriedades.Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
