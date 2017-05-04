package com.orrin.erp.manager.demo.job;

import com.bstek.bdf2.job.model.JobDefinition;
import com.bstek.bdf2.job.service.IJobDataService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 定时任务示例
 * @author Orrin on 2017/2/13.
 */

@Service("testJobDataService")
public class TestJobDataService implements IJobDataService {
	@Override
	public List<JobDefinition> filterJobs(List<JobDefinition> jobs) {
		return jobs;
	}
	@Override
	public String getCompanyId() {
		return "bstek";
	}
}