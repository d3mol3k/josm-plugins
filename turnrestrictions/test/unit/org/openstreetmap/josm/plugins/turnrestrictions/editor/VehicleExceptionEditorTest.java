// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.plugins.turnrestrictions.editor;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

import org.junit.jupiter.api.Disabled;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.gui.tagging.TagModel;

/**
 * Simple test application to test the vehicle exception editor
 *
 */
@Disabled("no test")
public class VehicleExceptionEditorTest extends JFrame {
    TurnRestrictionEditorModel model;
    OsmDataLayer layer;
    VehicleExceptionEditor editor;

    protected void build() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        layer = new OsmDataLayer(new DataSet(), "test", null);

        model = new TurnRestrictionEditorModel(layer, new MockNavigationControler());
        editor = new VehicleExceptionEditor(model);
        c.add(editor, BorderLayout.CENTER);

        model.getTagEditorModel().add(new TagModel("except", "non-standard-value"));
    }

    public VehicleExceptionEditorTest() {
        build();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        new VehicleExceptionEditorTest().setVisible(true);
    }

    private static class MockNavigationControler implements NavigationControler {

        @Override
        public void gotoAdvancedEditor() {
            // TODO Auto-generated method stub

        }

        @Override
        public void gotoBasicEditor() {
            // TODO Auto-generated method stub

        }

        @Override
        public void gotoBasicEditor(BasicEditorFokusTargets focusTarget) {
            // TODO Auto-generated method stub

        }
    }
}
