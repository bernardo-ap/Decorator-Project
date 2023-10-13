public class Bota extends PersonagemDecorator{

    public Bota(Personagem personagem){
        super(personagem);
    }

    public float getPercentualArmadura(){
        return 75.0f;
    }
}
