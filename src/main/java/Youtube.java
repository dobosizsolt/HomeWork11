import java.util.ArrayList;

public class Youtube {

    private float apiVersion;
    private Data data;

    public Youtube() {
    }

    public Youtube(float apiVersion, Data data) {
        this.apiVersion = apiVersion;
        this.data = data;
    }

    public float getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(float apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Youtube{" +
                "apiVersion=" + apiVersion +
                ", data=" + data +
                '}';
    }
}
