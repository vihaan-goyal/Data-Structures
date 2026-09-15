package ABC_Project;
/*
 * Will demonstrate abstract features
 * @author(v goyal)
 * @version (9/11/26)
 */
public abstract class Cat {
    protected int life;

    public Cat(){
        this.life = 9;
    }

    public void addLife(int howMany){
        this.life += howMany;
    }

    public abstract void subLife(int howMany);

    static void main() {

    }

}
