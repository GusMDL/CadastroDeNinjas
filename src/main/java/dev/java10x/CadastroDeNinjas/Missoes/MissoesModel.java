package dev.java10x.CadastroDeNinjas.Missoes;


import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")

// Anotação Lombok
@Data //Criar os getters and setters
@NoArgsConstructor // Cria o construtor NoArgs
@AllArgsConstructor//Cria o construtor AllArgs
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //@OneToMany = Um ninja só poderá estar vinculado a uma missão
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

}
