/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the applicable 
 * Liferay software end user license agreement ("License Agreement")
 * found on www.liferay.com/legal/eulas. You may also contact Liferay, Inc.
 * for a copy of the License Agreement. You may not use this file except in
 * compliance with the License Agreement. 
 * See the License Agreement for the specific language governing
 * permissions and limitations under the License Agreement, including 
 * but not limited to distribution rights of the Software.
 *
 */

package com.liferay.hu.badge.service.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.hu.badge.service.service.BadgeServiceUtil;

import java.util.Arrays;

/**
 * @author Borkuti Peter
 * @generated
 */
@ProviderType
public class BadgeServiceClpInvoker {
	public BadgeServiceClpInvoker() {
		_methodName24 = "getOSGiServiceIdentifier";

		_methodParameterTypes24 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			return BadgeServiceUtil.getOSGiServiceIdentifier();
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName24;
	private String[] _methodParameterTypes24;
}