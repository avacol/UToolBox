package lic.swifter.box.recycler.holder;

import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import lic.swifter.box.R;
import lic.swifter.box.api.model.IpLocation;

/**
 * Created by lic on 16-8-15.
 */
public class IpResultHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.item_ip_search_data)
    TextView searchDataTextView;
    @Bind(R.id.item_ip_result_area)
    TextView resultAreaTextView;
    @Bind(R.id.item_ip_result_location)
    TextView resultLocationTextView;

    public IpResultHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);

        TypedValue typedValue = new TypedValue();
        itemView.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        itemView.setBackgroundResource(typedValue.resourceId);
    }

    public void setData(IpLocation ipLocation) {
        searchDataTextView.setText(ipLocation.searchText);
        resultAreaTextView.setText(ipLocation.area);
        resultLocationTextView.setText(ipLocation.location);
    }
}
