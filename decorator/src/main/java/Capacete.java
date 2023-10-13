public class Capacete extends PersonagemDecorator{

    public Capacete(Personagem personagem){
        super(personagem);
    }

    public float getPercentualArmadura(){
        return 80.0f;
    }
}
