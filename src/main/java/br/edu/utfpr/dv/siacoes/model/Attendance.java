package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;
import java.util.Date;

import br.edu.utfpr.dv.siacoes.util.DateUtils;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Attendance implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idAttendance;
	private Proposal proposal;
	private User supervisor;
	private User student;
	private Date date;
	private Date startTime;
	private Date endTime;
	private String comments;
	private String nextMeeting;
	private int stage;
	
	public Attendance(){
		this.setIdAttendance(0);
		this.setProposal(new Proposal());
		this.setSupervisor(new User());
		this.setStudent(new User());
		this.setDate(DateUtils.getToday().getTime());
		this.setStartTime(new Date());
		this.setEndTime(new Date());
		this.setComments("");
		this.setNextMeeting("");
		this.setStage(1);
	}
}
