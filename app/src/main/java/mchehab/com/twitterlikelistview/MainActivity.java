package mchehab.com.twitterlikelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<TwitterRow> listTwitterRow = createList();

        ListView listView = findViewById(R.id.listView);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this, listTwitterRow);
        listView.setAdapter(listViewAdapter);
    }

    private List<TwitterRow> createList(){
        List<TwitterRow> listTwitterRow = new ArrayList<>();
        listTwitterRow.add(new TwitterRow(
                "http://i.dailymail.co.uk/i/pix/2016/04/12/23/3319F89C00000578-3536787-image-m-19_1460498410943.jpg",
                "Mohamad Chehab",
                "@mchehab94",
                "39m",
                "This is my tweet message!",
                12,
                15,
                100));

        listTwitterRow.add(new TwitterRow(
                "https://www.w3schools.com/css/paris.jpg",
                "First Lastname",
                "@firstlastname",
                "20h",
                "This is my tweet message!",
                2,
                25,
                10));

        listTwitterRow.add(new TwitterRow(
                "https://www.w3schools.com/css/trolltunga.jpg",
                "Someother name",
                "@someothername",
                "1d",
                "This is a very long message to see how the line is going to wrap in the list, " +
                        "some other text for testing...",
                3,
                20,
                13));

        listTwitterRow.add(new TwitterRow(
                "http://wallpaper-gallery.net/images/image/image-11.jpg",
                "Some Name",
                "@somename",
                "2d",
                "This is some other tweet\nMultiline to see how row  will\nbe displayed",
                59,
                193,
                529));
        listTwitterRow.addAll(listTwitterRow);
        return listTwitterRow;
    }
}