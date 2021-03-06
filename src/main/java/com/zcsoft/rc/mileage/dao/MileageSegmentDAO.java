package com.zcsoft.rc.mileage.dao;


import com.zcsoft.rc.mileage.model.entity.MileageSegment;
import com.zcsoft.rc.common.dao.BaseDAO;


public interface MileageSegmentDAO extends BaseDAO<MileageSegment,java.lang.String> {

    /**
     * 根据坐标查询
     * @param longitude
     * @return
     */
    MileageSegment queryByStartLongitudeEndLongitude(double longitude);

}
