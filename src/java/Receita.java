

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "receitas")
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePrato;

    @Enumerated(EnumType.STRING) //  "DOCE" ou "SALGADO"
    private TipoReceita tipo;

    private int tempoPreparo; 

    @Enumerated(EnumType.STRING) //  "FACIL", "MEDIO", "DIFICIL"
    private Dificuldade dificuldade;

    private String ingredientesPrincipais;
    
    public Receita() {}

    public Receita(String nomePrato, TipoReceita tipo, int tempoPreparo, Dificuldade dificuldade, String ingredientesPrincipais) {
        this.nomePrato = nomePrato;
        this.tipo = tipo;
        this.tempoPreparo = tempoPreparo;
        this.dificuldade = dificuldade;
        this.ingredientesPrincipais = ingredientesPrincipais;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public String getNomePrato() { return nomePrato; }
    public void setNomePrato(String nomePrato) { this.nomePrato = nomePrato; }

    public TipoReceita getTipo() { return tipo; }
    public void setTipo(TipoReceita tipo) { this.tipo = tipo; }

    public int getTempoPreparo() { return tempoPreparo; }
    public void setTempoPreparo(int tempoPreparo) { this.tempoPreparo = tempoPreparo; }

    public Dificuldade getDificuldade() { return dificuldade; }
    public void setDificuldade(Dificuldade dificuldade) { this.dificuldade = dificuldade; }

    public String getIngredientesPrincipais() { return ingredientesPrincipais; }
    public void setIngredientesPrincipais(String ingredientesPrincipais) { this.ingredientesPrincipais = ingredientesPrincipais; }
}
