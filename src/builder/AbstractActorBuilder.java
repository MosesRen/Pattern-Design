package builder;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 14:41
 */
public abstract class AbstractActorBuilder {
    protected  Actor actor = new Actor();

    public  abstract void buildType();
    public  abstract void buildSex();
    public  abstract void buildFace();
    public  abstract void buildCostume();
    public  abstract void buildHairstyle();

    //工厂方法，返回一个完整的游戏角色对象
    public Actor createActor()
    {
        return actor;
    }
}
