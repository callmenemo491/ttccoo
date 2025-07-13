package p161j3;

import p198l3.AbstractC4170d;

/* renamed from: j3.c */
/* loaded from: classes.dex */
public abstract class AbstractC3395c<T extends p198l3.AbstractC4170d<? extends p267p3.InterfaceC5350d<? extends p198l3.C4172f>>> extends android.view.ViewGroup implements p245o3.InterfaceC4889b {

    /* renamed from: A0 */
    public p230n3.C4684b[] f14628A0;

    /* renamed from: B0 */
    public float f14629B0;

    /* renamed from: C0 */
    public boolean f14630C0;

    /* renamed from: D0 */
    public p181k3.InterfaceC3680d f14631D0;

    /* renamed from: E0 */
    public java.util.ArrayList<java.lang.Runnable> f14632E0;

    /* renamed from: F0 */
    public boolean f14633F0;

    /* renamed from: a0 */
    public boolean f14634a0;

    /* renamed from: b0 */
    public T f14635b0;

    /* renamed from: c0 */
    public boolean f14636c0;

    /* renamed from: d0 */
    public boolean f14637d0;

    /* renamed from: e0 */
    public float f14638e0;

    /* renamed from: f0 */
    public p215m3.C4350b f14639f0;

    /* renamed from: g0 */
    public android.graphics.Paint f14640g0;

    /* renamed from: h0 */
    public android.graphics.Paint f14641h0;

    /* renamed from: i0 */
    public p181k3.C3684h f14642i0;

    /* renamed from: j0 */
    public boolean f14643j0;

    /* renamed from: k0 */
    public p181k3.C3679c f14644k0;

    /* renamed from: l0 */
    public p181k3.C3681e f14645l0;

    /* renamed from: m0 */
    public p283q3.InterfaceC5569d f14646m0;

    /* renamed from: n0 */
    public p283q3.AbstractViewOnTouchListenerC5567b f14647n0;

    /* renamed from: o0 */
    public java.lang.String f14648o0;

    /* renamed from: p0 */
    public p283q3.InterfaceC5568c f14649p0;

    /* renamed from: q0 */
    public p303r3.C5774d f14650q0;

    /* renamed from: r0 */
    public p303r3.AbstractC5773c f14651r0;

    /* renamed from: s0 */
    public p230n3.InterfaceC4685c f14652s0;

    /* renamed from: t0 */
    public p323s3.C5953g f14653t0;

    /* renamed from: u0 */
    public p141i3.C3066a f14654u0;

    /* renamed from: v0 */
    public float f14655v0;

    /* renamed from: w0 */
    public float f14656w0;

    /* renamed from: x0 */
    public float f14657x0;

    /* renamed from: y0 */
    public float f14658y0;

    /* renamed from: z0 */
    public boolean f14659z0;

    /* renamed from: j3.c$a */
    public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ p161j3.AbstractC3395c f14660a;

