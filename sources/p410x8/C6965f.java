package p410x8;

/* renamed from: x8.f */
/* loaded from: classes.dex */
public class C6965f extends p340t8.C6189f {

    /* renamed from: w0 */
    public final android.graphics.Paint f27208w0;

    /* renamed from: x0 */
    public final android.graphics.RectF f27209x0;

    /* renamed from: y0 */
    public int f27210y0;

    public C6965f() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C6965f(p340t8.C6192i r3) {
            r2 = this;
            if (r3 == 0) goto L3
            goto L8
        L3:
            t8.i r3 = new t8.i
            r3.<init>()
        L8:
            r2.<init>(r3)
            android.graphics.Paint r3 = new android.graphics.Paint
            r0 = 1
            r3.<init>(r0)
            r2.f27208w0 = r3
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r3.setStyle(r0)
            r0 = -1
            r3.setColor(r0)
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DST_OUT
            r0.<init>(r1)
            r3.setXfermode(r0)
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r2.f27209x0 = r3
            return
    }

    @Override // p340t8.C6189f, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.drawable.Drawable$Callback r0 = r9.getCallback()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L16
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getLayerType()
            r2 = 2
            if (r1 == r2) goto L2a
            r1 = 0
            r0.setLayerType(r2, r1)
            goto L2a
        L16:
            r4 = 0
            r5 = 0
            int r0 = r10.getWidth()
            float r6 = (float) r0
            int r0 = r10.getHeight()
            float r7 = (float) r0
            r8 = 0
            r3 = r10
            int r0 = r3.saveLayer(r4, r5, r6, r7, r8)
            r9.f27210y0 = r0
        L2a:
            super.draw(r10)
            android.graphics.RectF r0 = r9.f27209x0
            android.graphics.Paint r1 = r9.f27208w0
            r10.drawRect(r0, r1)
            android.graphics.drawable.Drawable$Callback r0 = r9.getCallback()
            boolean r0 = r0 instanceof android.view.View
            if (r0 != 0) goto L41
            int r0 = r9.f27210y0
            r10.restoreToCount(r0)
        L41:
            return
    }

    /* renamed from: z */
    public void m14125z(float r3, float r4, float r5, float r6) {
            r2 = this;
            android.graphics.RectF r0 = r2.f27209x0
            float r1 = r0.left
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1a
            float r1 = r0.top
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L1a
            float r1 = r0.right
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L1a
            float r1 = r0.bottom
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L20
        L1a:
            r0.set(r3, r4, r5, r6)
            r2.invalidateSelf()
        L20:
            return
    }
}
