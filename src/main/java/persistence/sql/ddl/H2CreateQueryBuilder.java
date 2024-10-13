package persistence.sql.ddl;

import persistence.sql.ddl.model.DDLColumn;

public class H2CreateQueryBuilder extends AbstractCreateQueryBuilder{

    private static final String LEFT_PARENTHESIS = "(";
    private static final String RIGHT_PARENTHESIS = ")";


    public H2CreateQueryBuilder(Class<?> clazz) {
        super(clazz);
    }

    @Override
    protected String generateColumnDefinitions() {
        DDLColumn ddlColumns = new DDLColumn(super.clazz.getDeclaredFields());

        StringBuilder columnDefinitionStringBuilder = new StringBuilder();
        columnDefinitionStringBuilder.append(LEFT_PARENTHESIS);
        columnDefinitionStringBuilder.append(ddlColumns.makeColumnsDDL());
        columnDefinitionStringBuilder.append(RIGHT_PARENTHESIS);
        return columnDefinitionStringBuilder.toString();
    }
}
