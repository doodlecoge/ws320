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
public class BuildWs320Tables {
    private static Config config = Config.getInstance("db.properties");

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Ws320Exception(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        String sql = "" +
                "create database if not exists ws320 " +
                "default character set = utf8 " +
                "default collate = utf8_general_ci;";

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
                "   kine    varchar(10)         null," +

                "   primary key using hash (id)," +
                "   index name_idx using hash (name)" +

                ");";


        execute(sql);


        // <HospitalCode>ABC</HospitalCode>
        // <DepartName>肝病专科</DepartName>
        // <DepartId>10</DepartId>
        // <DepartIntro></DepartIntro>
        // <DepartType>2</DepartType>
        // <RegistryFee>1.00</RegistryFee>
        // <ClinicFee>4.50</ClinicFee>
        // <MZKS>10</MZKS>
        // <Departsex>0</Departsex>
        // <Babyflag>0</Babyflag>
        // <BabyAge>14</BabyAge>

        sql = "" +
                "create table if not exists ws320.departments" +
                "(" +
                "   id          varchar(10)     not null," +
                "   hospitalId  varchar(10)     not null," +
                "   name        varchar(20)     not null," +
                "   intro       varchar(500)        null," +
                "   type        varchar(2)      not null," +
                "   registryFee varchar(10)     not null," +
                "   clinicFee   varchar(10)         null," +
                "   MZKS        varchar(10)         null," +
                "   sex         varchar(1)          null," +
                "   babyFlag    varchar(1)          null," +
                "   babyAge     varchar(10)         null," +

                "   primary key             using hash (id, hospitalId)," +
                "   index hospitalId_idx    using hash (hospitalId)," +
                "   index name_idx          using hash (name)," +
                "   foreign key (hospitalId) references ws320.hospitals (id)" +

                ");";

        execute(sql);



//        <Hospitalcode>ZYYY</Hospitalcode>
//        <DoctorId>11103</DoctorId>
//        <DepartId>11</DepartId>
//        <DoctorName>何焕荣</DoctorName>
//        <DoctorSex>1</DoctorSex>
//        <DoctorRank></DoctorRank>
//        <DoctorIntor></DoctorIntor>
//        <DoctorInro></DoctorInro>
//        <IsExpert>1</IsExpert>
//        <AVeworktime></AVeworktime>


        sql = "" +
                "create table if not exists ws320.doctors" +
                "(" +
                "   id              varchar(10)     not null," +
                "   departmentId    varchar(10)     not null," +
                "   hospitalId      varchar(10)     not null," +
                "   name            varchar(20)     not null," +
                "   sex             varchar(1)          null," +
                "   rank            varchar(500)        null," +
                "   intor           varchar(2)      not null," +
                "   inro            varchar(10)     not null," +
                "   isExpert        varchar(10)         null," +
                "   AVeworktime     varchar(10)         null," +

                "   primary key             using hash (id)," +
                "   index departmentId_idx  using hash (hospitalId)," +
                "   index hospitalId_idx    using hash (hospitalId)," +
                "   index name_idx          using hash (name)," +
                "   foreign key (hospitalId) references ws320.hospitals (id)" +

                ");";

        execute(sql);

//        <Hospitalcode>ZYYY</Hospitalcode>
//        <DepartId>102</DepartId>
//        <WorkStatus>0</WorkStatus>
//        <WorkDate>2014-04-13</WorkDate>
//        <WorkType>1</WorkType>
//        <Limited>9999</Limited>
//        <Registryfee>0.00</Registryfee>
//        <Chinicfee>4.50</Chinicfee>
//        <BeginNo>2</BeginNo>
//        <SpaceNo>2</SpaceNo>



//        <Hospitalcode>ZYYY</Hospitalcode>
//        <WorkStatus>0</WorkStatus>
//        <DoctorId>13302</DoctorId>
//        <DepartId>100</DepartId>
//        <WorkDate>2014-04-14 00:00:00.0</WorkDate>
//        <WorkType>1</WorkType>
//        <Limited>20</Limited>
//        <BeginNo>2</BeginNo>
//        <SpaceNo>2</SpaceNo>
//        <Registryfee>1.00</Registryfee>
//        <Chinicfee>0.00</Chinicfee>
//        <Expertsfee>6.00</Expertsfee>


    }

    public static void execute(String sql) throws SQLException {
        Connection conn = DriverManager.getConnection(
                config.getString("db.url"),
                "root",
                config.getString("db.rootpass")
        );
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        stmt.close();
        conn.close();
    }
}
