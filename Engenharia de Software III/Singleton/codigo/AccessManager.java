public class AccessManager {
    private static AccessManager instance = null;
    private User loggedInUser;

    private AccessManager() {
    }

    public static AccessManager getInstance() {
        if (instance == null) {
            instance = new AccessManager();
        }
        return instance;
    }

    public boolean login(String username, String password) {
        if ("user".equals(username) && "password".equals(password)) {
            loggedInUser = new User(username);
            return true;
        }
        return false;
    }

    public void logout() {
        loggedInUser = null;
    }

    public boolean grantAccess(User user, Resource resource) {
        if (loggedInUser != null && loggedInUser.equals(user)) {
            System.out.println("Acesso concedido a " + resource.getName() + " para o usuário " + user.getUsername());
            return true;
        }
        return false;
    }

    public boolean denyAccess(User user, Resource resource) {
        if (loggedInUser != null && loggedInUser.equals(user)) {
            System.out.println("Acesso negado a " + resource.getName() + " para o usuário " + user.getUsername());
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        AccessManager accessManager = AccessManager.getInstance();

        if (accessManager.login("user", "password")) {
            User user = new User("user");
            Resource resource = new Resource("ResourceA");
            accessManager.grantAccess(user, resource);
            accessManager.logout();
        }
    }
}

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

class Resource {
    private String name;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}