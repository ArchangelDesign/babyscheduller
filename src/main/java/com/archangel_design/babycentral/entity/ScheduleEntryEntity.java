/*
 * Baby Central
 * Copyright (c) 2018.
 * Rafal Martinez-Marjanski
 */

package com.archangel_design.babycentral.entity;

import com.archangel_design.babycentral.enums.ScheduleEntryPriority;
import com.archangel_design.babycentral.enums.ScheduleEntryRepeatType;
import com.archangel_design.babycentral.enums.ScheduleEntryType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "schedule_entries")
@Getter
@Setter
public class ScheduleEntryEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 120)
    private String title;

    @Enumerated(value = EnumType.STRING)
    private ScheduleEntryType type;

    private Time start;

    private Time stop;

    @Enumerated(EnumType.STRING)
    private ScheduleEntryPriority priority;

    @Enumerated(EnumType.STRING)
    private ScheduleEntryRepeatType repeatType;

    @ManyToOne(targetEntity = ScheduleEntity.class, optional = false)
    @JoinColumn(name = "schedule_id")
    private ScheduleEntity owner;

    private Date startDate;

    private Date endDate;

    private Date lastNotificationDate;

    private boolean deleted = false;
}
