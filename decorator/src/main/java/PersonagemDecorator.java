public abstract class PersonagemDecorator implements Personagem{

    private Personagem personagem;

    public PersonagemDecorator(Personagem personagem){
        this.personagem = personagem;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public abstract float getPercentualArmadura();

    public float getArmadura(){
        return this.personagem.getArmadura() + (this.getPercentualArmadura());
    }

}
