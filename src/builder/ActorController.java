package builder;

/**
 * @description: director
 * @author: jehuRen
 * @date: Created in 2020/1/20 14:43
 */
public class ActorController {
    public Actor construct(AbstractActorBuilder ab)
    {
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        return ab.createActor();
    }
}
