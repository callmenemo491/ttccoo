package com.github.mikephil.charting.charts;

/* loaded from: classes.dex */
public class LineChart extends p161j3.AbstractC3394b<p198l3.C4173g> implements p245o3.InterfaceC4890c {
    public LineChart(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // p161j3.AbstractC3394b, p161j3.AbstractC3395c
    /* renamed from: g */
    public void mo2800g() {
            r3 = this;
            super.mo2800g()
            r3.e r0 = new r3.e
            i3.a r1 = r3.f14654u0
            s3.g r2 = r3.f14653t0
            r0.<init>(r3, r1, r2)
            r3.f14651r0 = r0
            return
    }

    @Override // p245o3.InterfaceC4890c
    public p198l3.C4173g getLineData() {
            r1 = this;
            T extends l3.d<? extends p3.d<? extends l3.f>> r0 = r1.f14635b0
            l3.g r0 = (p198l3.C4173g) r0
            return r0
    }

    @Override // p161j3.AbstractC3395c, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r3 = this;
            r3.c r0 = r3.f14651r0
            if (r0 == 0) goto L2a
            boolean r1 = r0 instanceof p303r3.C5775e
            if (r1 == 0) goto L2a
            r3.e r0 = (p303r3.C5775e) r0
            android.graphics.Canvas r1 = r0.f22267k
            r2 = 0
            if (r1 == 0) goto L14
            r1.setBitmap(r2)
            r0.f22267k = r2
        L14:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r1 = r0.f22266j
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r1.get()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L23
            r1.recycle()
        L23:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r1 = r0.f22266j
            r1.clear()
            r0.f22266j = r2
        L2a:
            super.onDetachedFromWindow()
            return
    }
}
