package p250o8;

import p250o8.AbstractC5159c;

/* renamed from: o8.b */
/* loaded from: classes.dex */
public abstract class AbstractC5158b<S extends p250o8.AbstractC5159c> extends android.widget.ProgressBar {

    /* renamed from: a0 */
    public S f20213a0;

    /* renamed from: b0 */
    public int f20214b0;

    /* renamed from: c0 */
    public boolean f20215c0;

    /* renamed from: d0 */
    public boolean f20216d0;

    /* renamed from: e0 */
    public final int f20217e0;

    /* renamed from: f0 */
    public p250o8.C5157a f20218f0;

    /* renamed from: g0 */
    public boolean f20219g0;

    /* renamed from: h0 */
    public int f20220h0;

    /* renamed from: i0 */
    public final java.lang.Runnable f20221i0;

    /* renamed from: j0 */
    public final java.lang.Runnable f20222j0;

    /* renamed from: k0 */
    public final p348u1.AbstractC6284b f20223k0;

    /* renamed from: l0 */
    public final p348u1.AbstractC6284b f20224l0;

    /* renamed from: o8.b$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p250o8.AbstractC5158b f20225Y;

        public a(p250o8.AbstractC5158b r1) {
                r0 = this;
                r0.f20225Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                o8.b r0 = r2.f20225Y
                int r1 = r0.f20217e0
                if (r1 <= 0) goto L9
                android.os.SystemClock.uptimeMillis()
            L9:
                r1 = 0
                r0.setVisibility(r1)
                return
        }
    }

    /* renamed from: o8.b$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p250o8.AbstractC5158b f20226Y;

        public b(p250o8.AbstractC5158b r1) {
                r0 = this;
                r0.f20226Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                o8.b r0 = r4.f20226Y
                android.graphics.drawable.Drawable r1 = r0.getCurrentDrawable()
                o8.l r1 = (p250o8.AbstractC5168l) r1
                r2 = 0
                r3 = 1
                r1.m11488h(r2, r2, r3)
                o8.i r1 = r0.getProgressDrawable()
                if (r1 == 0) goto L1d
                o8.i r1 = r0.getProgressDrawable()
                boolean r1 = r1.isVisible()
                if (r1 != 0) goto L2e
            L1d:
                o8.n r1 = r0.getIndeterminateDrawable()
                if (r1 == 0) goto L2d
                o8.n r1 = r0.getIndeterminateDrawable()
                boolean r1 = r1.isVisible()
                if (r1 != 0) goto L2e
            L2d:
                r2 = 1
            L2e:
                if (r2 == 0) goto L34
                r1 = 4
                r0.setVisibility(r1)
            L34:
                o8.b r0 = r4.f20226Y
                java.util.Objects.requireNonNull(r0)
                return
        }
    }

    /* renamed from: o8.b$c */
    public class c extends p348u1.AbstractC6284b {

        /* renamed from: a */
        public final /* synthetic */ p250o8.AbstractC5158b f20227a;

        public c(p250o8.AbstractC5158b r1) {
                r0 = this;
                r0.f20227a = r1
                r0.<init>()
                return
        }

        @Override // p348u1.AbstractC6284b
        /* renamed from: a */
        public void mo11469a(android.graphics.drawable.Drawable r3) {
                r2 = this;
                o8.b r3 = r2.f20227a
                r0 = 0
                r3.setIndeterminate(r0)
                o8.b r3 = r2.f20227a
                r3.mo3496c(r0, r0)
                o8.b r3 = r2.f20227a
                int r0 = r3.f20214b0
                boolean r1 = r3.f20215c0
                r3.mo3496c(r0, r1)
                return
        }
    }

    /* renamed from: o8.b$d */
    public class d extends p348u1.AbstractC6284b {

        /* renamed from: a */
        public final /* synthetic */ p250o8.AbstractC5158b f20228a;

        public d(p250o8.AbstractC5158b r1) {
                r0 = this;
                r0.f20228a = r1
                r0.<init>()
                return
        }

        @Override // p348u1.AbstractC6284b
        /* renamed from: a */
        public void mo11469a(android.graphics.drawable.Drawable r2) {
                r1 = this;
                o8.b r2 = r1.f20228a
                boolean r0 = r2.f20219g0
                if (r0 != 0) goto Lb
                int r0 = r2.f20220h0
                r2.setVisibility(r0)
            Lb:
                return
        }
    }

