package com.springframe.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName ObscenityRemovingBeanFactoryPostProcessor
 * @Description TODO
 * @Author liangxp
 * @Date 2020/8/14 11:12
 **/
public class ObscenityRemovingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	private Set<String> obscenties;

	public ObscenityRemovingBeanFactoryPostProcessor() {
		this.obscenties = new HashSet<>();
	}

	public Set<String> getObscenties() {
		return obscenties;
	}

	public void setObscenties(Set<String> obscenties) {
		this.obscenties.clear();
		for (String obscenity : obscenties) {
			this.obscenties.add(obscenity.toUpperCase());
		}
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanNames = beanFactory.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
			StringValueResolver valueResolver = new StringValueResolver() {
				@Override
				public String resolveStringValue(String strVal) {
					if (isObscene(strVal)) {
						return "********";
					} else {
						return strVal;
					}
				}
			};
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
			visitor.visitBeanDefinition(beanDefinition);
		}
	}

	private boolean isObscene(String strVal) {
		String upperCase = strVal.toString().toUpperCase();
		return this.obscenties.contains(upperCase);
	}
}
