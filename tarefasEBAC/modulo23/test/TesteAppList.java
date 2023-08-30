package tarefasEBAC.modulo23.test;

import org.junit.Assert;
import org.junit.Test;
import tarefasEBAC.modulo22.Pessoas;
import tarefasEBAC.modulo23.AppList;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TesteAppList {

    @Test
    public void testNomesFemininos() {

        List<Pessoas> nomesFemininos = AppList.filtrarNomesFemininos();

        for (Pessoas pessoas : nomesFemininos) {
            Assert.assertEquals("Feminino", pessoas.getSexo());
        }
    }
}
