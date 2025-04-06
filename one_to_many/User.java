package one_to_many;

public class User {
	Post[]posts;
	String userName;
	static int count=0;
	public User(int size,String userName) {
		this.posts=new Post[size];
		this.userName=userName;
	}
	public void addPost(Post post) {
		if(count<posts.length) {
			posts[count++]=post;
			System.out.println("posts added");
		}
		else {
			System.out.println("cannot add posts,the array is full");
		}
	}
	public void displayPosts() {
		for(int i=0;i<count;i++) {
			System.out.println(posts[i].post_id+"\n"+posts[i].post_des);
		}
	}
	public void updatepost() {
		
	}

}
