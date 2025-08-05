package com.works.restapi.services;

import com.works.restapi.entities.Admin;
import com.works.restapi.repositories.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepository adminRepository;
    private final DB db;

    public boolean login( Admin admin ) {
        try {
            String sql = "select * from admin where username = ? and password = ? ";
            PreparedStatement st = db.getDataSource().getConnection().prepareStatement( sql );
            st.setString( 1, admin.getUsername() );
            st.setString( 2, admin.getPassword() );
            ResultSet rs = st.executeQuery();
            return  rs.next();
        }catch (Exception ex){
            return false;
        }
    }

}
