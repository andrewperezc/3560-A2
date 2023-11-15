package assignment2;


public class User implements UserGroup{
	
	private TwitterFeed feed;
	private UserID ID;
	
	public User(UserID ID) {
		this.ID = ID;
		this.feed = new TwitterFeed();
		TwitterUserManager.addFollower(this, this);
	}
	
	public void newTweet(String tweet) {

		TwitterUserManager.addUserTweet(this, tweet);
		this.feed.notifyFollowers(tweet);
	}
	
	public TwitterFeed getFeedService() {
		return this.feed;
	}
	
	public UserID getID() {
		return this.ID;
	}
	
	public int getNumberGroupMembers() {
		return 1;
	}
	

}
