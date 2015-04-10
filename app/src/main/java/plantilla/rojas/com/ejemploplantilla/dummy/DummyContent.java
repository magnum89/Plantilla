package plantilla.rojas.com.ejemploplantilla.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Ultimos estrenos", "Rapido y furioso 7"));
        addItem(new DummyItem("2", "Recomendados", "El hobbit"));
        addItem(new DummyItem("3", "Clasicos", "Harry potter"));
        addItem(new DummyItem("4", "Mas vistas", "Los pinguinos de madagascar"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;
        public String descripcion;//agregamos este nuevo atributo

        public DummyItem(String id, String content, String descripcion) {//modificar el constructor para asignar la descripcion
            //apenas se creen los objetos
            this.id = id;
            this.content = content;
            this.descripcion = descripcion;//agregamos un nuevo campo para agregar una descripcion de las entradas
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
