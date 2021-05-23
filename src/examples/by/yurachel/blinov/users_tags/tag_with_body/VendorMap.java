package examples.by.yurachel.blinov.users_tags.tag_with_body;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VendorMap {
    private Map<String, Double> map = new HashMap<>();

    {
        this.map.put("IBM", 5.7);
        this.map.put("Oracle", 2.6);
        this.map.put("SAP", 8.7);
        this.map.put("Google", 9.7);
    }

    private Iterator<Map.Entry<String, Double>> it = map.entrySet().iterator();

    public int getSize() {
        return this.map.size();
    }

    public String getRevenue() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        if (it.hasNext()) {
            Map.Entry<String, Double> m = it.next();
            return nf.format(m.getValue() + " " + m.getKey());
        } else {
            return null;
        }
    }
}
