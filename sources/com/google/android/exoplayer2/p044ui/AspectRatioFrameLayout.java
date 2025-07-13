package com.google.android.exoplayer2.p044ui;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends android.widget.FrameLayout {

    /* renamed from: a0 */
    public final com.google.android.exoplayer2.p044ui.AspectRatioFrameLayout.RunnableC1048c f5283a0;

    /* renamed from: b0 */
    public com.google.android.exoplayer2.p044ui.AspectRatioFrameLayout.InterfaceC1047b f5284b0;

    /* renamed from: c0 */
    public float f5285c0;

    /* renamed from: d0 */
    public int f5286d0;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$a */
    public static /* synthetic */ class C1046a {
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    public interface InterfaceC1047b {
        /* renamed from: a */
        void m2883a(float r1, float r2, boolean r3);
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c */
    public final class RunnableC1048c implements java.lang.Runnable {

        /* renamed from: Y */
        public float f5287Y;

        /* renamed from: Z */
        public float f5288Z;

        /* renamed from: a0 */
        public boolean f5289a0;

        /* renamed from: b0 */
        public boolean f5290b0;

        /* renamed from: c0 */
        public final /* synthetic */ com.google.android.exoplayer2.p044ui.AspectRatioFrameLayout f5291c0;

        public RunnableC1048c(com.google.android.exoplayer2.p044ui.AspectRatioFrameLayout r1, com.google.android.exoplayer2.p044ui.AspectRatioFrameLayout.C1046a r2) {
                r0 = this;
                r0.f5291c0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r0 = 0
                r4.f5290b0 = r0
                com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r4.f5291c0
                com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b r0 = r0.f5284b0
                if (r0 != 0) goto La
                return
            La:
                float r1 = r4.f5287Y
                float r2 = r4.f5288Z
                boolean r3 = r4.f5289a0
                r0.m2883a(r1, r2, r3)
                return
        }
    }

    public AspectRatioFrameLayout(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 0
            r2.f5286d0 = r0
            if (r4 == 0) goto L21
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int[] r1 = p337t5.C6175e.f23946a
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1, r0, r0)
            int r4 = r3.getInt(r0, r0)     // Catch: java.lang.Throwable -> L1c
            r2.f5286d0 = r4     // Catch: java.lang.Throwable -> L1c
            r3.recycle()
            goto L21
        L1c:
            r4 = move-exception
            r3.recycle()
            throw r4
        L21:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r3 = new com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c
            r4 = 0
            r3.<init>(r2, r4)
            r2.f5283a0 = r3
            return
    }

    public int getResizeMode() {
            r1 = this;
            int r0 = r1.f5286d0
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r9, int r10) {
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f5285c0
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f5285c0
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            r7 = 1
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L40
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.f5283a0
            float r10 = r8.f5285c0
            r0 = 0
            r9.f5287Y = r10
            r9.f5288Z = r3
            r9.f5289a0 = r0
            boolean r10 = r9.f5290b0
            if (r10 != 0) goto L3f
            r9.f5290b0 = r7
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r10 = r9.f5291c0
            r10.post(r9)
        L3f:
            return
        L40:
            int r5 = r8.f5286d0
            if (r5 == 0) goto L52
            if (r5 == r7) goto L56
            r6 = 2
            if (r5 == r6) goto L5b
            r6 = 4
            if (r5 == r6) goto L4d
            goto L60
        L4d:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L56
            goto L5b
        L52:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L5b
        L56:
            float r10 = r8.f5285c0
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L60
        L5b:
            float r9 = r8.f5285c0
            float r2 = r2 * r9
            int r9 = (int) r2
        L60:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.f5283a0
            float r1 = r8.f5285c0
            r10.f5287Y = r1
            r10.f5288Z = r3
            r10.f5289a0 = r7
            boolean r1 = r10.f5290b0
            if (r1 != 0) goto L75
            r10.f5290b0 = r7
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r1 = r10.f5291c0
            r1.post(r10)
        L75:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
    }

    public void setAspectRatio(float r2) {
            r1 = this;
            float r0 = r1.f5285c0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.f5285c0 = r2
            r1.requestLayout()
        Lb:
            return
    }

    public void setAspectRatioListener(com.google.android.exoplayer2.p044ui.AspectRatioFrameLayout.InterfaceC1047b r1) {
            r0 = this;
            r0.f5284b0 = r1
            return
    }

    public void setResizeMode(int r2) {
            r1 = this;
            int r0 = r1.f5286d0
            if (r0 == r2) goto L9
            r1.f5286d0 = r2
            r1.requestLayout()
        L9:
            return
    }
}
