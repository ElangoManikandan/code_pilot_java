class Constructor{
    int id;
    String name;
    Constructor(int id,String name){
        this.id=id;
        this.name=name;
    }
    Constructor(Constructor u){
        this.id=u.id;
        this.name=u.name;
    }

}
public class ConstructorsTutorial {

    public static void main(String[] args) {
    Constructor bhai=new Constructor(1,"Abdullah");
    Constructor nellaians=new Constructor(bhai);
    System.out.println(nellaians.name);
    }
}
