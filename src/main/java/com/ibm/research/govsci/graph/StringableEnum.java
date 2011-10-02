/*
 * StringableEnum.java
 * 
 * A simple interface that indicates that an enum possesses the toString
 * method. Very useful for creating enums that allow for edge and
 * vertex creation.
 * 
 * Copyright (c) 2011 IBM Corporation
 *
 * This library was originally developed for a joint research
 * project with the University of Nebraska, Lincoln under terms
 * of the Joint Study Agreement between IBM and UNL.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Patrick Wagstrom <patrick@wagstrom.net>
 */

package com.ibm.research.govsci.graph;

public interface StringableEnum {
	public String toString();
}
