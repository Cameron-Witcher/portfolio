package org.cameroncreates.projects;

import com.quiptmc.core.annotations.Nullable;

public record Project(String category, String client, String name, String description, String url,
                      @Nullable String date, @Nullable String... images) {

}
