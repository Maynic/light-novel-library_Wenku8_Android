package org.mewx.wenku8.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import org.mewx.wenku8.R;

public class HomePageActivity extends AppCompatActivity {

    TextView title1, title2, title3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        title1 = findViewById(R.id.textView_title_block1);
        title2 = findViewById(R.id.textView_title_block2);
        title3 = findViewById(R.id.textView_title_block3);

        title1.setText(Html.fromHtml("请问您今天要来点" + "<b>更新</b>" + "吗？"));
        title2.setText(Html.fromHtml("靠随机数寻求" + "<b>邂逅</b>" + "是否搞错了什么？"));
        title3.setText(Html.fromHtml("再续" + "<b>前缘</b>" + "..."));

    }
}