package com.nik.location.utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.springframework.stereotype.Component;

@Component
public class ReportUtilityImpl implements ReportUtility {

	@Override
	public void generatePieChart(String path, List<Object[]> data) {
		DefaultPieDataset dataSet = new DefaultPieDataset();

		for (Object[] object : data) {
			dataSet.setValue(object[0].toString(), Double.parseDouble(object[1].toString()));
		}

		JFreeChart chart = ChartFactory.createPieChart3D("Location Type Chart", dataSet, false, false, Locale.ENGLISH);

		try {
			ChartUtilities.saveChartAsJPEG(new File(path), chart, 300, 300);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
