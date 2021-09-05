package entities;

import java.sql.ResultSet;

public interface Entity {
    // Returns names of fields should be inserted
    String getFieldNames();
    // Returns values of fields should be inserted
    String getFieldValues();
    // Returns printable information about entity for output
    String getPrintable();
    // Applies values from ResultSet to entity
    void apply(ResultSet rs);
}
