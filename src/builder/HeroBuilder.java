package builder;

/**
 * @description:
 * @author: jehuRen
 * @date: Created in 2020/1/20 14:42
 */
public class HeroBuilder extends AbstractActorBuilder {
    @Override
    public  void buildType()
    {
        actor.setType("英雄");
    }
    @Override
    public  void buildSex()
    {
        actor.setSex("男");
    }
    @Override
    public  void buildFace()
    {
        actor.setFace("英俊");
    }
    @Override
    public  void buildCostume()
    {
        actor.setCostume("盔甲");
    }
    @Override
    public  void buildHairstyle()
    {
        actor.setHairstyle("飘逸");
    }
}
