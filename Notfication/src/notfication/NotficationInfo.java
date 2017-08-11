
package notfication;
public  abstract class NotficationInfo {
  private  String title,content,icon,ledcolor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getLedcolor() {
        return ledcolor;
    }

    public void setLedcolor(String ledcolor) {
        this.ledcolor = ledcolor;
    }
    
    
}
