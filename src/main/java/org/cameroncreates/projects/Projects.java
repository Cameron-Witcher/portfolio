package org.cameroncreates.projects;


import com.quiptmc.core.annotations.Nullable;

public enum Projects {

    QAPI("API", "Cameron Witcher", "Quipt API", "A RESTful API for the Quipt system.", "https://quipt-api.azurewebsites.net/", null),
    QMC("Minecraft Integration", "Cameron Witcher", "Quipt Minecraft", "A Minecraft plugin for the Quipt system.", "https://modrinth.com/plugin/quipt", null),
    LL4EL2025("Charity", "DragonFell", "Last Life for Extra Life 2025", "A project for the DragonFell Last Life for Extra Life charity event.", "https://www.example.com", "February 2025", "ll4el2025/activities1.png", "ll4el2025/activities2.png", "ll4el2025/activities3.png", "ll4el2025/ll4el2025.png");

    private final String category;
    private final String client;
    private final String name;
    private final String description;
    private final String url;
    @Nullable
    private final String date;
    private final String[] images;



    Projects(String category, String client, String name, String description, String url, @Nullable String date, String... images) {
        this.category = category;
        this.client = client;
        this.name = name;
        this.description = description;
        this.url = url;
        this.date = date;
        this.images = images;
    }


    public Project instance() {
        return new Project(category, client, name, description, url, date, images);
    }
}
