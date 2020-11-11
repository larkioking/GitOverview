package com.lark.gitoverview;

public class BaseEntity {

    private Long id;

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew() {
        return (this.id == null);
    }
}
