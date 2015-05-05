package jmx;

import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * Created by Alex on 5/4/2015.
 */
public class SystemConfigManagement {
    private static final int DEFAULT_THREAD_COUNT = 10;
    private static final String DEFAULT_SCHEMA = "Default";

    public static void main(String[] args) throws MalformedObjectNameException, InstanceAlreadyExistsException,
            MBeanRegistrationException, NotCompliantMBeanException, InterruptedException {
        //get the MBean server
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        //register the MBean
        SystemConfig mBean = new SystemConfig(DEFAULT_THREAD_COUNT, DEFAULT_SCHEMA);
        ObjectName name = new ObjectName("jmx:type=SystemConfig");
        mbs.registerMBean(mBean, name);

        do {
            Thread.sleep(3000);
            System.out.println("Thread Count =" + mBean.getThreadCount() + " Schema Name = " + mBean.getSchemaName());
        } while (mBean.getThreadCount() != 0);
    }
}
