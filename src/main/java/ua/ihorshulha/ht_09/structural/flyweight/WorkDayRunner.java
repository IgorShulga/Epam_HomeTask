package ua.ihorshulha.ht_09.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class WorkDayRunner {
    public static void main(String[] args) {
        WorkerFactory workerFactory = new WorkerFactory();

        List<OfficeSlave> officeSlaveList = new ArrayList<>();

        officeSlaveList.add(workerFactory.getOfficeSlave("manager"));
        officeSlaveList.add(workerFactory.getOfficeSlave("manager"));
        officeSlaveList.add(workerFactory.getOfficeSlave("manager"));
        officeSlaveList.add(workerFactory.getOfficeSlave("manager"));
        officeSlaveList.add(workerFactory.getOfficeSlave("manager"));
        officeSlaveList.add(workerFactory.getOfficeSlave("clerk"));
        officeSlaveList.add(workerFactory.getOfficeSlave("clerk"));
        officeSlaveList.add(workerFactory.getOfficeSlave("clerk"));
        officeSlaveList.add(workerFactory.getOfficeSlave("clerk"));
        officeSlaveList.add(workerFactory.getOfficeSlave("clerk"));
        officeSlaveList.add(workerFactory.getOfficeSlave("clerk"));
        officeSlaveList.add(workerFactory.getOfficeSlave("clerk"));

        for(OfficeSlave officeSlave : officeSlaveList){
            officeSlave.officeWork();
        }
    }
}
