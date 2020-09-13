package Controller;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ControlaCorLinhaTabela extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component result = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (column == 0 && String.valueOf(value).length() == 11) {
            result.setForeground(Color.black);
        }
        if (column == 0 && String.valueOf(value).length() == 10) {
            result.setForeground(Color.red);
        } else {
            result.setForeground(Color.black);

        }
        return result;
    }
}
