package com.haomiao.cloud.rxbusdemo;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private List<OtherEvent> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add(new OtherEvent("Tom" + i, 26));
        }

    }


    public void sendTap(View view) {
        RxBus.getInstance().send(Events.TAP, "Tap传了一个String");
    }

    /**
     * 传递集合 传对象 都可以
     *
     * @param view
     */
    public void sendOther(View view) {
//        RxBus.getInstance().send(Events.OTHER, null);
        //RxBus.getInstance().send(Events.OTHER, new OtherEvent("Cloud", 25));
        RxBus.getInstance().send(Events.OTHER, mList);
    }
}
