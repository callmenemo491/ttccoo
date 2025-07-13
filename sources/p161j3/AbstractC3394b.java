package p161j3;

import p198l3.AbstractC4167a;

@android.annotation.SuppressLint({"RtlHardcoded"})
/* renamed from: j3.b */
/* loaded from: classes.dex */
public abstract class AbstractC3394b<T extends p198l3.AbstractC4167a<? extends p267p3.InterfaceC5348b<? extends p198l3.C4172f>>> extends p161j3.AbstractC3395c<T> implements p245o3.InterfaceC4888a {

    /* renamed from: G0 */
    public int f14596G0;

    /* renamed from: H0 */
    public boolean f14597H0;

    /* renamed from: I0 */
    public boolean f14598I0;

    /* renamed from: J0 */
    public boolean f14599J0;

    /* renamed from: K0 */
    public boolean f14600K0;

    /* renamed from: L0 */
    public boolean f14601L0;

    /* renamed from: M0 */
    public boolean f14602M0;

    /* renamed from: N0 */
    public boolean f14603N0;

    /* renamed from: O0 */
    public boolean f14604O0;

    /* renamed from: P0 */
    public android.graphics.Paint f14605P0;

    /* renamed from: Q0 */
    public android.graphics.Paint f14606Q0;

    /* renamed from: R0 */
    public boolean f14607R0;

    /* renamed from: S0 */
    public boolean f14608S0;

    /* renamed from: T0 */
    public boolean f14609T0;

    /* renamed from: U0 */
    public float f14610U0;

    /* renamed from: V0 */
    public boolean f14611V0;

    /* renamed from: W0 */
    public p283q3.InterfaceC5570e f14612W0;

    /* renamed from: X0 */
    public p181k3.C3685i f14613X0;

    /* renamed from: Y0 */
    public p181k3.C3685i f14614Y0;

    /* renamed from: Z0 */
    public p303r3.C5779i f14615Z0;

    /* renamed from: a1 */
    public p303r3.C5779i f14616a1;

    /* renamed from: b1 */
    public p323s3.C5951e f14617b1;

    /* renamed from: c1 */
    public p323s3.C5951e f14618c1;

    /* renamed from: d1 */
    public p303r3.C5778h f14619d1;

    /* renamed from: e1 */
    public long f14620e1;

    /* renamed from: f1 */
    public long f14621f1;

    /* renamed from: g1 */
    public android.graphics.RectF f14622g1;

    /* renamed from: h1 */
    public android.graphics.Matrix f14623h1;

    /* renamed from: i1 */
    public boolean f14624i1;

    /* renamed from: j1 */
    public p323s3.C5948b f14625j1;

    /* renamed from: k1 */
    public p323s3.C5948b f14626k1;

    /* renamed from: l1 */
    public float[] f14627l1;

    public AbstractC3394b(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r3 = 100
            r2.f14596G0 = r3
            r3 = 0
            r2.f14597H0 = r3
            r2.f14598I0 = r3
            r4 = 1
            r2.f14599J0 = r4
            r2.f14600K0 = r4
            r2.f14601L0 = r4
            r2.f14602M0 = r4
            r2.f14603N0 = r4
            r2.f14604O0 = r4
            r2.f14607R0 = r3
            r2.f14608S0 = r3
            r2.f14609T0 = r3
            r4 = 1097859072(0x41700000, float:15.0)
            r2.f14610U0 = r4
            r2.f14611V0 = r3
            r0 = 0
            r2.f14620e1 = r0
            r2.f14621f1 = r0
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r2.f14622g1 = r4
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r2.f14623h1 = r4
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r2.f14624i1 = r3
            r3 = 0
            s3.b r0 = p323s3.C5948b.m12358b(r3, r3)
            r2.f14625j1 = r0
            s3.b r3 = p323s3.C5948b.m12358b(r3, r3)
            r2.f14626k1 = r3
            r3 = 2
            float[] r3 = new float[r3]
            r2.f14627l1 = r3
            return
    }

    @Override // p245o3.InterfaceC4888a
    /* renamed from: a */
    public p323s3.C5951e mo7775a(p181k3.C3685i.a r2) {
            r1 = this;
            k3.i$a r0 = p181k3.C3685i.a.f16312Y
            if (r2 != r0) goto L7
            s3.e r2 = r1.f14617b1
            return r2
        L7:
            s3.e r2 = r1.f14618c1
            return r2
    }

