package p250o8;

import p250o8.AbstractC5159c;

/* renamed from: o8.i */
/* loaded from: classes.dex */
public final class C5165i<S extends p250o8.AbstractC5159c> extends p250o8.AbstractC5168l {

    /* renamed from: o0 */
    public static final p366v0.AbstractC6484c<p250o8.C5165i> f20257o0 = null;

    /* renamed from: j0 */
    public p250o8.AbstractC5169m<S> f20258j0;

    /* renamed from: k0 */
    public final p366v0.C6486e f20259k0;

    /* renamed from: l0 */
    public final p366v0.C6485d f20260l0;

    /* renamed from: m0 */
    public float f20261m0;

    /* renamed from: n0 */
    public boolean f20262n0;

    /* renamed from: o8.i$a */
    public static class a extends p366v0.AbstractC6484c<p250o8.C5165i> {
        public a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p366v0.AbstractC6484c
        /* renamed from: f */
        public float mo11479f(p250o8.C5165i r2) {
                r1 = this;
                o8.i r2 = (p250o8.C5165i) r2
                float r2 = r2.f20261m0
                r0 = 1176256512(0x461c4000, float:10000.0)
                float r2 = r2 * r0
                return r2
        }

        @Override // p366v0.AbstractC6484c
        /* renamed from: h */
        public void mo11480h(p250o8.C5165i r2, float r3) {
                r1 = this;
                o8.i r2 = (p250o8.C5165i) r2
                r0 = 1176256512(0x461c4000, float:10000.0)
                float r3 = r3 / r0
                r2.f20261m0 = r3
                r2.invalidateSelf()
                return
        }
    }

    static {
            o8.i$a r0 = new o8.i$a
            java.lang.String r1 = "indicatorLevel"
            r0.<init>(r1)
            p250o8.C5165i.f20257o0 = r0
            return
    }

    public C5165i(android.content.Context r3, p250o8.AbstractC5159c r4, p250o8.AbstractC5169m<S> r5) {
            r2 = this;
            r2.<init>(r3, r4)
            r3 = 0
            r2.f20262n0 = r3
            r2.f20258j0 = r5
            r5.f20277b = r2
            v0.e r4 = new v0.e
            r4.<init>()
            r2.f20259k0 = r4
            r5 = 1065353216(0x3f800000, float:1.0)
            double r0 = (double) r5
            r4.f25154b = r0
            r4.f25155c = r3
            r3 = 1112014848(0x42480000, float:50.0)
            r4.m13174a(r3)
            v0.d r3 = new v0.d
            v0.c<o8.i> r0 = p250o8.C5165i.f20257o0
            r3.<init>(r2, r0)
            r2.f20260l0 = r3
            r3.f25151r = r4
            float r3 = r2.f20273f0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L33
            r2.f20273f0 = r5
            r2.invalidateSelf()
        L33:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r9) {
            r8 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r1 = r8.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4f
            boolean r1 = r8.isVisible()
            if (r1 == 0) goto L4f
            boolean r0 = r9.getClipBounds(r0)
            if (r0 != 0) goto L1c
            goto L4f
        L1c:
            r9.save()
            o8.m<S extends o8.c> r0 = r8.f20258j0
            float r1 = r8.m11483c()
            S extends o8.c r2 = r0.f20276a
            r2.mo11470a()
            r0.mo11471a(r9, r1)
            o8.m<S extends o8.c> r0 = r8.f20258j0
            android.graphics.Paint r1 = r8.f20274g0
            r0.mo11473c(r9, r1)
            o8.c r0 = r8.f20267Z
            int[] r0 = r0.f20231c
            r1 = 0
            r0 = r0[r1]
            int r1 = r8.f20275h0
            int r7 = p124h7.C2939x3.m7284j(r0, r1)
            o8.m<S extends o8.c> r2 = r8.f20258j0
            android.graphics.Paint r4 = r8.f20274g0
            r5 = 0
            float r6 = r8.f20261m0
            r3 = r9
            r2.mo11472b(r3, r4, r5, r6, r7)
            r9.restore()
        L4f:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            o8.m<S extends o8.c> r0 = r1.f20258j0
            int r0 = r0.mo11474d()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            o8.m<S extends o8.c> r0 = r1.f20258j0
            int r0 = r0.mo11475e()
            return r0
    }

