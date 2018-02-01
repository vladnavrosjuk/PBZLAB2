import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Владислав on 12.10.2017.
 */
public class Table {
    JFrame frameTable;
    JScrollPane pane;
    JScrollPane paneselect1;
    JButton updateoborud;
    JButton buttonaddsotrud;
    JButton updateuch;
    JButton deleteuch;
    DefaultTableModel model;
    DefaultTableModel modelselect1;
    SqlMethods sqlMethods1;
    JTextField iddetail;
    JTextField name;
    JTextField color;
    JTextField size;
    JButton updatesotrud;
    JTextField citu;
    JTextField citu1;
    JTextField textidoborud;
    JTextField textnameoborud;
    JTextField textiduch;
    JTextField textiduchuch;
    JTextField textnameuch;
    JTextField texttypeuch;
    JTextField textidsotrud;
    JTextField textfio;
    JTextField textdolg;
    JButton deletetehosmotr;
    JButton updateTehosmotr;
    DefaultTableModel modeloborud;
    JScrollPane paneoborud;
    JButton buttonadduch;
    JButton buttondelete = new JButton();
    String sqlupdate;

    JButton select;

    JTable table;
    JTable tableselect1;

    DefaultTableModel modeluch;
    DefaultTableModel modelsotrud;
    JScrollPane paneuch;
    JScrollPane panesotrud;
    JButton DeleteOborud;
    JTable tableuch;
    JTable tableoborud;
    JTable tablesotrud;
    JButton buttonaddoborud;
    TextArea label;
    TextArea label2;
    JButton select3;
    JTextField textField2;
    JButton buttonselect2;
    Object[] row;
    Object[] rowoborud;
    Object[] rowuch;
    Object[] rowsotrud;
    Object[] rowselect1;
    JButton buttonaddtech;
    String sqlSotud;
    String idcol;
    int i = 0;
    int iob = 0;
    int iuch = 0;
    int isot = 0;
    int iselect1 = 0;

    int deletesotrud = 0;

    public JTextField getIddetail() {
        return iddetail;
    }

    public JTextField getName() {
        return name;
    }

    public JTextField getColor() {
        return color;
    }

    public JTextField getSize() {
        return size;
    }

    public JTextField getCitu() {
        return citu;
    }

