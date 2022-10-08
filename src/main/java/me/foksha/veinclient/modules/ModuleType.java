package me.foksha.veinclient.modules;

public enum ModuleType {


    MISC("Miscellaneous"),
    COMBAT("Combat"),
    RENDER("Render");


    final String name;


    ModuleType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
