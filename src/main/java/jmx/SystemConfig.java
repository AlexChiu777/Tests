package jmx;

/**
 * Created by Alex on 5/4/2015.
 */
public class SystemConfig implements SystemConfigMBean {
    private int threadCount;
    private String schemaName;

    public SystemConfig (int threadCount, String schemaName) {
        this.schemaName = schemaName;
        this.threadCount = threadCount;
    }

    @Override
    public void setThreadCount(int count) {
        this.threadCount = count;
    }

    @Override
    public int getThreadCount() {
        return threadCount;
    }

    @Override
    public void setSchemaName(String name) {
        this.schemaName = name;
    }

    @Override
    public String getSchemaName() {
        return schemaName;
    }

    @Override
    public String doConfg() {
        return "No of threads - " + threadCount + " on Schema Name " + schemaName;
    }
}
