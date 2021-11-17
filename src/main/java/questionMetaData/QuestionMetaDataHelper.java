
package questionMetaData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuestionMetaDataHelper {

    @SerializedName("_items")
    @Expose
    private List<Item> items = null;
    @SerializedName("_meta")
    @Expose
    private Meta meta;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
