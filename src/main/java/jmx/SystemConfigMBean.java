package jmx;

/**
 * Created by Alex on 5/4/2015.
 */
public interface SystemConfigMBean {
    public void setThreadCount(int count);
    public int getThreadCount();

    public void setSchemaName(String name);
    public String getSchemaName();

    public String doConfg();
}