    @Override // p161j3.AbstractC3395c
    /* renamed from: b */
    public void mo7776b() {
            r9 = this;
            boolean r0 = r9.f14624i1
            if (r0 != 0) goto Ldb
            android.graphics.RectF r0 = r9.f14622g1
            r9.m7779l(r0)
            android.graphics.RectF r0 = r9.f14622g1
            float r1 = r0.left
            r2 = 0
            float r1 = r1 + r2
            float r3 = r0.top
            float r3 = r3 + r2
            float r4 = r0.right
            float r4 = r4 + r2
            float r0 = r0.bottom
            float r0 = r0 + r2
            k3.i r2 = r9.f14613X0
            boolean r2 = r2.m8142f()
            if (r2 == 0) goto L2b
            k3.i r2 = r9.f14613X0
            r3.i r5 = r9.f14615Z0
            android.graphics.Paint r5 = r5.f22246e
            float r2 = r2.m8141e(r5)
            float r1 = r1 + r2
        L2b:
            k3.i r2 = r9.f14614Y0
            boolean r2 = r2.m8142f()
            if (r2 == 0) goto L3e
            k3.i r2 = r9.f14614Y0
            r3.i r5 = r9.f14616a1
            android.graphics.Paint r5 = r5.f22246e
            float r2 = r2.m8141e(r5)
            float r4 = r4 + r2
        L3e:
            k3.h r2 = r9.f14642i0
            boolean r5 = r2.f16271a
            if (r5 == 0) goto L5e
            boolean r5 = r2.f16263r
            if (r5 == 0) goto L5e
            int r5 = r2.f16302z
            float r5 = (float) r5
            float r6 = r2.f16273c
            float r5 = r5 + r6
            int r2 = r2.f16301A
            r6 = 2
            if (r2 != r6) goto L55
            float r0 = r0 + r5
            goto L5e
        L55:
            r6 = 1
            if (r2 != r6) goto L59
            goto L5d
        L59:
            r6 = 3
            if (r2 != r6) goto L5e
            float r0 = r0 + r5
        L5d:
            float r3 = r3 + r5
        L5e:
            float r2 = r9.getExtraTopOffset()
            float r2 = r2 + r3
            float r3 = r9.getExtraRightOffset()
            float r3 = r3 + r4
            float r4 = r9.getExtraBottomOffset()
            float r4 = r4 + r0
            float r0 = r9.getExtraLeftOffset()
            float r0 = r0 + r1
            float r1 = r9.f14610U0
            float r1 = p323s3.AbstractC5952f.m12377d(r1)
            s3.g r5 = r9.f14653t0
            float r6 = java.lang.Math.max(r1, r0)
            float r7 = java.lang.Math.max(r1, r2)
            float r8 = java.lang.Math.max(r1, r3)
            float r1 = java.lang.Math.max(r1, r4)
            r5.m12393n(r6, r7, r8, r1)
            boolean r1 = r9.f14634a0
            if (r1 == 0) goto Ldb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "offsetLeft: "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = ", offsetTop: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", offsetRight: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", offsetBottom: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MPAndroidChart"
            android.util.Log.i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Content: "
            r0.append(r2)
            s3.g r2 = r9.f14653t0
            android.graphics.RectF r2 = r2.f22866b
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r1, r0)
        Ldb:
            r9.m7781n()
            r9.m7782o()
            return
    }

    @Override // android.view.View
    public void computeScroll() {
            r12 = this;
            q3.b r0 = r12.f14647n0
            boolean r1 = r0 instanceof p283q3.C5566a
            if (r1 == 0) goto Ld8
            q3.a r0 = (p283q3.C5566a) r0
            s3.c r1 = r0.f21677o0
            float r2 = r1.f22838b
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L19
            float r1 = r1.f22839c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L19
            goto Ld8
        L19:
            long r1 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            s3.c r4 = r0.f21677o0
            float r5 = r4.f22838b
            T extends j3.c<?> r6 = r0.f21684c0
            j3.b r6 = (p161j3.AbstractC3394b) r6
            float r6 = r6.getDragDecelerationFrictionCoef()
            float r6 = r6 * r5
            r4.f22838b = r6
            s3.c r4 = r0.f21677o0
            float r5 = r4.f22839c
            T extends j3.c<?> r6 = r0.f21684c0
            j3.b r6 = (p161j3.AbstractC3394b) r6
            float r6 = r6.getDragDecelerationFrictionCoef()
            float r6 = r6 * r5
            r4.f22839c = r6
            long r4 = r0.f21675m0
            long r4 = r1 - r4
            float r4 = (float) r4
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r5
            s3.c r5 = r0.f21677o0
            float r6 = r5.f22838b
            float r6 = r6 * r4
            float r5 = r5.f22839c
            float r5 = r5 * r4
            s3.c r4 = r0.f21676n0
            float r7 = r4.f22838b
            float r9 = r7 + r6
            r4.f22838b = r9
            float r6 = r4.f22839c
            float r10 = r6 + r5
            r4.f22839c = r10
            r8 = 2
            r11 = 0
            r4 = r1
            r6 = r1
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            T extends j3.c<?> r5 = r0.f21684c0
            j3.b r5 = (p161j3.AbstractC3394b) r5
            boolean r6 = r5.f14601L0
            if (r6 == 0) goto L77
            s3.c r6 = r0.f21676n0
            float r6 = r6.f22838b
            s3.c r7 = r0.f21668f0
            float r7 = r7.f22838b
            float r6 = r6 - r7
            goto L78
        L77:
            r6 = 0
        L78:
            boolean r5 = r5.f14602M0
            if (r5 == 0) goto L85
            s3.c r3 = r0.f21676n0
            float r3 = r3.f22839c
            s3.c r5 = r0.f21668f0
            float r5 = r5.f22839c
            float r3 = r3 - r5
        L85:
            r0.m11848c(r4, r6, r3)
            r4.recycle()
            T extends j3.c<?> r3 = r0.f21684c0
            j3.b r3 = (p161j3.AbstractC3394b) r3
            s3.g r3 = r3.getViewPortHandler()
            android.graphics.Matrix r4 = r0.f21666d0
            T extends j3.c<?> r5 = r0.f21684c0
            r6 = 0
            r3.m12392m(r4, r5, r6)
            r0.f21666d0 = r4
            r0.f21675m0 = r1
            s3.c r1 = r0.f21677o0
            float r1 = r1.f22838b
            float r1 = java.lang.Math.abs(r1)
            double r1 = (double) r1
            r3 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto Ld1
            s3.c r1 = r0.f21677o0
            float r1 = r1.f22839c
            float r1 = java.lang.Math.abs(r1)
            double r1 = (double) r1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto Lbf
            goto Ld1
        Lbf:
            T extends j3.c<?> r1 = r0.f21684c0
            j3.b r1 = (p161j3.AbstractC3394b) r1
            r1.mo7776b()
            T extends j3.c<?> r1 = r0.f21684c0
            j3.b r1 = (p161j3.AbstractC3394b) r1
            r1.postInvalidate()
            r0.m11850f()
            goto Ld8
        Ld1:
            T extends j3.c<?> r0 = r0.f21684c0
            android.util.DisplayMetrics r1 = p323s3.AbstractC5952f.f22855a
            r0.postInvalidateOnAnimation()
        Ld8:
            return
    }

    @Override // p161j3.AbstractC3395c
    /* renamed from: g */
    public void mo2800g() {
            r4 = this;
            super.mo2800g()
            k3.i r0 = new k3.i
            k3.i$a r1 = p181k3.C3685i.a.f16312Y
            r0.<init>(r1)
            r4.f14613X0 = r0
            k3.i r0 = new k3.i
            k3.i$a r1 = p181k3.C3685i.a.f16313Z
            r0.<init>(r1)
            r4.f14614Y0 = r0
            s3.e r0 = new s3.e
            s3.g r1 = r4.f14653t0
            r0.<init>(r1)
            r4.f14617b1 = r0
            s3.e r0 = new s3.e
            s3.g r1 = r4.f14653t0
            r0.<init>(r1)
            r4.f14618c1 = r0
            r3.i r0 = new r3.i
            s3.g r1 = r4.f14653t0
            k3.i r2 = r4.f14613X0
            s3.e r3 = r4.f14617b1
            r0.<init>(r1, r2, r3)
            r4.f14615Z0 = r0
            r3.i r0 = new r3.i
            s3.g r1 = r4.f14653t0
            k3.i r2 = r4.f14614Y0
            s3.e r3 = r4.f14618c1
            r0.<init>(r1, r2, r3)
            r4.f14616a1 = r0
            r3.h r0 = new r3.h
            s3.g r1 = r4.f14653t0
            k3.h r2 = r4.f14642i0
            s3.e r3 = r4.f14617b1
            r0.<init>(r1, r2, r3)
            r4.f14619d1 = r0
            n3.a r0 = new n3.a
            r0.<init>(r4)
            r4.setHighlighter(r0)
            q3.a r0 = new q3.a
            s3.g r1 = r4.f14653t0
            android.graphics.Matrix r1 = r1.f22865a
            r2 = 1077936128(0x40400000, float:3.0)
            r0.<init>(r4, r1, r2)
            r4.f14647n0 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.f14605P0 = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = r4.f14605P0
            r1 = 240(0xf0, float:3.36E-43)
            int r1 = android.graphics.Color.rgb(r1, r1, r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.f14606Q0 = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r4.f14606Q0
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r1)
            android.graphics.Paint r0 = r4.f14606Q0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = p323s3.AbstractC5952f.m12377d(r1)
            r0.setStrokeWidth(r1)
            return
    }

    public p181k3.C3685i getAxisLeft() {
            r1 = this;
            k3.i r0 = r1.f14613X0
            return r0
    }

    public p181k3.C3685i getAxisRight() {
            r1 = this;
            k3.i r0 = r1.f14614Y0
            return r0
    }

    @Override // p161j3.AbstractC3395c, p245o3.InterfaceC4889b, p245o3.InterfaceC4888a
    public /* bridge */ /* synthetic */ p198l3.AbstractC4167a getData() {
            r1 = this;
            l3.d r0 = super.getData()
            l3.a r0 = (p198l3.AbstractC4167a) r0
            return r0
    }

    public p283q3.InterfaceC5570e getDrawListener() {
            r1 = this;
            q3.e r0 = r1.f14612W0
            return r0
    }

    @Override // p245o3.InterfaceC4888a
    public float getHighestVisibleX() {
            r4 = this;
            s3.e r0 = r4.f14617b1
            s3.g r1 = r4.f14653t0
            android.graphics.RectF r1 = r1.f22866b
            float r2 = r1.right
            float r1 = r1.bottom
            s3.b r3 = r4.f14626k1
            r0.m12368c(r2, r1, r3)
            k3.h r0 = r4.f14642i0
            float r0 = r0.f16268w
            double r0 = (double) r0
            s3.b r2 = r4.f14626k1
            double r2 = r2.f22835b
            double r0 = java.lang.Math.min(r0, r2)
            float r0 = (float) r0
            return r0
    }

    @Override // p245o3.InterfaceC4888a
    public float getLowestVisibleX() {
            r4 = this;
            s3.e r0 = r4.f14617b1
            s3.g r1 = r4.f14653t0
            android.graphics.RectF r1 = r1.f22866b
            float r2 = r1.left
            float r1 = r1.bottom
            s3.b r3 = r4.f14625j1
            r0.m12368c(r2, r1, r3)
            k3.h r0 = r4.f14642i0
            float r0 = r0.f16269x
            double r0 = (double) r0
            s3.b r2 = r4.f14625j1
            double r2 = r2.f22835b
            double r0 = java.lang.Math.max(r0, r2)
            float r0 = (float) r0
            return r0
    }

    @Override // p161j3.AbstractC3395c, p245o3.InterfaceC4889b
    public int getMaxVisibleCount() {
            r1 = this;
            int r0 = r1.f14596G0
            return r0
    }

    public float getMinOffset() {
            r1 = this;
            float r0 = r1.f14610U0
            return r0
    }

    public p303r3.C5779i getRendererLeftYAxis() {
            r1 = this;
            r3.i r0 = r1.f14615Z0
            return r0
    }

    public p303r3.C5779i getRendererRightYAxis() {
            r1 = this;
            r3.i r0 = r1.f14616a1
            return r0
    }

    public p303r3.C5778h getRendererXAxis() {
            r1 = this;
            r3.h r0 = r1.f14619d1
            return r0
    }

    @Override // android.view.View
    public float getScaleX() {
            r1 = this;
            s3.g r0 = r1.f14653t0
            if (r0 != 0) goto L7
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L7:
            float r0 = r0.f22873i
            return r0
    }

    @Override // android.view.View
    public float getScaleY() {
            r1 = this;
            s3.g r0 = r1.f14653t0
            if (r0 != 0) goto L7
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L7:
            float r0 = r0.f22874j
            return r0
    }

    public float getVisibleXRange() {
            r2 = this;
            float r0 = r2.getHighestVisibleX()
            float r1 = r2.getLowestVisibleX()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            return r0
    }

    @Override // p161j3.AbstractC3395c, p245o3.InterfaceC4889b
    public float getYChartMax() {
            r2 = this;
            k3.i r0 = r2.f14613X0
            float r0 = r0.f16268w
            k3.i r1 = r2.f14614Y0
            float r1 = r1.f16268w
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // p161j3.AbstractC3395c, p245o3.InterfaceC4889b
    public float getYChartMin() {
            r2 = this;
            k3.i r0 = r2.f14613X0
            float r0 = r0.f16269x
            k3.i r1 = r2.f14614Y0
            float r1 = r1.f16269x
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Override // p161j3.AbstractC3395c
    /* renamed from: h */
    public void mo7777h() {
            r24 = this;
            r0 = r24
            T extends l3.d<? extends p3.d<? extends l3.f>> r1 = r0.f14635b0
            java.lang.String r2 = "MPAndroidChart"
            if (r1 != 0) goto L12
            boolean r1 = r0.f14634a0
            if (r1 == 0) goto L11
            java.lang.String r1 = "Preparing... DATA NOT SET."
            android.util.Log.i(r2, r1)
        L11:
            return
        L12:
            boolean r1 = r0.f14634a0
            if (r1 == 0) goto L1b
            java.lang.String r1 = "Preparing..."
            android.util.Log.i(r2, r1)
        L1b:
            r3.c r1 = r0.f14651r0
            if (r1 == 0) goto L22
            r1.mo12096r()
        L22:
            r24.m7778k()
            r3.i r1 = r0.f14615Z0
            k3.i r2 = r0.f14613X0
            float r3 = r2.f16269x
            float r2 = r2.f16268w
            r4 = 0
            r1.mo12086m(r3, r2, r4)
            r3.i r1 = r0.f14616a1
            k3.i r2 = r0.f14614Y0
            float r3 = r2.f16269x
            float r2 = r2.f16268w
            r1.mo12086m(r3, r2, r4)
            r3.h r1 = r0.f14619d1
            k3.h r2 = r0.f14642i0
            float r3 = r2.f16269x
            float r2 = r2.f16268w
            r1.mo12086m(r3, r2, r4)
            k3.e r1 = r0.f14645l0
            if (r1 == 0) goto L423
            r3.d r1 = r0.f14650q0
            T extends l3.d<? extends p3.d<? extends l3.f>> r2 = r0.f14635b0
            k3.e r3 = r1.f22260d
            java.util.Objects.requireNonNull(r3)
            java.util.List<k3.f> r3 = r1.f22261e
            r3.clear()
            r3 = 0
        L5a:
            int r5 = r2.m9249c()
            r6 = 1
            if (r3 >= r5) goto L1ed
            p3.d r5 = r2.m9248b(r3)
            java.util.List r7 = r5.mo9242l()
            int r8 = r5.mo9255P()
            boolean r9 = r5 instanceof p267p3.InterfaceC5347a
            if (r9 == 0) goto Ldc
            r9 = r5
            p3.a r9 = (p267p3.InterfaceC5347a) r9
            boolean r10 = r9.m11654B()
            if (r10 == 0) goto Ldc
            java.lang.String[] r6 = r9.m11655E()
            r8 = 0
        L7f:
            int r10 = r7.size()
            if (r8 >= r10) goto Lc0
            int r10 = r9.m11656m()
            if (r8 >= r10) goto Lc0
            java.util.List<k3.f> r10 = r1.f22261e
            k3.f r15 = new k3.f
            int r11 = r6.length
            int r11 = r8 % r11
            r12 = r6[r11]
            int r13 = r5.mo9239d()
            float r14 = r5.mo9238c0()
            float r16 = r5.mo9235W()
            android.graphics.DashPathEffect r17 = r5.mo9243o()
            java.lang.Object r11 = r7.get(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r18 = r11.intValue()
            r11 = r15
            r4 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r10.add(r4)
            int r8 = r8 + 1
            r4 = 0
            goto L7f
        Lc0:
            java.lang.String r4 = r9.mo9245x()
            if (r4 == 0) goto L1e8
            java.util.List<k3.f> r4 = r1.f22261e
            k3.f r13 = new k3.f
            java.lang.String r7 = r5.mo9245x()
            r9 = 2143289344(0x7fc00000, float:NaN)
            r10 = 2143289344(0x7fc00000, float:NaN)
            r11 = 0
            r12 = 1122867(0x112233, float:1.573472E-39)
            r8 = 1
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L141
        Ldc:
            boolean r4 = r5 instanceof p267p3.InterfaceC5354h
            if (r4 == 0) goto L146
            r4 = r5
            p3.h r4 = (p267p3.InterfaceC5354h) r4
            r6 = 0
        Le4:
            int r9 = r7.size()
            if (r6 >= r9) goto L126
            if (r6 >= r8) goto L126
            java.util.List<k3.f> r9 = r1.f22261e
            k3.f r15 = new k3.f
            l3.f r10 = r4.mo9256X(r6)
            l3.k r10 = (p198l3.C4177k) r10
            java.util.Objects.requireNonNull(r10)
            r11 = 0
            int r12 = r5.mo9239d()
            float r13 = r5.mo9238c0()
            float r14 = r5.mo9235W()
            android.graphics.DashPathEffect r16 = r5.mo9243o()
            java.lang.Object r10 = r7.get(r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r17 = r10.intValue()
            r10 = r15
            r19 = r15
            r15 = r16
            r16 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r10 = r19
            r9.add(r10)
            int r6 = r6 + 1
            goto Le4
        L126:
            java.lang.String r4 = r4.mo9245x()
            if (r4 == 0) goto L1e8
            java.util.List<k3.f> r4 = r1.f22261e
            k3.f r13 = new k3.f
            java.lang.String r7 = r5.mo9245x()
            r9 = 2143289344(0x7fc00000, float:NaN)
            r10 = 2143289344(0x7fc00000, float:NaN)
            r11 = 0
            r12 = 1122867(0x112233, float:1.573472E-39)
            r8 = 1
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L141:
            r4.add(r13)
            goto L1e8
        L146:
            boolean r4 = r5 instanceof p267p3.InterfaceC5349c
            if (r4 == 0) goto L19b
            r4 = r5
            p3.c r4 = (p267p3.InterfaceC5349c) r4
            int r9 = r4.m11658d0()
            r10 = 1122867(0x112233, float:1.573472E-39)
            if (r9 == r10) goto L19b
            int r17 = r4.m11658d0()
            int r4 = r4.m11657G()
            java.util.List<k3.f> r6 = r1.f22261e
            k3.f r7 = new k3.f
            r12 = 0
            int r13 = r5.mo9239d()
            float r14 = r5.mo9238c0()
            float r15 = r5.mo9235W()
            android.graphics.DashPathEffect r16 = r5.mo9243o()
            r11 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r6.add(r7)
            java.util.List<k3.f> r13 = r1.f22261e
            k3.f r14 = new k3.f
            java.lang.String r7 = r5.mo9245x()
            int r8 = r5.mo9239d()
            float r9 = r5.mo9238c0()
            float r10 = r5.mo9235W()
            android.graphics.DashPathEffect r11 = r5.mo9243o()
            r6 = r14
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.add(r14)
            goto L1e8
        L19b:
            r4 = 0
        L19c:
            int r9 = r7.size()
            if (r4 >= r9) goto L1e8
            if (r4 >= r8) goto L1e8
            int r9 = r7.size()
            int r9 = r9 - r6
            if (r4 >= r9) goto L1b1
            int r9 = r8 + (-1)
            if (r4 >= r9) goto L1b1
            r9 = 0
            goto L1b9
        L1b1:
            p3.d r9 = r2.m9248b(r3)
            java.lang.String r9 = r9.mo9245x()
        L1b9:
            r11 = r9
            java.util.List<k3.f> r9 = r1.f22261e
            k3.f r15 = new k3.f
            int r12 = r5.mo9239d()
            float r13 = r5.mo9238c0()
            float r14 = r5.mo9235W()
            android.graphics.DashPathEffect r16 = r5.mo9243o()
            java.lang.Object r10 = r7.get(r4)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r17 = r10.intValue()
            r10 = r15
            r6 = r15
            r15 = r16
            r16 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r9.add(r6)
            int r4 = r4 + 1
            r6 = 1
            goto L19c
        L1e8:
            int r3 = r3 + 1
            r4 = 0
            goto L5a
        L1ed:
            k3.e r2 = r1.f22260d
            java.util.Objects.requireNonNull(r2)
            k3.e r2 = r1.f22260d
            java.util.List<k3.f> r3 = r1.f22261e
            java.util.Objects.requireNonNull(r2)
            int r4 = r3.size()
            k3.f[] r4 = new p181k3.C3682f[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            k3.f[] r3 = (p181k3.C3682f[]) r3
            r2.f16278f = r3
            k3.e r2 = r1.f22260d
            java.util.Objects.requireNonNull(r2)
            android.graphics.Paint r2 = r1.f22258b
            k3.e r3 = r1.f22260d
            float r3 = r3.f16274d
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r1.f22258b
            k3.e r3 = r1.f22260d
            int r3 = r3.f16275e
            r2.setColor(r3)
            k3.e r2 = r1.f22260d
            android.graphics.Paint r3 = r1.f22258b
            java.lang.Object r1 = r1.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            float r4 = r2.f16284l
            float r4 = p323s3.AbstractC5952f.m12377d(r4)
            float r5 = r2.f16288p
            float r5 = p323s3.AbstractC5952f.m12377d(r5)
            float r6 = r2.f16287o
            float r6 = p323s3.AbstractC5952f.m12377d(r6)
            float r7 = r2.f16286n
            float r7 = p323s3.AbstractC5952f.m12377d(r7)
            r8 = 0
            float r9 = p323s3.AbstractC5952f.m12377d(r8)
            k3.f[] r10 = r2.f16278f
            int r11 = r10.length
            float r12 = r2.f16287o
            p323s3.AbstractC5952f.m12377d(r12)
            k3.f[] r12 = r2.f16278f
            int r13 = r12.length
            r14 = 0
            r15 = 0
            r16 = 0
        L252:
            if (r14 >= r13) goto L283
            r8 = r12[r14]
            float r0 = r8.f16297c
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L261
            float r0 = r2.f16284l
            goto L263
        L261:
            float r0 = r8.f16297c
        L263:
            float r0 = p323s3.AbstractC5952f.m12377d(r0)
            int r19 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r19 <= 0) goto L26c
            r15 = r0
        L26c:
            java.lang.String r0 = r8.f16295a
            if (r0 != 0) goto L271
            goto L27d
        L271:
            float r0 = r3.measureText(r0)
            int r0 = (int) r0
            float r0 = (float) r0
            int r8 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r8 <= 0) goto L27d
            r16 = r0
        L27d:
            int r14 = r14 + 1
            r8 = 0
            r0 = r24
            goto L252
        L283:
            k3.f[] r0 = r2.f16278f
            int r8 = r0.length
            r12 = 0
            r13 = 0
        L288:
            if (r13 >= r8) goto L29e
            r14 = r0[r13]
            java.lang.String r14 = r14.f16295a
            if (r14 != 0) goto L291
            goto L29b
        L291:
            int r14 = p323s3.AbstractC5952f.m12374a(r3, r14)
            float r14 = (float) r14
            int r15 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r15 <= 0) goto L29b
            r12 = r14
        L29b:
            int r13 = r13 + 1
            goto L288
        L29e:
            int r0 = r2.f16281i
            int r0 = p365v.C6480g.m13148b(r0)
            if (r0 == 0) goto L326
            r8 = 1
            if (r0 == r8) goto L2ab
            goto L415
        L2ab:
            android.graphics.Paint$FontMetrics r0 = p323s3.AbstractC5952f.f22859e
            r3.getFontMetrics(r0)
            float r1 = r0.descent
            float r0 = r0.ascent
            float r1 = r1 - r0
            r0 = 0
            r7 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L2ba:
            if (r13 >= r11) goto L320
            r15 = r10[r13]
            r16 = r4
            int r4 = r15.f16296b
            if (r4 == r8) goto L2c6
            r8 = 1
            goto L2c7
        L2c6:
            r8 = 0
        L2c7:
            float r4 = r15.f16297c
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L2d2
            r4 = r16
            goto L2d8
        L2d2:
            float r4 = r15.f16297c
            float r4 = p323s3.AbstractC5952f.m12377d(r4)
        L2d8:
            java.lang.String r15 = r15.f16295a
            if (r14 != 0) goto L2dd
            r12 = 0
        L2dd:
            if (r8 == 0) goto L2e3
            if (r14 == 0) goto L2e2
            float r12 = r12 + r5
        L2e2:
            float r12 = r12 + r4
        L2e3:
            if (r15 == 0) goto L30f
            if (r8 == 0) goto L2ec
            if (r14 != 0) goto L2ec
            float r4 = r12 + r6
            goto L2f9
        L2ec:
            if (r14 == 0) goto L2f8
            float r0 = java.lang.Math.max(r0, r12)
            float r4 = r1 + r9
            float r7 = r7 + r4
            r4 = 0
            r8 = 0
            goto L2fa
        L2f8:
            r4 = r12
        L2f9:
            r8 = r14
        L2fa:
            float r12 = r3.measureText(r15)
            int r12 = (int) r12
            float r12 = (float) r12
            float r4 = r4 + r12
            int r12 = r11 + (-1)
            if (r13 >= r12) goto L30c
            float r12 = r1 + r9
            float r12 = r12 + r7
            r14 = r8
            r7 = r12
            r12 = r4
            goto L316
        L30c:
            r12 = r4
            r14 = r8
            goto L316
        L30f:
            float r12 = r12 + r4
            int r4 = r11 + (-1)
            if (r13 >= r4) goto L315
            float r12 = r12 + r5
        L315:
            r14 = 1
        L316:
            float r0 = java.lang.Math.max(r0, r12)
            int r13 = r13 + 1
            r4 = r16
            r8 = 1
            goto L2ba
        L320:
            r2.f16290r = r0
            r2.f16291s = r7
            goto L415
        L326:
            r16 = r4
            android.graphics.Paint$FontMetrics r0 = p323s3.AbstractC5952f.f22859e
            r3.getFontMetrics(r0)
            float r4 = r0.descent
            float r0 = r0.ascent
            float r4 = r4 - r0
            android.graphics.Paint$FontMetrics r0 = p323s3.AbstractC5952f.f22859e
            r3.getFontMetrics(r0)
            float r8 = r0.ascent
            float r12 = r0.top
            float r8 = r8 - r12
            float r0 = r0.bottom
            float r8 = r8 + r0
            float r8 = r8 + r9
            r1.m12380a()
            java.util.List<java.lang.Boolean> r0 = r2.f16293u
            r0.clear()
            java.util.List<s3.a> r0 = r2.f16292t
            r0.clear()
            java.util.List<s3.a> r0 = r2.f16294v
            r0.clear()
            r1 = 0
            r9 = 0
            r12 = 0
            r13 = -1
            r14 = 0
        L357:
            if (r9 >= r11) goto L3f0
            r15 = r10[r9]
            int r0 = r15.f16296b
            r20 = r7
            r7 = 1
            if (r0 == r7) goto L364
            r0 = 1
            goto L365
        L364:
            r0 = 0
        L365:
            float r7 = r15.f16297c
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L370
            r7 = r16
            goto L376
        L370:
            float r7 = r15.f16297c
            float r7 = p323s3.AbstractC5952f.m12377d(r7)
        L376:
            java.lang.String r15 = r15.f16295a
            r21 = r10
            java.util.List<java.lang.Boolean> r10 = r2.f16293u
            r22 = r8
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r10.add(r8)
            r8 = -1
            if (r13 != r8) goto L388
            r1 = 0
            goto L389
        L388:
            float r1 = r1 + r5
        L389:
            java.util.List<s3.a> r8 = r2.f16292t
            if (r15 == 0) goto L3a9
            s3.a r10 = p323s3.AbstractC5952f.m12375b(r3, r15)
            r8.add(r10)
            if (r0 == 0) goto L399
            float r0 = r6 + r7
            goto L39a
        L399:
            r0 = 0
        L39a:
            float r1 = r1 + r0
            java.util.List<s3.a> r0 = r2.f16292t
            java.lang.Object r0 = r0.get(r9)
            s3.a r0 = (p323s3.C5947a) r0
            float r0 = r0.f22832b
            float r1 = r1 + r0
            r23 = r3
            goto L3bc
        L3a9:
            r23 = r3
            r10 = 0
            s3.a r3 = p323s3.C5947a.m12356b(r10, r10)
            r8.add(r3)
            if (r0 == 0) goto L3b6
            goto L3b7
        L3b6:
            r7 = 0
        L3b7:
            float r1 = r1 + r7
            r0 = -1
            if (r13 != r0) goto L3bc
            r13 = r9
        L3bc:
            if (r15 != 0) goto L3c5
            int r0 = r11 + (-1)
            if (r9 != r0) goto L3c3
            goto L3c5
        L3c3:
            r10 = 0
            goto L3e1
        L3c5:
            r10 = 0
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 != 0) goto L3cc
            r0 = 0
            goto L3ce
        L3cc:
            r0 = r20
        L3ce:
            float r0 = r0 + r1
            float r14 = r14 + r0
            int r0 = r11 + (-1)
            if (r9 != r0) goto L3e1
            java.util.List<s3.a> r0 = r2.f16294v
            s3.a r3 = p323s3.C5947a.m12356b(r14, r4)
            r0.add(r3)
            float r12 = java.lang.Math.max(r12, r14)
        L3e1:
            if (r15 == 0) goto L3e4
            r13 = -1
        L3e4:
            int r9 = r9 + 1
            r7 = r20
            r10 = r21
            r8 = r22
            r3 = r23
            goto L357
        L3f0:
            r22 = r8
            r2.f16290r = r12
            java.util.List<s3.a> r0 = r2.f16294v
            int r0 = r0.size()
            float r0 = (float) r0
            float r4 = r4 * r0
            java.util.List<s3.a> r0 = r2.f16294v
            int r0 = r0.size()
            if (r0 != 0) goto L407
            r0 = 0
            goto L40f
        L407:
            java.util.List<s3.a> r0 = r2.f16294v
            int r0 = r0.size()
            r1 = -1
            int r0 = r0 + r1
        L40f:
            float r0 = (float) r0
            float r8 = r22 * r0
            float r8 = r8 + r4
            r2.f16291s = r8
        L415:
            float r0 = r2.f16291s
            float r1 = r2.f16273c
            float r0 = r0 + r1
            r2.f16291s = r0
            float r0 = r2.f16290r
            float r1 = r2.f16272b
            float r0 = r0 + r1
            r2.f16290r = r0
        L423:
            r24.mo7776b()
            return
    }

    /* renamed from: k */
    public void m7778k() {
            r4 = this;
            k3.h r0 = r4.f14642i0
            T extends l3.d<? extends p3.d<? extends l3.f>> r1 = r4.f14635b0
            r2 = r1
            l3.a r2 = (p198l3.AbstractC4167a) r2
            float r2 = r2.f17273d
            l3.a r1 = (p198l3.AbstractC4167a) r1
            float r1 = r1.f17272c
            r0.mo8135a(r2, r1)
            k3.i r0 = r4.f14613X0
            T extends l3.d<? extends p3.d<? extends l3.f>> r1 = r4.f14635b0
            l3.a r1 = (p198l3.AbstractC4167a) r1
            k3.i$a r2 = p181k3.C3685i.a.f16312Y
            float r1 = r1.m9253g(r2)
            T extends l3.d<? extends p3.d<? extends l3.f>> r3 = r4.f14635b0
            l3.a r3 = (p198l3.AbstractC4167a) r3
            float r2 = r3.m9252f(r2)
            r0.mo8135a(r1, r2)
            k3.i r0 = r4.f14614Y0
            T extends l3.d<? extends p3.d<? extends l3.f>> r1 = r4.f14635b0
            l3.a r1 = (p198l3.AbstractC4167a) r1
            k3.i$a r2 = p181k3.C3685i.a.f16313Z
            float r1 = r1.m9253g(r2)
            T extends l3.d<? extends p3.d<? extends l3.f>> r3 = r4.f14635b0
            l3.a r3 = (p198l3.AbstractC4167a) r3
            float r2 = r3.m9252f(r2)
            r0.mo8135a(r1, r2)
            return
    }

    /* renamed from: l */
    public void m7779l(android.graphics.RectF r5) {
            r4 = this;
            r0 = 0
            r5.left = r0
            r5.right = r0
            r5.top = r0
            r5.bottom = r0
            k3.e r0 = r4.f14645l0
            if (r0 == 0) goto Lb4
            boolean r1 = r0.f16271a
            if (r1 == 0) goto Lb4
            int r0 = r0.f16281i
            int r0 = p365v.C6480g.m13148b(r0)
            r1 = 2
            if (r0 == 0) goto L72
            r2 = 1
            if (r0 == r2) goto L1f
            goto Lb4
        L1f:
            k3.e r0 = r4.f14645l0
            int r0 = r0.f16279g
            int r0 = p365v.C6480g.m13148b(r0)
            if (r0 == 0) goto L57
            if (r0 == r2) goto L4a
            if (r0 == r1) goto L2f
            goto Lb4
        L2f:
            float r0 = r5.right
            k3.e r1 = r4.f14645l0
            float r2 = r1.f16290r
            s3.g r3 = r4.f14653t0
            float r3 = r3.f22867c
            float r1 = r1.f16289q
            float r3 = r3 * r1
            float r1 = java.lang.Math.min(r2, r3)
            k3.e r2 = r4.f14645l0
            float r2 = r2.f16272b
            float r1 = r1 + r2
            float r1 = r1 + r0
            r5.right = r1
            goto Lb4
        L4a:
            k3.e r0 = r4.f14645l0
            int r0 = r0.f16280h
            int r0 = p365v.C6480g.m13148b(r0)
            if (r0 == 0) goto L9a
            if (r0 == r1) goto L7f
            goto Lb4
        L57:
            float r0 = r5.left
            k3.e r1 = r4.f14645l0
            float r2 = r1.f16290r
            s3.g r3 = r4.f14653t0
            float r3 = r3.f22867c
            float r1 = r1.f16289q
            float r3 = r3 * r1
            float r1 = java.lang.Math.min(r2, r3)
            k3.e r2 = r4.f14645l0
            float r2 = r2.f16272b
            float r1 = r1 + r2
            float r1 = r1 + r0
            r5.left = r1
            goto Lb4
        L72:
            k3.e r0 = r4.f14645l0
            int r0 = r0.f16280h
            int r0 = p365v.C6480g.m13148b(r0)
            if (r0 == 0) goto L9a
            if (r0 == r1) goto L7f
            goto Lb4
        L7f:
            float r0 = r5.bottom
            k3.e r1 = r4.f14645l0
            float r2 = r1.f16291s
            s3.g r3 = r4.f14653t0
            float r3 = r3.f22868d
            float r1 = r1.f16289q
            float r3 = r3 * r1
            float r1 = java.lang.Math.min(r2, r3)
            k3.e r2 = r4.f14645l0
            float r2 = r2.f16273c
            float r1 = r1 + r2
            float r1 = r1 + r0
            r5.bottom = r1
            goto Lb4
        L9a:
            float r0 = r5.top
            k3.e r1 = r4.f14645l0
            float r2 = r1.f16291s
            s3.g r3 = r4.f14653t0
            float r3 = r3.f22868d
            float r1 = r1.f16289q
            float r3 = r3 * r1
            float r1 = java.lang.Math.min(r2, r3)
            k3.e r2 = r4.f14645l0
            float r2 = r2.f16273c
            float r1 = r1 + r2
            float r1 = r1 + r0
            r5.top = r1
        Lb4:
            return
    }

    /* renamed from: m */
    public boolean m7780m(p181k3.C3685i.a r2) {
            r1 = this;
            k3.i$a r0 = p181k3.C3685i.a.f16312Y
            if (r2 != r0) goto L7
            k3.i r2 = r1.f14613X0
            goto L9
        L7:
            k3.i r2 = r1.f14614Y0
        L9:
            java.util.Objects.requireNonNull(r2)
            r2 = 0
            return r2
    }

    /* renamed from: n */
    public void m7781n() {
            r3 = this;
            s3.e r0 = r3.f14618c1
            k3.i r1 = r3.f14614Y0
            java.util.Objects.requireNonNull(r1)
            r1 = 0
            r0.m12372g(r1)
            s3.e r0 = r3.f14617b1
            k3.i r2 = r3.f14613X0
            java.util.Objects.requireNonNull(r2)
            r0.m12372g(r1)
            return
    }

    /* renamed from: o */
    public void m7782o() {
            r5 = this;
            boolean r0 = r5.f14634a0
            if (r0 == 0) goto L32
            java.lang.String r0 = "Preparing Value-Px Matrix, xmin: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            k3.h r1 = r5.f14642i0
            float r1 = r1.f16269x
            r0.append(r1)
            java.lang.String r1 = ", xmax: "
            r0.append(r1)
            k3.h r1 = r5.f14642i0
            float r1 = r1.f16268w
            r0.append(r1)
            java.lang.String r1 = ", xdelta: "
            r0.append(r1)
            k3.h r1 = r5.f14642i0
            float r1 = r1.f16270y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MPAndroidChart"
            android.util.Log.i(r1, r0)
        L32:
            s3.e r0 = r5.f14618c1
            k3.h r1 = r5.f14642i0
            float r2 = r1.f16269x
            float r1 = r1.f16270y
            k3.i r3 = r5.f14614Y0
            float r4 = r3.f16270y
            float r3 = r3.f16269x
            r0.m12373h(r2, r1, r4, r3)
            s3.e r0 = r5.f14617b1
            k3.h r1 = r5.f14642i0
            float r2 = r1.f16269x
            float r1 = r1.f16270y
            k3.i r3 = r5.f14613X0
            float r4 = r3.f16270y
            float r3 = r3.f16269x
            r0.m12373h(r2, r1, r4, r3)
            return
    }

    @Override // p161j3.AbstractC3395c, android.view.View
    public void onDraw(android.graphics.Canvas r37) {
            r36 = this;
            r0 = r36
            r7 = r37
            super.onDraw(r37)
            T extends l3.d<? extends p3.d<? extends l3.f>> r1 = r0.f14635b0
            if (r1 != 0) goto Lc
            return
        Lc:
            long r8 = java.lang.System.currentTimeMillis()
            boolean r1 = r0.f14607R0
            if (r1 == 0) goto L1d
            s3.g r1 = r0.f14653t0
            android.graphics.RectF r1 = r1.f22866b
            android.graphics.Paint r2 = r0.f14605P0
            r7.drawRect(r1, r2)
        L1d:
            boolean r1 = r0.f14608S0
            if (r1 == 0) goto L2a
            s3.g r1 = r0.f14653t0
            android.graphics.RectF r1 = r1.f22866b
            android.graphics.Paint r2 = r0.f14606Q0
            r7.drawRect(r1, r2)
        L2a:
            boolean r1 = r0.f14597H0
            if (r1 == 0) goto L99
            float r1 = r36.getLowestVisibleX()
            float r2 = r36.getHighestVisibleX()
            T extends l3.d<? extends p3.d<? extends l3.f>> r3 = r0.f14635b0
            l3.a r3 = (p198l3.AbstractC4167a) r3
            java.util.List<T extends p3.d<? extends l3.f>> r4 = r3.f17278i
            java.util.Iterator r4 = r4.iterator()
        L40:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            p3.d r5 = (p267p3.InterfaceC5350d) r5
            r5.mo9262q(r1, r2)
            goto L40
        L50:
            r3.m9247a()
            k3.h r1 = r0.f14642i0
            T extends l3.d<? extends p3.d<? extends l3.f>> r2 = r0.f14635b0
            l3.a r2 = (p198l3.AbstractC4167a) r2
            float r3 = r2.f17273d
            float r2 = r2.f17272c
            r1.mo8135a(r3, r2)
            k3.i r1 = r0.f14613X0
            boolean r2 = r1.f16271a
            if (r2 == 0) goto L7b
            T extends l3.d<? extends p3.d<? extends l3.f>> r2 = r0.f14635b0
            l3.a r2 = (p198l3.AbstractC4167a) r2
            k3.i$a r3 = p181k3.C3685i.a.f16312Y
            float r2 = r2.m9253g(r3)
            T extends l3.d<? extends p3.d<? extends l3.f>> r4 = r0.f14635b0
            l3.a r4 = (p198l3.AbstractC4167a) r4
            float r3 = r4.m9252f(r3)
            r1.mo8135a(r2, r3)
        L7b:
            k3.i r1 = r0.f14614Y0
            boolean r2 = r1.f16271a
            if (r2 == 0) goto L96
            T extends l3.d<? extends p3.d<? extends l3.f>> r2 = r0.f14635b0
            l3.a r2 = (p198l3.AbstractC4167a) r2
            k3.i$a r3 = p181k3.C3685i.a.f16313Z
            float r2 = r2.m9253g(r3)
            T extends l3.d<? extends p3.d<? extends l3.f>> r4 = r0.f14635b0
            l3.a r4 = (p198l3.AbstractC4167a) r4
            float r3 = r4.m9252f(r3)
            r1.mo8135a(r2, r3)
        L96:
            r36.mo7776b()
        L99:
            k3.i r1 = r0.f14613X0
            boolean r2 = r1.f16271a
            r3 = 0
            if (r2 == 0) goto La9
            r3.i r2 = r0.f14615Z0
            float r4 = r1.f16269x
            float r1 = r1.f16268w
            r2.mo12086m(r4, r1, r3)
        La9:
            k3.i r1 = r0.f14614Y0
            boolean r2 = r1.f16271a
            if (r2 == 0) goto Lb8
            r3.i r2 = r0.f14616a1
            float r4 = r1.f16269x
            float r1 = r1.f16268w
            r2.mo12086m(r4, r1, r3)
        Lb8:
            k3.h r1 = r0.f14642i0
            boolean r2 = r1.f16271a
            if (r2 == 0) goto Lc7
            r3.h r2 = r0.f14619d1
            float r4 = r1.f16269x
            float r1 = r1.f16268w
            r2.mo12086m(r4, r1, r3)
        Lc7:
            r3.h r1 = r0.f14619d1
            r1.m12108u(r7)
            r3.i r1 = r0.f14615Z0
            r1.m12116t(r7)
            r3.i r1 = r0.f14616a1
            r1.m12116t(r7)
            k3.h r1 = r0.f14642i0
            boolean r1 = r1.f16265t
            if (r1 == 0) goto Le1
            r3.h r1 = r0.f14619d1
            r1.m12109v(r7)
        Le1:
            k3.i r1 = r0.f14613X0
            boolean r1 = r1.f16265t
            if (r1 == 0) goto Lec
            r3.i r1 = r0.f14615Z0
            r1.m12117u(r7)
        Lec:
            k3.i r1 = r0.f14614Y0
            boolean r1 = r1.f16265t
            if (r1 == 0) goto Lf7
            r3.i r1 = r0.f14616a1
            r1.m12117u(r7)
        Lf7:
            k3.h r1 = r0.f14642i0
            boolean r1 = r1.f16271a
            k3.i r1 = r0.f14613X0
            boolean r1 = r1.f16271a
            k3.i r1 = r0.f14614Y0
            boolean r1 = r1.f16271a
            int r1 = r37.save()
            s3.g r2 = r0.f14653t0
            android.graphics.RectF r2 = r2.f22866b
            r7.clipRect(r2)
            r3.c r2 = r0.f14651r0
            r2.mo12092n(r7)
            k3.h r2 = r0.f14642i0
            boolean r2 = r2.f16265t
            if (r2 != 0) goto L11e
            r3.h r2 = r0.f14619d1
            r2.m12109v(r7)
        L11e:
            k3.i r2 = r0.f14613X0
            boolean r2 = r2.f16265t
            if (r2 != 0) goto L129
            r3.i r2 = r0.f14615Z0
            r2.m12117u(r7)
        L129:
            k3.i r2 = r0.f14614Y0
            boolean r2 = r2.f16265t
            if (r2 != 0) goto L134
            r3.i r2 = r0.f14616a1
            r2.m12117u(r7)
        L134:
            boolean r2 = r36.m7788j()
            if (r2 == 0) goto L141
            r3.c r2 = r0.f14651r0
            n3.b[] r3 = r0.f14628A0
            r2.mo12094p(r7, r3)
        L141:
            r7.restoreToCount(r1)
            r3.c r1 = r0.f14651r0
            r1.mo12093o(r7)
            k3.h r1 = r0.f14642i0
            boolean r1 = r1.f16271a
            if (r1 == 0) goto L154
            r3.h r1 = r0.f14619d1
            r1.m12110w(r7)
        L154:
            k3.i r1 = r0.f14613X0
            boolean r1 = r1.f16271a
            if (r1 == 0) goto L15f
            r3.i r1 = r0.f14615Z0
            r1.m12118v(r7)
        L15f:
            k3.i r1 = r0.f14614Y0
            boolean r1 = r1.f16271a
            if (r1 == 0) goto L16a
            r3.i r1 = r0.f14616a1
            r1.m12118v(r7)
        L16a:
            r3.h r1 = r0.f14619d1
            r1.m12107t(r7)
            r3.i r1 = r0.f14615Z0
            r1.m12115s(r7)
            r3.i r1 = r0.f14616a1
            r1.m12115s(r7)
            boolean r1 = r0.f14609T0
            if (r1 == 0) goto L191
            int r1 = r37.save()
            s3.g r2 = r0.f14653t0
            android.graphics.RectF r2 = r2.f22866b
            r7.clipRect(r2)
            r3.c r2 = r0.f14651r0
            r2.mo12095q(r7)
            r7.restoreToCount(r1)
            goto L196
        L191:
            r3.c r1 = r0.f14651r0
            r1.mo12095q(r7)
        L196:
            r3.d r10 = r0.f14650q0
            k3.e r1 = r10.f22260d
            boolean r2 = r1.f16271a
            if (r2 != 0) goto L1a3
            r15 = r7
            r21 = r8
            goto L50d
        L1a3:
            android.graphics.Paint r2 = r10.f22258b
            float r1 = r1.f16274d
            r2.setTextSize(r1)
            android.graphics.Paint r1 = r10.f22258b
            k3.e r2 = r10.f22260d
            int r2 = r2.f16275e
            r1.setColor(r2)
            android.graphics.Paint r1 = r10.f22258b
            android.graphics.Paint$FontMetrics r2 = r10.f22262f
            android.util.DisplayMetrics r3 = p323s3.AbstractC5952f.f22855a
            r1.getFontMetrics(r2)
            float r1 = r2.descent
            float r2 = r2.ascent
            float r11 = r1 - r2
            android.graphics.Paint r1 = r10.f22258b
            android.graphics.Paint$FontMetrics r2 = r10.f22262f
            r1.getFontMetrics(r2)
            float r1 = r2.ascent
            float r3 = r2.top
            float r1 = r1 - r3
            float r2 = r2.bottom
            float r1 = r1 + r2
            k3.e r2 = r10.f22260d
            java.util.Objects.requireNonNull(r2)
            r2 = 0
            float r2 = p323s3.AbstractC5952f.m12377d(r2)
            float r12 = r2 + r1
            android.graphics.Paint r1 = r10.f22258b
            java.lang.String r2 = "ABC"
            int r1 = p323s3.AbstractC5952f.m12374a(r1, r2)
            float r1 = (float) r1
            r13 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r13
            float r14 = r11 - r1
            k3.e r1 = r10.f22260d
            k3.f[] r15 = r1.f16278f
            float r1 = r1.f16287o
            float r6 = p323s3.AbstractC5952f.m12377d(r1)
            k3.e r1 = r10.f22260d
            float r1 = r1.f16286n
            float r5 = p323s3.AbstractC5952f.m12377d(r1)
            k3.e r1 = r10.f22260d
            int r2 = r1.f16281i
            int r4 = r1.f16279g
            int r3 = r1.f16280h
            int r13 = r1.f16282j
            float r1 = r1.f16284l
            float r17 = p323s3.AbstractC5952f.m12377d(r1)
            k3.e r1 = r10.f22260d
            float r1 = r1.f16288p
            float r1 = p323s3.AbstractC5952f.m12377d(r1)
            r18 = r1
            k3.e r1 = r10.f22260d
            r19 = r5
            float r5 = r1.f16273c
            float r1 = r1.f16272b
            r20 = r6
            int r6 = p365v.C6480g.m13148b(r4)
            r21 = r8
            r8 = 2
            if (r6 == 0) goto L28a
            r9 = 1
            if (r6 == r9) goto L24b
            if (r6 == r8) goto L233
            r1 = 0
            r0 = 0
            goto L2a0
        L233:
            java.lang.Object r6 = r10.f25150a
            s3.g r6 = (p323s3.C5953g) r6
            if (r2 != r8) goto L23c
            float r6 = r6.f22867c
            goto L240
        L23c:
            android.graphics.RectF r6 = r6.f22866b
            float r6 = r6.right
        L240:
            float r6 = r6 - r1
            r1 = 1
            if (r13 != r1) goto L249
            k3.e r1 = r10.f22260d
            float r1 = r1.f16290r
            float r6 = r6 - r1
        L249:
            r1 = r6
            goto L29f
        L24b:
            java.lang.Object r6 = r10.f25150a
            s3.g r6 = (p323s3.C5953g) r6
            if (r2 != r8) goto L257
            float r6 = r6.f22867c
            r9 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r9
            goto L263
        L257:
            r9 = 1073741824(0x40000000, float:2.0)
            android.graphics.RectF r8 = r6.f22866b
            float r8 = r8.left
            float r6 = r6.m12380a()
            float r6 = r6 / r9
            float r6 = r6 + r8
        L263:
            r8 = 1
            if (r13 != r8) goto L268
            r8 = r1
            goto L269
        L268:
            float r8 = -r1
        L269:
            float r6 = r6 + r8
            r8 = 2
            if (r2 != r8) goto L249
            double r8 = (double) r6
            r23 = 4611686018427387904(0x4000000000000000, double:2.0)
            r6 = 1
            if (r13 != r6) goto L27e
            k3.e r6 = r10.f22260d
            float r6 = r6.f16290r
            float r6 = -r6
            double r6 = (double) r6
            double r6 = r6 / r23
            double r0 = (double) r1
            double r6 = r6 + r0
            goto L287
        L27e:
            k3.e r0 = r10.f22260d
            float r0 = r0.f16290r
            double r6 = (double) r0
            double r6 = r6 / r23
            double r0 = (double) r1
            double r6 = r6 - r0
        L287:
            double r8 = r8 + r6
            float r0 = (float) r8
            goto L29e
        L28a:
            r0 = 2
            if (r2 != r0) goto L28e
            goto L297
        L28e:
            java.lang.Object r6 = r10.f25150a
            s3.g r6 = (p323s3.C5953g) r6
            android.graphics.RectF r6 = r6.f22866b
            float r6 = r6.left
            float r1 = r1 + r6
        L297:
            if (r13 != r0) goto L29f
            k3.e r0 = r10.f22260d
            float r0 = r0.f16290r
            float r0 = r0 + r1
        L29e:
            r1 = r0
        L29f:
            r0 = r1
        L2a0:
            int r1 = p365v.C6480g.m13148b(r2)
            if (r1 == 0) goto L3b6
            r2 = 1
            if (r1 == r2) goto L2af
            r0 = r36
            r15 = r37
            goto L50d
        L2af:
            int r1 = p365v.C6480g.m13148b(r3)
            if (r1 == 0) goto L2e3
            if (r1 == r2) goto L2d0
            r2 = 2
            if (r1 == r2) goto L2bc
            r1 = 0
            goto L2f1
        L2bc:
            java.lang.Object r1 = r10.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            if (r4 != r2) goto L2c5
            float r1 = r1.f22868d
            goto L2c9
        L2c5:
            android.graphics.RectF r1 = r1.f22866b
            float r1 = r1.bottom
        L2c9:
            k3.e r2 = r10.f22260d
            float r2 = r2.f16291s
            float r2 = r2 + r5
            float r1 = r1 - r2
            goto L2f1
        L2d0:
            java.lang.Object r1 = r10.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            float r1 = r1.f22868d
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            k3.e r3 = r10.f22260d
            float r4 = r3.f16291s
            float r4 = r4 / r2
            float r1 = r1 - r4
            float r2 = r3.f16273c
            float r1 = r1 + r2
            goto L2f1
        L2e3:
            r1 = 2
            if (r4 != r1) goto L2e8
            r1 = 0
            goto L2f0
        L2e8:
            java.lang.Object r1 = r10.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r1 = r1.top
        L2f0:
            float r1 = r1 + r5
        L2f1:
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = r1
            r8 = 0
            r9 = 0
            r16 = 0
        L2f9:
            int r1 = r15.length
            if (r8 >= r1) goto L3b2
            r6 = r15[r8]
            int r1 = r6.f16296b
            r2 = 1
            if (r1 == r2) goto L307
            r1 = 1
            r19 = 1
            goto L30a
        L307:
            r1 = 0
            r19 = 0
        L30a:
            float r1 = r6.f16297c
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L315
            r23 = r17
            goto L31d
        L315:
            float r1 = r6.f16297c
            float r1 = p323s3.AbstractC5952f.m12377d(r1)
            r23 = r1
        L31d:
            if (r19 == 0) goto L34d
            if (r13 != r2) goto L324
            float r1 = r0 + r16
            goto L328
        L324:
            float r1 = r23 - r16
            float r1 = r0 - r1
        L328:
            r24 = r1
            float r4 = r7 + r14
            k3.e r5 = r10.f22260d
            r3 = r18
            r1 = r10
            r2 = r37
            r18 = r14
            r14 = r3
            r3 = r24
            r25 = r5
            r5 = r6
            r26 = r0
            r0 = r20
            r20 = r15
            r15 = r6
            r6 = r25
            r1.m12098m(r2, r3, r4, r5, r6)
            r1 = 1
            if (r13 != r1) goto L35d
            float r24 = r24 + r23
            goto L35d
        L34d:
            r26 = r0
            r0 = r20
            r20 = r15
            r15 = r6
            r35 = r18
            r18 = r14
            r14 = r35
            r1 = 1
            r24 = r26
        L35d:
            java.lang.String r2 = r15.f16295a
            if (r2 == 0) goto L398
            if (r19 == 0) goto L36d
            if (r9 != 0) goto L36d
            if (r13 != r1) goto L369
            r6 = r0
            goto L36a
        L369:
            float r6 = -r0
        L36a:
            float r24 = r24 + r6
            goto L371
        L36d:
            if (r9 == 0) goto L371
            r24 = r26
        L371:
            r1 = 2
            if (r13 != r1) goto L37d
            android.graphics.Paint r1 = r10.f22258b
            int r1 = p323s3.AbstractC5952f.m12376c(r1, r2)
            float r1 = (float) r1
            float r24 = r24 - r1
        L37d:
            r1 = r24
            if (r9 != 0) goto L382
            goto L385
        L382:
            float r2 = r11 + r12
            float r7 = r7 + r2
        L385:
            float r2 = r7 + r11
            java.lang.String r3 = r15.f16295a
            android.graphics.Paint r4 = r10.f22258b
            r15 = r37
            r15.drawText(r3, r1, r2, r4)
            float r1 = r11 + r12
            float r1 = r1 + r7
            r2 = 0
            r7 = r1
            r16 = 0
            goto L3a2
        L398:
            r15 = r37
            float r23 = r23 + r14
            float r23 = r23 + r16
            r1 = 1
            r16 = r23
            r9 = 1
        L3a2:
            int r8 = r8 + 1
            r15 = r20
            r20 = r0
            r0 = r26
            r35 = r18
            r18 = r14
            r14 = r35
            goto L2f9
        L3b2:
            r15 = r37
            goto L50b
        L3b6:
            r26 = r0
            r0 = r20
            r20 = r15
            r15 = r37
            r35 = r18
            r18 = r14
            r14 = r35
            k3.e r1 = r10.f22260d
            java.util.List<s3.a> r7 = r1.f16294v
            java.util.List<s3.a> r8 = r1.f16292t
            java.util.List<java.lang.Boolean> r9 = r1.f16293u
            int r1 = p365v.C6480g.m13148b(r3)
            if (r1 == 0) goto L3f8
            r2 = 1
            if (r1 == r2) goto L3e8
            r2 = 2
            if (r1 == r2) goto L3da
            r1 = 0
            goto L3f9
        L3da:
            java.lang.Object r1 = r10.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            float r1 = r1.f22868d
            float r1 = r1 - r5
            k3.e r2 = r10.f22260d
            float r2 = r2.f16291s
            float r5 = r1 - r2
            goto L3f8
        L3e8:
            java.lang.Object r1 = r10.f25150a
            s3.g r1 = (p323s3.C5953g) r1
            float r1 = r1.f22868d
            k3.e r2 = r10.f22260d
            float r2 = r2.f16291s
            r3 = 1073741824(0x40000000, float:2.0)
            float r5 = p065e0.C1496a.m4063a(r1, r2, r3, r5)
        L3f8:
            r1 = r5
        L3f9:
            r6 = r20
            int r5 = r6.length
            r2 = 0
            r3 = 0
            r20 = r26
        L400:
            if (r3 >= r5) goto L50b
            r23 = r14
            r14 = r6[r3]
            r24 = r5
            int r5 = r14.f16296b
            r25 = r6
            r6 = 1
            if (r5 == r6) goto L413
            r5 = 1
            r27 = 1
            goto L416
        L413:
            r5 = 0
            r27 = 0
        L416:
            float r5 = r14.f16297c
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L421
            r28 = r17
            goto L429
        L421:
            float r5 = r14.f16297c
            float r5 = p323s3.AbstractC5952f.m12377d(r5)
            r28 = r5
        L429:
            int r5 = r9.size()
            if (r3 >= r5) goto L443
            java.lang.Object r5 = r9.get(r3)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L443
            float r5 = r11 + r12
            float r5 = r5 + r1
            r20 = r5
            r1 = r26
            goto L449
        L443:
            r35 = r20
            r20 = r1
            r1 = r35
        L449:
            int r5 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r5 != 0) goto L46a
            r5 = 2
            if (r4 != r5) goto L46a
            int r6 = r7.size()
            if (r2 >= r6) goto L46a
            java.lang.Object r6 = r7.get(r2)
            s3.a r6 = (p323s3.C5947a) r6
            float r6 = r6.f22832b
            if (r13 != r5) goto L461
            goto L462
        L461:
            float r6 = -r6
        L462:
            r16 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r16
            float r1 = r1 + r6
            int r2 = r2 + 1
            goto L46c
        L46a:
            r16 = 1073741824(0x40000000, float:2.0)
        L46c:
            r29 = r2
            java.lang.String r2 = r14.f16295a
            if (r2 != 0) goto L476
            r2 = 1
            r30 = 1
            goto L479
        L476:
            r2 = 0
            r30 = 0
        L479:
            if (r27 == 0) goto L4a6
            r2 = 2
            if (r13 != r2) goto L480
            float r1 = r1 - r28
        L480:
            r31 = r1
            float r5 = r20 + r18
            k3.e r6 = r10.f22260d
            r1 = r10
            r2 = r37
            r32 = r7
            r7 = r3
            r3 = r31
            r33 = r4
            r4 = r5
            r34 = r9
            r9 = r19
            r19 = r24
            r5 = r14
            r24 = r25
            r1.m12098m(r2, r3, r4, r5, r6)
            r1 = 1
            if (r13 != r1) goto L4a3
            float r1 = r31 + r28
            goto L4b3
        L4a3:
            r1 = r31
            goto L4b3
        L4a6:
            r33 = r4
            r32 = r7
            r34 = r9
            r9 = r19
            r19 = r24
            r24 = r25
            r7 = r3
        L4b3:
            r2 = 2
            if (r30 != 0) goto L4e8
            if (r27 == 0) goto L4be
            if (r13 != r2) goto L4bc
            float r6 = -r0
            goto L4bd
        L4bc:
            r6 = r0
        L4bd:
            float r1 = r1 + r6
        L4be:
            if (r13 != r2) goto L4c9
            java.lang.Object r2 = r8.get(r7)
            s3.a r2 = (p323s3.C5947a) r2
            float r2 = r2.f22832b
            float r1 = r1 - r2
        L4c9:
            float r2 = r20 + r11
            java.lang.String r3 = r14.f16295a
            android.graphics.Paint r4 = r10.f22258b
            r15.drawText(r3, r1, r2, r4)
            r2 = 1
            if (r13 != r2) goto L4de
            java.lang.Object r2 = r8.get(r7)
            s3.a r2 = (p323s3.C5947a) r2
            float r2 = r2.f22832b
            float r1 = r1 + r2
        L4de:
            r2 = 2
            if (r13 != r2) goto L4e3
            float r5 = -r9
            goto L4e4
        L4e3:
            r5 = r9
        L4e4:
            float r1 = r1 + r5
            r2 = r23
            goto L4f2
        L4e8:
            if (r13 != r2) goto L4ee
            r2 = r23
            float r3 = -r2
            goto L4f1
        L4ee:
            r2 = r23
            r3 = r2
        L4f1:
            float r1 = r1 + r3
        L4f2:
            int r3 = r7 + 1
            r14 = r2
            r5 = r19
            r6 = r24
            r2 = r29
            r7 = r32
            r4 = r33
            r19 = r9
            r9 = r34
            r35 = r20
            r20 = r1
            r1 = r35
            goto L400
        L50b:
            r0 = r36
        L50d:
            k3.c r1 = r0.f14644k0
            if (r1 == 0) goto L55f
            boolean r1 = r1.f16271a
            if (r1 == 0) goto L55f
            android.graphics.Paint r1 = r0.f14640g0
            r2 = 0
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r0.f14640g0
            k3.c r2 = r0.f14644k0
            float r2 = r2.f16274d
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r0.f14640g0
            k3.c r2 = r0.f14644k0
            int r2 = r2.f16275e
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.f14640g0
            k3.c r2 = r0.f14644k0
            android.graphics.Paint$Align r2 = r2.f16277g
            r1.setTextAlign(r2)
            int r1 = r36.getWidth()
            float r1 = (float) r1
            s3.g r2 = r0.f14653t0
            float r2 = r2.m12391l()
            float r1 = r1 - r2
            k3.c r2 = r0.f14644k0
            float r2 = r2.f16272b
            float r1 = r1 - r2
            int r2 = r36.getHeight()
            float r2 = (float) r2
            s3.g r3 = r0.f14653t0
            float r3 = r3.m12390k()
            float r2 = r2 - r3
            k3.c r3 = r0.f14644k0
            float r4 = r3.f16273c
            float r2 = r2 - r4
            java.lang.String r3 = r3.f16276f
            android.graphics.Paint r4 = r0.f14640g0
            r15.drawText(r3, r1, r2, r4)
        L55f:
            k3.d r1 = r0.f14631D0
            if (r1 == 0) goto L5d3
            boolean r1 = r0.f14630C0
            if (r1 == 0) goto L5d3
            boolean r1 = r36.m7788j()
            if (r1 != 0) goto L56e
            goto L5d3
        L56e:
            r1 = 0
        L56f:
            n3.b[] r2 = r0.f14628A0
            int r3 = r2.length
            if (r1 >= r3) goto L5d3
            r2 = r2[r1]
            T extends l3.d<? extends p3.d<? extends l3.f>> r3 = r0.f14635b0
            int r4 = r2.f18656f
            p3.d r3 = r3.m9248b(r4)
            T extends l3.d<? extends p3.d<? extends l3.f>> r4 = r0.f14635b0
            n3.b[] r5 = r0.f14628A0
            r5 = r5[r1]
            l3.f r4 = r4.m9251e(r5)
            int r5 = r3.mo9265v(r4)
            if (r4 == 0) goto L5d0
            float r5 = (float) r5
            int r3 = r3.mo9255P()
            float r3 = (float) r3
            i3.a r6 = r0.f14654u0
            java.util.Objects.requireNonNull(r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r6
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L5a2
            goto L5d0
        L5a2:
            float[] r3 = r0.m7785e(r2)
            s3.g r5 = r0.f14653t0
            r6 = 0
            r6 = r3[r6]
            r7 = 1
            r7 = r3[r7]
            boolean r6 = r5.m12387h(r6)
            if (r6 == 0) goto L5bc
            boolean r5 = r5.m12388i(r7)
            if (r5 == 0) goto L5bc
            r5 = 1
            goto L5bd
        L5bc:
            r5 = 0
        L5bd:
            if (r5 != 0) goto L5c0
            goto L5d0
        L5c0:
            k3.d r5 = r0.f14631D0
            r5.m8140b(r4, r2)
            k3.d r2 = r0.f14631D0
            r4 = 0
            r4 = r3[r4]
            r5 = 1
            r3 = r3[r5]
            r2.m8139a(r15, r4, r3)
        L5d0:
            int r1 = r1 + 1
            goto L56f
        L5d3:
            boolean r1 = r0.f14634a0
            if (r1 == 0) goto L612
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r21
            long r3 = r0.f14620e1
            long r3 = r3 + r1
            r0.f14620e1 = r3
            long r5 = r0.f14621f1
            r7 = 1
            long r5 = r5 + r7
            r0.f14621f1 = r5
            long r3 = r3 / r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Drawtime: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = " ms, average: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = " ms, cycles: "
            r5.append(r1)
            long r1 = r0.f14621f1
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = "MPAndroidChart"
            android.util.Log.i(r2, r1)
        L612:
            return
    }

    @Override // p161j3.AbstractC3395c, android.view.View
    public void onSizeChanged(int r6, int r7, int r8, int r9) {
            r5 = this;
            float[] r0 = r5.f14627l1
            r1 = 1
            r2 = 0
            r0[r1] = r2
            r3 = 0
            r0[r3] = r2
            boolean r2 = r5.f14611V0
            if (r2 == 0) goto L1e
            s3.g r2 = r5.f14653t0
            android.graphics.RectF r2 = r2.f22866b
            float r4 = r2.left
            r0[r3] = r4
            float r2 = r2.top
            r0[r1] = r2
            s3.e r2 = r5.f14617b1
            r2.m12370e(r0)
        L1e:
            super.onSizeChanged(r6, r7, r8, r9)
            boolean r6 = r5.f14611V0
            if (r6 == 0) goto L4f
            s3.e r6 = r5.f14617b1
            float[] r7 = r5.f14627l1
            r6.m12371f(r7)
            s3.g r6 = r5.f14653t0
            float[] r7 = r5.f14627l1
            android.graphics.Matrix r8 = r6.f22878n
            r8.reset()
            android.graphics.Matrix r9 = r6.f22865a
            r8.set(r9)
            r9 = r7[r3]
            android.graphics.RectF r0 = r6.f22866b
            float r2 = r0.left
            float r9 = r9 - r2
            r7 = r7[r1]
            float r0 = r0.top
            float r7 = r7 - r0
            float r9 = -r9
            float r7 = -r7
            r8.postTranslate(r9, r7)
            r6.m12392m(r8, r5, r1)
            goto L56
        L4f:
            s3.g r6 = r5.f14653t0
            android.graphics.Matrix r7 = r6.f22865a
            r6.m12392m(r7, r5, r1)
        L56:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            super.onTouchEvent(r4)
            q3.b r0 = r3.f14647n0
            r1 = 0
            if (r0 == 0) goto L19
            T extends l3.d<? extends p3.d<? extends l3.f>> r2 = r3.f14635b0
            if (r2 != 0) goto Ld
            goto L19
        Ld:
            boolean r2 = r3.f14643j0
            if (r2 != 0) goto L12
            return r1
        L12:
            q3.a r0 = (p283q3.C5566a) r0
            boolean r4 = r0.onTouch(r3, r4)
            return r4
        L19:
            return r1
    }

    public void setAutoScaleMinMaxEnabled(boolean r1) {
            r0 = this;
            r0.f14597H0 = r1
            return
    }

    public void setBorderColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f14606Q0
            r0.setColor(r2)
            return
    }

    public void setBorderWidth(float r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f14606Q0
            float r2 = p323s3.AbstractC5952f.m12377d(r2)
            r0.setStrokeWidth(r2)
            return
    }

    public void setClipValuesToContent(boolean r1) {
            r0 = this;
            r0.f14609T0 = r1
            return
    }

    public void setDoubleTapToZoomEnabled(boolean r1) {
            r0 = this;
            r0.f14599J0 = r1
            return
    }

    public void setDragEnabled(boolean r1) {
            r0 = this;
            r0.f14601L0 = r1
            r0.f14602M0 = r1
            return
    }

    public void setDragOffsetX(float r2) {
            r1 = this;
            s3.g r0 = r1.f14653t0
            java.util.Objects.requireNonNull(r0)
            float r2 = p323s3.AbstractC5952f.m12377d(r2)
            r0.f22876l = r2
            return
    }

    public void setDragOffsetY(float r2) {
            r1 = this;
            s3.g r0 = r1.f14653t0
            java.util.Objects.requireNonNull(r0)
            float r2 = p323s3.AbstractC5952f.m12377d(r2)
            r0.f22877m = r2
            return
    }

    public void setDragXEnabled(boolean r1) {
            r0 = this;
            r0.f14601L0 = r1
            return
    }

    public void setDragYEnabled(boolean r1) {
            r0 = this;
            r0.f14602M0 = r1
            return
    }

    public void setDrawBorders(boolean r1) {
            r0 = this;
            r0.f14608S0 = r1
            return
    }

    public void setDrawGridBackground(boolean r1) {
            r0 = this;
            r0.f14607R0 = r1
            return
    }

    public void setGridBackgroundColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f14605P0
            r0.setColor(r2)
            return
    }

    public void setHighlightPerDragEnabled(boolean r1) {
            r0 = this;
            r0.f14600K0 = r1
            return
    }

    public void setKeepPositionOnRotation(boolean r1) {
            r0 = this;
            r0.f14611V0 = r1
            return
    }

    public void setMaxVisibleValueCount(int r1) {
            r0 = this;
            r0.f14596G0 = r1
            return
    }

    public void setMinOffset(float r1) {
            r0 = this;
            r0.f14610U0 = r1
            return
    }

    public void setOnDrawListener(p283q3.InterfaceC5570e r1) {
            r0 = this;
            r0.f14612W0 = r1
            return
    }

    public void setPinchZoom(boolean r1) {
            r0 = this;
            r0.f14598I0 = r1
            return
    }

    public void setRendererLeftYAxis(p303r3.C5779i r1) {
            r0 = this;
            r0.f14615Z0 = r1
            return
    }

    public void setRendererRightYAxis(p303r3.C5779i r1) {
            r0 = this;
            r0.f14616a1 = r1
            return
    }

    public void setScaleEnabled(boolean r1) {
            r0 = this;
            r0.f14603N0 = r1
            r0.f14604O0 = r1
            return
    }

    public void setScaleXEnabled(boolean r1) {
            r0 = this;
            r0.f14603N0 = r1
            return
    }

    public void setScaleYEnabled(boolean r1) {
            r0 = this;
            r0.f14604O0 = r1
            return
    }

    public void setVisibleXRangeMaximum(float r4) {
            r3 = this;
            k3.h r0 = r3.f14642i0
            float r0 = r0.f16270y
            float r0 = r0 / r4
            s3.g r4 = r3.f14653t0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto Lf
            r0 = 1065353216(0x3f800000, float:1.0)
        Lf:
            r4.f22871g = r0
            android.graphics.Matrix r0 = r4.f22865a
            android.graphics.RectF r1 = r4.f22866b
            r4.m12389j(r0, r1)
            return
    }

    public void setVisibleXRangeMinimum(float r3) {
            r2 = this;
            k3.h r0 = r2.f14642i0
            float r0 = r0.f16270y
            float r0 = r0 / r3
            s3.g r3 = r2.f14653t0
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto Lf
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
        Lf:
            r3.f22872h = r0
            android.graphics.Matrix r0 = r3.f22865a
            android.graphics.RectF r1 = r3.f22866b
            r3.m12389j(r0, r1)
            return
    }

    public void setXAxisRenderer(p303r3.C5778h r1) {
            r0 = this;
            r0.f14619d1 = r1
            return
    }
}