    public Table(){




        sqlMethods1 = new SqlMethods(this);
        frameTable = new JFrame();
        frameTable.setSize(new Dimension(1250, 720));
        frameTable.setLayout(null);

        citu = new JTextField();
        citu.setBounds(0,300,300,20);
        frameTable.add(citu);
        label = new TextArea("");
        label.setBounds(0,440,800,300);
        frameTable.add(label);
        select = new JButton("");
        select.setBounds(800,480,40,260);
        frameTable.add(select);

        buttonselect2 = new JButton("");
        buttonselect2.setBounds(840,480,40,260);
        frameTable.add(buttonselect2);

        select3 = new JButton("");
        select3.setBounds(880,480,40,260);
        frameTable.add(select3);


        textField2 = new JTextField("");
        textField2.setBounds(800,440,120,40);
        frameTable.add(textField2);


        iddetail = new JTextField();
        iddetail.setBounds(0,320,300,20);
        frameTable.add(iddetail);

        color = new JTextField();
        color.setBounds(0,340,300,20);
        frameTable.add(color);

        size = new JTextField();
        size.setBounds(0,360,300,20);
        frameTable.add(size);

        citu1 = new JTextField();
        citu1.setBounds(0,380,300,20);
        frameTable.add(citu1);

        textidoborud = new JTextField();
        textidoborud.setBounds(300,300,300,20);
        frameTable.add(textidoborud);

        textnameoborud = new JTextField();
        textnameoborud.setBounds(300,320,300,20);
        frameTable.add(textnameoborud);

        textiduch = new JTextField();
        textiduch.setBounds(300,340,300,20);
        frameTable.add(textiduch);

        textiduchuch = new JTextField();
        textiduchuch.setBounds(600,300,300,20);
        frameTable.add(textiduchuch);

        textnameuch = new JTextField();
        textnameuch.setBounds(600,320,300,20);
        frameTable.add(textnameuch);

        texttypeuch = new JTextField();
        texttypeuch.setBounds(600,340,300,20);
        frameTable.add(texttypeuch);

        textidsotrud = new JTextField();
        textidsotrud.setBounds(900,300,300,20);
        frameTable.add(textidsotrud);

        textfio = new JTextField();
        textfio.setBounds(900,320,300,20);
        frameTable.add(textfio);

        textdolg = new JTextField();
        textdolg.setBounds(900,340,300,20);
        frameTable.add(textdolg);

        buttonaddoborud = new JButton("Add");
        buttonaddoborud.setBounds(300,360,100,40);
        frameTable.add(buttonaddoborud);

         buttonaddtech = new JButton("Add");
        buttonaddtech.setBounds(0,400,100,40);
        frameTable.add(buttonaddtech);

        updateTehosmotr = new JButton("Update");
        updateTehosmotr.setBounds(200,400,100,40);
        frameTable.add(updateTehosmotr);

        deletetehosmotr = new JButton("Delete");
        deletetehosmotr.setBounds(100,400,100,40);
        frameTable.add(deletetehosmotr);

        buttonadduch = new JButton("Add");
        buttonadduch.setBounds(600,360,100,40);
        frameTable.add(buttonadduch);
        buttonaddsotrud = new JButton("Add");
        buttonaddsotrud.setBounds(900,360,100,40);
        frameTable.add(buttonaddsotrud);

        buttondelete = new JButton("Delete");
        buttondelete.setBounds(1000,360,100,40);
        frameTable.add(buttondelete);

        DeleteOborud = new JButton("Delete");
        DeleteOborud.setBounds(400,360,100,40);
        frameTable.add(DeleteOborud);
        updateoborud = new JButton("Update");
        updateoborud.setBounds(500,360,100,40);
        frameTable.add(updateoborud);

        updatesotrud = new JButton("Update");
        updatesotrud.setBounds(1100,360,100,40);
        frameTable.add(updatesotrud);

        deleteuch = new JButton("Delete");
        deleteuch.setBounds(700,360,100,40);
        frameTable.add(deleteuch);
        updateuch = new JButton("Update");
        updateuch.setBounds(800,360,100,40);
        frameTable.add(updateuch);


        table = new JTable();
        Object[] columns = {"Id","Name","Причина","Дата","IdСотрудника"};


        model= new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
         TableColumn tableColumn = table.getColumnModel().getColumn(0);
        tableColumn.setPreferredWidth(20);

        pane = new JScrollPane(table);
        pane.setBounds(0, 0, 300, 300);
        frameTable.add(pane);
        frameTable.setVisible(true);
        row= new Object[5];

        sqlMethods1.searchtechosmotr();




        tableoborud = new JTable();
        Object[] columnsoborud = {"IdOborud","Name","IdUch"};
        modeloborud= new DefaultTableModel();
        modeloborud.setColumnIdentifiers(columnsoborud);
        tableoborud.setModel(modeloborud);







        paneoborud = new JScrollPane(tableoborud);
        paneoborud.setBounds(300, 0, 300, 300);
        frameTable.add(paneoborud);
        frameTable.setVisible(true);
        rowoborud= new Object[3];
        sqlMethods1.searchoborud();


        tableuch = new JTable();
        Object[] columnuch = {"IDUch","NameUch","typeOborud"};
        modeluch= new DefaultTableModel();
        modeluch.setColumnIdentifiers(columnuch);
        tableuch.setModel(modeluch);

        paneuch = new JScrollPane(tableuch);
        paneuch.setBounds(600, 0, 300, 300);
        frameTable.add(paneuch);
        frameTable.setVisible(true);
        rowuch= new Object[3];
        sqlMethods1.searchuchproizv();

        tablesotrud = new JTable();
        Object[] columnsotrud = {"IdSotrud","FIO","Должность"};
        modelsotrud= new DefaultTableModel();
        modelsotrud.setColumnIdentifiers(columnsotrud);
        tablesotrud.setModel(modelsotrud);

        panesotrud = new JScrollPane(tablesotrud);
        panesotrud.setBounds(900, 0, 300, 300);
        frameTable.add(panesotrud);
        frameTable.setVisible(true);
        rowsotrud= new Object[3];
        sqlMethods1.searchsotrud();








    }


    public JTable getTableuch() {
        return tableuch;
    }

    public JTable getTableoborud() {
        return tableoborud;
    }

    public JTable getTablesotrud() {
        return tablesotrud;
    }

