package me.hch.init;

import me.hch.Ws320Exception;
import me.hch.util.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by hch on 2014/4/26.
 */
public class H2DatabaseInitialize {
    private static Config config = Config.getInstance("db.properties");

    static {
        try {
            Class.forName(config.getString("db.driver"));
        } catch (ClassNotFoundException e) {
            throw new Ws320Exception(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        init();
    }

    public static void init() throws SQLException {
        String sql = "create schema if not exists ws320;";

        execute(sql);


        sql = "" +
                "create table if not exists ws320.hospitals" +
                "(" +
                "   id      varchar(10)     not null," +
                "   name    varchar(20)     not null," +
                "   address varchar(100)    not null," +
                "   phone   varchar(20)     not null," +
                "   intro   varchar(500)        null," +
                "   grade   varchar(10)         null," +
                "   kind    varchar(10)         null," +

                "   wsdl    varchar(200)    not null," +

                "   constraint pk primary key (id)" +
                ");";


        execute(sql);


        sql = "create index if not exists idx_name on ws320.hospitals(name);";
        execute(sql);


        sql = "insert into ws320.hospitals (id, name, address, phone, wsdl) values ('sdfy', 'sdfy name', 'sdfy addr', '13812345678', 'http://localhost:8080/')";
        execute(sql);

        sql = "insert into ws320.hospitals (id, name, address, phone, wsdl) values ('sdfe', 'sdfe name', 'sdfe addr', '13812345679', 'http://localhost:8080/')";
        execute(sql);
    }

    public static void execute(String sql) throws SQLException {
        Connection conn = DriverManager.getConnection(
                config.getString("db.url"),
                "sa",
                ""
        );
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        stmt.close();
        conn.close();
    }
}