import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class NewDataBase {
    List<User> users = new ArrayList<>();
    List<Post> posts = new ArrayList<>();
    HashSet<Likes> like = new HashSet<>();
    int postSequence = 0;
    int userSequence = 0;
    public User addUser(String firstName, String lastName, String email){
        int id = this.userSequence;
        User newUser = new User(id, firstName, lastName, email);
        this.users.add(newUser);
        userSequence++;
        return newUser;
    }
    public List<User> getUsers(){
        return this.users;
    }
    public User getUser(int id)throws UserNotFound{
        for (User user: users) {
            if(user.getId()==id)
            {return user;}
        }
        throw new UserNotFound("Useer not found!");
        // find user from array list and return
    }
    public User upDateUser(int id, String firstName,String lastName,String email){
        for (User user: users) {
            if(user.getId()==id) {
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setEmail(email);
                return user;
            }
        }
        return null;
    }
        public User deleteUser(int deletedAbldId){
        for (User user:users) {
            if (user.getId()==deletedAbldId){
                users.remove(user);
                return user;
            }
        }
       return null;
    }
    public Post addPost(String title,String contant,int autherID) throws UserNotFound {
        User user = this.getUser(autherID);
        if (user == null ) return null;
                int id = this.postSequence;
                Post newPost = new Post(id, title, contant,autherID);
                newPost.setDB(this);
                posts.add(newPost);
                //newPost.getAuther(useride);
                postSequence++;
                return newPost;
        }

//        public NewDataBase addLike(int userId,int postId){
//                User user = this.getUser(userId);
//                if (user == null)return null;
//                NewDataBase addLikes = null;
//                addLikes.addLikes(userId,postId);
//                return addLikes;
//        }
    public Likes addLikes(int userId,int postid) throws UserNotFound, PostNotFound {

                User user = this.getUser(userId);
                if (user == null)return null;
                Post post = this.getPost(postid);
                if (post == null)return null;
                Likes like = new Likes(userId,postid);
                this.like.add(like);
                return like;
            }

    public Likes unLike(int deletedAbldId){
        for (Likes user:like) {
            if (user.getUserid()==deletedAbldId){
                like.remove(user);
                return user;
            }
        }
        return null;
    }
    public List<Post> getPosts(){
            return this.posts;
    }
    public HashSet<Likes> getLike(){
        return this.like;
    }
    public Likes getLike(int postid) throws PostNotFound {
        Post post = this.getPost(postid);
        if(post == null)return null;
        for (Likes like:like) {if(postid==like.getPostid()){
                 return like;
        }
        }
        return null;
    }
    public Post updatePost(int postid,String title,String contant){
        for (Post postes:
                posts) {
            if(postes.getPostId()==postid){
                postes.setTitle(title);
                postes.setContant(contant);
                return postes;
            }
        }
        return null;
    }
    public Post deletePost(int deletePostID){
        for (Post post:posts) {
            if (post.getPostId()==deletePostID){
                users.remove(post);
                return post;
            }
        }
        return null;
    }

    public Post getPost(int id)throws PostNotFound{
        for (Post poster:
                posts) {
            if(poster.getPostId()==id)
            {return poster;
            }

        }
        throw new PostNotFound("user Not found");
    }
}
class User{
    int id;
    String firstName;
    String lastName;
    String email;
    public User(int id,String firstName,String lastName,String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public User(){}
    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
class Post{
    int postid;
    String title;
    String contant;
    int autherID;
    NewDataBase db;
    public Post(int postid,String title,String contant,int autherID){
        this.postid=postid;
        this.title=title;
        this.contant=contant;
        this.autherID=autherID;
    }
    public int getPostId() {
        return postid;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setContant(String contant) {
        this.contant = contant;
    }

    public void setDB(NewDataBase db) {
        this.db = db;
    }

    public User getAuthor() throws UserNotFound {
        return db.getUser(this.autherID);

    }

    @Override
    public String toString() {
        return "Post{" +
                "postid=" + postid +
                ", title='" + title + '\'' +
                ", contant='" + contant + '\'' +
                '}';
    }
}
class Likes{
    int userid;
    int postid;
    java.util.Date date;
    public Likes(int userid,int postid){
        this.userid=userid;
        this.postid=postid;
        this.date = new java.util.Date();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Likes likes = (Likes) o;
        return userid == likes.userid && postid == likes.postid && date.equals(likes.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid);
    }

    public int getUserid() {
        return userid;
    }

    public int getPostid() {
        return postid;
    }
    @Override
    public String toString() {
        return "Likes{" +
                "userid=" + userid +
                ", postid=" + postid +
                ", date=" + date +
                '}'+"\n";
    }
}
class UserNotFound  extends Exception
{
    public UserNotFound (String str)
    {
        super(str);
    }
}

class PostNotFound  extends Exception
{
    public PostNotFound (String str)
    {
        super(str);
    }
}