package mmo.characters;

public abstract class GameCharacter {
    protected String name;
    protected int maxHealth;
    protected int currentHealth;
    protected int attack;
    protected int defense;
    protected int level;
    protected int maxMana;
    protected int currentMana;
    protected int speed;

    public GameCharacter(String name, int maxHp, int hp, int atk, int def, int lvl, int maxMp, int mp, int spd){
        this.name = name;
        this.maxHealth = maxHp;
        this.currentHealth = hp;
        this.attack = atk;
        this.defense = def;
        this.level = lvl;
        this.maxMana = maxMp;
        this.currentMana = mp;
        this.speed = spd;
    }

    public abstract void attack(GameCharacter tag);

    public void useAbility(GameCharacter tag){

    }
    public void takeDamage(int amount){

    }
    public void heal(int amount){

    }
    public boolean isAlive(){
        return true;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public int getCurrentHealth(){
        return this.currentHealth;
    }

    public void setCurrentHealth(){

    }



    public String toString(){
        return name + "[HP: " + currentHealth + "/" + maxHealth + ", MP: " + currentMana + "/" + maxMana + "]";
    }

}
