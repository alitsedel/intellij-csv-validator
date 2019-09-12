package net.seesharpsoft.intellij.plugins.csv.editor.table.api;

import net.seesharpsoft.intellij.plugins.csv.editor.table.CsvTableEditor;

public interface TableActions<T extends CsvTableEditor> {

    void addRow(T tableEditor, boolean before);

    void addColumn(T tableEditor, boolean before);

    void deleteSelectedRows(T tableEditor);

    void deleteSelectedColumns(T tableEditor);

    default void adjustColumnWidths(T tableEditor) {
        tableEditor.adjustAllColumnWidths();
    }

    default void resetColumnWidths(T tableEditor) {
        tableEditor.resetAllColumnWidths();
    }
}
