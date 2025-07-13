package com.google.android.gms.cast.framework.media.widget;

/* loaded from: classes.dex */
public class CastSeekBar extends android.view.View {

    /* renamed from: k0 */
    public static final /* synthetic */ int f5513k0 = 0;

    /* renamed from: a0 */
    public p109g6.C2293b f5514a0;

    /* renamed from: b0 */
    @androidx.annotation.RecentlyNullable
    public java.util.List<p109g6.C2292a> f5515b0;

    /* renamed from: c0 */
    public final float f5516c0;

    /* renamed from: d0 */
    public final float f5517d0;

    /* renamed from: e0 */
    public final float f5518e0;

    /* renamed from: f0 */
    public final float f5519f0;

    /* renamed from: g0 */
    public final android.graphics.Paint f5520g0;

    /* renamed from: h0 */
    public final int f5521h0;

    /* renamed from: i0 */
    public final int f5522i0;

    /* renamed from: j0 */
    public final int f5523j0;

    public CastSeekBar(@androidx.annotation.RecentlyNonNull android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r0 = 0
            r5.<init>(r6, r7, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.f5515b0 = r7
            g6.c r7 = new g6.c
            r7.<init>(r5)
            r5.setAccessibilityDelegate(r7)
            android.graphics.Paint r7 = new android.graphics.Paint
            r1 = 1
            r7.<init>(r1)
            r5.f5520g0 = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r7.setStyle(r2)
            android.content.res.Resources r7 = r6.getResources()
            r2 = 2131165304(0x7f070078, float:1.7944821E38)
            float r7 = r7.getDimension(r2)
            r5.f5516c0 = r7
            android.content.res.Resources r7 = r6.getResources()
            r2 = 2131165303(0x7f070077, float:1.794482E38)
            float r7 = r7.getDimension(r2)
            r5.f5517d0 = r7
            android.content.res.Resources r7 = r6.getResources()
            r2 = 2131165305(0x7f070079, float:1.7944823E38)
            float r7 = r7.getDimension(r2)
            r2 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r2
            r5.f5518e0 = r7
            android.content.res.Resources r7 = r6.getResources()
            r2 = 2131165306(0x7f07007a, float:1.7944825E38)
            r7.getDimension(r2)
            android.content.res.Resources r7 = r6.getResources()
            r2 = 2131165302(0x7f070076, float:1.7944817E38)
            float r7 = r7.getDimension(r2)
            r5.f5519f0 = r7
            g6.b r7 = new g6.b
            r7.<init>()
            r5.f5514a0 = r7
            r7.f10514a = r1
            int[] r7 = p052d6.C1301d.f6830a
            r1 = 0
            r2 = 2130968735(0x7f04009f, float:1.7546132E38)
            r3 = 2132017401(0x7f1400f9, float:1.967308E38)
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r1, r7, r2, r3)
            r1 = 18
            int r1 = r7.getResourceId(r1, r0)
            r2 = 20
            int r2 = r7.getResourceId(r2, r0)
            r3 = 23
            int r3 = r7.getResourceId(r3, r0)
            int r0 = r7.getResourceId(r0, r0)
            android.content.res.Resources r4 = r6.getResources()
            int r1 = r4.getColor(r1)
            r5.f5521h0 = r1
            android.content.res.Resources r1 = r6.getResources()
            r1.getColor(r2)
            android.content.res.Resources r1 = r6.getResources()
            int r1 = r1.getColor(r3)
            r5.f5522i0 = r1
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r0)
            r5.f5523j0 = r6
            r7.recycle()
            return
    }

    /* renamed from: a */
    public final void m3039a(android.graphics.Canvas r7, int r8, int r9, int r10, int r11, int r12) {
            r6 = this;
            android.graphics.Paint r0 = r6.f5520g0
            r0.setColor(r12)
            float r10 = (float) r10
            float r11 = (float) r11
            float r4 = r6.f5518e0
            float r8 = (float) r8
            float r8 = r8 / r10
            float r1 = r8 * r11
            float r2 = -r4
            float r8 = (float) r9
            float r8 = r8 / r10
            float r3 = r8 * r11
            android.graphics.Paint r5 = r6.f5520g0
            r0 = r7
            r0.drawRect(r1, r2, r3, r4, r5)
            return
    }

    public int getMaxProgress() {
            r1 = this;
            g6.b r0 = r1.f5514a0
            int r0 = r0.f10514a
            return r0
    }

    public int getProgress() {
            r1 = this;
            g6.b r0 = r1.f5514a0
            java.util.Objects.requireNonNull(r0)
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public void onDraw(@androidx.annotation.RecentlyNonNull android.graphics.Canvas r17) {
            r16 = this;
            r7 = r16
            r8 = r17
            int r9 = r17.save()
            int r0 = r16.getPaddingLeft()
            float r0 = (float) r0
            int r1 = r16.getPaddingTop()
            float r1 = (float) r1
            r8.translate(r0, r1)
            int r0 = r16.getMeasuredWidth()
            int r1 = r16.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r16.getPaddingRight()
            int r10 = r0 - r1
            int r0 = r16.getMeasuredHeight()
            int r1 = r16.getPaddingTop()
            int r2 = r16.getPaddingBottom()
            int r11 = r16.getProgress()
            int r12 = r17.save()
            int r0 = r0 - r1
            int r0 = r0 - r2
            int r0 = r0 / 2
            float r0 = (float) r0
            r13 = 0
            r8.translate(r13, r0)
            g6.b r0 = r7.f5514a0
            java.util.Objects.requireNonNull(r0)
            r14 = 0
            int r15 = java.lang.Math.max(r14, r14)
            if (r15 <= 0) goto L5d
            r2 = 0
            g6.b r0 = r7.f5514a0
            int r4 = r0.f10514a
            int r6 = r7.f5522i0
            r0 = r16
            r1 = r17
            r3 = r15
            r5 = r10
            r0.m3039a(r1, r2, r3, r4, r5, r6)
        L5d:
            if (r11 <= r15) goto L6f
            g6.b r0 = r7.f5514a0
            int r4 = r0.f10514a
            int r6 = r7.f5521h0
            r0 = r16
            r1 = r17
            r2 = r15
            r3 = r11
            r5 = r10
            r0.m3039a(r1, r2, r3, r4, r5, r6)
        L6f:
            g6.b r0 = r7.f5514a0
            int r4 = r0.f10514a
            if (r4 <= r11) goto L81
            int r6 = r7.f5522i0
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r4
            r5 = r10
            r0.m3039a(r1, r2, r3, r4, r5, r6)
        L81:
            r8.restoreToCount(r12)
            java.util.List<g6.a> r0 = r7.f5515b0
            if (r0 == 0) goto L115
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L90
            goto L115
        L90:
            android.graphics.Paint r1 = r7.f5520g0
            int r2 = r7.f5523j0
            r1.setColor(r2)
            int r1 = r16.getMeasuredWidth()
            int r2 = r16.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r16.getPaddingRight()
            int r6 = r1 - r2
            int r1 = r16.getMeasuredHeight()
            int r2 = r16.getPaddingTop()
            int r3 = r16.getPaddingBottom()
            int r10 = r17.save()
            int r1 = r1 - r2
            int r1 = r1 - r3
            int r1 = r1 / 2
            float r1 = (float) r1
            r8.translate(r13, r1)
            java.util.Iterator r11 = r0.iterator()
        Lc2:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L112
            java.lang.Object r0 = r11.next()
            g6.a r0 = (p109g6.C2292a) r0
            if (r0 == 0) goto Lc2
            g6.b r0 = r7.f5514a0
            int r0 = r0.f10514a
            int r0 = java.lang.Math.min(r14, r0)
            float r1 = (float) r6
            g6.b r2 = r7.f5514a0
            int r2 = r2.f10514a
            float r2 = (float) r2
            float r3 = (float) r0
            float r3 = r3 * r1
            float r3 = r3 / r2
            int r0 = r0 + 1
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 / r2
            float r2 = r7.f5519f0
            float r4 = r0 - r3
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf2
            float r0 = r3 + r2
        Lf2:
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto Lf8
            r4 = r1
            goto Lf9
        Lf8:
            r4 = r0
        Lf9:
            float r0 = r4 - r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L103
            float r0 = r4 - r2
            r1 = r0
            goto L104
        L103:
            r1 = r3
        L104:
            float r5 = r7.f5518e0
            float r2 = -r5
            android.graphics.Paint r12 = r7.f5520g0
            r0 = r17
            r3 = r4
            r4 = r5
            r5 = r12
            r0.drawRect(r1, r2, r3, r4, r5)
            goto Lc2
        L112:
            r8.restoreToCount(r10)
        L115:
            boolean r0 = r16.isEnabled()
            if (r0 == 0) goto L120
            g6.b r0 = r7.f5514a0
            java.util.Objects.requireNonNull(r0)
        L120:
            r8.restoreToCount(r9)
            return
    }

    @Override // android.view.View
    public synchronized void onMeasure(int r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            float r0 = r6.f5516c0     // Catch: java.lang.Throwable -> L2d
            int r1 = r6.getPaddingLeft()     // Catch: java.lang.Throwable -> L2d
            int r2 = r6.getPaddingRight()     // Catch: java.lang.Throwable -> L2d
            float r3 = r6.f5517d0     // Catch: java.lang.Throwable -> L2d
            int r4 = r6.getPaddingTop()     // Catch: java.lang.Throwable -> L2d
            int r5 = r6.getPaddingBottom()     // Catch: java.lang.Throwable -> L2d
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L2d
            float r0 = r0 + r1
            float r1 = (float) r2     // Catch: java.lang.Throwable -> L2d
            float r0 = r0 + r1
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            int r7 = android.view.View.resolveSizeAndState(r0, r7, r1)     // Catch: java.lang.Throwable -> L2d
            float r0 = (float) r4     // Catch: java.lang.Throwable -> L2d
            float r3 = r3 + r0
            float r0 = (float) r5     // Catch: java.lang.Throwable -> L2d
            float r3 = r3 + r0
            int r0 = (int) r3     // Catch: java.lang.Throwable -> L2d
            int r8 = android.view.View.resolveSizeAndState(r0, r8, r1)     // Catch: java.lang.Throwable -> L2d
            r6.setMeasuredDimension(r7, r8)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r6)
            return
        L2d:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // android.view.View
    public boolean onTouchEvent(@androidx.annotation.RecentlyNonNull android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto Lb
            g6.b r1 = r0.f5514a0
            java.util.Objects.requireNonNull(r1)
        Lb:
            r1 = 0
            return r1
    }
}
