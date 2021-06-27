package model;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public enum Role3 {
    USER(new HashSet<Permission>() {
        {
            this.add(Permission.DEVELOPERS_READ);
        }
    }),
    ADMIN(new HashSet<Permission>() {
        {
            this.add(Permission.DEVELOPERS_WRITE);
            this.add(Permission.DEVELOPERS_READ);
        }
    });


    private final Set<Permission> permissions;

    Role3(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthorities() {
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
    }
}
