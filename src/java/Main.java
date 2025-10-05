
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // Nome deve ser igual ao definido no persistence.xml
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("chefemcasaPU");

        EntityManager em = factory.createEntityManager();
  
        
        Receita receita = new Receita();
        receita.setNomePrato("Bolo de Cenoura");
        receita.setTipo(TipoReceita.DOCE); 
        receita.setTempoPreparo(45);
        receita.setDificuldade(Dificuldade.FACIL); 
        receita.setIngredientesPrincipais("cenoura, farinha, ovos, açúcar, óleo");
        
        receita.setNomePrato("Strogonoff");
        receita.setTipo(TipoReceita.SALGADO); 
        receita.setTempoPreparo(60);
        receita.setDificuldade(Dificuldade.MEDIO); 
        receita.setIngredientesPrincipais("Frango, ketchup, mostarda, creme de leite, óleo, alho e sal");

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(receita);
        tx.commit();

        em.close();
        factory.close();
    }
}