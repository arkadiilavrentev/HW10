import java.util.Iterator;
import java.util.LinkedList;

public class WoodCutter {

    public void woodCheck(LinkedList<TreeHeight> treeHeights){     // Выводит данные структуры

        for (TreeHeight tree : treeHeights){
            System.out.println(tree.height);
        }
        System.out.println();
    }

    public void woodCut(LinkedList<TreeHeight> treeHeights){        // "Срубает" деревья, высота которых больше 8
        Iterator<TreeHeight> iterator = treeHeights.iterator();
        while (iterator.hasNext()){
            if(iterator.next().height > 8){
                iterator.remove();
            }
        }

    }
}
