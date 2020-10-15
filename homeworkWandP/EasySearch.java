package homework.homeworkWandP;

//Реализовать поиск по словам при помощи метода indexOf.
public class EasySearch extends War implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int indexFrom = 0;
        long count = -1;
        int tmp=0;
        while (tmp >= 0) {
            tmp =text.indexOf(" " + word + " ", indexFrom);
            indexFrom=tmp+word.length();
            count++;
        }
        return count;
    }

    public long searchIgnorCace(String text, String word) {
        int indexFrom = 0;
        long count = -1;
        int tmp=0;
        text=text.toUpperCase();
        while (tmp >= 0) {
            tmp =text.indexOf(" " + word.toUpperCase() + " ", indexFrom);
            indexFrom=tmp+word.length();
            count++;
        }
        return count;
    }
}
