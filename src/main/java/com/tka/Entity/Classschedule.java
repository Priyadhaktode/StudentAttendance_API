package com.tka.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classschedule")
public class Classschedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Long subjectId;

	@Column(nullable = false)
	private Long ClassroomId;

	@Column(nullable = false)
	private String dayOfWeek;

	@Column(nullable = false)
	private String StartTime;

	@Column(nullable = false)
	private String EndTime;

	public Classschedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classschedule(Long subjectId, Long classroomId, String dayOfWeek, String startTime, String endTime) {
		super();
		this.subjectId = subjectId;
		ClassroomId = classroomId;
		this.dayOfWeek = dayOfWeek;
		StartTime = startTime;
		EndTime = endTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public Long getClassroomId() {
		return ClassroomId;
	}
	public void setClassroomId(Long classroomId) {
		ClassroomId = classroomId;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	@Override
	public String toString() {
		return "ClassSchedule [id=" + id + ", subjectId=" + subjectId + ", ClassroomId=" + ClassroomId + ", dayOfWeek="
				+ dayOfWeek + ", StartTime=" + StartTime + ", EndTime=" + EndTime + "]";
	}




}
