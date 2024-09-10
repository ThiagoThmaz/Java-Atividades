package br.com.fiap;

import Dao.PessoaDao;
import Dao.PessoaDaoImplementada;
import br.com.fiap.entities.Pessoa;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
public class Main {

    public static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    public static final String USER = "rm557992";
    public static final String PASS = "240504";

    public static void main(String[] args) throws SQLException {

        Pessoa cliente = new Pessoa(8L, "Luiz", 19);

        DatabaseConfig db = new DatabaseConfig(URL, USER, PASS);
        Connection connection = db.getConnection();

        PessoaDao pessoaDao = new PessoaDaoImplementada(connection);
//        pessoaDao.create(cliente);

        List<Pessoa> pessoas = pessoaDao.read();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }

        cliente.setNome("Mathues");
        cliente.setIdade(80);

        System.out.println();
        System.out.println();

        pessoaDao.update(cliente);

        System.out.println();
        System.out.println();

        pessoas = pessoaDao.read();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }

        pessoaDao.delete(1L);

        System.out.println();
        System.out.println();

        pessoas = pessoaDao.read();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }

    }

}