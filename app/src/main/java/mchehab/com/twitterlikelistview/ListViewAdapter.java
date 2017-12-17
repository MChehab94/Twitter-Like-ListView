package mchehab.com.twitterlikelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import jp.wasabeef.picasso.transformations.CropCircleTransformation;

/**
 * Created by muhammadchehab on 12/10/17.
 */

public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private List<TwitterRow> listTwitterRows;

    public ListViewAdapter(Context context, List<TwitterRow> listTwitterRows){
        this.context = context;
        this.listTwitterRows = listTwitterRows;
    }

    @Override
    public int getCount() {
        return listTwitterRows.size();
    }

    @Override
    public Object getItem(int position) {
        return listTwitterRows.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_row, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }

        TwitterRow twitterRow = listTwitterRows.get(position);

        Picasso.with(context)
                .load(twitterRow.getImageURL())
                .transform(new CropCircleTransformation())
                .placeholder(R.drawable.profile)
                .into(viewHolder.imageViewProfile);

        viewHolder.textViewUsername.setText(twitterRow.getUsername());
        viewHolder.textViewTwittername.setText(twitterRow.getTwitterName());
        viewHolder.textViewTweetTime.setText(twitterRow.getTimeOfTweet());
        viewHolder.textViewTweetText.setText(twitterRow.getTweetMessage());

        viewHolder.textViewChats.setText(twitterRow.getMessageCount() + "");
        viewHolder.textViewRetweet.setText(twitterRow.getRetweetCount() + "");
        viewHolder.textViewLike.setText(twitterRow.getLikeCount() + "");

        return convertView;
    }

    class ViewHolder{

        ViewHolder(View view){
            ButterKnife.bind(this, view);
        }

        @BindView(R.id.imageViewProfile) ImageView imageViewProfile;
        @BindView(R.id.textViewUsername) TextView textViewUsername;
        @BindView(R.id.textViewTwittername) TextView textViewTwittername;
        @BindView(R.id.textViewTweetTime) TextView textViewTweetTime;
        @BindView(R.id.textViewTweetText) TextView textViewTweetText;

        @BindView(R.id.imageViewChats) ImageView imageViewChats;
        @BindView(R.id.textViewChats) TextView textViewChats;
        @BindView(R.id.imageViewRetweet) ImageView imageViewRetweet;
        @BindView(R.id.textViewRetweet) TextView textViewRetweet;
        @BindView(R.id.imageViewLike) ImageView imageViewLike;
        @BindView(R.id.textViewLike) TextView textViewLike;
        @BindView(R.id.imageViewPrivateMessage) ImageView imageViewPrivateMessage;
    }
}