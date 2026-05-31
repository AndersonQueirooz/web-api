package queiroz.web_api.repository;

import org.springframework.stereotype.Repository;
import queiroz.web_api.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null) {
            System.out.println("Save - Recebendo usuário na camada de repository");
        }
        else {
            System.out.println("Update - Recebendo usuário na camada de repository");
        }

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("Delete /ID - recebendo id %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("List - Listando usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1,"Anderson", "Password"));
        usuarios.add(new Usuario(2,"Andressa", "Senha"));
        return usuarios;

    }

    public Usuario findByUsername (String username){
        System.out.println(String.format("Find/username - Recebendo o username: %s para buscar usuário", username));
        return new Usuario(3,"Anderson", "password");
    }


}
