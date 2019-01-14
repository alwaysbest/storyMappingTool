package nju.software.controller.request;

/**
 * Time       : 2019/1/12 11:35 PM
 * Author     : tangdaye
 * Description: /project request
 */
public class CreateProjectRequest {
    private int creatorId;
    private String title;
    private String description;

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
