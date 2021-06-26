package model;

import java.util.Set;

public enum Role2 {
    USER(Set.of(Permission.DEVELOPERS_READ)),
    ADMIN(Set.of(Permission.DEVELOPERS_WRITE,Permission.DEVELOPERS_READ));

    private final Set<Permission> permissions;

    Role2(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }
}
