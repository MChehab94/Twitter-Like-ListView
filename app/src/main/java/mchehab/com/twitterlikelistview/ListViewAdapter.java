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
            viewHolder = new ViewHolder();
            viewHolder.imageViewProfile = convertView.findViewById(R.id.imageViewProfile);
            viewHolder.textViewUsername = convertView.findViewById(R.id.textViewUsername);
            viewHolder.textViewTwittername = convertView.findViewById(R.id.textViewTwittername);
            viewHolder.textViewTweetTime = convertView.findViewById(R.id.textViewTweetTime);
            viewHolder.textViewTweetText = convertView.findViewById(R.id.textViewTweetText);

            viewHolder.imageViewChats = convertView.findViewById(R.id.imageViewChats);
            viewHolder.textViewChats = convertView.findViewById(R.id.textViewChats);
            viewHolder.imageViewRetweet = convertView.findViewById(R.id.imageViewRetweet);
            viewHolder.textViewRetweet = convertView.findViewById(R.id.textViewRetweet);
            viewHolder.imageViewLike = convertView.findViewById(R.id.imageViewLike);
            viewHolder.textViewLike = convertView.findViewById(R.id.textViewLike);
            viewHolder.imageViewPrivateMessage = convertView.findViewById(R.id.imageViewPrivateMessage);
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
        ImageView imageViewProfile;
        TextView textViewUsername;
        TextView textViewTwittername;
        TextView textViewTweetTime;
        TextView textViewTweetText;

        ImageView imageViewChats;
        TextView textViewChats;
        ImageView imageViewRetweet;
        TextView textViewRetweet;
        ImageView imageViewLike;
        TextView textViewLike;
        ImageView imageViewPrivateMessage;
    }
}