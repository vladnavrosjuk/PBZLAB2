import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Simple Java program to connect to MySQL database running on localhost and
 * running SELECT and INSERT query to retrieve and add data.
 * @author Javin Paul
 */
public class SqlMethods {
    String sssqlupdate;
    String querydelete;
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/PBZ12";
    private static final String user = "root";
    private static final String password = "root";
    String operauery;
    private String a;

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    int numberoper = 0;
    String select1 = "";
    ArrayList ListDetail = new ArrayList();
    ArrayList listNumber = new ArrayList();
    ArrayList ListColor = new ArrayList();
    ArrayList ListCity = new ArrayList();
    ArrayList ListSize = new ArrayList();
    ArrayList IdSotrudTech = new ArrayList();
    ArrayList idOborudList = new ArrayList();
    ArrayList nameOborudList = new ArrayList();
    ArrayList IdSotrudSotrud = new ArrayList();
    ArrayList FioSotrud = new ArrayList();
    ArrayList DolgnistSotrud = new ArrayList();
    ArrayList idUchOborudList = new ArrayList();
    ArrayList idUchUch = new ArrayList();
    ArrayList idNameUCh = new ArrayList();
    ArrayList IdTypeUch = new ArrayList();
    ArrayList cat2 = new ArrayList();
    Table table;
    public SqlMethods(Table table){
        this.table = table;
    }


    public ArrayList getListDetail() {
        return ListDetail;
    }

    public ArrayList getListNumber() {
        return listNumber;
    }

    public ArrayList getListColor() {
        return ListColor;
    }

    public ArrayList getListCity() {
        return ListCity;
    }

    public ArrayList getListSize() {
        return ListSize;
    }

