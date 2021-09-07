package com.tiansu.ltc.executor.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

/**
 * demo-Job
 * @author Chris
 * @date 2020-04-02 16:20
 */
@Component
@JobHandler("todoRetryRateJob")
public class DemoJob extends IJobHandler {
    @Override
    public ReturnT<String> execute(String s) throws Exception {
        return null;
    }



}
