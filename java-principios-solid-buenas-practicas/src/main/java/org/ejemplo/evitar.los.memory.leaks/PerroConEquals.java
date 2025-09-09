package org.ejemplo.evitar.los.memory.leaks;

import java.util.Objects;

public class PerroConEquals {
    String raza;

    public PerroConEquals(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PerroConEquals that = (PerroConEquals) o;
        return Objects.equals(raza, that.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(raza);
    }
}
