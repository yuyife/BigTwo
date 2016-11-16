package com.yuyife.bigtwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.yuyife.bigtwo.anim.Fall;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.home_head)
    ImageView homeHead;
    @Bind(R.id.home_name)
    TextView homeName;
    @Bind(R.id.home_id)
    TextView homeId;
    @Bind(R.id.home_zhanji)
    Button homeZhanji;
    @Bind(R.id.home_bangzhu)
    Button homeBangzhu;
    @Bind(R.id.home_shezhi)
    Button homeShezhi;
    @Bind(R.id.home_gonggao_tv)
    TextView homeGonggaoTv;
    @Bind(R.id.home_join_game)
    ImageView homeJoinGame;
    @Bind(R.id.home_create_game)
    ImageView homeCreateGame;
    @Bind(R.id.home_biaoti_img)
    ImageView homeBiaotiImg;
    @Bind(R.id.home_jinbi)
    TextView homeJinbi;
    @Bind(R.id.home_add_jinbi)
    Button homeAddJinbi;

    @OnClick({R.id.home_add_jinbi, R.id.home_join_game, R.id.home_create_game,
            R.id.home_zhanji, R.id.home_bangzhu, R.id.home_shezhi})
    public void homeViewClick(View v) {
        switch (v.getId()) {
            case R.id.home_add_jinbi:
                //增加金币
                break;
            case R.id.home_join_game:
                //加入游戏
                new Fall().start(homeJoinGame);
                break;
            case R.id.home_create_game:
                //创建房间
                new Fall().start(homeCreateGame);
                break;
            case R.id.home_zhanji:
                //战绩
                break;
            case R.id.home_bangzhu:
                //帮助
                break;
            case R.id.home_shezhi:
                //设置
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
