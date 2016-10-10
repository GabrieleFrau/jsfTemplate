package it.sipalinformatica;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class ThemeBean implements Serializable{

    private String currentTheme;
    private final Map<String, Object> themes;

    public ThemeBean() {
        this.currentTheme = "cerulean";
        this.themes = new HashMap<String, Object>(3) {
            {
                put("cerulean", "cerulean");
                put("cosmo", "cosmo");
                put("cyborg", "cyborg");
                put("darkly", "darkly");
                put("flatly", "flatly");
                put("journal", "journal");
                put("lumen", "lumen");
                put("paper", "paper");
                put("readable", "readable");
                put("sandstone", "sandstone");
                put("simplex", "simplex");
                put("slate", "slate");
                put("spacelab", "spacelab");
                put("superhero", "superhero");
                put("united", "united");
                put("yeti", "yeti");
            }
        };
    }

    public String getCurrentTheme() {
        return currentTheme;
    }

    public void setCurrentTheme(String currentTheme) {
        this.currentTheme = currentTheme;
    }

    public Map<String, Object> getThemes() {
        return themes;
    }

}
