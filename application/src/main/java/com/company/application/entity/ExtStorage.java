package com.company.application.entity;

import com.company.inventorycontrolsystem.entity.Storage;
import io.jmix.core.entity.annotation.ReplaceEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.time.LocalTime;

@JmixEntity
@Entity(name = "app_ExtStorage")
@ReplaceEntity(Storage.class)
public class ExtStorage extends Storage {

    @Column(name = "WORK_FROM")
    private LocalTime workFrom;

    @Column(name = "WORK_TO")
    private LocalDateTime workTo;

    @Column(name = "ACTIVE")
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDateTime getWorkTo() {
        return workTo;
    }

    public void setWorkTo(LocalDateTime workTo) {
        this.workTo = workTo;
    }

    public LocalTime getWorkFrom() {
        return workFrom;
    }

    public void setWorkFrom(LocalTime workFrom) {
        this.workFrom = workFrom;
    }
}