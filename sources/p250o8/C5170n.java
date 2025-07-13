package p250o8;

import p250o8.AbstractC5159c;

/* renamed from: o8.n */
/* loaded from: classes.dex */
public final class C5170n<S extends p250o8.AbstractC5159c> extends p250o8.AbstractC5168l {

    /* renamed from: j0 */
    public p250o8.AbstractC5169m<S> f20278j0;

    /* renamed from: k0 */
    public p194l.AbstractC4151b f20279k0;

    public C5170n(android.content.Context r1, p250o8.AbstractC5159c r2, p250o8.AbstractC5169m<S> r3, p194l.AbstractC4151b r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f20278j0 = r3
            r3.f20277b = r0
            r0.f20279k0 = r4
            r4.f17200a = r0
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r11) {
            r10 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r1 = r10.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5a
            boolean r1 = r10.isVisible()
            if (r1 == 0) goto L5a
            boolean r0 = r11.getClipBounds(r0)
            if (r0 != 0) goto L1c
            goto L5a
        L1c:
            r11.save()
            o8.m<S extends o8.c> r0 = r10.f20278j0
            float r1 = r10.m11483c()
            S extends o8.c r2 = r0.f20276a
            r2.mo11470a()
            r0.mo11471a(r11, r1)
            o8.m<S extends o8.c> r0 = r10.f20278j0
            android.graphics.Paint r1 = r10.f20274g0
            r0.mo11473c(r11, r1)
            r0 = 0
        L35:
            l.b r1 = r10.f20279k0
            s.h<i0.c, android.view.SubMenu> r2 = r1.f17202c
            int[] r2 = (int[]) r2
            int r3 = r2.length
            if (r0 >= r3) goto L57
            o8.m<S extends o8.c> r4 = r10.f20278j0
            android.graphics.Paint r6 = r10.f20274g0
            s.h<i0.b, android.view.MenuItem> r1 = r1.f17201b
            float[] r1 = (float[]) r1
            int r3 = r0 * 2
            r7 = r1[r3]
            int r3 = r3 + 1
            r8 = r1[r3]
            r9 = r2[r0]
            r5 = r11
            r4.mo11472b(r5, r6, r7, r8, r9)
            int r0 = r0 + 1
            goto L35
        L57:
            r11.restore()
        L5a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            o8.m<S extends o8.c> r0 = r1.f20278j0
            int r0 = r0.mo11474d()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            o8.m<S extends o8.c> r0 = r1.f20278j0
            int r0 = r0.mo11475e()
            return r0
    }

    @Override // p250o8.AbstractC5168l
    /* renamed from: i */
    public boolean mo11478i(boolean r3, boolean r4, boolean r5) {
            r2 = this;
            boolean r4 = super.mo11478i(r3, r4, r5)
            boolean r0 = r2.isRunning()
            if (r0 != 0) goto Lf
            l.b r0 = r2.f20279k0
            r0.mo9197c()
        Lf:
            o8.a r0 = r2.f20268a0
            android.content.Context r1 = r2.f20266Y
            android.content.ContentResolver r1 = r1.getContentResolver()
            float r0 = r0.m11466a(r1)
            if (r3 == 0) goto L2f
            if (r5 != 0) goto L2a
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r3 > r5) goto L2f
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2f
        L2a:
            l.b r3 = r2.f20279k0
            r3.mo9204j()
        L2f:
            return r4
    }
}