    public void refreshtable(){
        model.setRowCount(0);
        sqlMethods1.clearTechosmotr();
        sqlMethods1.searchtechosmotr();

        createtable();
    }
    public void listener(){
        select3.addActionListener(e -> {
            label.setText("");
            sqlMethods1.searchselect3(textField2.getText());
            label.setText(sqlMethods1.getSelect1());
        });
        select.addActionListener(e -> {
            label.setText("");

            sqlMethods1.searchselect1();
            label.setText(sqlMethods1.getSelect1());

        });
        buttonselect2.addActionListener(e -> {
            label.setText("");
            sqlMethods1.searchselect2(textField2.getText());
            label.setText(sqlMethods1.getSelect1());
        });
        updateTehosmotr.addActionListener(e -> {
            deletetehosmotr();
            sqlMethods1.update();
            model.setRowCount(0);
            sqlMethods1.clearTechosmotr();

            sqlMethods1.searchtechosmotr();

            System.out.println(sqlMethods1.getSelect1());
            createtable();
        });

        deletetehosmotr.addActionListener(e -> {
            deletetehosmotr();
            sqlMethods1.delete();
            model.setRowCount(0);
            sqlMethods1.clearTechosmotr();

            sqlMethods1.searchtechosmotr();
            createtable();
        });
        updatesotrud.addActionListener(e -> {
            setDeletesotrud();
            sqlMethods1.update();
            modelsotrud.setRowCount(0);
            sqlMethods1.clearsotrud();

            sqlMethods1.searchsotrud();
            createsotrud();


        });
        updateuch.addActionListener(e -> {
            deleteuch();
            sqlMethods1.update();
            modeluch.setRowCount(0);
            sqlMethods1.clearuch();

            sqlMethods1.searchuchproizv();
            createtableuch();
        });
        deleteuch.addActionListener(e -> {
            deleteuch();
            sqlMethods1.delete();
            modeluch.setRowCount(0);
            sqlMethods1.clearuch();

            sqlMethods1.searchuchproizv();
            createtableuch();
        });
        updateoborud.addActionListener(e -> {
            deleteoborud();
            sqlMethods1.update();
            modeloborud.setRowCount(0);
            sqlMethods1.clearOborud();

            sqlMethods1.searchoborud();
            createtableoborud();

        });
        DeleteOborud.addActionListener(e -> {
            deleteoborud();
            sqlMethods1.delete();
            modeloborud.setRowCount(0);
            sqlMethods1.clearOborud();

            sqlMethods1.searchoborud();
            createtableoborud();


        });
        buttondelete.addActionListener(e ->
        {


                setDeletesotrud();
                sqlMethods1.delete();
                modelsotrud.setRowCount(0);
                sqlMethods1.clearsotrud();

                sqlMethods1.searchsotrud();
                createsotrud();



        });
        buttonaddtech.addActionListener(e -> {
            model.setRowCount(0);
            sqlMethods1.clearTechosmotr();
            sqlMethods1.addtech(citu.getText(),iddetail.getText(),color.getText(),size.getText(),citu1.getText());
            sqlMethods1.searchtechosmotr();
            createtable();
        });

        buttonaddoborud.addActionListener(e -> {
            modeloborud.setRowCount(0);
            sqlMethods1.clearOborud();
            sqlMethods1.addoborud(textidoborud.getText(),textnameoborud.getText(),textiduch.getText());
            sqlMethods1.searchoborud();
            createtableoborud();
        });
        buttonadduch.addActionListener(e -> {
            modeluch.setRowCount(0);
            sqlMethods1.clearuch();
            sqlMethods1.adduch(textiduchuch.getText(),textnameuch.getText(),texttypeuch.getText());
            sqlMethods1.searchuchproizv();
            createtableuch();
        });
        buttonaddsotrud.addActionListener(e -> {
            modelsotrud.setRowCount(0);
            sqlMethods1.clearsotrud();
            sqlMethods1.addsotrud(textidsotrud.getText(),textfio.getText(),textdolg.getText());
            sqlMethods1.searchsotrud();
            createsotrud();

        });
    }


    public void createtable(){
        while ( iob < sqlMethods1.getListColor().size())
        {
            row[0] = sqlMethods1.getListDetail().get(iob);
            row[1] = sqlMethods1.getListNumber().get(iob);
            row[2] = sqlMethods1.getListColor().get(iob);
            row[3] = sqlMethods1.getListSize().get(iob);
            row[4] = sqlMethods1.getIdSotrudTech().get(iob);



            model.addRow(row);
            iob++;

        }
        iob = 0;
    }
    public void delete() {


/*        if (selcol == 0)
            idcol = "idSotrud";
        if (selcol == 1)
            idcol = "nameSotrud";
        if (selcol == 2)
            idcol = "dolgnost";

        sqlSotud = "delete from sotrud where "+idcol+" = '"+modelsotrud.getValueAt(selcol,selrow)+"'";
        System.out.println(sqlSotud);*/
    }
    public void createsotrud(){
        while ( isot < sqlMethods1.getFioSotrud().size())
        {
            rowsotrud[0] = sqlMethods1.getIdSotrudSotrud().get(isot);
            rowsotrud[1] = sqlMethods1.getFioSotrud().get(isot);
            rowsotrud[2] = sqlMethods1.getDolgnistSotrud().get(isot);




            modelsotrud.addRow(rowsotrud);
            isot++;

        }
        isot = 0;
    }
    public void deleteoborud(){

            if (tableoborud.getSelectedColumn() == 0)
                idcol = "idOborud";
            if (tableoborud.getSelectedColumn() == 1)
                idcol = "nameOborud";
            if (tableoborud.getSelectedColumn() == 2)
                idcol = "idUch";
            sqlSotud = "delete from oborud where "+idcol+" = '"+tableoborud.getValueAt(tableoborud.getSelectedRow(),tableoborud.getSelectedColumn())+"'";
            sqlupdate = "update oborud set "+idcol+" = '"+textidoborud.getText()+"' where "+idcol+" = '"+tableoborud.getValueAt(tableoborud.getSelectedRow(),tableoborud.getSelectedColumn())+"'";
            sqlMethods1.setQuerydelete(sqlSotud);
            sqlMethods1.setSssqlupdate(sqlupdate);
        System.out.println(sqlupdate);

    }

