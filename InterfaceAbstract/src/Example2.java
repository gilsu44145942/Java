// 게임 캐릭터 (추상클래스)
abstract class Character{
    String name; //이름
    int hp; // 생명

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public final void takeDamage(int amount){
        hp = hp - amount; // 공격을 받으면 받은 공격만큼을 생명에서 뺀다
        System.out.println(name + "은 "+ amount + "만큼의 공격을 받음 " + " 남은 생명은" + hp);
    }
    public abstract void doAction(); // 추상메서드
}
// 기능 인커페이스 : 근접공격
interface MeleAttacker{
    void meleAttack(Character target, int amount); // 추상메서드
}
// 기능 인터페이스 : 마법공격
interface MagicCaster{
    void castSpell(Character target, int amount); // 추상메서드
}

// 전사
class Warrior extends Character implements MeleAttacker{

    public Warrior(String name, int hp) {
        super(name, hp);
    }
    @Override
    public void doAction() {
        System.out.println("전사는 엑스칼리버");
    }

    @Override
    public void meleAttack(Character target, int amount) {
        System.out.println(name + "가 "+ target.name + " 를 공격");
        target.takeDamage(amount);
    }
}

// 마법사
class Mage extends Character implements MagicCaster{

    public Mage(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void doAction() {
        System.out.println("마법사는 아토믹익스플로젼");
    }

    @Override
    public void castSpell(Character target, int amount) {
        System.out.println(name + "가 "+ target.name + "를 공격");
        target.takeDamage(amount);
    }
}

public class Example2 {
    public static void main(String[] args) {
        Character a = new Warrior("전사A", 200);
        Character b = new Mage("마법사B",150);
        a.doAction();
        ((MeleAttacker)a).meleAttack(b,20);
        System.out.println();
        b.doAction();
        ((MagicCaster)b).castSpell(a,10);


    }
}

