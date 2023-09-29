package ch.plebsapps.jdbc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.stream.Collectors;

/**
 * Lernziel: SQL-Datenbanken ansprechen
 * - TODO  `Connection` aufbauen
 * - TODO SQL-Anweisungen ausführen
 * - TODO SQL-Abfragen durchführen
 *
 *   // https://mvnrepository.com/artifact/com.h2database/h2
 *   umbenennen von testImplementation -> implementation
 *   TODO implementation group: 'com.h2database', name: 'h2', version: '1.4.200'
 *
 * @see <a href="https://h2database.com/">H2 Datenbank</a>
 * @see <a href="https://h2database.com/html/features.html#database_url">H2 URLs</a>
 * @see <a href="https://github.com/ullenboom/mondial-database">mondial-database</a>
 * @see <a href="https://download.oracle.com/otn-pub/jcp/jdbc-4_1-mrel-spec/jdbc4.1-fr-spec.pdf">JDBC-Spezifikation, Anhang B, ab Seite 202</a>
 */
public class SQL {
    public static void main( String[] args ) {
        try ( Connection connection = DriverManager.getConnection( "jdbc:h2:file:./mondial" );
              Statement statement = connection.createStatement(); ) {
              // String filename = "mondial.sql";
              // final String sql =  Files.readAllLines( Paths.get( filename ) ).stream().collect( Collectors.joining( "\n" ) );
              // connection.createStatement().execute( sql );

            final ResultSet resultSet = statement.executeQuery( "SELECT * FROM Country" );
            while ( resultSet.next() ) {
                System.out.printf( "%s %d %.0f%n", resultSet.getString( "Name" ),
                        resultSet.getInt( "Population" ),
                        resultSet.getDouble( "Area" ) );
            }
        }
        catch (SQLException  e ) {
            e.printStackTrace();
        }
    }
}