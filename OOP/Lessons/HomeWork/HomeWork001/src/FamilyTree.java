import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> humanList;

    public FamilyTree (List<Human> human){
        this.humanList = human;
    }

    public FamilyTree(){
        this(new ArrayList<>());
    }

    /**
     * Добавление в список нового человека
     * @param human
     */
    public void addHumanList(Human human){
        humanList.add(human);
    }

    /**
     * Получение полного списка людей в дереве
     * @return
     */
    public String getHumanListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список всех людей: \n");
        stringBuilder.append("\n");
        for (Human human: humanList) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        stringBuilder.append("=".repeat(50));
        return stringBuilder.toString();
    }
}

