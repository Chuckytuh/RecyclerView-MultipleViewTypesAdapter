package com.rjsvieira.recyclerviewmultipleviewtypesadapter.sample.adapter;

import com.rjsvieira.recyclerviewmultipleviewtypesadapter.EnumListBindAdapter;
import com.rjsvieira.recyclerviewmultipleviewtypesadapter.sample.SampleData;
import com.rjsvieira.recyclerviewmultipleviewtypesadapter.sample.binder.Sample1Binder;
import com.rjsvieira.recyclerviewmultipleviewtypesadapter.sample.binder.Sample2Binder;
import com.rjsvieira.recyclerviewmultipleviewtypesadapter.sample.binder.Sample3Binder;

import java.util.List;

public class SampleEnumListAdapter extends EnumListBindAdapter<SampleEnumListAdapter.SampleViewType> {

    enum SampleViewType {
        SAMPLE1, SAMPLE2, SAMPLE3
    }

    public SampleEnumListAdapter() {
        addAllBinder(new Sample1Binder(this),
                new Sample2Binder(this),
                new Sample3Binder(this));
    }

    public void setSample2Data(List<SampleData> dataSet) {
        ((Sample2Binder) getDataBinder(SampleViewType.SAMPLE2)).addAll(dataSet);
    }

}
