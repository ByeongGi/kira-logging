package kirarepository.common.logging.core;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kira on 2016-03-20.
 */
public class Sample {

    final Logger logger = LoggerFactory.getLogger(Sample.class);

    @Test
    public void run(){

        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }


}
