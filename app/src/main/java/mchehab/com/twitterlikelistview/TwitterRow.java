package mchehab.com.twitterlikelistview;

/**
 * Created by muhammadchehab on 12/10/17.
 */

public class TwitterRow {

    private String imageURL;
    private String username;
    private String twitterName;
    private String timeOfTweet;
    private String tweetMessage;
    private int messageCount;
    private int retweetCount;
    private int likeCount;

    public TwitterRow(String imageURL, String username, String twitterName, String timeOfTweet,
                      String tweetMessage, int messageCount, int retweetCount, int likeCount) {
        this.imageURL = imageURL;
        this.username = username;
        this.twitterName = twitterName;
        this.timeOfTweet = timeOfTweet;
        this.tweetMessage = tweetMessage;
        this.messageCount = messageCount;
        this.retweetCount = retweetCount;
        this.likeCount = likeCount;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTwitterName() {
        return twitterName;
    }

    public void setTwitterName(String twitterName) {
        this.twitterName = twitterName;
    }

    public String getTimeOfTweet() {
        return timeOfTweet;
    }

    public void setTimeOfTweet(String timeOfTweet) {
        this.timeOfTweet = timeOfTweet;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    public int getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(int retweetCount) {
        this.retweetCount = retweetCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public String getTweetMessage() {
        return tweetMessage;
    }

    public void setTweetMessage(String tweetMessage) {
        this.tweetMessage = tweetMessage;
    }
}