    public AbstractC5158b(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
            r7 = this;
            r0 = 2132017983(0x7f14033f, float:1.967426E38)
            android.content.Context r8 = p431y8.C7133a.m14245a(r8, r9, r10, r0)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f20219g0 = r8
            r0 = 4
            r7.f20220h0 = r0
            o8.b$a r0 = new o8.b$a
            r0.<init>(r7)
            r7.f20221i0 = r0
            o8.b$b r0 = new o8.b$b
            r0.<init>(r7)
            r7.f20222j0 = r0
            o8.b$c r0 = new o8.b$c
            r0.<init>(r7)
            r7.f20223k0 = r0
            o8.b$d r0 = new o8.b$d
            r0.<init>(r7)
            r7.f20224l0 = r0
            android.content.Context r1 = r7.getContext()
            o8.c r0 = r7.mo3495b(r1, r9)
            r7.f20213a0 = r0
            int[] r3 = p339t7.C6183a.f24007d
            int[] r6 = new int[r8]
            r2 = r9
            r4 = r10
            r5 = r11
            android.content.res.TypedArray r8 = p220m8.C4429m.m9881d(r1, r2, r3, r4, r5, r6)
            r9 = 5
            r10 = -1
            r8.getInt(r9, r10)
            r9 = 3
            int r9 = r8.getInt(r9, r10)
            r10 = 1000(0x3e8, float:1.401E-42)
            int r9 = java.lang.Math.min(r9, r10)
            r7.f20217e0 = r9
            r8.recycle()
            o8.a r8 = new o8.a
            r8.<init>()
            r7.f20218f0 = r8
            r8 = 1
            r7.f20216d0 = r8
            return
    }

    private p250o8.AbstractC5169m<S> getCurrentDrawingDelegate() {
            r2 = this;
            boolean r0 = r2.isIndeterminate()
            r1 = 0
            if (r0 == 0) goto L15
            o8.n r0 = r2.getIndeterminateDrawable()
            if (r0 != 0) goto Le
            goto L14
        Le:
            o8.n r0 = r2.getIndeterminateDrawable()
            o8.m<S extends o8.c> r1 = r0.f20278j0
        L14:
            return r1
        L15:
            o8.i r0 = r2.getProgressDrawable()
            if (r0 != 0) goto L1c
            goto L22
        L1c:
            o8.i r0 = r2.getProgressDrawable()
            o8.m<S extends o8.c> r1 = r0.f20258j0
        L22:
            return r1
    }

    /* renamed from: a */
    public void m11467a(boolean r4) {
            r3 = this;
            boolean r0 = r3.f20216d0
            if (r0 != 0) goto L5
            return
        L5:
            android.graphics.drawable.Drawable r0 = r3.getCurrentDrawable()
            o8.l r0 = (p250o8.AbstractC5168l) r0
            boolean r1 = r3.m11468d()
            r2 = 0
            r0.m11488h(r1, r2, r4)
            return
    }

    /* renamed from: b */
    public abstract S mo3495b(android.content.Context r1, android.util.AttributeSet r2);

    /* renamed from: c */
    public void mo3496c(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.isIndeterminate()
            if (r0 == 0) goto L45
            o8.i r0 = r1.getProgressDrawable()
            if (r0 == 0) goto L57
            r1.f20214b0 = r2
            r1.f20215c0 = r3
            r2 = 1
            r1.f20219g0 = r2
            o8.n r2 = r1.getIndeterminateDrawable()
            boolean r2 = r2.isVisible()
            if (r2 == 0) goto L3b
            o8.a r2 = r1.f20218f0
            android.content.Context r3 = r1.getContext()
            android.content.ContentResolver r3 = r3.getContentResolver()
            float r2 = r2.m11466a(r3)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L31
            goto L3b
        L31:
            o8.n r2 = r1.getIndeterminateDrawable()
            l.b r2 = r2.f20279k0
            r2.mo9203i()
            goto L57
        L3b:
            u1.b r2 = r1.f20223k0
            o8.n r3 = r1.getIndeterminateDrawable()
            r2.mo11469a(r3)
            goto L57
        L45:
            super.setProgress(r2)
            o8.i r2 = r1.getProgressDrawable()
            if (r2 == 0) goto L57
            if (r3 != 0) goto L57
            o8.i r2 = r1.getProgressDrawable()
            r2.jumpToCurrentState()
        L57:
            return
    }

