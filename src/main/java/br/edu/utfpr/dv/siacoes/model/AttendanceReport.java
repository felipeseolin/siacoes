package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AttendanceReport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int stage;
	private String title;
	private String student;
	private String supervisor;
	private List<Attendance> attendances;
	
	public AttendanceReport(){
		this.setStage(1);
		this.setTitle("");
		this.setStudent("");
		this.setSupervisor("");
		this.setAttendances(new ArrayList<Attendance>());
	}
}
