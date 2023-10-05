package aula05transacao.db;

public class DbIntegrityException extends RuntimeException {

   public DbIntegrityException(String msg) {
      super(msg);
   }
}
