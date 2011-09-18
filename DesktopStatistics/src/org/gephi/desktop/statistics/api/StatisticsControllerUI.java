/*
Copyright 2008-2010 Gephi
Authors : Mathieu Bastian <mathieu.bastian@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.desktop.statistics.api;

import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsUI;
import org.gephi.utils.longtask.api.LongTaskListener;
import org.gephi.utils.longtask.spi.LongTask;

/**
 * Controller for executing Statistics/Metrics algorithms with UI support.
 * <p>
 * This controller is a service and can therefore be found in Lookup:
 * <pre>StatisticsControllerUI sc = Lookup.getDefault().lookup(StatisticsControllerUI.class);</pre>
 * 
 * @author Mathieu Bastian
 */
public interface StatisticsControllerUI {

    /**
     * Execute the statistics in a background thread.
     * The <code>statistics</code> should implement {@link LongTask}.
     * @param statistics    the statistics algorithm instance
     */
    public void execute(Statistics statistics);
    
    /**
     * Execute the statistics in a background thread an call the listener when finished.
     * The <code>statistics</code> should implement {@link LongTask}.
     * @param statistics    the statistics algorithm instance
     * @param listener      a listener that is notified when execution finished
     */
    public void execute(Statistics statistics, LongTaskListener listener);

    /**
     * Sets the visible state for a given <code>StatisticsUI</code>.
     * @param ui            the UI instance
     * @param visible       <code>true</code> to display the front-end
     */
    public void setStatisticsUIVisible(StatisticsUI ui, boolean visible);
}
