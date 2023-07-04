package edu.scu.pzhlsm.service.datastatisticanalysisservice;

import edu.scu.pzhlsm.dao.basicinfomgmtdao.ResourceDao;
import edu.scu.pzhlsm.dao.basicinfomgmtdao.StaffDao;
import edu.scu.pzhlsm.dao.carrepairmgmtdao.CarRepairRecordsDAO;
import edu.scu.pzhlsm.dao.carrepairmgmtdao.RepairWorkerMaintenanceRecordsDAO;
import edu.scu.pzhlsm.dao.purchaseandsalemgmtdao.*;
import edu.scu.pzhlsm.dao.transscheduledao.BusinessRecordDAO;
import edu.scu.pzhlsm.dao.transscheduledao.RailwayMissionRecordDAO;
import edu.scu.pzhlsm.pojo.basicinfomgmtpojo.Staff;
import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.CarRepairRecord;
import edu.scu.pzhlsm.pojo.carrepairmgmtpojo.RepairWorkerMaintenanceRecord;
import edu.scu.pzhlsm.pojo.purchaseandsalemgmtpojo.*;
import edu.scu.pzhlsm.pojo.transschedulepojo.BusinessRecord;
import edu.scu.pzhlsm.pojo.transschedulepojo.RailwayMissionRecord;
import edu.scu.pzhlsm.result.ProfitResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class OutputValueProfitService {
    @Autowired
    private StaffDao staffDao;
    @Autowired
    private OfficeConsumableDao officeConsumableDao;
    @Autowired
    private MaterialDao materialDao;
    @Autowired
    private VehiclepsiDao vehiclepsiDao;
    @Autowired
    private CommodityDao commodityDao;
    @Autowired
    private BuildingTransactionRecordsDAO buildingTransactionRecordsDAO;
    @Autowired
    private CarRepairRecordsDAO carRepairRecordsDAO;
    @Autowired
    private RepairWorkerMaintenanceRecordsDAO repairWorkerMaintenanceRecordsDAO;
    @Autowired
    private BusinessRecordDAO businessRecordDAO;
    @Autowired
    private RailwayMissionRecordDAO railwayMissionRecordDAO;

    public List<Double> getOutputValueProfitByDates(List<String> dates) {
        try {
            List<Double> profit = new ArrayList<>();
            for (String date : dates) {
                double earning = 0.0;
                double expenditure = 0.0;

                List<Staff> staffList = staffDao.queryAllList();
                for (Staff staff : staffList) {
                    expenditure += staff.getSalary();
                }

                List<OfficeConsumable> officeConsumableList = officeConsumableDao.queryOfficeConsumables();
                for (OfficeConsumable officeConsumable : officeConsumableList) {
                    if (Objects.equals(date, officeConsumable.getCreateTime().substring(0, 7))) {
                        expenditure += (officeConsumable.getPerPrice() * officeConsumable.getPurchaseQuantity());
                    }
                }

                List<MaterialPsi> materialPsiList = materialDao.queryAllList();
                for (MaterialPsi materialPsi : materialPsiList) {
                    if (Objects.equals(date, materialPsi.getCreateTime().substring(0, 7))) {
                        if (materialPsi.getMaterialStatus() == 0) {
                            expenditure += (materialPsi.getMaterialPrice() * materialPsi.getMaterialQuantity());
                        } else if (materialPsi.getMaterialStatus() == 1) {
                            earning += (materialPsi.getMaterialPrice() * materialPsi.getMaterialQuantity());
                        }
                    }
                }

                List<VehiclePsi> vehiclePsiList = vehiclepsiDao.queryAllList();
                for (VehiclePsi vehiclePsi : vehiclePsiList) {
                    if (Objects.equals(date, vehiclePsi.getCreateTime().substring(0, 7))) {
                        if (vehiclePsi.getVehicleStatus() == 0) {
                            expenditure += (vehiclePsi.getVehiclePrice() * vehiclePsi.getVehicleQuantity());
                        } else if (vehiclePsi.getVehicleStatus() == 1) {
                            earning += (vehiclePsi.getVehiclePrice() * vehiclePsi.getVehicleQuantity());
                        }
                    }
                }

                List<CommodityPsi> commodityPsiList = commodityDao.queryAllList();
                for (CommodityPsi commodityPsi : commodityPsiList) {
                    if (Objects.equals(date, commodityPsi.getCreateTime().substring(0, 7))) {
                        if (commodityPsi.getCommodityStatus() == 0) {
                            expenditure += (commodityPsi.getCommodityPrice() * commodityPsi.getCommodityQuantity());
                        } else if (commodityPsi.getCommodityStatus() == 1) {
                            earning += (commodityPsi.getCommodityPrice() * commodityPsi.getCommodityQuantity());
                        }
                    }
                }

                List<BuildingTransactionRecord> buildingTransactionRecordList = buildingTransactionRecordsDAO.findAll();
                for (BuildingTransactionRecord buildingTransactionRecord : buildingTransactionRecordList) {
                    if (Objects.equals(date, buildingTransactionRecord.getTransactionDate().substring(0, 7))) {
                        earning += (buildingTransactionRecord.getTransactionPrice() * buildingTransactionRecord.getLeaseTerm());
                    }
                }

                List<CarRepairRecord> carRepairRecordList = carRepairRecordsDAO.findAll();
                for (CarRepairRecord carRepairRecord : carRepairRecordList) {
                    if (Objects.equals(date, carRepairRecord.getRepairDate().substring(0, 7))) {
                        expenditure += carRepairRecord.getRepairCost();
                    }
                }

                List<RepairWorkerMaintenanceRecord> repairWorkerMaintenanceRecordList = repairWorkerMaintenanceRecordsDAO.findAll();
                for (RepairWorkerMaintenanceRecord repairWorkerMaintenanceRecord : repairWorkerMaintenanceRecordList) {
                    if (Objects.equals(date, repairWorkerMaintenanceRecord.getMaintenanceDate().substring(0, 7))) {
                        expenditure += repairWorkerMaintenanceRecord.getMaintenanceCost();
                    }
                }

                List<BusinessRecord> businessRecordList = businessRecordDAO.selectAll();
                for (BusinessRecord businessRecord : businessRecordList) {
                    if (businessRecord.getstate() == 2) {
                        earning += businessRecord.getmissionPrice();
                    }
                }

                List<RailwayMissionRecord> railwayMissionRecordList = railwayMissionRecordDAO.selectAll();
                for (RailwayMissionRecord railwayMissionRecord : railwayMissionRecordList) {
                    if (Objects.equals(date, railwayMissionRecord.getMissionFinishTime().substring(0, 7)) &&
                            railwayMissionRecord.getState() == 2) {
                        earning += railwayMissionRecord.getMissionPrice();
                    }
                }

                profit.add(earning - expenditure);
            }
            return profit;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