    public void deletetehosmotr(){

        if (table.getSelectedColumn() == 0)
            idcol = "idOborud";
        if (table.getSelectedColumn() == 1)
            idcol = "resultOsmotr";
        if (table.getSelectedColumn() == 2)
            idcol = "prichinOsmotr";
        if (table.getSelectedColumn() == 3)
            idcol = "dataremonta";
        if (table.getSelectedColumn() == 4)
            idcol = "idSotrud";
        sqlSotud = "delete from tehosmotr where "+idcol+" = '"+table.getValueAt(table.getSelectedRow(),table.getSelectedColumn())+"'";
        sqlupdate = "update tehosmotr set "+idcol+" = '"+citu.getText()+"' where "+idcol+" = '"+table.getValueAt(table.getSelectedRow(),table.getSelectedColumn())+"'";
        sqlMethods1.setQuerydelete(sqlSotud);
        sqlMethods1.setSssqlupdate(sqlupdate);
        System.out.println(sqlupdate);

    }
    public void deleteuch(){

        if (tableuch.getSelectedColumn() == 0)
            idcol = "idUch";
        if (tableuch.getSelectedColumn() == 1)
            idcol = "nameUch";
        if (tableuch.getSelectedColumn() == 2)
            idcol = "typeOborud";
        sqlSotud = "delete from uchproizv where "+idcol+" = '"+tableuch.getValueAt(tableuch.getSelectedRow(),tableuch.getSelectedColumn())+"'";
        sqlupdate = "update uchproizv set "+idcol+" = '"+textiduchuch.getText()+"' where "+idcol+" = '"+tableuch.getValueAt(tableuch.getSelectedRow(),tableuch.getSelectedColumn())+"'";
        sqlMethods1.setQuerydelete(sqlSotud);
        sqlMethods1.setSssqlupdate(sqlupdate);
        System.out.println(sqlupdate);

    }
    public void setDeletesotrud(){


            if (tablesotrud.getSelectedColumn() == 0)
                idcol = "idSotrud";
            if (tablesotrud.getSelectedColumn() == 1)
                idcol = "nameSotrud";
            if (tablesotrud.getSelectedColumn() == 2)
                idcol = "dolgnost";
            sqlSotud = "delete from sotrud where " + idcol + " = '" + tablesotrud.getValueAt(tablesotrud.getSelectedRow(), tablesotrud.getSelectedColumn()) + "'";
        sqlupdate = "update sotrud set "+idcol+" = '"+textidsotrud.getText()+"' where "+idcol+" = '"+tablesotrud.getValueAt(tablesotrud.getSelectedRow(),tablesotrud.getSelectedColumn())+"'";
            sqlMethods1.setQuerydelete(sqlSotud);
        sqlMethods1.setSssqlupdate(sqlupdate);


    }
    public void createtableoborud(){
        while ( i < sqlMethods1.getIdOborudList().size())
        {
            rowoborud[0] = sqlMethods1.getIdOborudList().get(i);
            rowoborud[1] = sqlMethods1.getNameOborudList().get(i);
            rowoborud[2] = sqlMethods1.getIdUchOborudList().get(i);



            modeloborud.addRow(rowoborud);
            i++;

        }
        i = 0;
    }
    public void createtableuch(){
        while ( iuch < sqlMethods1.getIdTypeUch().size())
        {
            rowuch[0] = sqlMethods1.getIdUchUch().get(iuch);
            rowuch[1] = sqlMethods1.getIdNameUCh().get(iuch);
            rowuch[2] = sqlMethods1.getIdTypeUch().get(iuch);



            modeluch.addRow(rowuch);
            iuch++;

        }
        iuch = 0;
    }
}
