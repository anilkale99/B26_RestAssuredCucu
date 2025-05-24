package post_basic;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("post_basic")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/resources/post_basic_FF/PostCreateUser.feature")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "post_basic")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/cucumber.html")
@ConfigurationParameter(key = Constants.PARALLEL_CONFIG_FIXED_PARALLELISM_PROPERTY_NAME,value = "1")
@ConfigurationParameter(key = Constants.PARALLEL_CONFIG_STRATEGY_PROPERTY_NAME,value = "fixed")
@ConfigurationParameter(key = Constants.PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME,value = "false")

public class PostRunnerBasic {

}
