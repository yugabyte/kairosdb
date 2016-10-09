/*
 * Copyright 2016 KairosDB Authors
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.kairosdb.datastore.h2.orm;

import org.agileclick.genorm.runtime.GenOrmQueryRecord;

/**
	This class has been automatically generated by GenORMous.  This file is for
	adding custom code to.  This file will not be regenerated once it exists.

	Returns the metric ids for a specified query. In essence this the initial rows returned.
*/
public interface MetricIdResults extends GenOrmQueryRecord
{
	public String getMetricId();
	public String getType();
}
