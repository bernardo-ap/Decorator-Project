public class Calca extends PersonagemDecorator{

    public Calca(Personagem personagem){
        super(personagem);
    }

    public float getPercentualArmadura(){
        return 200.0f;
    }
}
