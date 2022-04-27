package banco.util;


import banco.cliente.Cliente;

public class LoginUtil {

    Cliente cliente;

    public Boolean ValidarLogin(String cpf, String senha){
        cliente = new Cliente();
        Boolean loginValido = true;

        if(!cpf.equalsIgnoreCase(cliente.cpfLogin)){
            loginValido = false;
        }
        if(!senha.equalsIgnoreCase(cliente.senhaLogin)){
            loginValido = false;
        }
        return loginValido;
    }
}