    @Override // p250o8.AbstractC5168l
    /* renamed from: i */
    public boolean mo11478i(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            boolean r2 = super.mo11478i(r2, r3, r4)
            o8.a r3 = r1.f20268a0
            android.content.Context r4 = r1.f20266Y
            android.content.ContentResolver r4 = r4.getContentResolver()
            float r3 = r3.m11466a(r4)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L19
            r3 = 1
            r1.f20262n0 = r3
            goto L24
        L19:
            r4 = 0
            r1.f20262n0 = r4
            v0.e r4 = r1.f20259k0
            r0 = 1112014848(0x42480000, float:50.0)
            float r0 = r0 / r3
            r4.m13174a(r0)
        L24:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r2 = this;
            v0.d r0 = r2.f20260l0
            r0.m13164b()
            int r0 = r2.getLevel()
            float r0 = (float) r0
            r1 = 1176256512(0x461c4000, float:10000.0)
            float r0 = r0 / r1
            r2.f20261m0 = r0
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r9) {
            r8 = this;
            boolean r0 = r8.f20262n0
            r1 = 1176256512(0x461c4000, float:10000.0)
            r2 = 1
            if (r0 == 0) goto L16
            v0.d r0 = r8.f20260l0
            r0.m13164b()
            float r9 = (float) r9
            float r9 = r9 / r1
            r8.f20261m0 = r9
            r8.invalidateSelf()
            goto Lc6
        L16:
            v0.d r0 = r8.f20260l0
            float r3 = r8.f20261m0
            float r3 = r3 * r1
            r0.f25138b = r3
            r0.f25139c = r2
            float r9 = (float) r9
            boolean r1 = r0.f25142f
            if (r1 == 0) goto L29
            r0.f25152s = r9
            goto Lc6
        L29:
            v0.e r1 = r0.f25151r
            if (r1 != 0) goto L34
            v0.e r1 = new v0.e
            r1.<init>(r9)
            r0.f25151r = r1
        L34:
            v0.e r1 = r0.f25151r
            double r3 = (double) r9
            r1.f25161i = r3
            float r9 = (float) r3
            double r3 = (double) r9
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
            double r5 = (double) r9
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto Ld7
            float r5 = r0.f25143g
            double r5 = (double) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto Lcf
            float r3 = r0.f25145i
            r4 = 1061158912(0x3f400000, float:0.75)
            float r3 = r3 * r4
            double r3 = (double) r3
            double r3 = java.lang.Math.abs(r3)
            r1.f25156d = r3
            r5 = 4633992910331707392(0x404f400000000000, double:62.5)
            double r3 = r3 * r5
            r1.f25157e = r3
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r1 != r3) goto Lc7
            boolean r1 = r0.f25142f
            if (r1 != 0) goto Lc6
            if (r1 != 0) goto Lc6
            r0.f25142f = r2
            boolean r1 = r0.f25139c
            if (r1 != 0) goto L80
            v0.c r1 = r0.f25141e
            java.lang.Object r3 = r0.f25140d
            float r1 = r1.mo11479f(r3)
            r0.f25138b = r1
        L80:
            float r1 = r0.f25138b
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 > 0) goto Lbe
            float r9 = r0.f25143g
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbe
            v0.a r9 = p366v0.C6482a.m13160a()
            java.util.ArrayList<v0.a$b> r1 = r9.f25121b
            int r1 = r1.size()
            if (r1 != 0) goto Lb0
            v0.a$c r1 = r9.f25123d
            if (r1 != 0) goto La5
            v0.a$d r1 = new v0.a$d
            v0.a$a r3 = r9.f25122c
            r1.<init>(r3)
            r9.f25123d = r1
        La5:
            v0.a$c r1 = r9.f25123d
            v0.a$d r1 = (p366v0.C6482a.d) r1
            android.view.Choreographer r3 = r1.f25128b
            android.view.Choreographer$FrameCallback r1 = r1.f25129c
            r3.postFrameCallback(r1)
        Lb0:
            java.util.ArrayList<v0.a$b> r1 = r9.f25121b
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto Lc6
            java.util.ArrayList<v0.a$b> r9 = r9.f25121b
            r9.add(r0)
            goto Lc6
        Lbe:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Starting value need to be in between min value and max value"
            r9.<init>(r0)
            throw r9
        Lc6:
            return r2
        Lc7:
            android.util.AndroidRuntimeException r9 = new android.util.AndroidRuntimeException
            java.lang.String r0 = "Animations may only be started on the main thread"
            r9.<init>(r0)
            throw r9
        Lcf:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Final position of the spring cannot be less than the min value."
            r9.<init>(r0)
            throw r9
        Ld7:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Final position of the spring cannot be greater than the max value."
            r9.<init>(r0)
            throw r9
    }
}
