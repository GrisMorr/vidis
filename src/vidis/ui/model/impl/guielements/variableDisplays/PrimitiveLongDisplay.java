package vidis.ui.model.impl.guielements.variableDisplays;

import javax.media.opengl.GL;

import org.apache.log4j.Logger;

import vidis.data.var.AVariable;

public class PrimitiveLongDisplay extends Display {
	private static Logger logger = Logger.getLogger(PrimitiveLongDisplay.class);

	public PrimitiveLongDisplay ( AVariable v) {
		super(v);
		this.setText( "Label" );
	}
	
//	@Override
//	public Display newInstance( AVariable var ) {
//		return new PrimitiveLongDisplay( var );
//	}
	
	
	@Override
	public void renderContainer(GL gl) {
		if ( var != null ) {
			String txt = "   " + var.getIdentifierWithoutNamespace() + " -> ";
			Object num = var.getData();
			if (Long.class.isAssignableFrom(num.getClass()) || num.getClass().equals(Long.TYPE)) {
				txt += (Long)num;
			} else {
				txt += "NAN";
			}
			//var.getData().toString();
			this.setText(txt);
			super.renderContainer(gl);
		}
	}
//	@Override
//	public void renderContainer(GL gl) {
//		String txt = var.getIdentifier() + " -> " + var.getData().toString();
//		double scale = 0.01;
//		height = textH * scale;
//		double hoffset = height / 2d;
//		gl.glPushMatrix();
//			gl.glTranslated(0, 0, 0);
//			gl.glScaled( scale, scale, scale );
//			textRenderer.begin3DRendering();
//			textRenderer.setUseVertexArrays(false);
//			textRenderer.draw3D( txt, 0f, 0f, 0f, 1f );
//			textRenderer.end3DRendering();
//		gl.glPopMatrix();
//		//super.renderContainer(gl);
//	}

}
