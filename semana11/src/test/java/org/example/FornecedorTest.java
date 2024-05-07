package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {

    @Test
    void quando_setCredito_1000_getCredito_mesmo_valor(){
        Fornecedor fornecedorMock = new Fornecedor();
        fornecedorMock.setValorCredito(1000);
        Assertions.assertEquals(1000,fornecedorMock.getValorCredito());
    }


    @Test
    void quanto_valordivida_100_c_valorCredito_2000_obter_retorna_1000() {
        Fornecedor fornecedorMock = new Fornecedor();
        fornecedorMock.setValorCredito(2000);
        fornecedorMock.setValorDivida(1000);
        Assertions.assertEquals(1000,fornecedorMock.obterSaldo());
    }

    @Test
    void quando_set_nome_Maria_qetNome_Maria(){
        Fornecedor fornecedorMock = new Fornecedor();
        fornecedorMock.setNome("Maria");
        Assertions.assertEquals("Maria", fornecedorMock.getNome());
    }

    @Test
    void quando_setEndereco_SP_getEndereco_SP(){
        Fornecedor fornecedorMock = new Fornecedor();
        fornecedorMock.setEndereco("SP");
        Assertions.assertEquals("SP", fornecedorMock, fornecedorMock.getEndereco());
    }

    @Test
    void quando_setTelefone_111111111_getTelefone_111111(){
        Fornecedor fornecedorMock = new Fornecedor();
        fornecedorMock.setTelefone("111111111");
        Assertions.assertEquals("111111111", fornecedorMock.getTelefone());
    }
}