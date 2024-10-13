package persistence.sql.ddl;

import jakarta.persistence.Entity;
import persistence.sql.ddl.model.TableName;

public abstract class AbstractCreateQueryBuilder implements CreateQueryBuilder {
    protected final Class<?> clazz;
    private static final String SPACE = " ";

    protected AbstractCreateQueryBuilder(Class<?> clazz) {
        ExceptionUtil.requireNonNull(clazz);

        if (!clazz.isAnnotationPresent(Entity.class)) {
            throw new IllegalArgumentException("Entity 클래스가 아닙니다.");
        }

        this.clazz = clazz;
    }

    private String createTableStatement() {
        TableName tableName = new TableName(clazz);

        StringBuilder createTableSQLStringBuilder = new StringBuilder();
        createTableSQLStringBuilder.append("CREATE TABLE");
        createTableSQLStringBuilder.append(SPACE);
        createTableSQLStringBuilder.append(tableName.getValue());
        return createTableSQLStringBuilder.toString();
    }
    protected abstract String generateColumnDefinitions();

    @Override
    public String makeQuery() {
        return createTableStatement() + generateColumnDefinitions();
    }
}
