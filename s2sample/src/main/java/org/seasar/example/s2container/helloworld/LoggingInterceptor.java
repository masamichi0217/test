package org.seasar.example.s2container.helloworld;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

public class LoggingInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	private Logger logger = Logger.getLogger(LoggingInterceptor.class);

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		Class<?> clazz = getTargetClass(invocation);
		Method method = invocation.getMethod();

		// メソッドの開始ログ
		if (logger.isTraceEnabled()) {
			logger.trace(clazz.getSimpleName() + "#" + method.getName()
					+ "() start");
		}

		Object result = invocation.proceed();

		// メソッドの終了ログ
		if (logger.isTraceEnabled()) {
			logger.trace(clazz.getSimpleName() + "#" + method.getName()
					+ "() end");
		}

		return result;

	}

}
