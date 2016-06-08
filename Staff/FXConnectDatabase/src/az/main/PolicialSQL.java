package az.main;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PolicialSQL {

    private Connection connection = null;
    private Statement statement = null;

    private void connected() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Policia?zeroDateTimeBehavior=convertToNull", "root", "root");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void closed() {
        try {
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertPolicial(PolicialPojo pojo) {
        try {
            connected();
            String sql = "Insert into Staff values( " + pojo.getId() + ",'" + pojo.getNome() + "'," + pojo.getIdade() + "," + pojo.getVcorrida() + "," + pojo.getVapoio() + "," + pojo.getVbarra() + "," + pojo.getVabdom() + "," + pojo.getMcorrida() + "," + pojo.getMapoio() + "," + pojo.getMbarra() + "," + pojo.getMabdom() + "," + pojo.getMediafinal() + ")";
            System.out.println(sql);
            statement.executeUpdate(sql);
            closed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ObservableList<PolicialPojo> listStudent() {
        try {
            connected();
            ObservableList<PolicialPojo> list = FXCollections.observableArrayList();
            ResultSet rs = statement.executeQuery("Select * from Staff");
            while (rs.next()) {
                PolicialPojo pojo = new PolicialPojo();
                pojo.setId(rs.getInt(1));
                pojo.setNome(rs.getString(2));
                pojo.setIdade(rs.getInt(3));
                pojo.setVcorrida(rs.getInt(4));
                pojo.setVapoio(rs.getInt(5));
                pojo.setVbarra(rs.getInt(6));
                pojo.setVabdom(rs.getInt(7));
                pojo.setMcorrida(rs.getInt(8));
                pojo.setMapoio(rs.getInt(9));
                pojo.setMbarra(rs.getInt(10));
                pojo.setMabdom(rs.getInt(11));
                pojo.setMediafinal(rs.getInt(12));
                list.add(pojo);
                System.out.println(String.valueOf(list));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            closed();
        }
    }

    public List<PolicialPojo> listStudent2() {
        try {
            connected();
            List<PolicialPojo> list = new ArrayList<PolicialPojo>();
            ResultSet rs = statement.executeQuery("Select * from Staff");
            while (rs.next()) {
                PolicialPojo pojo = new PolicialPojo();
                pojo.setId(rs.getInt(1));
                pojo.setNome(rs.getString(2));
                pojo.setIdade(rs.getInt(3));
                pojo.setVcorrida(rs.getInt(4));
                pojo.setVapoio(rs.getInt(5));
                pojo.setVbarra(rs.getInt(6));
                pojo.setVabdom(rs.getInt(7));
                pojo.setMcorrida(rs.getInt(8));
                pojo.setMapoio(rs.getInt(9));
                pojo.setMbarra(rs.getInt(10));
                pojo.setMabdom(rs.getInt(11));
                pojo.setMediafinal(rs.getInt(12));
                list.add(pojo);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            closed();
        }
    }

    public void updateStudent(PolicialPojo pojo) {
        try {
            connected();
//            String sql = "Update student set name='" + pojo.getName() + "',surname = '" + pojo.getSurname() + "',age = " + pojo.getAge() + ",email = '" + pojo.getEmail() + "' Where id = " + pojo.getId();
            String sql = "";
            statement.executeUpdate(sql);
            System.out.println(sql);
        } catch (Exception e) {
        } finally {
            closed();
        }
    }

    public void deleteStudent(int id) {
        try {
            connected();
            statement.executeUpdate("Delete from Staff where id = " + id);
        } catch (Exception e) {
        } finally {
            closed();
        }
    }

    public int studentMaxID() {
        try {
            connected();
            int max = 1;
            ResultSet rs = statement.executeQuery("Select max(id) From Statt");
            rs.next();
            max = rs.getInt(1);
            rs.close();
            closed();
            return max = +1;
        } catch (Exception e) {
            return 0;
        }
    }

    public PolicialPojo findByID(int id) {
        try {
            connected();
            ResultSet rs = statement.executeQuery("Select * from Staff where id=" + id);
            PolicialPojo pojo = new PolicialPojo();
            while (rs.next()) {
                pojo.setId(rs.getInt(1));
                pojo.setNome(rs.getString(2));
                pojo.setIdade(rs.getInt(3));
                pojo.setVcorrida(rs.getInt(4));
                pojo.setVapoio(rs.getInt(5));
                pojo.setVbarra(rs.getInt(6));
                pojo.setVabdom(rs.getInt(7));
            }
            return pojo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            closed();
        }
    }

}
