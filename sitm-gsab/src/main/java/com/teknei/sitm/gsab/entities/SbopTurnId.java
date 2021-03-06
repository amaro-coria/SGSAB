package com.teknei.sitm.gsab.entities;
// Generated 23/06/2015 11:21:34 PM by Hibernate Tools 4.3.1



/**
 * SbopTurnId generated by hbm2java
 */
public class SbopTurnId  implements java.io.Serializable {


     private long idTurn;
     private int idEqui;

    public SbopTurnId() {
    }

    public SbopTurnId(long idTurn, int idEqui) {
       this.idTurn = idTurn;
       this.idEqui = idEqui;
    }
   
    public long getIdTurn() {
        return this.idTurn;
    }
    
    public void setIdTurn(long idTurn) {
        this.idTurn = idTurn;
    }
    public int getIdEqui() {
        return this.idEqui;
    }
    
    public void setIdEqui(int idEqui) {
        this.idEqui = idEqui;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SbopTurnId) ) return false;
		 SbopTurnId castOther = ( SbopTurnId ) other; 
         
		 return (this.getIdTurn()==castOther.getIdTurn())
 && (this.getIdEqui()==castOther.getIdEqui());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getIdTurn();
         result = 37 * result + this.getIdEqui();
         return result;
   }   


}


