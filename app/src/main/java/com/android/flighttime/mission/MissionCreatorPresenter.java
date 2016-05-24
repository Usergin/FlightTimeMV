package com.android.flighttime.mission;

import android.view.View;

import com.android.flighttime.data.AbstractExpandableDataProvider;

import java.util.Calendar;

/**
 * Created by oldman on 19.05.16.
 */
public interface MissionCreatorPresenter {
    void onResume();

    void onPause();

    void onDestroy();

    void createMission(String name, Calendar date, Calendar time);

}