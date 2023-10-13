public class Peitoral extends PersonagemDecorator{

    public Peitoral(Personagem personagem){
        super(personagem);
    }

    public float getPercentualArmadura(){
        return 250.0f;
    }
}
