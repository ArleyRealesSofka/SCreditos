package Mundo;

public class CopiaSeguridad {
    public CopiaSeguridad(String pFecha){
        try {
                String ejecutablePgdrump = "C:/Program Files/PostgreSQL/10/bin\\pg_dump.exe";
                String format = "p";
                String path = "C:\\SCREDITOS\\copias_backup/Backup"+ pFecha +".sql";
                String host = "localhost";
                String puerto = "5432";
                String usuario = "postgres";
                String clave = "0987654321";
                String bDatos = "DB_SCREDITOS";
             ProcessBuilder pb;
             Process p;   
             if(!format.equalsIgnoreCase("")) {
              pb = new ProcessBuilder(ejecutablePgdrump, "--verbose", "--format", format, "-f", path);
             } else {
              pb = new ProcessBuilder(ejecutablePgdrump, "--verbose", "--inserts", "--column-inserts", "-f", path);
             }
                  pb.environment().put("PGHOST", host);
                  pb.environment().put("PGPORT", puerto);
                  pb.environment().put("PGUSER", usuario);
                  pb.environment().put("PGPASSWORD", clave);
                  pb.environment().put("PGDATABASE", bDatos);
                  pb.redirectErrorStream(true);
                  p = pb.start();
              } catch (Exception e) {
               System.out.print("backup \n"+e.getMessage()+"\n");
              }    
    }
}
