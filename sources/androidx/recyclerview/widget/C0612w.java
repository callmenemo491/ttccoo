package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.w */
/* loaded from: classes.dex */
public class C0612w extends androidx.recyclerview.widget.RecyclerView.AbstractC0568x {

    /* renamed from: i */
    public final android.view.animation.LinearInterpolator f3632i;

    /* renamed from: j */
    public final android.view.animation.DecelerateInterpolator f3633j;

    /* renamed from: k */
    public android.graphics.PointF f3634k;

    /* renamed from: l */
    public final android.util.DisplayMetrics f3635l;

    /* renamed from: m */
    public boolean f3636m;

    /* renamed from: n */
    public float f3637n;

    /* renamed from: o */
    public int f3638o;

    /* renamed from: p */
    public int f3639p;

    public C0612w(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r1.f3632i = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.f3633j = r0
            r0 = 0
            r1.f3636m = r0
            r1.f3638o = r0
            r1.f3639p = r0
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r1.f3635l = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0568x
    /* renamed from: c */
    public void mo1925c(android.view.View r11, androidx.recyclerview.widget.RecyclerView.C0569y r12, androidx.recyclerview.widget.RecyclerView.AbstractC0568x.a r13) {
            r10 = this;
            android.graphics.PointF r12 = r10.f3634k
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r12 == 0) goto L15
            float r12 = r12.x
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 != 0) goto Lf
            goto L15
        Lf:
            if (r12 <= 0) goto L13
            r9 = 1
            goto L16
        L13:
            r9 = -1
            goto L16
        L15:
            r9 = 0
        L16:
            androidx.recyclerview.widget.RecyclerView$m r12 = r10.f3283c
            if (r12 == 0) goto L47
            boolean r4 = r12.mo1687g()
            if (r4 != 0) goto L21
            goto L47
        L21:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r4 = (androidx.recyclerview.widget.RecyclerView.C0558n) r4
            int r5 = r12.m1848D(r11)
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r12.m1853G(r11)
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            int r7 = r12.m1865O()
            int r4 = r12.f3253n
            int r12 = r12.m1866P()
            int r8 = r4 - r12
            r4 = r10
            int r12 = r4.m2139e(r5, r6, r7, r8, r9)
            goto L48
        L47:
            r12 = 0
        L48:
            android.graphics.PointF r4 = r10.f3634k
            if (r4 == 0) goto L59
            float r4 = r4.y
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L53
            goto L59
        L53:
            if (r3 <= 0) goto L57
            r9 = 1
            goto L5a
        L57:
            r9 = -1
            goto L5a
        L59:
            r9 = 0
        L5a:
            androidx.recyclerview.widget.RecyclerView$m r0 = r10.f3283c
            if (r0 == 0) goto L8c
            boolean r1 = r0.mo1689h()
            if (r1 != 0) goto L65
            goto L8c
        L65:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r1 = (androidx.recyclerview.widget.RecyclerView.C0558n) r1
            int r2 = r0.m1855H(r11)
            int r3 = r1.topMargin
            int r5 = r2 - r3
            int r11 = r0.m1846C(r11)
            int r1 = r1.bottomMargin
            int r6 = r11 + r1
            int r7 = r0.m1867Q()
            int r11 = r0.f3254o
            int r0 = r0.m1864N()
            int r8 = r11 - r0
            r4 = r10
            int r2 = r4.m2139e(r5, r6, r7, r8, r9)
        L8c:
            int r11 = r12 * r12
            int r0 = r2 * r2
            int r0 = r0 + r11
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            int r11 = (int) r0
            int r11 = r10.mo2023g(r11)
            double r0 = (double) r11
            r3 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r0 = r0 / r3
            double r0 = java.lang.Math.ceil(r0)
            int r11 = (int) r0
            if (r11 <= 0) goto Lb0
            int r12 = -r12
            int r0 = -r2
            android.view.animation.DecelerateInterpolator r1 = r10.f3633j
            r13.m1928b(r12, r0, r11, r1)
        Lb0:
            return
    }

    /* renamed from: e */
    public int m2139e(int r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = -1
            if (r6 == r0) goto L1c
            if (r6 == 0) goto L12
            r2 = 1
            if (r6 != r2) goto La
            int r5 = r5 - r3
            return r5
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"
            r2.<init>(r3)
            throw r2
        L12:
            int r4 = r4 - r2
            if (r4 <= 0) goto L16
            return r4
        L16:
            int r5 = r5 - r3
            if (r5 >= 0) goto L1a
            return r5
        L1a:
            r2 = 0
            return r2
        L1c:
            int r4 = r4 - r2
            return r4
    }

    /* renamed from: f */
    public float mo2022f(android.util.DisplayMetrics r2) {
            r1 = this;
            int r2 = r2.densityDpi
            float r2 = (float) r2
            r0 = 1103626240(0x41c80000, float:25.0)
            float r0 = r0 / r2
            return r0
    }

    /* renamed from: g */
    public int mo2023g(int r3) {
            r2 = this;
            int r3 = java.lang.Math.abs(r3)
            float r3 = (float) r3
            boolean r0 = r2.f3636m
            if (r0 != 0) goto L14
            android.util.DisplayMetrics r0 = r2.f3635l
            float r0 = r2.mo2022f(r0)
            r2.f3637n = r0
            r0 = 1
            r2.f3636m = r0
        L14:
            float r0 = r2.f3637n
            float r3 = r3 * r0
            double r0 = (double) r3
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            return r3
    }
}
