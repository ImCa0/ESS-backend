package cn.imcao.ess.service.task;

import cn.imcao.ess.entity.task.TaskDO;
import cn.imcao.ess.entity.task.TaskRequestVO;

import java.util.List;

/**
 * @author ImCaO
 * @description 制造任务服务接口
 * @date Created at 2021/12/15 19:22
 */
public interface TaskService {

    /**
     * 查询待接受任务
     * @param eId 企业 ID
     * @param taskRequest 制造任务请求 VO
     * @return 待接受任务列表
     */
    List<TaskDO> queryToBeAcceptedList(int eId, TaskRequestVO taskRequest);

    /**
     * 查询待接受任务总数
     * @param eId 企业 ID
     * @return 待接受任务总数
     */
    int queryToBeAcceptedTotal(int eId);

    /**
     * 接受任务
     * @param task 制造任务实体 DO
     * @return 成功返回 1，失败返回 0
     */
    int accept(TaskDO task);

    /**
     * 拒绝任务
     * @param task 制造任务实体 DO
     * @return 成功返回 1，失败返回 0
     */
    int decline(TaskDO task);

    /**
     * 查询正在加工任务
     * @param eId 企业 ID
     * @param taskRequest 制造任务请求 VO
     * @return 正在加工任务列表
     */
    List<TaskDO> queryProcessingList(int eId, TaskRequestVO taskRequest);

    /**
     * 查询正在加工任务总数
     * @param eId 企业 ID
     * @return 正在加工任务总数
     */
    int queryProcessingTotal(int eId);

    /**
     * 查询已完成任务
     * @param eId 企业 ID
     * @param taskRequest 制造任务请求 VO
     * @return 已完成任务列表
     */
    List<TaskDO> queryCompletedList(int eId, TaskRequestVO taskRequest);

    /**
     * 查询已完成任务总数
     * @param eId 企业 ID
     * @return 已完成任务总数
     */
    int queryCompletedTotal(int eId);

    /**
     * 查询最近 6 个任务，用于首页展示
     * @return 最近 6 个任务
     */
    List<TaskDO> query6Tasks(int eId);
}