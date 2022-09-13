import java.util.ArrayList;
import java.util.Iterator;

public class MarcsChecker {

    public void scanMarcs (ArrayList<FizMatMarcs> marcs){          // Выводит данные структуры

        for (FizMatMarcs marc : marcs){
            System.out.println(marc.mark);
        }
        System.out.println();
    }

    public void goodTeacher(ArrayList<FizMatMarcs> marcs){       // Удаляет плохие оценки
        Iterator<FizMatMarcs> iterator = marcs.iterator();
        int minimalGoodMarc = 4;
        while (iterator.hasNext()) {
            if (iterator.next().mark < minimalGoodMarc){
                iterator.remove();
            }
        }
    }
}
