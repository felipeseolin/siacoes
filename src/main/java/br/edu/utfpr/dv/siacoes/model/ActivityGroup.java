package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class ActivityGroup implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	private int idActivityGroup;
	private String description;
	private int sequence;
	private int minimumScore;
	private int maximumScore;

	public String toString(){
		return this.getDescription();
	}

	@Override
    public boolean equals(final Object object) {
        if (!(object instanceof ActivityGroup)) {
            return false;
        }else if(this.getIdActivityGroup() == ((ActivityGroup)object).getIdActivityGroup()){
        	return true;
        }else{
        	return false;
        }
    }

}
