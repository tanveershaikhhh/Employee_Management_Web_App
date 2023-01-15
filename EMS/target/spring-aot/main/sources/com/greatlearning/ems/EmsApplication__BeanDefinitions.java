package com.greatlearning.ems;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link EmsApplication}
 */
public class EmsApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'emsApplication'
   */
  public static BeanDefinition getEmsApplicationBeanDefinition() {
    Class<?> beanType = EmsApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(EmsApplication.class);
    beanDefinition.setInstanceSupplier(EmsApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
