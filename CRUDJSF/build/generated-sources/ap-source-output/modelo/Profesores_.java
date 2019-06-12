package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Ciudades;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-14T18:21:02")
@StaticMetamodel(Profesores.class)
public class Profesores_ { 

    public static volatile SingularAttribute<Profesores, String> clave;
    public static volatile SingularAttribute<Profesores, Integer> id;
    public static volatile SingularAttribute<Profesores, String> nombre;
    public static volatile SingularAttribute<Profesores, String> correoElectronico;
    public static volatile SingularAttribute<Profesores, String> user;
    public static volatile SingularAttribute<Profesores, Ciudades> idCiudad;

}