    /* renamed from: d */
    public boolean m11468d() {
            r4 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10587b(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L34
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L34
            r0 = r4
        L11:
            int r3 = r0.getVisibility()
            if (r3 == 0) goto L18
            goto L26
        L18:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L28
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L26
        L24:
            r0 = 1
            goto L2d
        L26:
            r0 = 0
            goto L2d
        L28:
            boolean r3 = r0 instanceof android.view.View
            if (r3 != 0) goto L31
            goto L24
        L2d:
            if (r0 == 0) goto L34
            r1 = 1
            goto L34
        L31:
            android.view.View r0 = (android.view.View) r0
            goto L11
        L34:
            return r1
    }

    @Override // android.widget.ProgressBar
    public android.graphics.drawable.Drawable getCurrentDrawable() {
            r1 = this;
            boolean r0 = r1.isIndeterminate()
            if (r0 == 0) goto Lb
            o8.n r0 = r1.getIndeterminateDrawable()
            goto Lf
        Lb:
            o8.i r0 = r1.getProgressDrawable()
        Lf:
            return r0
    }

    public int getHideAnimationBehavior() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            int r0 = r0.f20234f
            return r0
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getIndeterminateDrawable() {
            r1 = this;
            o8.n r0 = r1.getIndeterminateDrawable()
            return r0
    }

    @Override // android.widget.ProgressBar
    public p250o8.C5170n<S> getIndeterminateDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getIndeterminateDrawable()
            o8.n r0 = (p250o8.C5170n) r0
            return r0
    }

    public int[] getIndicatorColor() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            int[] r0 = r0.f20231c
            return r0
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getProgressDrawable() {
            r1 = this;
            o8.i r0 = r1.getProgressDrawable()
            return r0
    }

