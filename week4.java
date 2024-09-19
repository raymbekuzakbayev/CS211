public class Main {

    public static void main(String[] args) {
        UserRole role = UserRole.MODERATOR;
        System.out.println(role.getAccessLevel());
    }
    public static String removeDuplicates(String input) {
        String new_text = "";
        for (char ch: new_text.toCharArray()){
            if (new_text.indexOf(ch)==-1){
                new_text+=ch;
            }
        }
        return new_text;
    }
}
public enum UserRole {
    ADMIN(1),
    MODERATOR(2),
    USER(3);
    private int value;
    UserRole(int value) {
        this.value = value;
    }
    public int getAccessLevel() {
        return this.value;
    }
}
