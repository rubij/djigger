/*******************************************************************************
 * (C) Copyright 2016 Jérôme Comte and Dorian Cransac
 *  
 *  This file is part of djigger
 *  
 *  djigger is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  djigger is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with djigger.  If not, see <http://www.gnu.org/licenses/>.
 *
 *******************************************************************************/
package io.djigger.aggregation;

import java.util.LinkedList;
import java.util.List;

import io.djigger.aggregation.Thread.RealNodePathWrapper;
import io.djigger.ui.model.RealNodePath;


public class Aggregation {

	private final RealNodePath path;

	private final LinkedList<RealNodePathWrapper> samples;

	public Aggregation(RealNodePath path) {
		super();
		samples = new LinkedList<>();
		this.path = path;
	}

	public void addSample(RealNodePathWrapper sample) {
		samples.add(sample);
	}

	public RealNodePath getPath() {
		return path;
	}

	public List<RealNodePathWrapper> getSamples() {
		return samples;
	}
}
