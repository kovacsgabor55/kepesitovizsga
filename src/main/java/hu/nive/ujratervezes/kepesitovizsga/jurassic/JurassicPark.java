package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {
    private MariaDbDataSource dataSource;

    public JurassicPark(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT `breed` FROM `dinosaur` WHERE `expected` < `actual` ORDER BY `breed` ASC;")) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("breed");
                names.add(name);
            }
            return names;
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select dinosaur", se);
        }
    }
}
