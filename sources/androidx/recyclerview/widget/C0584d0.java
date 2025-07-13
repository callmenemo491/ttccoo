package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.d0 */
/* loaded from: classes.dex */
public class C0584d0 extends androidx.recyclerview.widget.C0612w {

    /* renamed from: q */
    public final /* synthetic */ androidx.recyclerview.widget.C0586e0 f3391q;

    public C0584d0(androidx.recyclerview.widget.C0586e0 r1, android.content.Context r2) {
            r0 = this;
            r0.f3391q = r1
            r0.<init>(r2)
            return
    }

    @Override // androidx.recyclerview.widget.C0612w, androidx.recyclerview.widget.RecyclerView.AbstractC0568x
    /* renamed from: c */
    public void mo1925c(android.view.View r5, androidx.recyclerview.widget.RecyclerView.C0569y r6, androidx.recyclerview.widget.RecyclerView.AbstractC0568x.a r7) {
            r4 = this;
            androidx.recyclerview.widget.e0 r6 = r4.f3391q
            androidx.recyclerview.widget.RecyclerView r0 = r6.f3457a
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            int[] r5 = r6.mo2026b(r0, r5)
            r6 = 0
            r6 = r5[r6]
            r0 = 1
            r5 = r5[r0]
            int r0 = java.lang.Math.abs(r6)
            int r1 = java.lang.Math.abs(r5)
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = r4.mo2023g(r0)
            double r0 = (double) r0
            r2 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            if (r0 <= 0) goto L35
            android.view.animation.DecelerateInterpolator r1 = r4.f3633j
            r7.m1928b(r6, r5, r0, r1)
        L35:
            return
    }

    @Override // androidx.recyclerview.widget.C0612w
    /* renamed from: f */
    public float mo2022f(android.util.DisplayMetrics r2) {
            r1 = this;
            int r2 = r2.densityDpi
            float r2 = (float) r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            return r0
    }

    @Override // androidx.recyclerview.widget.C0612w
    /* renamed from: g */
    public int mo2023g(int r2) {
            r1 = this;
            int r2 = super.mo2023g(r2)
            r0 = 100
            int r2 = java.lang.Math.min(r0, r2)
            return r2
    }
}
