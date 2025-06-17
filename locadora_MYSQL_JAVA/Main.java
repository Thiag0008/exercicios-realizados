/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora;

/**
 *
 * @author contr
 */


import java.util.*;
import java.sql.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final FilmeDAO filmeDAO = new FilmeDAO();
    private static final ClienteDAO clienteDAO = new ClienteDAO();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- MENU LOCADORA ---");
            System.out.println("1. Gerenciar Filmes");
            System.out.println("2. Gerenciar Clientes");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            try {
                switch (opcao) {
                    case 1 -> menuFilmes();
                    case 2 -> menuClientes();
                    case 0 -> System.exit(0);
                    default -> System.out.println("Opção inválida.");
                }
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static void menuFilmes() throws SQLException {
        System.out.println("\n--- GERENCIAR FILMES ---");
        System.out.println("1. Listar");
        System.out.println("2. Adicionar");
        System.out.println("3. Atualizar");
        System.out.println("4. Deletar");
        System.out.println("5. Buscar por gênero");
        System.out.print("Escolha: ");
        int op = scanner.nextInt();
        scanner.nextLine();

        switch (op) {
            case 1 -> {
                for (Filme f : filmeDAO.listar())
                    System.out.println(f.getId() + ": " + f.getTitulo() + " (" + f.getAno() + ") - " + f.getGenero());
            }
            case 2 -> {
                System.out.print("Título: "); String t = scanner.nextLine();
                System.out.print("Gênero: "); String g = scanner.nextLine();
                System.out.print("Ano: "); int a = scanner.nextInt(); scanner.nextLine();
                filmeDAO.inserir(new Filme(t, g, a));
            }
            case 3 -> {
                System.out.print("ID a atualizar: "); int id = scanner.nextInt(); scanner.nextLine();
                System.out.print("Novo título: "); String t = scanner.nextLine();
                System.out.print("Novo gênero: "); String g = scanner.nextLine();
                System.out.print("Novo ano: "); int a = scanner.nextInt(); scanner.nextLine();
                filmeDAO.atualizar(new Filme(id, t, g, a));
            }
            case 4 -> {
                System.out.print("ID a deletar: "); int id = scanner.nextInt(); scanner.nextLine();
                filmeDAO.deletar(id);
            }
            case 5 -> {
                System.out.print("Gênero: ");
                String genero = scanner.nextLine();
                List<Filme> filmes = filmeDAO.buscarPorGenero(genero);
                for (Filme f : filmes) {
                    System.out.println(f.getId() + ": " + f.getTitulo() + " (" + f.getAno() + ") - " + f.getGenero());
                }
            }
        }
    }

    private static void menuClientes() throws SQLException {
        System.out.println("\n--- GERENCIAR CLIENTES ---");
        System.out.println("1. Listar");
        System.out.println("2. Adicionar");
        System.out.println("3. Atualizar");
        System.out.println("4. Deletar");
        System.out.println("5. Buscar por nome");
        System.out.print("Escolha: ");
        int op = scanner.nextInt();
        scanner.nextLine();

        switch (op) {
            case 1 -> {
                for (Cliente c : clienteDAO.listar())
                    System.out.println(c.getId() + ": " + c.getNome() + " - " + c.getEmail() + " - " + c.getTelefone());
            }
            case 2 -> {
                System.out.print("Nome: "); String n = scanner.nextLine();
                System.out.print("Email: "); String e = scanner.nextLine();
                System.out.print("Telefone: "); String t = scanner.nextLine();
                clienteDAO.inserir(new Cliente(n, e, t));
            }
            case 3 -> {
                System.out.print("ID a atualizar: "); int id = scanner.nextInt(); scanner.nextLine();
                System.out.print("Novo nome: "); String n = scanner.nextLine();
                System.out.print("Novo email: "); String e = scanner.nextLine();
                System.out.print("Novo telefone: "); String t = scanner.nextLine();
                clienteDAO.atualizar(new Cliente(id, n, e, t));
            }
            case 4 -> {
                System.out.print("ID a deletar: "); int id = scanner.nextInt(); scanner.nextLine();
                clienteDAO.deletar(id);
            }
            case 5 -> {
                System.out.print("Nome (ou parte): ");
                String nome = scanner.nextLine();
                List<Cliente> clientes = clienteDAO.buscarPorNome(nome);
                for (Cliente c : clientes) {
                    System.out.println(c.getId() + ": " + c.getNome() + " - " + c.getEmail() + " - " + c.getTelefone());
                }
            }
        }
    }
}

