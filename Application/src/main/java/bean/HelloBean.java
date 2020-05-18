package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;


@ManagedBean
@RequestScoped
public class HelloBean implements Serializable{

    
    // Connect to database
    String hostName = "aqdbserver0415.database.windows.net"; // update me
    String dbName = "AzureDB_AQ"; // update me
    String user = "azureuser@aqdbserver0415"; // update me
    String dbpassword = "Zaq12wsx"; // update me
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
        + "trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, dbpassword);
    Connection connection = null;

    /** ユーザID */
    private String userId = "";

    /** パスワード */
    private String password = "";

    private String sqlresult = "";

    public String login() {


        System.out.println(userId);
        System.out.println(password);

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url);
            final String schema = connection.getSchema();
            System.out.println("Successful connection - Schema: " + schema);

            System.out.println("Query data example:");
            System.out.println("=========================================");

            // Create and execute a SELECT SQL statement.
            final String selectSql = "SELECT TOP (1) FirstName+LastName FROM [SalesLT].[Customer]";

            try (Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSql)) {

                //Print results from select statement
                //System.out.println("Top 20 categories:");
                while (resultSet.next())
                {
                //    System.out.println(resultSet.getString(1) + " "
                //        + resultSet.getString(2));
                    sqlresult = resultSet.getString(1);
                }
                
                connection.close();
            }
        }
        catch (final Exception e) {
            e.printStackTrace();
        }

        return "resultPage.xhtml";
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(final String userIdtext) {
        this.userId = userIdtext;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordtext) {
        this.password = passwordtext;
    }

    public String getSqlresult() {
        return this.sqlresult;
    }

    public void setSqlresult(final String sqlresult) {
        this.sqlresult = sqlresult;
    }

    public String list() {
        return "listPage_sample.xhtml";
    }

    public String STest() {
        return "STestPage.xhtml";
    }

    public String detail() {
        return "index2.xhtml";
    }
}