package GRUPO3;

import java.util.List;

public class clientes {
    private String RazonSocial;
    private double Cuit;
    private int NumeroIncidente;

    public String getRazonSocial() {
        return RazonSocial;
    }

    public clientes(String razonSocial, double cuit, int numeroIncidente) {
        RazonSocial = razonSocial;
        Cuit = cuit;
        NumeroIncidente = numeroIncidente;
    }
    public class Incidente extends tecnicos {
        public void tecnicos(String especialidad) {


        }
        private List<tecnicos> tecnicosDisponibles;

        public Incidente(String especialidad) {
            super(especialidad);
        }

        public List<tecnicos>getTecnicosDisponibles() {
            return tecnicosDisponibles;
                    }

        public void setTecnicosDisponibles(List<tecnicos> tecnicosDisponibles) {
            this.tecnicosDisponibles = tecnicosDisponibles;
        }
    }
}