        public a(p161j3.AbstractC3395c r1) {
                r0 = this;
                r0.f14660a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r1) {
                r0 = this;
                j3.c r1 = r0.f14660a
                r1.postInvalidate()
                return
        }
    }

    public AbstractC3395c(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 0
            r1.f14634a0 = r2
            r3 = 0
            r1.f14635b0 = r3
            r3 = 1
            r1.f14636c0 = r3
            r1.f14637d0 = r3
            r0 = 1063675494(0x3f666666, float:0.9)
            r1.f14638e0 = r0
            m3.b r0 = new m3.b
            r0.<init>(r2)
            r1.f14639f0 = r0
            r1.f14643j0 = r3
            java.lang.String r0 = "No chart data available."
            r1.f14648o0 = r0
            s3.g r0 = new s3.g
            r0.<init>()
            r1.f14653t0 = r0
            r0 = 0
            r1.f14655v0 = r0
            r1.f14656w0 = r0
            r1.f14657x0 = r0
            r1.f14658y0 = r0
            r1.f14659z0 = r2
            r1.f14629B0 = r0
            r1.f14630C0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f14632E0 = r3
            r1.f14633F0 = r2
            r1.mo2800g()
            return
    }

    /* renamed from: b */
    public abstract void mo7776b();

    /* renamed from: c */
    public void m7783c() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto La
            r1 = 1
            r0.requestDisallowInterceptTouchEvent(r1)
        La:
            return
    }

    /* renamed from: d */
    public p230n3.C4684b m7784d(float r2, float r3) {
            r1 = this;
            T extends l3.d<? extends p3.d<? extends l3.f>> r0 = r1.f14635b0
            if (r0 != 0) goto Ld
            java.lang.String r2 = "MPAndroidChart"
            java.lang.String r3 = "Can't select by touch. No data set."
            android.util.Log.e(r2, r3)
            r2 = 0
            return r2
        Ld:
            n3.c r0 = r1.getHighlighter()
            n3.b r2 = r0.mo10718a(r2, r3)
            return r2
    }

    /* renamed from: e */
    public float[] m7785e(p230n3.C4684b r4) {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            float r1 = r4.f18659i
            r2 = 0
            r0[r2] = r1
            float r4 = r4.f18660j
            r1 = 1
            r0[r1] = r4
            return r0
    }

    /* renamed from: f */
    public void m7786f(p230n3.C4684b r4, boolean r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L6
            r3.f14628A0 = r0
            goto L35
        L6:
            boolean r1 = r3.f14634a0
            if (r1 == 0) goto L20
            java.lang.String r1 = "Highlighted: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r4.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MPAndroidChart"
            android.util.Log.i(r2, r1)
        L20:
            T extends l3.d<? extends p3.d<? extends l3.f>> r1 = r3.f14635b0
            l3.f r1 = r1.m9251e(r4)
            if (r1 != 0) goto L2c
            r3.f14628A0 = r0
            r4 = r0
            goto L34
        L2c:
            r0 = 1
            n3.b[] r0 = new p230n3.C4684b[r0]
            r2 = 0
            r0[r2] = r4
            r3.f14628A0 = r0
        L34:
            r0 = r1
        L35:
            n3.b[] r1 = r3.f14628A0
            r3.setLastHighlighted(r1)
            if (r5 == 0) goto L51
            q3.d r5 = r3.f14646m0
            if (r5 == 0) goto L51
            boolean r5 = r3.m7788j()
            if (r5 != 0) goto L4c
            q3.d r4 = r3.f14646m0
            r4.m11860b()
            goto L51
        L4c:
            q3.d r5 = r3.f14646m0
            r5.m11859a(r0, r4)
        L51:
            r3.invalidate()
            return
    }

    /* renamed from: g */
    public void mo2800g() {
            r4 = this;
            r0 = 0
            r4.setWillNotDraw(r0)
            i3.a r0 = new i3.a
            j3.c$a r1 = new j3.c$a
            r1.<init>(r4)
            r0.<init>(r1)
            r4.f14654u0 = r0
            android.content.Context r0 = r4.getContext()
            android.util.DisplayMetrics r1 = p323s3.AbstractC5952f.f22855a
            if (r0 != 0) goto L2c
            int r0 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            p323s3.AbstractC5952f.f22856b = r0
            int r0 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            p323s3.AbstractC5952f.f22857c = r0
            java.lang.String r0 = "MPChartLib-Utils"
            java.lang.String r1 = "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL"
            android.util.Log.e(r0, r1)
            goto L46
        L2c:
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r0)
            int r2 = r1.getScaledMinimumFlingVelocity()
            p323s3.AbstractC5952f.f22856b = r2
            int r1 = r1.getScaledMaximumFlingVelocity()
            p323s3.AbstractC5952f.f22857c = r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            p323s3.AbstractC5952f.f22855a = r0
        L46:
            r0 = 1140457472(0x43fa0000, float:500.0)
            float r0 = p323s3.AbstractC5952f.m12377d(r0)
            r4.f14629B0 = r0
            k3.c r0 = new k3.c
            r0.<init>()
            r4.f14644k0 = r0
            k3.e r0 = new k3.e
            r0.<init>()
            r4.f14645l0 = r0
            r3.d r1 = new r3.d
            s3.g r2 = r4.f14653t0
            r1.<init>(r2, r0)
            r4.f14650q0 = r1
            k3.h r0 = new k3.h
            r0.<init>()
            r4.f14642i0 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r4.f14640g0 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r4.f14641h0 = r0
            r1 = 247(0xf7, float:3.46E-43)
            r2 = 189(0xbd, float:2.65E-43)
            r3 = 51
            int r1 = android.graphics.Color.rgb(r1, r2, r3)
            r0.setColor(r1)
            android.graphics.Paint r0 = r4.f14641h0
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            android.graphics.Paint r0 = r4.f14641h0
            r1 = 1094713344(0x41400000, float:12.0)
            float r1 = p323s3.AbstractC5952f.m12377d(r1)
            r0.setTextSize(r1)
            boolean r0 = r4.f14634a0
            if (r0 == 0) goto La5
            java.lang.String r0 = ""
            java.lang.String r1 = "Chart.init()"
            android.util.Log.i(r0, r1)
        La5:
            return
    }

    public p141i3.C3066a getAnimator() {
            r1 = this;
            i3.a r0 = r1.f14654u0
            return r0
    }

    public p323s3.C5949c getCenter() {
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r2 = r3.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r1
            s3.c r0 = p323s3.C5949c.m12359b(r0, r2)
            return r0
    }

    public p323s3.C5949c getCenterOfView() {
            r1 = this;
            s3.c r0 = r1.getCenter()
            return r0
    }

    public p323s3.C5949c getCenterOffsets() {
            r2 = this;
            s3.g r0 = r2.f14653t0
            android.graphics.RectF r1 = r0.f22866b
            float r1 = r1.centerX()
            android.graphics.RectF r0 = r0.f22866b
            float r0 = r0.centerY()
            s3.c r0 = p323s3.C5949c.m12359b(r1, r0)
            return r0
    }

    public android.graphics.Bitmap getChartBitmap() {
            r3 = this;
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            if (r2 == 0) goto L1d
            r2.draw(r1)
            goto L21
        L1d:
            r2 = -1
            r1.drawColor(r2)
        L21:
            r3.draw(r1)
            return r0
    }

    public android.graphics.RectF getContentRect() {
            r1 = this;
            s3.g r0 = r1.f14653t0
            android.graphics.RectF r0 = r0.f22866b
            return r0
    }

    public T getData() {
            r1 = this;
            T extends l3.d<? extends p3.d<? extends l3.f>> r0 = r1.f14635b0
            return r0
    }

    public p215m3.AbstractC4351c getDefaultValueFormatter() {
            r1 = this;
            m3.b r0 = r1.f14639f0
            return r0
    }

    public p181k3.C3679c getDescription() {
            r1 = this;
            k3.c r0 = r1.f14644k0
            return r0
    }

    public float getDragDecelerationFrictionCoef() {
            r1 = this;
            float r0 = r1.f14638e0
            return r0
    }

    public float getExtraBottomOffset() {
            r1 = this;
            float r0 = r1.f14657x0
            return r0
    }

    public float getExtraLeftOffset() {
            r1 = this;
            float r0 = r1.f14658y0
            return r0
    }

    public float getExtraRightOffset() {
            r1 = this;
            float r0 = r1.f14656w0
            return r0
    }

    public float getExtraTopOffset() {
            r1 = this;
            float r0 = r1.f14655v0
            return r0
    }

    public p230n3.C4684b[] getHighlighted() {
            r1 = this;
            n3.b[] r0 = r1.f14628A0
            return r0
    }

    public p230n3.InterfaceC4685c getHighlighter() {
            r1 = this;
            n3.c r0 = r1.f14652s0
            return r0
    }

    public java.util.ArrayList<java.lang.Runnable> getJobs() {
            r1 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r1.f14632E0
            return r0
    }

    public p181k3.C3681e getLegend() {
            r1 = this;
            k3.e r0 = r1.f14645l0
            return r0
    }

    public p303r3.C5774d getLegendRenderer() {
            r1 = this;
            r3.d r0 = r1.f14650q0
            return r0
    }

    public p181k3.InterfaceC3680d getMarker() {
            r1 = this;
            k3.d r0 = r1.f14631D0
            return r0
    }

    @java.lang.Deprecated
    public p181k3.InterfaceC3680d getMarkerView() {
            r1 = this;
            k3.d r0 = r1.getMarker()
            return r0
    }

    @Override // p245o3.InterfaceC4889b
    public float getMaxHighlightDistance() {
            r1 = this;
            float r0 = r1.f14629B0
            return r0
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public p283q3.InterfaceC5568c getOnChartGestureListener() {
            r1 = this;
            q3.c r0 = r1.f14649p0
            return r0
    }

    public p283q3.AbstractViewOnTouchListenerC5567b getOnTouchListener() {
            r1 = this;
            q3.b r0 = r1.f14647n0
            return r0
    }

    public p303r3.AbstractC5773c getRenderer() {
            r1 = this;
            r3.c r0 = r1.f14651r0
            return r0
    }

    public p323s3.C5953g getViewPortHandler() {
            r1 = this;
            s3.g r0 = r1.f14653t0
            return r0
    }

    public p181k3.C3684h getXAxis() {
            r1 = this;
            k3.h r0 = r1.f14642i0
            return r0
    }

    public float getXChartMax() {
            r1 = this;
            k3.h r0 = r1.f14642i0
            float r0 = r0.f16268w
            return r0
    }

    public float getXChartMin() {
            r1 = this;
            k3.h r0 = r1.f14642i0
            float r0 = r0.f16269x
            return r0
    }

    public float getXRange() {
            r1 = this;
            k3.h r0 = r1.f14642i0
            float r0 = r0.f16270y
            return r0
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
            r1 = this;
            T extends l3.d<? extends p3.d<? extends l3.f>> r0 = r1.f14635b0
            float r0 = r0.f17270a
            return r0
    }

    public float getYMin() {
            r1 = this;
            T extends l3.d<? extends p3.d<? extends l3.f>> r0 = r1.f14635b0
            float r0 = r0.f17271b
            return r0
    }

    /* renamed from: h */
    public abstract void mo7777h();

    /* renamed from: i */
    public final void m7787i(android.view.View r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            r1 = 0
            r0.setCallback(r1)
        Le:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L29
            r0 = 0
        L13:
            r1 = r4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            if (r0 >= r2) goto L26
            android.view.View r1 = r1.getChildAt(r0)
            r3.m7787i(r1)
            int r0 = r0 + 1
            goto L13
        L26:
            r1.removeAllViews()
        L29:
            return
    }

    /* renamed from: j */
    public boolean m7788j() {
            r3 = this;
            n3.b[] r0 = r3.f14628A0
            r1 = 0
            if (r0 == 0) goto Le
            int r2 = r0.length
            if (r2 <= 0) goto Le
            r0 = r0[r1]
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            boolean r0 = r1.f14633F0
            if (r0 == 0) goto La
            r1.m7787i(r1)
        La:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            T extends l3.d<? extends p3.d<? extends l3.f>> r0 = r4.f14635b0
            r1 = 1
            if (r0 != 0) goto L1e
            java.lang.String r0 = r4.f14648o0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r1
            if (r0 == 0) goto L1d
            s3.c r0 = r4.getCenter()
            java.lang.String r1 = r4.f14648o0
            float r2 = r0.f22838b
            float r0 = r0.f22839c
            android.graphics.Paint r3 = r4.f14641h0
            r5.drawText(r1, r2, r0, r3)
        L1d:
            return
        L1e:
            boolean r5 = r4.f14659z0
            if (r5 != 0) goto L27
            r4.mo7776b()
            r4.f14659z0 = r1
        L27:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r2 = 0
        L1:
            int r0 = r1.getChildCount()
            if (r2 >= r0) goto L11
            android.view.View r0 = r1.getChildAt(r2)
            r0.layout(r3, r4, r5, r6)
            int r2 = r2 + 1
            goto L1
        L11:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            r0 = 1112014848(0x42480000, float:50.0)
            float r0 = p323s3.AbstractC5952f.m12377d(r0)
            int r0 = (int) r0
            int r1 = r2.getSuggestedMinimumWidth()
            int r3 = android.view.ViewGroup.resolveSize(r0, r3)
            int r3 = java.lang.Math.max(r1, r3)
            int r1 = r2.getSuggestedMinimumHeight()
            int r4 = android.view.ViewGroup.resolveSize(r0, r4)
            int r4 = java.lang.Math.max(r1, r4)
            r2.setMeasuredDimension(r3, r4)
            return
    }

    @Override // android.view.View
    public void onSizeChanged(int r8, int r9, int r10, int r11) {
            r7 = this;
            boolean r0 = r7.f14634a0
            java.lang.String r1 = "MPAndroidChart"
            if (r0 == 0) goto Lb
            java.lang.String r0 = "OnSizeChanged()"
            android.util.Log.i(r1, r0)
        Lb:
            java.lang.String r0 = ", height: "
            if (r8 <= 0) goto L4f
            if (r9 <= 0) goto L4f
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r8 >= r2) goto L4f
            if (r9 >= r2) goto L4f
            boolean r2 = r7.f14634a0
            if (r2 == 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Setting chart dimens, width: "
            r2.append(r3)
            r2.append(r8)
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = r2.toString()
            android.util.Log.i(r1, r0)
        L35:
            s3.g r0 = r7.f14653t0
            float r1 = (float) r8
            float r2 = (float) r9
            android.graphics.RectF r3 = r0.f22866b
            float r4 = r3.left
            float r3 = r3.top
            float r5 = r0.m12391l()
            float r6 = r0.m12390k()
            r0.f22868d = r2
            r0.f22867c = r1
            r0.m12393n(r4, r3, r5, r6)
            goto L6d
        L4f:
            boolean r2 = r7.f14634a0
            if (r2 == 0) goto L6d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "*Avoiding* setting chart dimens! width: "
            r2.append(r3)
            r2.append(r8)
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r1, r0)
        L6d:
            r7.mo7777h()
            java.util.ArrayList<java.lang.Runnable> r0 = r7.f14632E0
            java.util.Iterator r0 = r0.iterator()
        L76:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r7.post(r1)
            goto L76
        L86:
            java.util.ArrayList<java.lang.Runnable> r0 = r7.f14632E0
            r0.clear()
            super.onSizeChanged(r8, r9, r10, r11)
            return
    }

    public void setData(T r5) {
            r4 = this;
            r4.f14635b0 = r5
            r0 = 0
            r4.f14659z0 = r0
            if (r5 != 0) goto L8
            return
        L8:
            float r1 = r5.f17271b
            float r2 = r5.f17270a
            r3 = 2
            if (r5 == 0) goto L1c
            int r5 = r5.m9250d()
            if (r5 >= r3) goto L16
            goto L1c
        L16:
            float r2 = r2 - r1
            float r5 = java.lang.Math.abs(r2)
            goto L28
        L1c:
            float r5 = java.lang.Math.abs(r1)
            float r1 = java.lang.Math.abs(r2)
            float r5 = java.lang.Math.max(r5, r1)
        L28:
            double r1 = (double) r5
            float r5 = p323s3.AbstractC5952f.m12379f(r1)
            boolean r1 = java.lang.Float.isInfinite(r5)
            if (r1 == 0) goto L34
            goto L41
        L34:
            double r0 = (double) r5
            double r0 = java.lang.Math.log10(r0)
            double r0 = -r0
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            int r0 = r5 + 2
        L41:
            m3.b r5 = r4.f14639f0
            r5.m9735b(r0)
            T extends l3.d<? extends p3.d<? extends l3.f>> r5 = r4.f14635b0
            java.util.List<T extends p3.d<? extends l3.f>> r5 = r5.f17278i
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r5.next()
            p3.d r0 = (p267p3.InterfaceC5350d) r0
            boolean r1 = r0.mo9237b()
            if (r1 != 0) goto L68
            m3.c r1 = r0.mo9231O()
            m3.b r2 = r4.f14639f0
            if (r1 != r2) goto L4e
        L68:
            m3.b r1 = r4.f14639f0
            r0.mo9226C(r1)
            goto L4e
        L6e:
            r4.mo7777h()
            boolean r5 = r4.f14634a0
            if (r5 == 0) goto L7c
            java.lang.String r5 = "MPAndroidChart"
            java.lang.String r0 = "Data is set."
            android.util.Log.i(r5, r0)
        L7c:
            return
    }

    public void setDescription(p181k3.C3679c r1) {
            r0 = this;
            r0.f14644k0 = r1
            return
    }

    public void setDragDecelerationEnabled(boolean r1) {
            r0 = this;
            r0.f14637d0 = r1
            return
    }

    public void setDragDecelerationFrictionCoef(float r3) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            r3 = 0
        L6:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lf
            r3 = 1065336439(0x3f7fbe77, float:0.999)
        Lf:
            r2.f14638e0 = r3
            return
    }

    @java.lang.Deprecated
    public void setDrawMarkerViews(boolean r1) {
            r0 = this;
            r0.setDrawMarkers(r1)
            return
    }

    public void setDrawMarkers(boolean r1) {
            r0 = this;
            r0.f14630C0 = r1
            return
    }

    public void setExtraBottomOffset(float r1) {
            r0 = this;
            float r1 = p323s3.AbstractC5952f.m12377d(r1)
            r0.f14657x0 = r1
            return
    }

    public void setExtraLeftOffset(float r1) {
            r0 = this;
            float r1 = p323s3.AbstractC5952f.m12377d(r1)
            r0.f14658y0 = r1
            return
    }

    public void setExtraRightOffset(float r1) {
            r0 = this;
            float r1 = p323s3.AbstractC5952f.m12377d(r1)
            r0.f14656w0 = r1
            return
    }

    public void setExtraTopOffset(float r1) {
            r0 = this;
            float r1 = p323s3.AbstractC5952f.m12377d(r1)
            r0.f14655v0 = r1
            return
    }

    public void setHardwareAccelerationEnabled(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L5
            r2 = 2
            goto L6
        L5:
            r2 = 1
        L6:
            r1.setLayerType(r2, r0)
            return
    }

    public void setHighlightPerTapEnabled(boolean r1) {
            r0 = this;
            r0.f14636c0 = r1
            return
    }

    public void setHighlighter(p230n3.C4683a r1) {
            r0 = this;
            r0.f14652s0 = r1
            return
    }

    public void setLastHighlighted(p230n3.C4684b[] r3) {
            r2 = this;
            if (r3 == 0) goto L12
            int r0 = r3.length
            if (r0 <= 0) goto L12
            r0 = 0
            r1 = r3[r0]
            if (r1 != 0) goto Lb
            goto L12
        Lb:
            q3.b r1 = r2.f14647n0
            r3 = r3[r0]
            r1.f21682a0 = r3
            goto L17
        L12:
            q3.b r3 = r2.f14647n0
            r0 = 0
            r3.f21682a0 = r0
        L17:
            return
    }

    public void setLogEnabled(boolean r1) {
            r0 = this;
            r0.f14634a0 = r1
            return
    }

    public void setMarker(p181k3.InterfaceC3680d r1) {
            r0 = this;
            r0.f14631D0 = r1
            return
    }

    @java.lang.Deprecated
    public void setMarkerView(p181k3.InterfaceC3680d r1) {
            r0 = this;
            r0.setMarker(r1)
            return
    }

    public void setMaxHighlightDistance(float r1) {
            r0 = this;
            float r1 = p323s3.AbstractC5952f.m12377d(r1)
            r0.f14629B0 = r1
            return
    }

    public void setNoDataText(java.lang.String r1) {
            r0 = this;
            r0.f14648o0 = r1
            return
    }

    public void setNoDataTextColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f14641h0
            r0.setColor(r2)
            return
    }

    public void setNoDataTextTypeface(android.graphics.Typeface r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f14641h0
            r0.setTypeface(r2)
            return
    }

    public void setOnChartGestureListener(p283q3.InterfaceC5568c r1) {
            r0 = this;
            r0.f14649p0 = r1
            return
    }

    public void setOnChartValueSelectedListener(p283q3.InterfaceC5569d r1) {
            r0 = this;
            r0.f14646m0 = r1
            return
    }

    public void setOnTouchListener(p283q3.AbstractViewOnTouchListenerC5567b r1) {
            r0 = this;
            r0.f14647n0 = r1
            return
    }

    public void setRenderer(p303r3.AbstractC5773c r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.f14651r0 = r1
        L4:
            return
    }

    public void setTouchEnabled(boolean r1) {
            r0 = this;
            r0.f14643j0 = r1
            return
    }

    public void setUnbindEnabled(boolean r1) {
            r0 = this;
            r0.f14633F0 = r1
            return
    }
}
