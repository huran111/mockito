package 工厂模式.demo03;

/**
 * @program: mockito
 * @description:
 * @author: HuRan
 * @create: 2020-07-06 10:23
 * <p>
 * 各种肤色的男性、女性都制造出来了，两性之间产生了相互吸引力，
 * 于是情感产生，这 个世界就多了一种小说的题材“爱情”。回头来想想我们的设计，不知道大家有没有去过工 厂，
 * 每个工厂分很多车间，每个车间又分多条生产线，分别生产不同的产品，我们可以把八 卦炉比喻为车间，
 * 把八卦炉生产的工艺（生产白人、黑人还是黄人）称为生产线，如此来看 就是一个女性生产车间，专门生产各种肤色的女性，一个是男性生产车间，
 * 专门生产各种肤 色男性，生产完毕就可以在系统外组装，什么是组装？嘿嘿，自己思考！在这样的设计下， 各个车间和各条生产线的职责非常明确，
 * 在车间内各个生产出来的产品可以有耦合关系，
 * 你 要知道世界上黑、黄、白人种的比例是：1∶4∶6，那这就需要女娲娘娘在烧制的时候就要 做好比例分配，在一个车间内协调好。这就是抽象工厂模式。
 * </p>
 */
public class NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        //生产线建立完毕，开始生产人了:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
        System.out.println("=============================================");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
    }
}