    public  void searchtechosmotr() {
        String query = "select * from tehosmotr ";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

            while (rs.next()) {




                String idOborud = rs.getString(1);
                String resultOsmotr = rs.getString(2);
                String prichinOsmotr = rs.getString(3);
                String dataremonta = rs.getString(4);
                String idSotrud = rs.getString(5);

                ListDetail.add(idOborud);
                listNumber.add(resultOsmotr);
                ListColor.add(prichinOsmotr);
                ListSize.add(dataremonta);
                IdSotrudTech.add(idSotrud);




                /*System.out.printf("idDetail: %s, Color: %s %n",idDetail, colorDetail);*/
            }



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
    public  void searchsotrud() {
        String query = "select * from sotrud ";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

            while (rs.next()) {




                String idSotrud = rs.getString(1);
                String nameSotrud = rs.getString(2);
                String dolgnost = rs.getString(3);


                IdSotrudSotrud.add(idSotrud);
                FioSotrud.add(nameSotrud);
                DolgnistSotrud.add(dolgnost);





                /*System.out.printf("idDetail: %s, Color: %s %n",idDetail, colorDetail);*/
            }



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    public  void searchselect1() {
        select1 = "";
        String query = "select tehosmotr.dataremonta, tehosmotr.prichinOsmotr, oborud.nameOborud , uchproizv.idUch, uchproizv.typeOborud , uchproizv.nameUch from  tehosmotr, oborud, uchproizv where tehosmotr.idOborud = oborud.idOborud and (tehosmotr.resultOsmotr = 'В ремонт' or tehosmotr.resultOsmotr = 'Списать' ) and oborud.idUch = uchproizv.idUch ";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

            while (rs.next()) {





                String dataremonta = rs.getString(1);
                String prichinOsmotr = rs.getString(2);
                String nameOborud = rs.getString(3);
                String idUch = rs.getString(4);
                String typeOborud = rs.getString(5);
                String nameUch = rs.getString(6);
                /*System.out.printf("id: %s, name: %s, id: %s, name: %s,id: %s, author: %s %n", dataremonta, prichinOsmotr, nameOborud, idUch ,typeOborud, nameUch);*/
                select1 += " "+dataremonta+" "+ prichinOsmotr +" "+ nameOborud+" "+ idUch +" "+typeOborud+" "+nameUch+" \n";





                /*System.out.printf("idDetail: %s, Color: %s %n",idDetail, colorDetail);*/
            }



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    public  void searchselect2(String a) {
        select1 = "";
        String query = "select tehosmotr.dataremonta, tehosmotr.idOborud, oborud.nameOborud, uchproizv.typeOborud, tehosmotr.resultOsmotr from  tehosmotr, oborud, uchproizv where tehosmotr.idOborud = oborud.idOborud and oborud.idUch = uchproizv.idUch and tehosmotr.idOborud = '"+a+"'";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

            while (rs.next()) {









                String dataremonta = rs.getString(1);
                String idOborud = rs.getString(2);
                String nameOborud = rs.getString(3);
                String typeOborud = rs.getString(4);
                String resultOsmotr = rs.getString(5);
                /*System.out.printf("id: %s, name: %s, id: %s, name: %s,id: %s, author: %s %n", dataremonta, prichinOsmotr, nameOborud, idUch ,typeOborud, nameUch);*/
                select1 += " "+dataremonta+" "+ idOborud +" "+ nameOborud+"  "+typeOborud+" "+resultOsmotr+" \n";





                /*System.out.printf("idDetail: %s, Color: %s %n",idDetail, colorDetail);*/
            }



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }


    public  void searchselect3(String a) {
        select1 = "";
        String query = "select distinct tehosmotr.dataremonta, sotrud.nameSotrud , sotrud.dolgnost from  tehosmotr, sotrud where tehosmotr.idSotrud = sotrud.idSotrud and tehosmotr.dataremonta = '"+a+"'";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

            while (rs.next()) {









                String dataremonta = rs.getString(1);
                String nameSotrud = rs.getString(2);
                String dolgnost = rs.getString(3);

                /*System.out.printf("id: %s, name: %s, id: %s, name: %s,id: %s, author: %s %n", dataremonta, prichinOsmotr, nameOborud, idUch ,typeOborud, nameUch);*/
                select1 += " "+dataremonta+" "+ nameSotrud +" "+ dolgnost+"   \n";





                /*System.out.printf("idDetail: %s, Color: %s %n",idDetail, colorDetail);*/
            }



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    public String getSelect1() {
        return select1;
    }

    public ArrayList getIdSotrudSotrud() {
        return IdSotrudSotrud;
    }


    public ArrayList getFioSotrud() {
        return FioSotrud;
    }

    public ArrayList getDolgnistSotrud() {
        return DolgnistSotrud;
    }

    public  void searchoborud() {
        String query = "select * from oborud ";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

            while (rs.next()) {




                String idOborud = rs.getString(1);
                String nameOborud = rs.getString(2);
                String idUch = rs.getString(3);



                idOborudList.add(idOborud);
                idUchOborudList.add(idUch);
                nameOborudList.add(nameOborud);



                /*System.out.printf("idDetail: %s, Color: %s %n",idDetail, colorDetail);*/
            }



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
    public void clearsotrud(){
        IdSotrudSotrud.clear();
        FioSotrud.clear();
        DolgnistSotrud.clear();
    }

    public  void searchuchproizv() {
        String query = "select * from uchproizv ";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

            while (rs.next()) {




                String idUch = rs.getString(1);
                String nameUch = rs.getString(2);
                String typeOborud = rs.getString(3);



                idUchUch.add(idUch);
                idNameUCh.add(nameUch);
                IdTypeUch.add(typeOborud);



                /*System.out.printf("idDetail: %s, Color: %s %n",idDetail, colorDetail);*/
            }



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    public ArrayList getIdOborudList() {
        return idOborudList;
    }

    public ArrayList getNameOborudList() {
        return nameOborudList;
    }

    public ArrayList getIdUchOborudList() {
        return idUchOborudList;
    }

    public ArrayList getIdUchUch() {
        return idUchUch;
    }

    public ArrayList getIdNameUCh() {
        return idNameUCh;
    }

    public ArrayList getIdTypeUch() {
        return IdTypeUch;
    }

    public void clearTechosmotr(){
        listNumber.clear();
        ListCity.clear();
        ListSize.clear();
        ListDetail.clear();
        ListColor.clear();
        idOborudList.clear();
        idUchOborudList.clear();
        nameOborudList.clear();
    }
    public void clearuch(){
        idUchUch.clear();
        idNameUCh.clear();
        IdTypeUch.clear();
    }
    public void clearOborud(){

        idOborudList.clear();
        idUchOborudList.clear();
        nameOborudList.clear();
    }

    public void update(){


        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            stmt.executeUpdate(sssqlupdate);



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
        table.getCitu().getText();
    }

    public void setSssqlupdate(String sssqlupdate) {
        this.sssqlupdate = sssqlupdate;
    }

    public ArrayList getIdSotrudTech() {
        return IdSotrudTech;
    }

    public  void addtech (String a , String b,String c , String d,String e) {
        String query = "insert into tehosmotr values ('"+a+"', '"+b+"', '"+c+"', '"+d+"', '"+e+"');";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            stmt.executeUpdate(query);



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
    public  void adduch (String a , String b,String c ) {
        String query = "insert into uchproizv values ('"+a+"', '"+b+"', '"+c+"');";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            stmt.executeUpdate(query);



            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            }
        }

    public  void addsotrud (String a , String b,String c ) {
        String query = "insert into sotrud values ('"+a+"', '"+b+"', '"+c+"');";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            stmt.executeUpdate(query);



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
    public  void addoborud (String a , String b,String c ) {
        String query = "insert into oborud values ('"+a+"', '"+b+"', '"+c+"');";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            stmt.executeUpdate(query);



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    public void setQuerydelete(String querydelete) {
        this.querydelete = querydelete;
    }

    public  void delete () {


        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            stmt.executeUpdate(querydelete);



        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

}