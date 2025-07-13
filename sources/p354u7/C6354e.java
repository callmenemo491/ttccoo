package p354u7;

/* renamed from: u7.e */
/* loaded from: classes.dex */
public class C6354e extends android.util.Property<android.widget.ImageView, android.graphics.Matrix> {

    /* renamed from: a */
    public final android.graphics.Matrix f24811a;

    public C6354e() {
            r2 = this;
            java.lang.Class<android.graphics.Matrix> r0 = android.graphics.Matrix.class
            java.lang.String r1 = "imageMatrixProperty"
            r2.<init>(r0, r1)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f24811a = r0
            return
    }

    @Override // android.util.Property
    public android.graphics.Matrix get(android.widget.ImageView r2) {
            r1 = this;
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.Matrix r0 = r1.f24811a
            android.graphics.Matrix r2 = r2.getImageMatrix()
            r0.set(r2)
            android.graphics.Matrix r2 = r1.f24811a
            return r2
    }

    @Override // android.util.Property
    public void set(android.widget.ImageView r1, android.graphics.Matrix r2) {
            r0 = this;
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            r1.setImageMatrix(r2)
            return
    }
}
