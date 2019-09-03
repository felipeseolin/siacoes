package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded=true)
@ToString(onlyExplicitlyIncluded = true)
public class ActivityUnit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@EqualsAndHashCode.Include
	private int idActivityUnit;
	@ToString.Include
	private String description;
	private boolean fillAmount;
	private String amountDescription;

	@Override
    public boolean equals(final Object object) {
        if (!(object instanceof ActivityUnit)) {
            return false;
        }else if(this.getIdActivityUnit() == ((ActivityUnit)object).getIdActivityUnit()){
        	return true;
        }else{
        	return false;
        }
    }

}
