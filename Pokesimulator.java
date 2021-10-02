
package pokesimulator;


public class Pokesimulator {

    public static void main(String[] args) {
 int vidaMeuPokemon;
        int vidaOutroPokemon;
        
        //Instanciar um novo objeto
        pokemon meuPokemon = new pokemon("Charmander", "Fogo", 10);
        pokemon outroPokemon = new pokemon("Squirtle", "Agua", 50);
                           
        meuPokemon.imprimiPokemon();
        outroPokemon.imprimiPokemon();
        
        
        vidaMeuPokemon = meuPokemon.getVida();
        vidaOutroPokemon = outroPokemon.getVida();
        
        if(vidaMeuPokemon > vidaOutroPokemon){
            System.out.println("Eu ganhei");
        } else{
            System.out.println("Eu perdi");
        }
  } 
    }
   
