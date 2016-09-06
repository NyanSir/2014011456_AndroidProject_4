package bistu.rookie.u_nity.androidproject_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = { "Zhang San", "Li Si", "Wang Wu" };
        String[] sex = { "male", "female", "male" };
        String[] number = { "001", "002", "003" };

        List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
        for(int i=0;i<name.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put("name", name[i]);
            item.put("sex", sex[i]);
            item.put("number", number[i]);
            items.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, items, R.layout.item_layout,
                new String[]{ "name", "sex", "number" },
                new int[]{ R.id.name, R.id.sex, R.id.number });
        ListView list = (ListView) findViewById(R.id.ListView);
        list.setAdapter(adapter);
    }
}
