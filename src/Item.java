import java.util.ArrayList;
import java.util.List;
interface Item {


    public static List<ItemEl> list = new ArrayList<ItemEl>();

    public Double calculateValue();

    public List<String> getDetails();
    public String getDescriptionD();

}
