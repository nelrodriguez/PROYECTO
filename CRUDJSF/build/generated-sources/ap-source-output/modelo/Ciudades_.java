package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Profesores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-14T18:21:02")
@StaticMetamodel(Ciudades.class)
public class Ciudades_ { 

    public static volatile CollectionAttribute<Ciudades, Profesores> profesoresCollection;
    public static volatile SingularAttribute<Ciudades, String> nombreCiudad;
    public static volatile SingularAttribute<Ciudades, Integer> idCiudad;

}