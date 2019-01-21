package com.location.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

import javafx.scene.chart.PieChart;
@Component
public class ReportUtilImpl implements ReportUtil {

	
	@Override
	public void genratedPieChart(String path, List<Object[]> data) {
    
		DefaultPieDataset dataset= new DefaultPieDataset();
		
		for(Object[] obj : data) {
			 dataset.setValue(obj[0].toString() , new Double(obj[1].toString()));
	
         			
		}
	JFreeChart chart= ChartFactory.createPieChart3D("location path ", dataset, false, false, null);
	
	
	
	try {
		ChartUtilities.saveChartAsJPEG(new File(path + 	"/pieChart.jpeg"), chart, 300, 300);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
	}
	
	
}
