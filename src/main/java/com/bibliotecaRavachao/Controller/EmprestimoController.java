package com.bibliotecaRavachao.Controller;
import com.bibliotecaRavachao.Model.Emprestimo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/emprestimos")
public class EmprestimoController {
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    @GetMapping("/inicio") public String inicio(){
        return "emprestimos/inicio";
    }
    @GetMapping
    public String inicio(Model model) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setRetirada("20/11/2026");
        emprestimo.setDevolucao("27/11/2026");

        model.addAttribute("emprestimo", emprestimo);

        return "emprestimos/inicio";
    }

    @PostMapping
    public String cadastrar(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        return "redirect:/emprestimos";
    }

    @DeleteMapping("/excluir/{indice}")
    public String excluir (@PathVariable("indice") int indice) {
        if (indice>= 0 && indice < emprestimos.size()) {
            emprestimos.remove(indice);
        }
        return "redirect:/emprestimos";
    }
}
