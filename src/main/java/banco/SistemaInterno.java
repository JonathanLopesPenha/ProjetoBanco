package banco;

import banco.util.LoginUtil;

import javax.swing.*;

class SistemaInterno {

    public static void main(String[] args) {

        String cpfDigitado;
        String senhaDigitada;
        Boolean loginEfetuado;
        LoginUtil loginUtil = new LoginUtil();

        senhaDigitada = JOptionPane.showInputDialog("Insira a sua senha:");
        cpfDigitado = JOptionPane.showInputDialog("Insira seu CPF:");

        loginEfetuado = loginUtil.ValidarLogin(cpfDigitado, senhaDigitada);

        if(!loginEfetuado){
            System.out.println("CPF ou Senha inválidos.");
            return;
        }
        System.out.println("Login cloncluído com sucesso.");
    }
}