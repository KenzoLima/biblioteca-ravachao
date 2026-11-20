package com.bibliotecaRavachao.Controller;
import com.bibliotecaRavachao.Model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

    @GetMapping("/inicio") public String inicio(){
        return "usuario/inicio";
    }

    @GetMapping public String inicio(Model model){
        Usuario usuario = new Usuario();
        usuario.getNome("Guinho");
        usuario.setEmail("guinho@email");
        usuario.setSenha("rezendog");
        usuario.getDataNascimento("26/10/2006");

        model.addAttribute("usuario", usuario);

        return "usuario/inicio";
    }

}
