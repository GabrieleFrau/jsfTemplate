package it.sipalinformatica;

import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class LoremIpsumBean {

    private final List<Item> items;

    public LoremIpsumBean() {
        this.items = Arrays.asList(
                new Item("h1", "h2", "h3", "h4", "h5"),
                new Item("h1", "h2", "h3", "h4", "h5"),
                new Item("h1", "h2", "h3", "h4", "h5"),
                new Item("h1", "h2", "h3", "h4", "h5"),
                new Item("h1", "h2", "h3", "h4", "h5")
        );
    }

    /**
     *
     * @return
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     *
     */
    public static class Item {

        private final String h1;
        private final String h2;
        private final String h3;
        private final String h4;
        private final String h5;

        public Item(String h1, String h2, String h3, String h4, String h5) {
            this.h1 = h1;
            this.h2 = h2;
            this.h3 = h3;
            this.h4 = h4;
            this.h5 = h5;
        }

        public String getH1() {
            return h1;
        }

        public String getH2() {
            return h2;
        }

        public String getH3() {
            return h3;
        }

        public String getH4() {
            return h4;
        }

        public String getH5() {
            return h5;
        }

    }

}
