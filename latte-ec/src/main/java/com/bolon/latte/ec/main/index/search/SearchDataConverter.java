package com.bolon.latte.ec.main.index.search;

import com.alibaba.fastjson.JSONArray;
import com.bolon.latte.ui.recycler.DataConverter;
import com.bolon.latte.ui.recycler.MultipleFields;
import com.bolon.latte.ui.recycler.MultipleItemEntity;
import com.bolon.latte.util.storage.LattePreference;

import java.util.ArrayList;

/**
 * Created by Administrator
 */

public class SearchDataConverter extends DataConverter {

    public static final String TAG_SEARCH_HISTORY = "search_history";

    @Override
    public ArrayList<MultipleItemEntity> convert() {
        final String jsonStr =
                LattePreference.getCustomAppProfile(TAG_SEARCH_HISTORY);
        if (!jsonStr.equals("")) {
            final JSONArray array = JSONArray.parseArray(jsonStr);
            final int size = array.size();
            for (int i = 0; i < size; i++) {
                final String historyItemText = array.getString(i);
                final MultipleItemEntity entity = MultipleItemEntity.builder()
                        .setItemType(SearchItemType.ITEM_SEARCH)
                        .setField(MultipleFields.TEXT, historyItemText)
                        .build();
                ENTITIES.add(entity);
            }
        }

        return ENTITIES;
    }
}