    @Override // android.widget.ProgressBar
    public p250o8.C5165i<S> getProgressDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getProgressDrawable()
            o8.i r0 = (p250o8.C5165i) r0
            return r0
    }

    public int getShowAnimationBehavior() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            int r0 = r0.f20233e
            return r0
    }

    public int getTrackColor() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            int r0 = r0.f20232d
            return r0
    }

    public int getTrackCornerRadius() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            int r0 = r0.f20230b
            return r0
    }

    public int getTrackThickness() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            int r0 = r0.f20229a
            return r0
    }

    @Override // android.view.View
    public void invalidate() {
            r1 = this;
            super.invalidate()
            android.graphics.drawable.Drawable r0 = r1.getCurrentDrawable()
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r1.getCurrentDrawable()
            r0.invalidateSelf()
        L10:
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            o8.i r0 = r2.getProgressDrawable()
            if (r0 == 0) goto L1a
            o8.n r0 = r2.getIndeterminateDrawable()
            if (r0 == 0) goto L1a
            o8.n r0 = r2.getIndeterminateDrawable()
            l.b r0 = r0.f20279k0
            u1.b r1 = r2.f20223k0
            r0.mo9202h(r1)
        L1a:
            o8.i r0 = r2.getProgressDrawable()
            if (r0 == 0) goto L29
            o8.i r0 = r2.getProgressDrawable()
            u1.b r1 = r2.f20224l0
            r0.m11487g(r1)
        L29:
            o8.n r0 = r2.getIndeterminateDrawable()
            if (r0 == 0) goto L38
            o8.n r0 = r2.getIndeterminateDrawable()
            u1.b r1 = r2.f20224l0
            r0.m11487g(r1)
        L38:
            boolean r0 = r2.m11468d()
            if (r0 == 0) goto L49
            int r0 = r2.f20217e0
            if (r0 <= 0) goto L45
            android.os.SystemClock.uptimeMillis()
        L45:
            r0 = 0
            r2.setVisibility(r0)
        L49:
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            java.lang.Runnable r0 = r2.f20222j0
            r2.removeCallbacks(r0)
            java.lang.Runnable r0 = r2.f20221i0
            r2.removeCallbacks(r0)
            android.graphics.drawable.Drawable r0 = r2.getCurrentDrawable()
            o8.l r0 = (p250o8.AbstractC5168l) r0
            r0.m11484d()
            o8.n r0 = r2.getIndeterminateDrawable()
            if (r0 == 0) goto L2b
            o8.n r0 = r2.getIndeterminateDrawable()
            u1.b r1 = r2.f20224l0
            r0.m11489j(r1)
            o8.n r0 = r2.getIndeterminateDrawable()
            l.b r0 = r0.f20279k0
            r0.mo9205k()
        L2b:
            o8.i r0 = r2.getProgressDrawable()
            if (r0 == 0) goto L3a
            o8.i r0 = r2.getProgressDrawable()
            u1.b r1 = r2.f20224l0
            r0.m11489j(r1)
        L3a:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            monitor-enter(r5)
            int r0 = r6.save()     // Catch: java.lang.Throwable -> L56
            int r1 = r5.getPaddingLeft()     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L11
            int r1 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L1e
        L11:
            int r1 = r5.getPaddingLeft()     // Catch: java.lang.Throwable -> L56
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L56
            int r2 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> L56
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L56
            r6.translate(r1, r2)     // Catch: java.lang.Throwable -> L56
        L1e:
            int r1 = r5.getPaddingRight()     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L2a
            int r1 = r5.getPaddingBottom()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L4a
        L2a:
            int r1 = r5.getWidth()     // Catch: java.lang.Throwable -> L56
            int r2 = r5.getPaddingLeft()     // Catch: java.lang.Throwable -> L56
            int r3 = r5.getPaddingRight()     // Catch: java.lang.Throwable -> L56
            int r2 = r2 + r3
            int r1 = r1 - r2
            int r2 = r5.getHeight()     // Catch: java.lang.Throwable -> L56
            int r3 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> L56
            int r4 = r5.getPaddingBottom()     // Catch: java.lang.Throwable -> L56
            int r3 = r3 + r4
            int r2 = r2 - r3
            r3 = 0
            r6.clipRect(r3, r3, r1, r2)     // Catch: java.lang.Throwable -> L56
        L4a:
            android.graphics.drawable.Drawable r1 = r5.getCurrentDrawable()     // Catch: java.lang.Throwable -> L56
            r1.draw(r6)     // Catch: java.lang.Throwable -> L56
            r6.restoreToCount(r0)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r5)
            return
        L56:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            super.onMeasure(r2, r3)     // Catch: java.lang.Throwable -> L3b
            o8.m r2 = r1.getCurrentDrawingDelegate()     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto Lc
            monitor-exit(r1)
            return
        Lc:
            int r3 = r2.mo11475e()     // Catch: java.lang.Throwable -> L3b
            int r2 = r2.mo11474d()     // Catch: java.lang.Throwable -> L3b
            if (r3 >= 0) goto L1b
            int r3 = r1.getMeasuredWidth()     // Catch: java.lang.Throwable -> L3b
            goto L25
        L1b:
            int r0 = r1.getPaddingLeft()     // Catch: java.lang.Throwable -> L3b
            int r3 = r3 + r0
            int r0 = r1.getPaddingRight()     // Catch: java.lang.Throwable -> L3b
            int r3 = r3 + r0
        L25:
            if (r2 >= 0) goto L2c
            int r2 = r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L3b
            goto L36
        L2c:
            int r0 = r1.getPaddingTop()     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + r0
            int r0 = r1.getPaddingBottom()     // Catch: java.lang.Throwable -> L3b
            int r2 = r2 + r0
        L36:
            r1.setMeasuredDimension(r3, r2)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r1)
            return
        L3b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View r1, int r2) {
            r0 = this;
            super.onVisibilityChanged(r1, r2)
            if (r2 != 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            r0.m11467a(r1)
            return
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            r1 = 0
            r0.m11467a(r1)
            return
    }

    public void setAnimatorDurationScaleProvider(p250o8.C5157a r2) {
            r1 = this;
            r1.f20218f0 = r2
            o8.i r0 = r1.getProgressDrawable()
            if (r0 == 0) goto Le
            o8.i r0 = r1.getProgressDrawable()
            r0.f20268a0 = r2
        Le:
            o8.n r0 = r1.getIndeterminateDrawable()
            if (r0 == 0) goto L1a
            o8.n r0 = r1.getIndeterminateDrawable()
            r0.f20268a0 = r2
        L1a:
            return
    }

    public void setHideAnimationBehavior(int r2) {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            r0.f20234f = r2
            r1.invalidate()
            return
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isIndeterminate()     // Catch: java.lang.Throwable -> L3c
            if (r3 != r0) goto L9
            monitor-exit(r2)
            return
        L9:
            boolean r0 = r2.m11468d()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L1a
            if (r3 != 0) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "Cannot switch to indeterminate mode while the progress indicator is visible."
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            throw r3     // Catch: java.lang.Throwable -> L3c
        L1a:
            android.graphics.drawable.Drawable r0 = r2.getCurrentDrawable()     // Catch: java.lang.Throwable -> L3c
            o8.l r0 = (p250o8.AbstractC5168l) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L25
            r0.m11484d()     // Catch: java.lang.Throwable -> L3c
        L25:
            super.setIndeterminate(r3)     // Catch: java.lang.Throwable -> L3c
            android.graphics.drawable.Drawable r3 = r2.getCurrentDrawable()     // Catch: java.lang.Throwable -> L3c
            o8.l r3 = (p250o8.AbstractC5168l) r3     // Catch: java.lang.Throwable -> L3c
            r0 = 0
            if (r3 == 0) goto L38
            boolean r1 = r2.m11468d()     // Catch: java.lang.Throwable -> L3c
            r3.m11488h(r1, r0, r0)     // Catch: java.lang.Throwable -> L3c
        L38:
            r2.f20219g0 = r0     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)
            return
        L3c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.setIndeterminateDrawable(r2)
            return
        L7:
            boolean r0 = r2 instanceof p250o8.C5170n
            if (r0 == 0) goto L15
            r0 = r2
            o8.l r0 = (p250o8.AbstractC5168l) r0
            r0.m11484d()
            super.setIndeterminateDrawable(r2)
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot set framework drawable as indeterminate drawable."
            r2.<init>(r0)
            throw r2
    }

    public void setIndicatorColor(int... r5) {
            r4 = this;
            int r0 = r5.length
            if (r0 != 0) goto L15
            r5 = 1
            int[] r5 = new int[r5]
            r0 = 0
            android.content.Context r1 = r4.getContext()
            r2 = 2130968831(0x7f0400ff, float:1.7546327E38)
            r3 = -1
            int r1 = p124h7.C2939x3.m7285k(r1, r2, r3)
            r5[r0] = r1
        L15:
            int[] r0 = r4.getIndicatorColor()
            boolean r0 = java.util.Arrays.equals(r0, r5)
            if (r0 != 0) goto L2f
            S extends o8.c r0 = r4.f20213a0
            r0.f20231c = r5
            o8.n r5 = r4.getIndeterminateDrawable()
            l.b r5 = r5.f20279k0
            r5.mo9201g()
            r4.invalidate()
        L2f:
            return
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isIndeterminate()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L9
            monitor-exit(r1)
            return
        L9:
            r0 = 0
            r1.mo3496c(r2, r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 != 0) goto L7
            r3 = 0
            super.setProgressDrawable(r3)
            return
        L7:
            boolean r0 = r3 instanceof p250o8.C5165i
            if (r0 == 0) goto L28
            o8.i r3 = (p250o8.C5165i) r3
            r3.m11484d()
            super.setProgressDrawable(r3)
            int r0 = r2.getProgress()
            float r0 = (float) r0
            int r1 = r2.getMax()
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1176256512(0x461c4000, float:10000.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r3.setLevel(r0)
            return
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot set framework drawable as progress drawable."
            r3.<init>(r0)
            throw r3
    }

    public void setShowAnimationBehavior(int r2) {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            r0.f20233e = r2
            r1.invalidate()
            return
    }

    public void setTrackColor(int r3) {
            r2 = this;
            S extends o8.c r0 = r2.f20213a0
            int r1 = r0.f20232d
            if (r1 == r3) goto Lb
            r0.f20232d = r3
            r2.invalidate()
        Lb:
            return
    }

    public void setTrackCornerRadius(int r3) {
            r2 = this;
            S extends o8.c r0 = r2.f20213a0
            int r1 = r0.f20230b
            if (r1 == r3) goto L10
            int r1 = r0.f20229a
            int r1 = r1 / 2
            int r3 = java.lang.Math.min(r3, r1)
            r0.f20230b = r3
        L10:
            return
    }

    public void setTrackThickness(int r3) {
            r2 = this;
            S extends o8.c r0 = r2.f20213a0
            int r1 = r0.f20229a
            if (r1 == r3) goto Lb
            r0.f20229a = r3
            r2.requestLayout()
        Lb:
            return
    }

    public void setVisibilityAfterHide(int r2) {
            r1 = this;
            if (r2 == 0) goto L12
            r0 = 4
            if (r2 == r0) goto L12
            r0 = 8
            if (r2 != r0) goto La
            goto L12
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View."
            r2.<init>(r0)
            throw r2
        L12:
            r1.f20220h0 = r2
            return
    }
}
