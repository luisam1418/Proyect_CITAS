

package DAO;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @since 31-03-2021
 * @author Luisa Manrique
 */
public class ConectarDB {

    /**
     *
     * @return
     */
    public DriverManagerDataSource conectar (){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/ordenes");
        datasource.setUsername("root");
        datasource.setPassword("");
        
        return datasource;
    
}
}
