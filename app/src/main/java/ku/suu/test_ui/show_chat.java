package ku.suu.test_ui;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.chart.PointStyle;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class show_chat extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    /*** A placeholder fragment containing a simple view.*/
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {}

        private View mView;
        private GraphicalView mGraphView;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment, container, false);
            mView = rootView;
            initData();
            return rootView;
        }//OnCreate

        private void initData() {
            String[] months = {
                    "A", "B", "B", "C", "D"
            };

            int[] index = {1, 2, 3, 4, 5};

            int[] incomeA = {2,3,5,4,0};
            int[] incomeB = {3,2,3,1,5};


            XYSeries seriesA = new XYSeries("Left");
            XYSeries seriesB = new XYSeries("Right");


            int length = index.length;
            for (int i = 0; i < length; i++) {
                seriesA.add(index[i], incomeA[i]);
                seriesB.add(index[i], incomeB[i]);
            }

            XYSeriesRenderer rendererA = new XYSeriesRenderer();
            rendererA.setPointStyle(PointStyle.CIRCLE);
            rendererA.setColor(Color.RED);
            rendererA.setLineWidth(2);

            XYSeriesRenderer rendererB = new XYSeriesRenderer();
            rendererB.setPointStyle(PointStyle.X);
            rendererB.setColor(Color.BLUE);
            rendererB.setLineWidth(2);

            XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
            dataset.addSeries(seriesA);
            dataset.addSeries(seriesB);



            XYMultipleSeriesRenderer multipleSeriesRenderer
                    = new XYMultipleSeriesRenderer();

            for (int i = 0; i < length; i++) {
                multipleSeriesRenderer.addXTextLabel(i + 1, months[i]);
            }
            multipleSeriesRenderer.setChartTitle("ข้อมูลกราฟ");
            multipleSeriesRenderer.setYTitle("ระดับความดังในการได้ยิน");
            multipleSeriesRenderer.setXTitle("ความถีในการได้ยิน");
            multipleSeriesRenderer.setZoomButtonsVisible(true);

            multipleSeriesRenderer.setXLabels(0);
            multipleSeriesRenderer.setBackgroundColor(Color.WHITE);
            multipleSeriesRenderer.setApplyBackgroundColor(true);
            multipleSeriesRenderer.setMarginsColor(Color.WHITE);
            multipleSeriesRenderer.setLabelsColor(Color.BLACK);
            multipleSeriesRenderer.setAxesColor(Color.GRAY);
            multipleSeriesRenderer.setYLabelsColor(0, Color.BLACK);
            multipleSeriesRenderer.setXLabelsColor(Color.BLACK);

            multipleSeriesRenderer.addSeriesRenderer(rendererA);
            multipleSeriesRenderer.addSeriesRenderer(rendererB);

            drawChart(dataset, multipleSeriesRenderer);
        }

        private void drawChart(XYMultipleSeriesDataset dataset,
                               XYMultipleSeriesRenderer renderer) {

            if (null == mGraphView) {
                mGraphView =
                        ChartFactory.getLineChartView(getActivity(), dataset, renderer);

                RelativeLayout container =
                        (RelativeLayout) mView.findViewById(R.id.graph_container);

                container.addView(mGraphView);
            } else {
                mGraphView.repaint();
            }
        }

    }

}
